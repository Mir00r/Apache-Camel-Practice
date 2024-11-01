package com.mir00r.practiceApacheCamel.soap.commons;

import com.mir00r.practiceApacheCamel.utils.AppUtil;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.soap.SoapDataFormat;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public abstract class SoapRequestHandlerRoute extends RouteBuilder {


  @Override
  public void configure() throws Exception {
    String predicate1 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== null");
    String predicate2 =
      AppUtil.getExpressionPredicate(ISoapClientBaseService.IMPL_BEAN_REF, "== ''");

    onException(SoapInputFieldValueException.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_SOAP_INPUT_FIELD_VALUE_EXCEPTION));

    onException(Exception.class)
      .log(LoggingLevel.ERROR, getLogger(), ISoapClientBaseService.EXCEPTION_STACKTRACE)
      .handled(true)
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.HANDLE_REQUEST_HANDLER_EXCEPTION));


    from(getRouteFromUri())
      .routeId(getRouteId())
      .setProperty(ISoapClientBaseService.ORIGINAL_WS_RQ, simple(ISoapClientBaseService.IN_BODY))
      .choice()
      .when(simple(predicate1 + " || " + predicate2))
      .throwException(new IllegalArgumentException(
        "Camel Property." + ISoapClientBaseService.IMPL_BEAN_REF
          + " must be specified and not empty"))
      .endChoice()
      .otherwise()
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.SETUP_EXCHANGE_PROPERTIES))
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.VALIDATE_REQUEST))
      .toD(AppUtil.getBeanUri(ISoapClientBaseService.IMPL_BEAN_REF,
        ISoapClientBaseService.TO_SOAP_REQUEST))

      /*
       * Usage of .marshal(getDataFormat()) = Convert WS_RQ to SOAP Request (JAXB REQUEST POJO)
       *
       *
       *
       * WARN :
       *
       * Because of SOAPRequestHandlerRoute using cxf://someAddress[?options] style (AKA dataFormat=RAW),
       * if caller needs to send in attachment , or needs to work with MIME, MTOM,
       * the .marshal(getDataFormat()) will fail
       *
       */
      .marshal(getDataFormat())
      .log(LoggingLevel.DEBUG, getLogger(),
        "Going to send SOAP request : " + ISoapClientBaseService.IN_BODY)
      .end();
  }

  public abstract SoapDataFormat getDataFormat();

  public abstract String getRouteFromUri();

  public abstract Logger getLogger();

  public abstract String getRouteId();
}
