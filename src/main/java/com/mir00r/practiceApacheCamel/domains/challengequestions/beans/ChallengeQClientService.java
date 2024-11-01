package com.mir00r.practiceApacheCamel.domains.challengequestions.beans;

import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRq;
import com.mir00r.practiceApacheCamel.domains.challengequestions.models.ChallengeQRs;
import com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa.Challenge;
import com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa.ChallengeResponse;
import com.mir00r.practiceApacheCamel.soap.commons.ISoapClientBaseService;
import com.mir00r.practiceApacheCamel.soap.commons.SoapInputFieldValueException;
import jakarta.xml.ws.soap.SOAPFaultException;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.cxf.interceptor.Fault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.SocketTimeoutException;
import java.util.Map;

@Component
public class ChallengeQClientService implements ISoapClientBaseService<ChallengeQRq, Challenge, ChallengeResponse, ChallengeQRs> {

  private SoapJaxbDataFormat soapJaxbDataFormat = null;

  private static final Logger log = LoggerFactory.getLogger(ChallengeQClientService.class);

  private static final String CXF_ENDPOINT_CONFIGURER_NAME = "challengeQuestionsCxfEndpointConfigurer";

  private static final String SYS_PARAM_SOAP_AUTH_USER_KEY = "challengequestions.soap.auth.userkey";
  private static final String SYS_PARAM_SOAP_AUTH_PASSWORD = "challengequestions.soap.auth.password";
  private static final String SYS_PARAM_SOAP_URL = "challengequestions.soap.url";
  private static final String SYS_PARAM_SOAP_VERSION = "challengequestions.soap.version";
  private static final String SYS_PARAM_SOAP_PACKAGE_NAME = "challengequestions.soap.packagename";
  private static final String SYS_PARAM_SOAP_SERVICE_NAME = "challengequestions.soap.servicename";
  private static final String SYS_PARAM_SOAP_SERVICE_INTERFACE_NAME = "challengequestions.soap.serviceinterfacename";
  private static final String SYS_PARAM_SOAP_PORT_NAME = "challengequestions.soap.portname";
  private static final String SYS_PARAM_SOAP_RECEIVE_TIMEOUT = "challengequestions.soap.receivetimeout";

  private static final String SYS_PARAM_SOAP_11_HTTP_HEADER_CONTENT_TYPE = "challengequestions.soap.11.httpheader.contenttype";
  private static final String SYS_PARAM_SOAP_11_HTTP_HEADER_CONTENT_TYPE_CHARSET = "challengequestions.soap.11.httpheader.contenttype.charset";
  private static final String SYS_PARAM_SOAP_11_HTTP_HEADER_SOAP_ACTION = "challengequestions.soap.11.httpheader.soapaction";

  private static final String SYS_PARAM_SOAP_12_HTTP_HEADER_CONTENT_TYPE = "challengequestions.soap.12.httpheader.contenttype";
  private static final String SYS_PARAM_SOAP_12_HTTP_HEADER_CONTENT_TYPE_CHARSET = "challengequestions.soap.12.httpheader.contenttype.charset";
  private static final String SYS_PARAM_SOAP_12_HTTP_HEADER_CONTENT_TYPE_ACTION = "challengequestions.soap.12.httpheader.contenttype.action";
  
  @Override
  public String getPortName() {
    return SYS_PARAM_SOAP_PORT_NAME;
  }

  @Override
  public String getPackageName() {
    return SYS_PARAM_SOAP_PACKAGE_NAME;
  }

  @Override
  public String getSoap11SOAPAction() {
    return SYS_PARAM_SOAP_11_HTTP_HEADER_SOAP_ACTION;
  }

  @Override
  public String getUrl() {
    return SYS_PARAM_SOAP_URL;
  }

  @Override
  public String getServiceName() {
    return SYS_PARAM_SOAP_SERVICE_NAME;
  }

  @Override
  public String getServiceInterfaceName() {
    return SYS_PARAM_SOAP_SERVICE_INTERFACE_NAME;
  }

  @Override
  public String getSoap11ContentType() {
    return SOAP_CONTENT_TYPE;
  }

  @Override
  public String getSoap11ContentTypeCharset() {
    return SYS_PARAM_SOAP_11_HTTP_HEADER_CONTENT_TYPE_CHARSET;
  }

  @Override
  public String getSoap12ContentType() {
    return SYS_PARAM_SOAP_12_HTTP_HEADER_CONTENT_TYPE_ACTION;
  }

  @Override
  public String getSoap12ContentTypeCharset() {
    return null;
  }

  @Override
  public String getSoap12ContentTypeAction() {
    return null;
  }

  @Override
  public SoapJaxbDataFormat getDataFormat() {
    return null;
  }

  @Override
  public String getCustomSSLContextParameters() {
    return null;
  }

  @Override
  public Logger getLogger() {
    return null;
  }

  @Override
  public Long getReceiveTimeout() {
    return null;
  }

  @Override
  public void validate(ChallengeQRq sourceObject, Map<String, Object> headers,
    Map<String, Object> properties) throws SoapInputFieldValueException {

  }

  @Override
  public Challenge constructSOAPBody(ChallengeQRq sourceObject) {
    return null;
  }

  @Override
  public ChallengeQRs constructWSResponse(ChallengeResponse sourceObject,
    Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapSOAPResponseHandlerExceptionToWsResponse(Exception exception,
    Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapSOAPRequestHandlerExceptionToWsResponse(Exception exception,
    Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapToWsResponse(SOAPFaultException exception, SoapJaxbDataFormat dataFormat,
    Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapToWsResponse(Fault fault, Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapToWsResponse(SoapInputFieldValueException exception,
    Map<String, Object> properties) {
    return null;
  }

  @Override
  public ChallengeQRs mapToWsResponse(SocketTimeoutException exception,
    Map<String, Object> properties) {
    return null;
  }
}
