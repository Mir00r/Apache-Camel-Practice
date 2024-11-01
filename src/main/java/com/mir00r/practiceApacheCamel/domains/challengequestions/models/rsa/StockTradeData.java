
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the compostion for stock trade information
 * 
 * &lt;p&gt;Java class for StockTradeData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="StockTradeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="allOrNone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lowerChangeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lowerPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numberOfShares" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="priceType" type="{http://ws.csd.rsa.com}PriceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="stockData" type="{http://ws.csd.rsa.com}StockData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="termType" type="{http://ws.csd.rsa.com}TermType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tradeType" type="{http://ws.csd.rsa.com}TradeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="upperChangeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="upperPrice" type="{http://ws.csd.rsa.com}Amount" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTradeData", propOrder = {
    "allOrNone",
    "lowerChangeLimit",
    "lowerPrice",
    "numberOfShares",
    "priceType",
    "stockData",
    "termType",
    "tradeType",
    "upperChangeLimit",
    "upperPrice"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class StockTradeData {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Boolean allOrNone;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer lowerChangeLimit;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount lowerPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer numberOfShares;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected PriceType priceType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected StockData stockData;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TermType termType;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TradeType tradeType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer upperChangeLimit;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Amount upperPrice;

    /**
     * Gets the value of the allOrNone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Boolean isAllOrNone() {
        return allOrNone;
    }

    /**
     * Sets the value of the allOrNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAllOrNone(Boolean value) {
        this.allOrNone = value;
    }

    /**
     * Gets the value of the lowerChangeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getLowerChangeLimit() {
        return lowerChangeLimit;
    }

    /**
     * Sets the value of the lowerChangeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLowerChangeLimit(Integer value) {
        this.lowerChangeLimit = value;
    }

    /**
     * Gets the value of the lowerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getLowerPrice() {
        return lowerPrice;
    }

    /**
     * Sets the value of the lowerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setLowerPrice(Amount value) {
        this.lowerPrice = value;
    }

    /**
     * Gets the value of the numberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * Sets the value of the numberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setNumberOfShares(Integer value) {
        this.numberOfShares = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public PriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setPriceType(PriceType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the stockData property.
     * 
     * @return
     *     possible object is
     *     {@link StockData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public StockData getStockData() {
        return stockData;
    }

    /**
     * Sets the value of the stockData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setStockData(StockData value) {
        this.stockData = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TermType getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTermType(TermType value) {
        this.termType = value;
    }

    /**
     * Gets the value of the tradeType property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TradeType getTradeType() {
        return tradeType;
    }

    /**
     * Sets the value of the tradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTradeType(TradeType value) {
        this.tradeType = value;
    }

    /**
     * Gets the value of the upperChangeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getUpperChangeLimit() {
        return upperChangeLimit;
    }

    /**
     * Sets the value of the upperChangeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUpperChangeLimit(Integer value) {
        this.upperChangeLimit = value;
    }

    /**
     * Gets the value of the upperPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Amount getUpperPrice() {
        return upperPrice;
    }

    /**
     * Sets the value of the upperPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUpperPrice(Amount value) {
        this.upperPrice = value;
    }

}
