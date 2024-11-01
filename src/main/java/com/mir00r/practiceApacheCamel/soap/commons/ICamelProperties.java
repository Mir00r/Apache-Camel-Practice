package com.mir00r.practiceApacheCamel.soap.commons;

/**
 * Camel property keys for SOAP operations
 */
public interface ICamelProperties {
  String IMPL_BEAN_REF = "IMPL_BEAN_REF";
  String ORIGINAL_WS_RQ = "ORIGINAL_WS_RQ";
  String SOAP_DATA_FORMAT = "SOAP_DATA_FORMAT";
  String SOAP_ACTION = "SOAP_ACTION";
  String SOAP_CONTENT_TYPE = "SOAP_CONTENT_TYPE";
  String SOAP_OPERATION = "SOAP_OPERATION";
  String SOAP_OPERATION_NAMESPACE = "SOAP_OPERATION_NAMESPACE";
  String SOAP_ENDPOINT = "SOAP_ENDPOINT";
  String SOAP_URL = "SOAP_URL";
  String SOAP_SERVICE_NAME = "SOAP_SERVICE_NAME";
  String EXCEPTION_STACKTRACE = "${exception.stacktrace}";
  String IN_BODY = "${in.body}";

}
