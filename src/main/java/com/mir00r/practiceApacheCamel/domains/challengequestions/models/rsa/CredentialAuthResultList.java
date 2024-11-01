
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialAuthResultList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialAuthResultList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialResponseList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionAuthResult" type="{http://ws.csd.rsa.com}ChallengeQuestionAuthResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailAuthResult" type="{http://ws.csd.rsa.com}OobEmailAuthResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneAuthResult" type="{http://ws.csd.rsa.com}OobPhoneAuthResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspAuthenticationResponseData" type="{http://ws.csd.rsa.com}AcspAuthenticationResponseData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialAuthResultList", propOrder = {
    "challengeQuestionAuthResult",
    "oobEmailAuthResult",
    "oobPhoneAuthResult",
    "acspAuthenticationResponseData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialAuthResultList
    extends CredentialResponseList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionAuthResult challengeQuestionAuthResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailAuthResult oobEmailAuthResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneAuthResult oobPhoneAuthResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspAuthenticationResponseData acspAuthenticationResponseData;

    /**
     * Gets the value of the challengeQuestionAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionAuthResult getChallengeQuestionAuthResult() {
        return challengeQuestionAuthResult;
    }

    /**
     * Sets the value of the challengeQuestionAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionAuthResult(ChallengeQuestionAuthResult value) {
        this.challengeQuestionAuthResult = value;
    }

    /**
     * Gets the value of the oobEmailAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailAuthResult getOobEmailAuthResult() {
        return oobEmailAuthResult;
    }

    /**
     * Sets the value of the oobEmailAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailAuthResult(OobEmailAuthResult value) {
        this.oobEmailAuthResult = value;
    }

    /**
     * Gets the value of the oobPhoneAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneAuthResult getOobPhoneAuthResult() {
        return oobPhoneAuthResult;
    }

    /**
     * Sets the value of the oobPhoneAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneAuthResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneAuthResult(OobPhoneAuthResult value) {
        this.oobPhoneAuthResult = value;
    }

    /**
     * Gets the value of the acspAuthenticationResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspAuthenticationResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspAuthenticationResponseData getAcspAuthenticationResponseData() {
        return acspAuthenticationResponseData;
    }

    /**
     * Sets the value of the acspAuthenticationResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspAuthenticationResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspAuthenticationResponseData(AcspAuthenticationResponseData value) {
        this.acspAuthenticationResponseData = value;
    }

}
