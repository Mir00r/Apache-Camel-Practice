package com.mir00r.practiceApacheCamel.soap.commons;

import org.apache.commons.lang3.StringUtils;

import static com.mir00r.practiceApacheCamel.soap.commons.IHttpHeaders.Soap11.SOAP_11_CONTENT_TYPE_DEFAULT;
import static com.mir00r.practiceApacheCamel.soap.commons.IHttpHeaders.Soap12.SOAP_12_ACTION_END;
import static com.mir00r.practiceApacheCamel.soap.commons.IHttpHeaders.Soap12.SOAP_12_ACTION_START;
import static com.mir00r.practiceApacheCamel.soap.commons.IHttpHeaders.Soap12.SOAP_12_CONTENT_TYPE_DEFAULT;

/**
 * HTTP header constants for SOAP
 */
public interface IHttpHeaders {

  String CONTENT_TYPE_CHARSET = "charset=";
  String CONTENT_TYPE_CHARSET_DEFAULT = "UTF-8";

  interface Soap11 {
    String SOAP_11_CONTENT_TYPE_DEFAULT = "text/xml";
    String SOAP_11_SOAP_ACTION = "SOAPAction";
  }

  interface Soap12 {
    String SOAP_12_CONTENT_TYPE_DEFAULT = "application/soap+xml";
    String SOAP_12_ACTION_START = "action=\"";
    String SOAP_12_ACTION_END = "\"";
  }

  default void formSOAP11ContentType(StringBuffer contentType, String soap11ContentType,
    String soap11ContentTypeCharSet) {

    // Example of Content-Type for SOAP 1.1 captured from SOAPUI
    // Content-Type: text/xml;charset=UTF-8"

    if (StringUtils.isBlank(soap11ContentType)) {
      contentType.append(SOAP_11_CONTENT_TYPE_DEFAULT);
    } else {
      contentType.append(soap11ContentType);
    }

    contentType.append(";");
    contentType.append(CONTENT_TYPE_CHARSET);

    if (StringUtils.isBlank(soap11ContentTypeCharSet)) {
      contentType.append(CONTENT_TYPE_CHARSET_DEFAULT);
    } else {
      contentType.append(soap11ContentTypeCharSet);
    }
  }

  default void formSOAP12ContentType(StringBuffer contentType, String soap12ContentType,
    String soap12ContentTypeCharSet, String soap12ContentTypeAction) {

    // Example of Content-Type for SOAP 1.2 captured from SOAPUI
    // Content-Type: application/soap+xml;charset=UTF-8;action="http://tempuri.org/PlatformIMP/Service1/deliverMessage"

    if (StringUtils.isBlank(soap12ContentType)) {
      contentType.append(SOAP_12_CONTENT_TYPE_DEFAULT);
    } else {
      contentType.append(soap12ContentType);
    }

    contentType.append(";");
    contentType.append(CONTENT_TYPE_CHARSET);

    if (StringUtils.isBlank(soap12ContentTypeCharSet)) {
      contentType.append(CONTENT_TYPE_CHARSET_DEFAULT);
    } else {
      contentType.append(soap12ContentTypeCharSet);
    }

    contentType.append(";");
    contentType.append(SOAP_12_ACTION_START);

    if (StringUtils.isBlank(soap12ContentTypeAction)) {
      throw new IllegalArgumentException("soap12ContentTypeAction is required");
    }

    contentType.append(soap12ContentTypeAction);
    contentType.append(SOAP_12_ACTION_END);

  }
}
