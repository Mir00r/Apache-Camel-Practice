
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines all relevant information about an event
 * 
 * &lt;p&gt;Java class for EventData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EventData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="authenticationLevel" type="{http://ws.csd.rsa.com}AuthenticationLevel" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="clientDefinedAttributeList" type="{http://ws.csd.rsa.com}FactList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="clientDefinedEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventType" type="{http://ws.csd.rsa.com}EventType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="newUserData" type="{http://ws.csd.rsa.com}UserData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="stockTradeData" type="{http://ws.csd.rsa.com}StockTradeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="timeOfOccurrence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="transactionData" type="{http://ws.csd.rsa.com}TransactionData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventData", propOrder = {
    "authenticationLevel",
    "clientDefinedAttributeList",
    "clientDefinedEventType",
    "eventDescription",
    "eventId",
    "eventReferenceId",
    "eventType",
    "newUserData",
    "stockTradeData",
    "timeOfOccurrence",
    "transactionData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class EventData {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AuthenticationLevel authenticationLevel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected FactList clientDefinedAttributeList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String clientDefinedEventType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String eventDescription;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String eventId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String eventReferenceId;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected EventType eventType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserData newUserData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected StockTradeData stockTradeData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String timeOfOccurrence;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TransactionData transactionData;

    /**
     * Gets the value of the authenticationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AuthenticationLevel getAuthenticationLevel() {
        return authenticationLevel;
    }

    /**
     * Sets the value of the authenticationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAuthenticationLevel(AuthenticationLevel value) {
        this.authenticationLevel = value;
    }

    /**
     * Gets the value of the clientDefinedAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link FactList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public FactList getClientDefinedAttributeList() {
        return clientDefinedAttributeList;
    }

    /**
     * Sets the value of the clientDefinedAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setClientDefinedAttributeList(FactList value) {
        this.clientDefinedAttributeList = value;
    }

    /**
     * Gets the value of the clientDefinedEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getClientDefinedEventType() {
        return clientDefinedEventType;
    }

    /**
     * Sets the value of the clientDefinedEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setClientDefinedEventType(String value) {
        this.clientDefinedEventType = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getEventReferenceId() {
        return eventReferenceId;
    }

    /**
     * Sets the value of the eventReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEventReferenceId(String value) {
        this.eventReferenceId = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the newUserData property.
     * 
     * @return
     *     possible object is
     *     {@link UserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public UserData getNewUserData() {
        return newUserData;
    }

    /**
     * Sets the value of the newUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setNewUserData(UserData value) {
        this.newUserData = value;
    }

    /**
     * Gets the value of the stockTradeData property.
     * 
     * @return
     *     possible object is
     *     {@link StockTradeData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public StockTradeData getStockTradeData() {
        return stockTradeData;
    }

    /**
     * Sets the value of the stockTradeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTradeData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setStockTradeData(StockTradeData value) {
        this.stockTradeData = value;
    }

    /**
     * Gets the value of the timeOfOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getTimeOfOccurrence() {
        return timeOfOccurrence;
    }

    /**
     * Sets the value of the timeOfOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTimeOfOccurrence(String value) {
        this.timeOfOccurrence = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTransactionData(TransactionData value) {
        this.transactionData = value;
    }

}
