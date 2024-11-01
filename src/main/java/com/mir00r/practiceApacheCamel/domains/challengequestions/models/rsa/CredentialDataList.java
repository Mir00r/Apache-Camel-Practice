
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialDataList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialDataList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialRequestList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionData" type="{http://ws.csd.rsa.com}ChallengeQuestionData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailData" type="{http://ws.csd.rsa.com}OobEmailData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneData" type="{http://ws.csd.rsa.com}OobPhoneData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspAuthenticationRequestData" type="{http://ws.csd.rsa.com}AcspAuthenticationRequestData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialDataList", propOrder = {
    "challengeQuestionData",
    "oobEmailData",
    "oobPhoneData",
    "acspAuthenticationRequestData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialDataList
    extends CredentialRequestList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionData challengeQuestionData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailData oobEmailData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneData oobPhoneData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspAuthenticationRequestData acspAuthenticationRequestData;

    /**
     * Gets the value of the challengeQuestionData property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionData getChallengeQuestionData() {
        return challengeQuestionData;
    }

    /**
     * Sets the value of the challengeQuestionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionData(ChallengeQuestionData value) {
        this.challengeQuestionData = value;
    }

    /**
     * Gets the value of the oobEmailData property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailData getOobEmailData() {
        return oobEmailData;
    }

    /**
     * Sets the value of the oobEmailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailData(OobEmailData value) {
        this.oobEmailData = value;
    }

    /**
     * Gets the value of the oobPhoneData property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneData getOobPhoneData() {
        return oobPhoneData;
    }

    /**
     * Sets the value of the oobPhoneData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneData(OobPhoneData value) {
        this.oobPhoneData = value;
    }

    /**
     * Gets the value of the acspAuthenticationRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspAuthenticationRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspAuthenticationRequestData getAcspAuthenticationRequestData() {
        return acspAuthenticationRequestData;
    }

    /**
     * Sets the value of the acspAuthenticationRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspAuthenticationRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspAuthenticationRequestData(AcspAuthenticationRequestData value) {
        this.acspAuthenticationRequestData = value;
    }

}
