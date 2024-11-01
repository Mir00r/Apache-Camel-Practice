
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the composition for specific stock information
 * 
 * &lt;p&gt;Java class for StockData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StockData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ETF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SP500" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="currentMarketPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="last30DaysAveragePrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="last30DaysAverageVolume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="last30DaysHighPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="last30DaysLowPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="percentSharesHeldByInstitution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sharesFloating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sharesOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="todayHighPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="todayLowPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="todayOpenPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="todayVolume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockData", propOrder = {
    "etf",
    "otc",
    "sp500",
    "currentMarketPrice",
    "last30DaysAveragePrice",
    "last30DaysAverageVolume",
    "last30DaysHighPrice",
    "last30DaysLowPrice",
    "percentSharesHeldByInstitution",
    "sharesFloating",
    "sharesOut",
    "symbol",
    "todayHighPrice",
    "todayLowPrice",
    "todayOpenPrice",
    "todayVolume"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class StockData {

    @XmlElement(name = "ETF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean etf;
    @XmlElement(name = "OTC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean otc;
    @XmlElement(name = "SP500")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean sp500;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount currentMarketPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount last30DaysAveragePrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer last30DaysAverageVolume;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount last30DaysHighPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount last30DaysLowPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer percentSharesHeldByInstitution;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer sharesFloating;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer sharesOut;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String symbol;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount todayHighPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount todayLowPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount todayOpenPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer todayVolume;

    /**
     * Gets the value of the etf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isETF() {
        return etf;
    }

    /**
     * Sets the value of the etf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setETF(Boolean value) {
        this.etf = value;
    }

    /**
     * Gets the value of the otc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isOTC() {
        return otc;
    }

    /**
     * Sets the value of the otc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOTC(Boolean value) {
        this.otc = value;
    }

    /**
     * Gets the value of the sp500 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isSP500() {
        return sp500;
    }

    /**
     * Sets the value of the sp500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSP500(Boolean value) {
        this.sp500 = value;
    }

    /**
     * Gets the value of the currentMarketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    /**
     * Sets the value of the currentMarketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCurrentMarketPrice(Amount value) {
        this.currentMarketPrice = value;
    }

    /**
     * Gets the value of the last30DaysAveragePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getLast30DaysAveragePrice() {
        return last30DaysAveragePrice;
    }

    /**
     * Sets the value of the last30DaysAveragePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLast30DaysAveragePrice(Amount value) {
        this.last30DaysAveragePrice = value;
    }

    /**
     * Gets the value of the last30DaysAverageVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getLast30DaysAverageVolume() {
        return last30DaysAverageVolume;
    }

    /**
     * Sets the value of the last30DaysAverageVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLast30DaysAverageVolume(Integer value) {
        this.last30DaysAverageVolume = value;
    }

    /**
     * Gets the value of the last30DaysHighPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getLast30DaysHighPrice() {
        return last30DaysHighPrice;
    }

    /**
     * Sets the value of the last30DaysHighPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLast30DaysHighPrice(Amount value) {
        this.last30DaysHighPrice = value;
    }

    /**
     * Gets the value of the last30DaysLowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getLast30DaysLowPrice() {
        return last30DaysLowPrice;
    }

    /**
     * Sets the value of the last30DaysLowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLast30DaysLowPrice(Amount value) {
        this.last30DaysLowPrice = value;
    }

    /**
     * Gets the value of the percentSharesHeldByInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getPercentSharesHeldByInstitution() {
        return percentSharesHeldByInstitution;
    }

    /**
     * Sets the value of the percentSharesHeldByInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setPercentSharesHeldByInstitution(Integer value) {
        this.percentSharesHeldByInstitution = value;
    }

    /**
     * Gets the value of the sharesFloating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getSharesFloating() {
        return sharesFloating;
    }

    /**
     * Sets the value of the sharesFloating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSharesFloating(Integer value) {
        this.sharesFloating = value;
    }

    /**
     * Gets the value of the sharesOut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getSharesOut() {
        return sharesOut;
    }

    /**
     * Sets the value of the sharesOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSharesOut(Integer value) {
        this.sharesOut = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the todayHighPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTodayHighPrice() {
        return todayHighPrice;
    }

    /**
     * Sets the value of the todayHighPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTodayHighPrice(Amount value) {
        this.todayHighPrice = value;
    }

    /**
     * Gets the value of the todayLowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTodayLowPrice() {
        return todayLowPrice;
    }

    /**
     * Sets the value of the todayLowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTodayLowPrice(Amount value) {
        this.todayLowPrice = value;
    }

    /**
     * Gets the value of the todayOpenPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getTodayOpenPrice() {
        return todayOpenPrice;
    }

    /**
     * Sets the value of the todayOpenPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTodayOpenPrice(Amount value) {
        this.todayOpenPrice = value;
    }

    /**
     * Gets the value of the todayVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getTodayVolume() {
        return todayVolume;
    }

    /**
     * Sets the value of the todayVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTodayVolume(Integer value) {
        this.todayVolume = value;
    }

}
