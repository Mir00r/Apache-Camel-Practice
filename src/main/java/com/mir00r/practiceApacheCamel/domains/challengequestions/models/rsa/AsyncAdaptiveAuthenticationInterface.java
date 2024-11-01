package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 3.3.10
 * 2024-10-28T16:59:47.791+08:00
 * Generated source version: 3.3.10
 *
 */
@WebService(targetNamespace = "http://ws.csd.rsa.com", name = "AsyncAdaptiveAuthenticationInterface")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.791+08:00", comments = "Apache CXF 3.3.10")
public interface AsyncAdaptiveAuthenticationInterface {

    @WebMethod(action = "rsa:analyze:Analyze")
    @Oneway
    @RequestWrapper(localName = "analyze", targetNamespace = "http://ws.csd.rsa.com", className = "com.sde.mobiusgateway.wsdl2java.rsa.Analyze")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.791+08:00")
    public void analyze(

        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        com.sde.mobiusgateway.wsdl2java.rsa.AnalyzeRequest request
    );

    @WebMethod(action = "rsa:notify:Notify")
    @Oneway
    @RequestWrapper(localName = "notify", targetNamespace = "http://ws.csd.rsa.com", className = "com.sde.mobiusgateway.wsdl2java.rsa.Notify")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.791+08:00")
    public void notify(

        @WebParam(name = "request", targetNamespace = "http://ws.csd.rsa.com")
        com.sde.mobiusgateway.wsdl2java.rsa.NotifyRequest request
    );
}