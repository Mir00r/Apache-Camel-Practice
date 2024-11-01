
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthenticateResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuthenticateResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="credentialAuthResultList" type="{http://ws.csd.rsa.com}CredentialAuthResultList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="requiredCredentialList" type="{http://ws.csd.rsa.com}RequiredCredentialList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateResponse", propOrder = {
    "credentialAuthResultList",
    "deviceManagementResponse",
    "requiredCredentialList"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class AuthenticateResponse2
    extends GenericResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialAuthResultList credentialAuthResultList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementResponsePayload deviceManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected RequiredCredentialList requiredCredentialList;

    /**
     * Gets the value of the credentialAuthResultList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthResultList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialAuthResultList getCredentialAuthResultList() {
        return credentialAuthResultList;
    }

    /**
     * Sets the value of the credentialAuthResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthResultList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialAuthResultList(CredentialAuthResultList value) {
        this.credentialAuthResultList = value;
    }

    /**
     * Gets the value of the deviceManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceManagementResponsePayload getDeviceManagementResponse() {
        return deviceManagementResponse;
    }

    /**
     * Sets the value of the deviceManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceManagementResponse(DeviceManagementResponsePayload value) {
        this.deviceManagementResponse = value;
    }

    /**
     * Gets the value of the requiredCredentialList property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public RequiredCredentialList getRequiredCredentialList() {
        return requiredCredentialList;
    }

    /**
     * Sets the value of the requiredCredentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRequiredCredentialList(RequiredCredentialList value) {
        this.requiredCredentialList = value;
    }

}
