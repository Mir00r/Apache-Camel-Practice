
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialAuthStatusResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialAuthStatusResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialResponseList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionAuthStatusResponse" type="{http://ws.csd.rsa.com}ChallengeQuestionAuthStatusResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailAuthStatusResponse" type="{http://ws.csd.rsa.com}OobEmailAuthStatusResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneAuthStatusResponse" type="{http://ws.csd.rsa.com}OobPhoneAuthStatusResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspAuthStatusResponseData" type="{http://ws.csd.rsa.com}AcspAuthStatusResponseData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialAuthStatusResponse", propOrder = {
    "challengeQuestionAuthStatusResponse",
    "oobEmailAuthStatusResponse",
    "oobPhoneAuthStatusResponse",
    "acspAuthStatusResponseData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialAuthStatusResponse
    extends CredentialResponseList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionAuthStatusResponse challengeQuestionAuthStatusResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailAuthStatusResponse oobEmailAuthStatusResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneAuthStatusResponse oobPhoneAuthStatusResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspAuthStatusResponseData acspAuthStatusResponseData;

    /**
     * Gets the value of the challengeQuestionAuthStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionAuthStatusResponse getChallengeQuestionAuthStatusResponse() {
        return challengeQuestionAuthStatusResponse;
    }

    /**
     * Sets the value of the challengeQuestionAuthStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionAuthStatusResponse(ChallengeQuestionAuthStatusResponse value) {
        this.challengeQuestionAuthStatusResponse = value;
    }

    /**
     * Gets the value of the oobEmailAuthStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailAuthStatusResponse getOobEmailAuthStatusResponse() {
        return oobEmailAuthStatusResponse;
    }

    /**
     * Sets the value of the oobEmailAuthStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailAuthStatusResponse(OobEmailAuthStatusResponse value) {
        this.oobEmailAuthStatusResponse = value;
    }

    /**
     * Gets the value of the oobPhoneAuthStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneAuthStatusResponse getOobPhoneAuthStatusResponse() {
        return oobPhoneAuthStatusResponse;
    }

    /**
     * Sets the value of the oobPhoneAuthStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneAuthStatusResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneAuthStatusResponse(OobPhoneAuthStatusResponse value) {
        this.oobPhoneAuthStatusResponse = value;
    }

    /**
     * Gets the value of the acspAuthStatusResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspAuthStatusResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspAuthStatusResponseData getAcspAuthStatusResponseData() {
        return acspAuthStatusResponseData;
    }

    /**
     * Sets the value of the acspAuthStatusResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspAuthStatusResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspAuthStatusResponseData(AcspAuthStatusResponseData value) {
        this.acspAuthStatusResponseData = value;
    }

}
