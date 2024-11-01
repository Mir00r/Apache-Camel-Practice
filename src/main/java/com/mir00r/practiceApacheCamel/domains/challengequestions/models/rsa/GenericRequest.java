
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of an abstract Generic Request
 * 
 * &lt;p&gt;Java class for GenericRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GenericRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="actionTypeList" type="{http://ws.csd.rsa.com}GenericActionTypeList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="configurationHeader" type="{http://ws.csd.rsa.com}ConfigurationHeader" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceRequest" type="{http://ws.csd.rsa.com}DeviceRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="identificationData" type="{http://ws.csd.rsa.com}IdentificationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="messageHeader" type="{http://ws.csd.rsa.com}MessageHeader"/&amp;gt;
 *         &amp;lt;element name="securityHeader" type="{http://ws.csd.rsa.com}SecurityHeader"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericRequest", propOrder = {
    "actionTypeList",
    "configurationHeader",
    "deviceRequest",
    "identificationData",
    "messageHeader",
    "securityHeader"
})
@XmlSeeAlso({
    NotifyRequest.class,
    QueryRequest.class,
    AnalyzeRequest.class,
    AuthenticateRequest.class,
    ChallengeRequest.class,
    CreateUserRequest.class,
    QueryAuthStatusRequest.class,
    UpdateUserRequest.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public abstract class GenericRequest {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected GenericActionTypeList actionTypeList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ConfigurationHeader configurationHeader;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceRequest deviceRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected IdentificationData identificationData;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected MessageHeader messageHeader;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SecurityHeader securityHeader;

    /**
     * Gets the value of the actionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link GenericActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public GenericActionTypeList getActionTypeList() {
        return actionTypeList;
    }

    /**
     * Sets the value of the actionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setActionTypeList(GenericActionTypeList value) {
        this.actionTypeList = value;
    }

    /**
     * Gets the value of the configurationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ConfigurationHeader getConfigurationHeader() {
        return configurationHeader;
    }

    /**
     * Sets the value of the configurationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setConfigurationHeader(ConfigurationHeader value) {
        this.configurationHeader = value;
    }

    /**
     * Gets the value of the deviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceRequest getDeviceRequest() {
        return deviceRequest;
    }

    /**
     * Sets the value of the deviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceRequest(DeviceRequest value) {
        this.deviceRequest = value;
    }

    /**
     * Gets the value of the identificationData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public IdentificationData getIdentificationData() {
        return identificationData;
    }

    /**
     * Sets the value of the identificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setIdentificationData(IdentificationData value) {
        this.identificationData = value;
    }

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the securityHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public SecurityHeader getSecurityHeader() {
        return securityHeader;
    }

    /**
     * Sets the value of the securityHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSecurityHeader(SecurityHeader value) {
        this.securityHeader = value;
    }

}
