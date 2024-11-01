package com.mir00r.practiceApacheCamel.soap.commons;

public interface IMethodNames {

  String HANDLE_SOAP_FAULT = "handleSOAPFault";
  String HANDLE_FAULT = "handleFault";
  String HANDLE_SOAP_INPUT_FIELD_VALUE_EXCEPTION = "handleSOAPInputFieldValueException";
  String HANDLE_SOCKET_TIMEOUT_EXCEPTION = "handleSocketTimeoutException";
  String HANDLE_REQUEST_HANDLER_EXCEPTION = "handleRequestHandlerException";
  String HANDLE_RESPONSE_HANDLER_EXCEPTION = "handleResponseHandlerException";
  String VALIDATE_REQUEST = "validateRequest";
  String SETUP_EXCHANGE_PROPERTIES = "setupExchangeProperties";
  String SETUP_HTTP_HEADERS = "setupHttpHeaders";
  String TO_WS_RESPONSE = "toWSResponse";
  String TO_SOAP_REQUEST = "toSOAPRquest";
}
