
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the specific detials of a transaction
 * 
 * &lt;p&gt;Java class for TransactionData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TransactionData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="amount" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="executionSpeed" type="{http://ws.csd.rsa.com}ExecutionSpeed" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="myAccountData" type="{http://ws.csd.rsa.com}AccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="otherAccountBankType" type="{http://ws.csd.rsa.com}OtherAccountBankType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="otherAccountData" type="{http://ws.csd.rsa.com}AccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="otherAccountOwnershipType" type="{http://ws.csd.rsa.com}OtherAccountOwnershipType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="otherAccountType" type="{http://ws.csd.rsa.com}OtherAccountType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="previousAmount" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="recurringFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="schedule" type="{http://ws.csd.rsa.com}Schedule" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="transferMediumType" type="{http://ws.csd.rsa.com}TransferMediumType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionData", propOrder = {
    "amount",
    "dueDate",
    "estimatedDeliveryDate",
    "executionSpeed",
    "myAccountData",
    "otherAccountBankType",
    "otherAccountData",
    "otherAccountOwnershipType",
    "otherAccountType",
    "previousAmount",
    "recurringFrequency",
    "schedule",
    "transferMediumType"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class TransactionData {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount amount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String dueDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String estimatedDeliveryDate;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ExecutionSpeed executionSpeed;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AccountData myAccountData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OtherAccountBankType otherAccountBankType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AccountData otherAccountData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OtherAccountOwnershipType otherAccountOwnershipType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OtherAccountType otherAccountType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount previousAmount;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer recurringFrequency;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Schedule schedule;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TransferMediumType transferMediumType;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setEstimatedDeliveryDate(String value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the executionSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionSpeed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ExecutionSpeed getExecutionSpeed() {
        return executionSpeed;
    }

    /**
     * Sets the value of the executionSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionSpeed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setExecutionSpeed(ExecutionSpeed value) {
        this.executionSpeed = value;
    }

    /**
     * Gets the value of the myAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AccountData getMyAccountData() {
        return myAccountData;
    }

    /**
     * Sets the value of the myAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setMyAccountData(AccountData value) {
        this.myAccountData = value;
    }

    /**
     * Gets the value of the otherAccountBankType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAccountBankType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OtherAccountBankType getOtherAccountBankType() {
        return otherAccountBankType;
    }

    /**
     * Sets the value of the otherAccountBankType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAccountBankType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOtherAccountBankType(OtherAccountBankType value) {
        this.otherAccountBankType = value;
    }

    /**
     * Gets the value of the otherAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AccountData getOtherAccountData() {
        return otherAccountData;
    }

    /**
     * Sets the value of the otherAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOtherAccountData(AccountData value) {
        this.otherAccountData = value;
    }

    /**
     * Gets the value of the otherAccountOwnershipType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAccountOwnershipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OtherAccountOwnershipType getOtherAccountOwnershipType() {
        return otherAccountOwnershipType;
    }

    /**
     * Sets the value of the otherAccountOwnershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAccountOwnershipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOtherAccountOwnershipType(OtherAccountOwnershipType value) {
        this.otherAccountOwnershipType = value;
    }

    /**
     * Gets the value of the otherAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAccountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OtherAccountType getOtherAccountType() {
        return otherAccountType;
    }

    /**
     * Sets the value of the otherAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAccountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOtherAccountType(OtherAccountType value) {
        this.otherAccountType = value;
    }

    /**
     * Gets the value of the previousAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getPreviousAmount() {
        return previousAmount;
    }

    /**
     * Sets the value of the previousAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setPreviousAmount(Amount value) {
        this.previousAmount = value;
    }

    /**
     * Gets the value of the recurringFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Sets the value of the recurringFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRecurringFrequency(Integer value) {
        this.recurringFrequency = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the transferMediumType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferMediumType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TransferMediumType getTransferMediumType() {
        return transferMediumType;
    }

    /**
     * Sets the value of the transferMediumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferMediumType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTransferMediumType(TransferMediumType value) {
        this.transferMediumType = value;
    }

}
