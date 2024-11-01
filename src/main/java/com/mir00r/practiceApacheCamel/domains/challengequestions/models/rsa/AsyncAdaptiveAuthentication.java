package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.3.10
 * 2024-10-28T16:59:47.830+08:00
 * Generated source version: 3.3.10
 *
 */
@WebServiceClient(name = "AsyncAdaptiveAuthentication",
                  wsdlLocation = "file:/C:/Users/sdarmd/Desktop/SDE/CBS/sde-biz-affin-mobius-gateway/sde-biz-affin-mobius-gateway-service/src/main/resources/wsdl/RSA/AdaptiveAuthentication_1.wsdl",
                  targetNamespace = "http://ws.csd.rsa.com")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00", comments = "Apache CXF 3.3.10")
public class AsyncAdaptiveAuthentication extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public final static QName SERVICE = new QName("http://ws.csd.rsa.com", "AsyncAdaptiveAuthentication");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public final static QName AsyncAdaptiveAuthentication = new QName("http://ws.csd.rsa.com", "AsyncAdaptiveAuthentication");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/sdarmd/Desktop/SDE/CBS/sde-biz-affin-mobius-gateway/sde-biz-affin-mobius-gateway-service/src/main/resources/wsdl/RSA/AdaptiveAuthentication_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AsyncAdaptiveAuthentication.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/sdarmd/Desktop/SDE/CBS/sde-biz-affin-mobius-gateway/sde-biz-affin-mobius-gateway-service/src/main/resources/wsdl/RSA/AdaptiveAuthentication_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthentication(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AsyncAdaptiveAuthenticationInterface
     */
    @WebEndpoint(name = "AsyncAdaptiveAuthentication")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthenticationInterface getAsyncAdaptiveAuthentication() {
        return super.getPort(AsyncAdaptiveAuthentication, AsyncAdaptiveAuthenticationInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsyncAdaptiveAuthenticationInterface
     */
    @WebEndpoint(name = "AsyncAdaptiveAuthentication")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2024-10-28T16:59:47.830+08:00")
    public AsyncAdaptiveAuthenticationInterface getAsyncAdaptiveAuthentication(WebServiceFeature... features) {
        return super.getPort(AsyncAdaptiveAuthentication, AsyncAdaptiveAuthenticationInterface.class, features);
    }

}
