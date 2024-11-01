
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the contents of a Generic Response
 * 
 * &lt;p&gt;Java class for GenericResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GenericResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="deviceResult" type="{http://ws.csd.rsa.com}DeviceResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="identificationData" type="{http://ws.csd.rsa.com}IdentificationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="messageHeader" type="{http://ws.csd.rsa.com}MessageHeader"/&amp;gt;
 *         &amp;lt;element name="statusHeader" type="{http://ws.csd.rsa.com}StatusHeader"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResponse", propOrder = {
    "deviceResult",
    "identificationData",
    "messageHeader",
    "statusHeader"
})
@XmlSeeAlso({
    NotifyResponse2 .class,
    QueryResponse2 .class,
    AnalyzeResponse2 .class,
    AuthenticateResponse2 .class,
    ChallengeResponse2 .class,
    CreateUserResponse2 .class,
    QueryAuthStatusResponse2 .class,
    UpdateUserResponse2 .class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public abstract class GenericResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceResult deviceResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected IdentificationData identificationData;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected MessageHeader messageHeader;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected StatusHeader statusHeader;

    /**
     * Gets the value of the deviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceResult getDeviceResult() {
        return deviceResult;
    }

    /**
     * Sets the value of the deviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceResult(DeviceResult value) {
        this.deviceResult = value;
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
     * Gets the value of the statusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link StatusHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public StatusHeader getStatusHeader() {
        return statusHeader;
    }

    /**
     * Sets the value of the statusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setStatusHeader(StatusHeader value) {
        this.statusHeader = value;
    }

}
