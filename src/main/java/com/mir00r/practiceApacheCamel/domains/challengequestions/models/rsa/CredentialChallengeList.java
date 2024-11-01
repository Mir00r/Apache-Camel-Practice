
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialChallengeList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialChallengeList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialResponseList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionChallenge" type="{http://ws.csd.rsa.com}ChallengeQuestionChallenge" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailChallenge" type="{http://ws.csd.rsa.com}OobEmailChallenge" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneChallenge" type="{http://ws.csd.rsa.com}OobPhoneChallenge" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspChallengeResponseData" type="{http://ws.csd.rsa.com}AcspChallengeResponseData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialChallengeList", propOrder = {
    "challengeQuestionChallenge",
    "oobEmailChallenge",
    "oobPhoneChallenge",
    "acspChallengeResponseData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialChallengeList
    extends CredentialResponseList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionChallenge challengeQuestionChallenge;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailChallenge oobEmailChallenge;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneChallenge oobPhoneChallenge;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspChallengeResponseData acspChallengeResponseData;

    /**
     * Gets the value of the challengeQuestionChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionChallenge getChallengeQuestionChallenge() {
        return challengeQuestionChallenge;
    }

    /**
     * Sets the value of the challengeQuestionChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionChallenge(ChallengeQuestionChallenge value) {
        this.challengeQuestionChallenge = value;
    }

    /**
     * Gets the value of the oobEmailChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailChallenge getOobEmailChallenge() {
        return oobEmailChallenge;
    }

    /**
     * Sets the value of the oobEmailChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailChallenge(OobEmailChallenge value) {
        this.oobEmailChallenge = value;
    }

    /**
     * Gets the value of the oobPhoneChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneChallenge getOobPhoneChallenge() {
        return oobPhoneChallenge;
    }

    /**
     * Sets the value of the oobPhoneChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneChallenge }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneChallenge(OobPhoneChallenge value) {
        this.oobPhoneChallenge = value;
    }

    /**
     * Gets the value of the acspChallengeResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspChallengeResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspChallengeResponseData getAcspChallengeResponseData() {
        return acspChallengeResponseData;
    }

    /**
     * Sets the value of the acspChallengeResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspChallengeResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspChallengeResponseData(AcspChallengeResponseData value) {
        this.acspChallengeResponseData = value;
    }

}
