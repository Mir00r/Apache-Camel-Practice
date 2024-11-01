
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object defines the contact information for a user
 * 
 * &lt;p&gt;Java class for PersonInfo complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PersonInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ssnInfo" type="{http://ws.kba.csd.rsa.com}SSNInfo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nameInfo" type="{http://ws.kba.csd.rsa.com}NameInfo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="addressInfo" type="{http://ws.kba.csd.rsa.com}AddressInfo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="birthdayInfo" type="{http://ws.kba.csd.rsa.com}BirthdayInfo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="languageInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo", namespace = "http://ws.kba.csd.rsa.com", propOrder = {
    "ssnInfo",
    "nameInfo",
    "addressInfo",
    "birthdayInfo",
    "languageInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class PersonInfo {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SSNInfo ssnInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected NameInfo nameInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AddressInfo addressInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected BirthdayInfo birthdayInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String languageInfo;

    /**
     * Gets the value of the ssnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SSNInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public SSNInfo getSsnInfo() {
        return ssnInfo;
    }

    /**
     * Sets the value of the ssnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSNInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSsnInfo(SSNInfo value) {
        this.ssnInfo = value;
    }

    /**
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public NameInfo getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setNameInfo(NameInfo value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the birthdayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BirthdayInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public BirthdayInfo getBirthdayInfo() {
        return birthdayInfo;
    }

    /**
     * Sets the value of the birthdayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthdayInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setBirthdayInfo(BirthdayInfo value) {
        this.birthdayInfo = value;
    }

    /**
     * Gets the value of the languageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getLanguageInfo() {
        return languageInfo;
    }

    /**
     * Sets the value of the languageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLanguageInfo(String value) {
        this.languageInfo = value;
    }

}
