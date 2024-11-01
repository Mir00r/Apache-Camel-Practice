
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnalyzeRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnalyzeRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericRequest"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="channel" type="{http://ws.csd.rsa.com}DeviceIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="autoCreateUserFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="clientReturnData" type="{http://ws.csd.rsa.com}ClientReturnData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="collectionRequest" type="{http://ws.csd.rsa.com}CollectionRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="credentialDataList" type="{http://ws.csd.rsa.com}CredentialDataList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementRequest" type="{http://ws.csd.rsa.com}DeviceManagementRequestPayload" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventDataList" type="{http://ws.csd.rsa.com}EventDataList"/&amp;gt;
 *         &amp;lt;element name="runRiskType" type="{http://ws.csd.rsa.com}RunRiskType"/&amp;gt;
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
@XmlType(name = "AnalyzeRequest", propOrder = {
    "channel",
    "autoCreateUserFlag",
    "clientReturnData",
    "collectionRequest",
    "credentialDataList",
    "deviceManagementRequest",
    "eventDataList",
    "runRiskType",
    "userData",
    "channelIndicator",
    "clientDefinedChannelIndicator"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class AnalyzeRequest
    extends GenericRequest
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceIdentifier channel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean autoCreateUserFlag;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ClientReturnData clientReturnData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CollectionRequest collectionRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialDataList credentialDataList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementRequestPayload deviceManagementRequest;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected EventDataList eventDataList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected RunRiskType runRiskType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserData userData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChannelIndicatorType channelIndicator;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String clientDefinedChannelIndicator;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceIdentifier getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChannel(DeviceIdentifier value) {
        this.channel = value;
    }

    /**
     * Gets the value of the autoCreateUserFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isAutoCreateUserFlag() {
        return autoCreateUserFlag;
    }

    /**
     * Sets the value of the autoCreateUserFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAutoCreateUserFlag(Boolean value) {
        this.autoCreateUserFlag = value;
    }

    /**
     * Gets the value of the clientReturnData property.
     * 
     * @return
     *     possible object is
     *     {@link ClientReturnData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ClientReturnData getClientReturnData() {
        return clientReturnData;
    }

    /**
     * Sets the value of the clientReturnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientReturnData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setClientReturnData(ClientReturnData value) {
        this.clientReturnData = value;
    }

    /**
     * Gets the value of the collectionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CollectionRequest getCollectionRequest() {
        return collectionRequest;
    }

    /**
     * Sets the value of the collectionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCollectionRequest(CollectionRequest value) {
        this.collectionRequest = value;
    }

    /**
     * Gets the value of the credentialDataList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialDataList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialDataList getCredentialDataList() {
        return credentialDataList;
    }

    /**
     * Sets the value of the credentialDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialDataList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialDataList(CredentialDataList value) {
        this.credentialDataList = value;
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
     * Gets the value of the eventDataList property.
     * 
     * @return
     *     possible object is
     *     {@link EventDataList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public EventDataList getEventDataList() {
        return eventDataList;
    }

    /**
     * Sets the value of the eventDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDataList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEventDataList(EventDataList value) {
        this.eventDataList = value;
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
