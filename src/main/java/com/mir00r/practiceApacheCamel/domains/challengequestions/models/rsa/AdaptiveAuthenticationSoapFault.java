
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.10
 * 2024-10-28T16:59:47.673+08:00
 * Generated source version: 3.3.10
 */

@WebFault(name = "SoapFault", targetNamespace = "http://ws.csd.rsa.com")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00", comments = "Apache CXF 3.3.10")
public class AdaptiveAuthenticationSoapFault extends Exception {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    private com.sde.mobiusgateway.wsdl2java.rsa.SoapFaultType faultInfo;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public AdaptiveAuthenticationSoapFault() {
        super();
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public AdaptiveAuthenticationSoapFault(String message) {
        super(message);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public AdaptiveAuthenticationSoapFault(String message, Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public AdaptiveAuthenticationSoapFault(String message, com.sde.mobiusgateway.wsdl2java.rsa.SoapFaultType soapFault) {
        super(message);
        this.faultInfo = soapFault;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public AdaptiveAuthenticationSoapFault(String message, com.sde.mobiusgateway.wsdl2java.rsa.SoapFaultType soapFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = soapFault;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.673+08:00")
    public com.sde.mobiusgateway.wsdl2java.rsa.SoapFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
