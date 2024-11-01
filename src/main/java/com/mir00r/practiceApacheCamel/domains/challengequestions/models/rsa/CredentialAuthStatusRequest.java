
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialAuthStatusRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialAuthStatusRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialRequestList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionAuthStatusRequest" type="{http://ws.csd.rsa.com}ChallengeQuestionAuthStatusRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailAuthStatusRequest" type="{http://ws.csd.rsa.com}OobEmailAuthStatusRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneAuthStatusRequest" type="{http://ws.csd.rsa.com}OobPhoneAuthStatusRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspAuthStatusRequestData" type="{http://ws.csd.rsa.com}AcspAuthStatusRequestData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialAuthStatusRequest", propOrder = {
    "challengeQuestionAuthStatusRequest",
    "oobEmailAuthStatusRequest",
    "oobPhoneAuthStatusRequest",
    "acspAuthStatusRequestData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialAuthStatusRequest
    extends CredentialRequestList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionAuthStatusRequest challengeQuestionAuthStatusRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailAuthStatusRequest oobEmailAuthStatusRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneAuthStatusRequest oobPhoneAuthStatusRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspAuthStatusRequestData acspAuthStatusRequestData;

    /**
     * Gets the value of the challengeQuestionAuthStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionAuthStatusRequest getChallengeQuestionAuthStatusRequest() {
        return challengeQuestionAuthStatusRequest;
    }

    /**
     * Sets the value of the challengeQuestionAuthStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionAuthStatusRequest(ChallengeQuestionAuthStatusRequest value) {
        this.challengeQuestionAuthStatusRequest = value;
    }

    /**
     * Gets the value of the oobEmailAuthStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailAuthStatusRequest getOobEmailAuthStatusRequest() {
        return oobEmailAuthStatusRequest;
    }

    /**
     * Sets the value of the oobEmailAuthStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailAuthStatusRequest(OobEmailAuthStatusRequest value) {
        this.oobEmailAuthStatusRequest = value;
    }

    /**
     * Gets the value of the oobPhoneAuthStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneAuthStatusRequest getOobPhoneAuthStatusRequest() {
        return oobPhoneAuthStatusRequest;
    }

    /**
     * Sets the value of the oobPhoneAuthStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneAuthStatusRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneAuthStatusRequest(OobPhoneAuthStatusRequest value) {
        this.oobPhoneAuthStatusRequest = value;
    }

    /**
     * Gets the value of the acspAuthStatusRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspAuthStatusRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspAuthStatusRequestData getAcspAuthStatusRequestData() {
        return acspAuthStatusRequestData;
    }

    /**
     * Sets the value of the acspAuthStatusRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspAuthStatusRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspAuthStatusRequestData(AcspAuthStatusRequestData value) {
        this.acspAuthStatusRequestData = value;
    }

}
