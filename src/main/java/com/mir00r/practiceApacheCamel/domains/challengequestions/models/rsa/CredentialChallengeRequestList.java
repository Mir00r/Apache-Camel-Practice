
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialChallengeRequestList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialChallengeRequestList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialRequestList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionChallengeRequest" type="{http://ws.csd.rsa.com}ChallengeQuestionChallengeRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailChallengeRequest" type="{http://ws.csd.rsa.com}OobEmailChallengeRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneChallengeRequest" type="{http://ws.csd.rsa.com}OobPhoneChallengeRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspChallengeRequestData" type="{http://ws.csd.rsa.com}AcspChallengeRequestData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialChallengeRequestList", propOrder = {
    "challengeQuestionChallengeRequest",
    "oobEmailChallengeRequest",
    "oobPhoneChallengeRequest",
    "acspChallengeRequestData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialChallengeRequestList
    extends CredentialRequestList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionChallengeRequest challengeQuestionChallengeRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailChallengeRequest oobEmailChallengeRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneChallengeRequest oobPhoneChallengeRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspChallengeRequestData acspChallengeRequestData;

    /**
     * Gets the value of the challengeQuestionChallengeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionChallengeRequest getChallengeQuestionChallengeRequest() {
        return challengeQuestionChallengeRequest;
    }

    /**
     * Sets the value of the challengeQuestionChallengeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionChallengeRequest(ChallengeQuestionChallengeRequest value) {
        this.challengeQuestionChallengeRequest = value;
    }

    /**
     * Gets the value of the oobEmailChallengeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailChallengeRequest getOobEmailChallengeRequest() {
        return oobEmailChallengeRequest;
    }

    /**
     * Sets the value of the oobEmailChallengeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailChallengeRequest(OobEmailChallengeRequest value) {
        this.oobEmailChallengeRequest = value;
    }

    /**
     * Gets the value of the oobPhoneChallengeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneChallengeRequest getOobPhoneChallengeRequest() {
        return oobPhoneChallengeRequest;
    }

    /**
     * Sets the value of the oobPhoneChallengeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneChallengeRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneChallengeRequest(OobPhoneChallengeRequest value) {
        this.oobPhoneChallengeRequest = value;
    }

    /**
     * Gets the value of the acspChallengeRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspChallengeRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspChallengeRequestData getAcspChallengeRequestData() {
        return acspChallengeRequestData;
    }

    /**
     * Sets the value of the acspChallengeRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspChallengeRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspChallengeRequestData(AcspChallengeRequestData value) {
        this.acspChallengeRequestData = value;
    }

}
