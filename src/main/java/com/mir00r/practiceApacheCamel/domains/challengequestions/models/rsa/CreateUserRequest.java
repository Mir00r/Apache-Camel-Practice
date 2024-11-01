
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CreateUserRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreateUserRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericRequest"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="credentialManagementRequestList" type="{http://ws.csd.rsa.com}CredentialManagementRequestList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementRequest" type="{http://ws.csd.rsa.com}DeviceManagementRequestPayload" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="runRiskType" type="{http://ws.csd.rsa.com}RunRiskType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="siteToUserBrowseRequest" type="{http://ws.csd.rsa.com}SiteToUserBrowseRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userData" type="{http://ws.csd.rsa.com}UserData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="channelIndicator" type="{http://ws.csd.rsa.com}ChannelIndicatorType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="clientDefinedChannelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUserRequest", propOrder = {
    "credentialManagementRequestList",
    "deviceManagementRequest",
    "runRiskType",
    "siteToUserBrowseRequest",
    "userData",
    "channelIndicator",
    "clientDefinedChannelIndicator"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CreateUserRequest
    extends GenericRequest
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialManagementRequestList credentialManagementRequestList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementRequestPayload deviceManagementRequest;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected RunRiskType runRiskType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SiteToUserBrowseRequest siteToUserBrowseRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserData userData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChannelIndicatorType channelIndicator;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String clientDefinedChannelIndicator;

    /**
     * Gets the value of the credentialManagementRequestList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialManagementRequestList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialManagementRequestList getCredentialManagementRequestList() {
        return credentialManagementRequestList;
    }

    /**
     * Sets the value of the credentialManagementRequestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialManagementRequestList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialManagementRequestList(CredentialManagementRequestList value) {
        this.credentialManagementRequestList = value;
    }

    /**
     * Gets the value of the deviceManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceManagementRequestPayload getDeviceManagementRequest() {
        return deviceManagementRequest;
    }

    /**
     * Sets the value of the deviceManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementRequestPayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceManagementRequest(DeviceManagementRequestPayload value) {
        this.deviceManagementRequest = value;
    }

    /**
     * Gets the value of the runRiskType property.
     * 
     * @return
     *     possible object is
     *     {@link RunRiskType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public RunRiskType getRunRiskType() {
        return runRiskType;
    }

    /**
     * Sets the value of the runRiskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunRiskType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRunRiskType(RunRiskType value) {
        this.runRiskType = value;
    }

    /**
     * Gets the value of the siteToUserBrowseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SiteToUserBrowseRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public SiteToUserBrowseRequest getSiteToUserBrowseRequest() {
        return siteToUserBrowseRequest;
    }

    /**
     * Sets the value of the siteToUserBrowseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteToUserBrowseRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSiteToUserBrowseRequest(SiteToUserBrowseRequest value) {
        this.siteToUserBrowseRequest = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public UserData getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserData(UserData value) {
        this.userData = value;
    }

    /**
     * Gets the value of the channelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelIndicatorType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChannelIndicatorType getChannelIndicator() {
        return channelIndicator;
    }

    /**
     * Sets the value of the channelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelIndicatorType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChannelIndicator(ChannelIndicatorType value) {
        this.channelIndicator = value;
    }

    /**
     * Gets the value of the clientDefinedChannelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getClientDefinedChannelIndicator() {
        return clientDefinedChannelIndicator;
    }

    /**
     * Sets the value of the clientDefinedChannelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setClientDefinedChannelIndicator(String value) {
        this.clientDefinedChannelIndicator = value;
    }

}
