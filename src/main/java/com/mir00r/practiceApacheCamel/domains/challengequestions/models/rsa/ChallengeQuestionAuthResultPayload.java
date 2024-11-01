
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This returns the results of the challenge question authentication
 * 
 * &lt;p&gt;Java class for ChallengeQuestionAuthResultPayload complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeQuestionAuthResultPayload"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="authenticationResult" type="{http://ws.csd.rsa.com}AuthenticationResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="callStatus" type="{http://ws.csd.rsa.com}CallStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="challengeQuestionMatchResult" type="{http://ws.csd.rsa.com}ChallengeQuestionMatchResult" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionAuthResultPayload", propOrder = {
    "authenticationResult",
    "callStatus",
    "challengeQuestionMatchResult"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeQuestionAuthResultPayload {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AuthenticationResult authenticationResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CallStatus callStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionMatchResult challengeQuestionMatchResult;

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AuthenticationResult getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAuthenticationResult(AuthenticationResult value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the callStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CallStatus getCallStatus() {
        return callStatus;
    }

    /**
     * Sets the value of the callStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCallStatus(CallStatus value) {
        this.callStatus = value;
    }

    /**
     * Gets the value of the challengeQuestionMatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionMatchResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionMatchResult getChallengeQuestionMatchResult() {
        return challengeQuestionMatchResult;
    }

    /**
     * Sets the value of the challengeQuestionMatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionMatchResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionMatchResult(ChallengeQuestionMatchResult value) {
        this.challengeQuestionMatchResult = value;
    }

}
