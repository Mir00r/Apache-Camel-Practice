package com.mir00r.practiceApacheCamel.soap.commons;

import jakarta.xml.bind.Marshaller;
import jakarta.xml.ws.soap.SOAPBinding;
import jakarta.xml.ws.soap.SOAPFaultException;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.Headers;
import org.apache.camel.component.cxf.CxfEndpointConfigurer;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.commons.lang3.StringUtils;
import org.glassfish.jaxb.core.marshaller.CharacterEscapeHandler;
import org.slf4j.Logger;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ISoapClientBaseService<WS_RQ, SOAP_BODY_RQ, SOAP_BODY_RP, WS_RP>
  extends ICamelProperties, IHttpHeaders, ISoapVersions, IMethodNames {

  /**
   * Gets the endpoint name implementing this SOAP web service. Maps to wsdl:port@name in WSDL.
   *
   * @return The port name
   */
  String getPortName();

  /**
   * Gets the package name containing JAXB classes.
   *
   * @return The package name for JAXB classes
   */
  String getPackageName();

  /**
   * Gets the SOAPAction for SOAP 1.1 requests.
   *
   * @return The SOAP action string
   */
  String getSoap11SOAPAction();

  /**
   * Gets the web service SOAP server URL.
   *
   * @return The endpoint URL
   */
  String getUrl();

  /**
   * Gets the service name implementing this SOAP web service. Maps to wsdl:service@name in WSDL or
   * the stub class name with @WebServiceClient annotation.
   *
   * @return The service name
   */
  String getServiceName();

  /**
   * Gets the service interface name.
   *
   * @return The service interface name
   */
  String getServiceInterfaceName();

  // endregion

  // region Content Type Configuration

  /**
   * Gets the SOAP 1.1 HTTP Content-Type. Defaults to text/xml if not specified.
   *
   * @return The SOAP 1.1 content type
   */
  String getSoap11ContentType();

  /**
   * Gets the SOAP 1.1 charset. Defaults to UTF-8 if not specified.
   *
   * @return The SOAP 1.1 charset
   */
  String getSoap11ContentTypeCharset();

  /**
   * Gets the SOAP 1.2 HTTP Content-Type. Defaults to application/soap+xml if not specified.
   * Optional - not all services support SOAP 1.2.
   *
   * @return The SOAP 1.2 content type
   */
  String getSoap12ContentType();

  /**
   * Gets the SOAP 1.2 charset. Defaults to UTF-8 if not specified. Optional - not all services
   * support SOAP 1.2.
   *
   * @return The SOAP 1.2 charset
   */
  String getSoap12ContentTypeCharset();

  /**
   * Gets the SOAP 1.2 action. Required if using SOAP 1.2. Typically defined in soap12:operation
   * soapAction attribute.
   *
   * @return The SOAP 1.2 action
   */
  String getSoap12ContentTypeAction();

  // endregion

  // region Data Format and SSL Configuration

  /**
   * Gets the SoapJaxbDataFormat for this service. Should be injected during bean construction.
   *
   * @return The SOAP JAXB data format
   */
  SoapJaxbDataFormat getDataFormat();

  /**
   * Gets the SSL context parameters bean name. Used to override HTTP SSL for self-signed
   * certificates or 2-way SSL.
   *
   * @return The SSL context parameters bean name
   */
  String getCustomSSLContextParameters();

  /**
   * Gets the logger instance.
   *
   * @return The logger
   */
  Logger getLogger();

  /**
   * The HTTPClientPolicy socket read timeout value you want to extend for the SOAP web service URL
   *
   * @return
   */
  public Long getReceiveTimeout();

  // endregion

  // region Request/Response Handling

  /**
   * Validates the incoming request object.
   *
   * @param sourceObject The request object to validate
   * @param headers Request headers
   * @param properties Exchange properties
   * @throws SoapInputFieldValueException if validation fails
   */
  void validate(WS_RQ sourceObject, Map<String, Object> headers, Map<String, Object> properties)
    throws SoapInputFieldValueException;

  /**
   * Constructs the SOAP body from the request object.
   *
   * @param sourceObject The source request object
   * @return The constructed SOAP body
   */
  SOAP_BODY_RQ constructSOAPBody(WS_RQ sourceObject);

  /**
   * Constructs the response object from the SOAP response.
   *
   * @param sourceObject The SOAP response object
   * @param properties Exchange properties
   * @return The constructed response object
   */
  WS_RP constructWSResponse(SOAP_BODY_RP sourceObject, Map<String, Object> properties);

  // endregion

  // region Error Handling

  /**
   * Maps SOAP response handler exceptions to response objects.
   *
   * @param exception The caught exception
   * @param properties Exchange properties
   * @return The error response
   */
  WS_RP mapSOAPResponseHandlerExceptionToWsResponse(Exception exception,
    Map<String, Object> properties);

  /**
   * Maps SOAP request handler exceptions to response objects.
   *
   * @param exception The caught exception
   * @param properties Exchange properties
   * @return The error response
   */
  WS_RP mapSOAPRequestHandlerExceptionToWsResponse(Exception exception,
    Map<String, Object> properties);

  /**
   * Maps SOAP faults to response objects.
   *
   * @param exception The SOAP fault exception
   * @param dataFormat The SOAP data format
   * @param properties Exchange properties
   * @return The error response
   */
  WS_RP mapToWsResponse(SOAPFaultException exception, SoapJaxbDataFormat dataFormat,
    Map<String, Object> properties);

  WS_RP mapToWsResponse(org.apache.cxf.interceptor.Fault fault, Map<String, Object> properties);

  WS_RP mapToWsResponse(SoapInputFieldValueException exception, Map<String, Object> properties);

  WS_RP mapToWsResponse(SocketTimeoutException exception, Map<String, Object> properties);

  // endregion

  // region Default Method Implementations

  /**
   * Gets the custom header filter strategy bean name. Defaults to "cxfSOAPCamelHeaderFilter".
   *
   * @return The header filter strategy bean name
   */
  default String getCustomHeaderFilterStrategy() {
    return "cxfSOAPCamelHeaderFilter";
  }

  /**
   * Initializes the SOAP JAXB data format.
   *
   * @return The initialized data format
   * @throws ClassNotFoundException if service interface cannot be found
   */
  default SoapJaxbDataFormat initDataFormat() throws ClassNotFoundException {
    long start = System.currentTimeMillis();

    Class<?> serviceInterface = Class.forName(getPackageName() + "." + getServiceInterfaceName());

    if (getLogger().isDebugEnabled()) {
      long end = System.currentTimeMillis();
      getLogger().debug("Class.forName took {}ms", (end - start));
    }

    SoapJaxbDataFormat format = new SoapJaxbDataFormat(
      getPackageName(),
      new ServiceInterfaceStrategy(serviceInterface, true)
    );

    configureMarshallerProperties(format);

    return format;
  }

  /**
   * Configures the marshaller properties for CDATA handling.
   *
   * @param format The SOAP JAXB data format to configure
   */
  default void configureMarshallerProperties(SoapJaxbDataFormat format) {
    Map<String, Object> props = new HashMap<>();
    props.put(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    props.put(CharacterEscapeHandler.class.getName(),
      (CharacterEscapeHandler) (ch, start, length, isAttVal, writer) -> writer.write(ch, start,
        length));
    format.setJaxbProviderProperties(props);
  }

  // Additional default methods would follow...

  default public void setupHttpHeaders(@Body SOAP_BODY_RQ body,
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    String soapAction = (String) properties.get(SOAP_ACTION);
    String contentType = (String) properties.get(SOAP_CONTENT_TYPE);
    SoapJaxbDataFormat dataFormat = (SoapJaxbDataFormat) properties.get(SOAP_DATA_FORMAT);

    String version = StringUtils.trim(dataFormat.getVersion());

    if (StringUtils.isNotBlank(contentType)) {
      headers.put(Exchange.CONTENT_TYPE, contentType);
    }

    /* The SOAPAction HTTP header is required by SOAP 1.1 and therefore by the WSA. It can be blank or have a value, but the HTTP header has to be there. */
    if (StringUtils.equalsIgnoreCase(VERSION_1_1, version)) {

      StringBuffer val = new StringBuffer();
      val.append("\"");
      val.append(StringUtils.isBlank(soapAction) ? "" : soapAction);
      val.append("\"");

      headers.put(SOAP_ACTION, val.toString());
    }
    this.constructCustomHttpHeaders(headers, properties);
  }

  /**
   * The function to let caller to construct custom HTTP header for the SOAP web service
   *
   * @param headers
   * @param properties
   */
  default public void constructCustomHttpHeaders(Map<String, Object> headers,
    Map<String, Object> properties) {

  }

  default String setupEndpointUri(String packageName, String serviceName, String url,
    SoapJaxbDataFormat dataFormat, String portName, String headerFilterStrategy) {

    List<String> versions = getSupportedVersions();
    String bindingId = null;
    String version = StringUtils.trim(dataFormat.getVersion());

    if (StringUtils.isNotBlank(version)) {

      if (!versions.contains(version)) {
        throw new IllegalArgumentException("Invalid SOAP version : '" + version + "'");
      }

      if (StringUtils.equalsIgnoreCase(VERSION_1_1, version)) {
        bindingId = SOAPBinding.SOAP11HTTP_BINDING;
      } else if (StringUtils.equalsIgnoreCase(VERSION_1_2, version)) {
        bindingId = SOAPBinding.SOAP12HTTP_BINDING;
      }
    } else {
      bindingId = SOAPBinding.SOAP11HTTP_BINDING;
    }

    String serviceClass = packageName + "." + serviceName;

    /*
     * Currently using cxf://someAddress[?options] style not cxf:bean:cxfEndpoint[?options]
     * to send SOAP request.
     *
     * WARN : Only cxf:bean:cxfEndpoint style allows caller
     * to supply operationName & defaultOperationName options in the camel exchange
     *  for SOAP to know which soap:operation to work (AKA web service method)
     */
    StringBuffer buffer = new StringBuffer();
    buffer.append("cxf://");
    buffer.append(url);
    buffer.append("?");
    buffer.append("dataFormat=RAW");
    buffer.append("&");
    buffer.append("serviceClass=");
    buffer.append(serviceClass);
    buffer.append("&");
    buffer.append("bindingId=");
    buffer.append(bindingId);

    if (StringUtils.isNotBlank(portName)) {
      buffer.append("&");
      buffer.append("portName=");
      buffer.append(portName);
    }

    if (StringUtils.isNotBlank(headerFilterStrategy)) {
      buffer.append("&");
      buffer.append("headerFilterStrategy=");
      buffer.append("#" + headerFilterStrategy);
    }

    //    if (StringUtils.isNotBlank(getCustomCxfEndpointConfigurer())) {
    //      buffer.append("&");
    //      buffer.append("cxfEndpointConfigurer=");
    //      buffer.append("#"+getCustomCxfEndpointConfigurer());
    //    }

    if (StringUtils.isNotBlank(getCustomSSLContextParameters())) {
      buffer.append("&");
      buffer.append("sslContextParameters =");
      buffer.append("#" + getCustomSSLContextParameters());
    }

    String endpointUri = buffer.toString();

    return endpointUri;
  }



  default String setupHttpContentType(SoapJaxbDataFormat dataFormat) {

    /*
     * Please take note, because of using SoapJaxbDataFormat to marshal WS_RQ into SOAP request xml string,
     * the generated HTTP Header Content-Type by CFX is defaulted as application/xml instead of 'text/xml or application/soap+xml',
     * so we need to override it.
     */
    StringBuffer contentType = new StringBuffer();

    List<String> versions = getSupportedVersions();

    String version = StringUtils.trim(dataFormat.getVersion());

    String soap11ContentType = getSoap11ContentType();
    String soap11ContentTypeCharSet = getSoap11ContentTypeCharset();

    if (StringUtils.isNotBlank(version)) {

      if (!versions.contains(version)) {
        throw new IllegalArgumentException("Invalid SOAP version : '" + version + "'");
      }

      if (StringUtils.equalsIgnoreCase(VERSION_1_1, version)) {
        formSOAP11ContentType(contentType, soap11ContentType, soap11ContentTypeCharSet);
      } else if (StringUtils.equalsIgnoreCase(VERSION_1_2, version)) {

        String soap12ContentType = getSoap12ContentType();
        String soap12ContentTypeCharSet = getSoap12ContentTypeCharset();
        String soap12ContentTypeAction = getSoap12ContentTypeAction();

        formSOAP12ContentType(contentType, soap12ContentType, soap12ContentTypeCharSet,
          soap12ContentTypeAction);
      }
    } else {
      formSOAP11ContentType(contentType, soap11ContentType, soap11ContentTypeCharSet);
    }

    return contentType.toString();
  }

  default void setupExchangeProperties(@Body WS_RQ body,
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    String url = getUrl();
    String serviceName = getServiceName();
    SoapJaxbDataFormat dataFormat = getDataFormat();
    String packageName = getPackageName();
    String portName = getPortName();
    String headerFilterStrategy = getCustomHeaderFilterStrategy();

    if (dataFormat == null) {
      throw new IllegalArgumentException("dataFormat is required");
    }

    if (StringUtils.isBlank(url)) {
      throw new IllegalArgumentException("url is required");
    }

    if (StringUtils.isBlank(serviceName)) {
      throw new IllegalArgumentException("serviceName is required");
    }

    if (StringUtils.isBlank(packageName)) {
      throw new IllegalArgumentException("packageName is required");
    }

    String soap11SOAPAction = getSoap11SOAPAction();
    String contentType = setupHttpContentType(dataFormat);
    String endpointUri =
      setupEndpointUri(packageName, serviceName, url, dataFormat, portName, headerFilterStrategy);

    properties.put(SOAP_ACTION, StringUtils.isBlank(soap11SOAPAction) ? "" : soap11SOAPAction);
    properties.put(SOAP_CONTENT_TYPE, contentType);
    properties.put(SOAP_DATA_FORMAT, dataFormat);
    properties.put(SOAP_ENDPOINT, endpointUri);
  }

  default public WS_RP handleSOAPFault(@ExchangeProperties Map<String, Object> properties,
    @Headers Map<String, Object> headers) {

    SOAPFaultException soapFaultException =
      (SOAPFaultException) properties.get(Exchange.EXCEPTION_CAUGHT);

    SoapJaxbDataFormat dataFormat = (SoapJaxbDataFormat) properties.get(SOAP_DATA_FORMAT);

    return mapToWsResponse(soapFaultException, dataFormat, properties);
  }

  default public WS_RP handleFault(@ExchangeProperties Map<String, Object> properties,
    @Headers Map<String, Object> headers) {

    org.apache.cxf.interceptor.Fault fault =
      (org.apache.cxf.interceptor.Fault) properties.get(Exchange.EXCEPTION_CAUGHT);

    return mapToWsResponse(fault, properties);
  }

  default public WS_RP handleResponseHandlerException(
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    Exception exception = (Exception) properties.get(Exchange.EXCEPTION_CAUGHT);

    return mapSOAPResponseHandlerExceptionToWsResponse(exception, properties);
  }

  default public WS_RP handleRequestHandlerException(
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    Exception exception = (Exception) properties.get(Exchange.EXCEPTION_CAUGHT);

    return mapSOAPRequestHandlerExceptionToWsResponse(exception, properties);
  }

  default public WS_RP toWSResponse(@Body SOAP_BODY_RP sourceObject,
    @ExchangeProperties Map<String, Object> properties) {

    return constructWSResponse(sourceObject, properties);
  }

  default public SOAP_BODY_RQ toSOAPRquest(@Body WS_RQ sourceObject) {

    return constructSOAPBody(sourceObject);
  }

  default public void validateRequest(@Body WS_RQ sourceObject,
    @Headers Map<String, Object> headers,
    @ExchangeProperties Map<String, Object> properties) throws SoapInputFieldValueException {

    validate(sourceObject, headers, properties);
  }

  default public WS_RP handleSOAPInputFieldValueException(
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    SoapInputFieldValueException exception =
      (SoapInputFieldValueException) properties.get(Exchange.EXCEPTION_CAUGHT);

    return mapToWsResponse(exception, properties);
  }

  default public WS_RP handleSocketTimeoutException(
    @ExchangeProperties Map<String, Object> properties, @Headers Map<String, Object> headers) {

    SocketTimeoutException exception =
      (SocketTimeoutException) properties.get(Exchange.EXCEPTION_CAUGHT);

    return mapToWsResponse(exception, properties);
  }


  /**
   * To be used in conjunction with org.springframework.context.annotation.Configuration, auto bind
   * a custom CxfEndpointConfigurer to control HTTP client behavior.
   *
   * @return
   */
  default CustomCxfEndpointConfigurer initCustomCxfEndpointConfigurer() {

    CustomCxfEndpointConfigurer configurer = new CustomCxfEndpointConfigurer(getReceiveTimeout());

    return configurer;
  }

  class CustomCxfEndpointConfigurer extends CxfEndpointConfigurer {

    /* In future you may add other HTTPClientPolicy configuration you want to override besides receiveTimeout */
    private Long receiveTimeout;

    public CustomCxfEndpointConfigurer(Long receiveTimeout) {
      this.receiveTimeout = receiveTimeout;
    }
  }

}
