
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UserData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UserData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="business" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lastAccountOpenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lastOnlineServicePasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="onlineServiceEnrollDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="totalAvailableBalance" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="totalCreditLimit" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="totalCreditsUsed" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userAddress" type="{http://ws.csd.rsa.com}UserAddress" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userNameData" type="{http://ws.csd.rsa.com}UserName" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserData", propOrder = {
    "vip",
    "business",
    "lastAccountOpenDate",
    "lastOnlineServicePasswordChangeDate",
    "onlineServiceEnrollDate",
    "totalAvailableBalance",
    "totalCreditLimit",
    "totalCreditsUsed",
    "userAddress",
    "userNameData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class UserData {

    @XmlElement(name = "VIP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean vip;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean business;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String lastAccountOpenDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String lastOnlineServicePasswordChangeDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String onlineServiceEnrollDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount totalAvailableBalance;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount totalCreditLimit;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount totalCreditsUsed;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserAddress userAddress;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserName userNameData;

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isVIP() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setBusiness(Boolean value) {
        this.business = value;
    }

    /**
     * Gets the value of the lastAccountOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getLastAccountOpenDate() {
        return lastAccountOpenDate;
    }

    /**
     * Sets the value of the lastAccountOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLastAccountOpenDate(String value) {
        this.lastAccountOpenDate = value;
    }

    /**
     * Gets the value of the lastOnlineServicePasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getLastOnlineServicePasswordChangeDate() {
        return lastOnlineServicePasswordChangeDate;
    }

    /**
     * Sets the value of the lastOnlineServicePasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLastOnlineServicePasswordChangeDate(String value) {
        this.lastOnlineServicePasswordChangeDate = value;
    }

    /**
     * Gets the value of the onlineServiceEnrollDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getOnlineServiceEnrollDate() {
        return onlineServiceEnrollDate;
    }

    /**
     * Sets the value of the onlineServiceEnrollDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOnlineServiceEnrollDate(String value) {
        this.onlineServiceEnrollDate = value;
    }

    /**
     * Gets the value of the totalAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTotalAvailableBalance() {
        return totalAvailableBalance;
    }

    /**
     * Sets the value of the totalAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTotalAvailableBalance(Amount value) {
        this.totalAvailableBalance = value;
    }

    /**
     * Gets the value of the totalCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTotalCreditLimit() {
        return totalCreditLimit;
    }

    /**
     * Sets the value of the totalCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTotalCreditLimit(Amount value) {
        this.totalCreditLimit = value;
    }

    /**
     * Gets the value of the totalCreditsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTotalCreditsUsed() {
        return totalCreditsUsed;
    }

    /**
     * Sets the value of the totalCreditsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTotalCreditsUsed(Amount value) {
        this.totalCreditsUsed = value;
    }

    /**
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UserAddress }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public UserAddress getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddress }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserAddress(UserAddress value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the userNameData property.
     * 
     * @return
     *     possible object is
     *     {@link UserName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public UserName getUserNameData() {
        return userNameData;
    }

    /**
     * Sets the value of the userNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserNameData(UserName value) {
        this.userNameData = value;
    }

}
