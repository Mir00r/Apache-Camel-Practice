
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the risk result information
 * 
 * &lt;p&gt;Java class for RiskResult complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RiskResult"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="riskScoreBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="triggeredRule" type="{http://ws.csd.rsa.com}TriggeredRule" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="triggeredTestRule" type="{http://ws.csd.rsa.com}TriggeredRule" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskResult", propOrder = {
    "riskScore",
    "riskScoreBand",
    "triggeredRule",
    "triggeredTestRule"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class RiskResult {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected Integer riskScore;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String riskScoreBand;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TriggeredRule triggeredRule;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected TriggeredRule triggeredTestRule;

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public Integer getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRiskScore(Integer value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the riskScoreBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getRiskScoreBand() {
        return riskScoreBand;
    }

    /**
     * Sets the value of the riskScoreBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRiskScoreBand(String value) {
        this.riskScoreBand = value;
    }

    /**
     * Gets the value of the triggeredRule property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredRule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TriggeredRule getTriggeredRule() {
        return triggeredRule;
    }

    /**
     * Sets the value of the triggeredRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredRule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTriggeredRule(TriggeredRule value) {
        this.triggeredRule = value;
    }

    /**
     * Gets the value of the triggeredTestRule property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredRule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public TriggeredRule getTriggeredTestRule() {
        return triggeredTestRule;
    }

    /**
     * Sets the value of the triggeredTestRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredRule }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setTriggeredTestRule(TriggeredRule value) {
        this.triggeredTestRule = value;
    }

}
