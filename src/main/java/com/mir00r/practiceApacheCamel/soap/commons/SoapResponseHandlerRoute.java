package com.mir00r.practiceApacheCamel.soap.commons;

import com.mir00r.practiceApacheCamel.utils.AppUtil;
import jakarta.xml.ws.soap.SOAPFaultException;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.soap.SoapDataFormat;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public abstract class SoapResponseHandlerRoute extends RouteBuilder {


  @Override
  public void configure() throws Exception {
    String predicate1 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== null");
    String predicate2 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== ''");

    /*
     * SOAPFaultException thrown by '.unmarshal(getDataFormat())'
     *
     * Server returned http 500 with SOAPFault XML
     *
     */
    onException(SOAPFaultException.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_SOAP_FAULT));

    /*
     *
     * Fault thrown by '.toD("${exchangeProperty."+ISoapClientBaseService.SOAP_ENDPOINT+"}")'
     *
     * Root cause :
     *
     * (1) May be unable to reach the URL, most likely is internal issue, such as connection terminated by firewall
     * (2) UnknownHostException
     * (3) May be included ConnectException
     *
     */
    onException(org.apache.cxf.interceptor.Fault.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_FAULT));


    /*
     *
     * Fault thrown by '.toD("${exchangeProperty."+ISoapClientBaseService.SOAP_ENDPOINT+"}")'
     *
     * Root cause :
     *
     * (1) Socket read timeout -> SOAP request sent to server,  but waited (x) ms but server did not return any SOAP response
     *
     */
    onException(java.net.SocketTimeoutException.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_SOCKET_TIMEOUT_EXCEPTION));


    /* Other uncaught errors thrown within SOAPResponseHandlerRoute */
    onException(Exception.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_RESPONSE_HANDLER_EXCEPTION));


    from(getRouteFromUri())
      .routeId(getRouteId())

      /* Because wanted to inspect the raw SOAP response received from Server, need to enable streamCaching,
       * if not during  unmarshall(..), the unmarshall process will complain the raw SOAP response (InputStream) already closed
       */
      .streamCaching()

      .choice()
      .when(simple(predicate1 + " || " + predicate2))
      .throwException(new IllegalArgumentException(
        "Camel Property." + ISoapClientBaseService.IMPL_BEAN_REF
          + " must be specified and not empty"))
      .endChoice()
      .otherwise()
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.SETUP_HTTP_HEADERS))
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.SOAP_ENDPOINT))

      /*
       * If SOAPAction is provided, must remove 'SOAPAction' from current MESSAGE Header once CXF SOAP client sent the 'SOAPAction' value to server,
       *
       * Reason is, this is to avoid CXF mistakenly treated this HTTP call as a SOAP server side call and start invoking method
       * specified by SOAPAction on the bean object 'exchangeProperty."+ISoapClientBaseService.IMPL_BEAN_REF'
       * resulted org.apache.camel.component.bean.MethodNotFoundException.
       *
       */
      .removeHeader(ISoapClientBaseService.SOAP_SERVICE_NAME)

      .log(LoggingLevel.DEBUG, getLogger(),
        "Received SOAP response : " + ISoapClientBaseService.IN_BODY)

      /*
       * Usage of .unmarshal(getDataFormat())
       * Convert received SOAP response (InputStream / String) to JAXB RESPONSE POJO
       *
       *
       * WARN :
       * Because of SOAPRequestHandlerRoute using cxf://someAddress[?options] style
       * (AKA dataFormat=RAW), will receive SOAP response from server in raw form
       * which is (InputStream / String), not POJO or PAYLOAD or CXF_MESSAGE style.
       *
       * Hence if SOAP server returned response in MIME format,
       * the current unmarshal(getDataFormat()) method will fail
       *
       */
      .unmarshal(getDataFormat())

      /* Convert JAXB RESPONSE POJO to WS_RP */
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.TO_WS_RESPONSE))
      .end();
  }

  public abstract SoapDataFormat getDataFormat();

  public abstract String getRouteFromUri();

  public abstract Logger getLogger();

  public abstract String getRouteId();
}
