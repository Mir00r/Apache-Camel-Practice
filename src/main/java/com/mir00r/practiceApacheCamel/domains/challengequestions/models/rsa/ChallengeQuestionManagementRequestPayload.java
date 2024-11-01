
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the Challenge Question Management request
 * 
 * &lt;p&gt;Java class for ChallengeQuestionManagementRequestPayload complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeQuestionManagementRequestPayload"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="actionTypeList" type="{http://ws.csd.rsa.com}ChallengeQuestionActionTypeList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="challengeQuestionConfig" type="{http://ws.csd.rsa.com}ChallengeQuestionConfig" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="challengeQuestionList" type="{http://ws.csd.rsa.com}ChallengeQuestionList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionManagementRequestPayload", propOrder = {
    "actionTypeList",
    "challengeQuestionConfig",
    "challengeQuestionList"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeQuestionManagementRequestPayload {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionActionTypeList actionTypeList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionConfig challengeQuestionConfig;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionList challengeQuestionList;

    /**
     * Gets the value of the actionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionActionTypeList getActionTypeList() {
        return actionTypeList;
    }

    /**
     * Sets the value of the actionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setActionTypeList(ChallengeQuestionActionTypeList value) {
        this.actionTypeList = value;
    }

    /**
     * Gets the value of the challengeQuestionConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionConfig }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionConfig getChallengeQuestionConfig() {
        return challengeQuestionConfig;
    }

    /**
     * Sets the value of the challengeQuestionConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionConfig }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionConfig(ChallengeQuestionConfig value) {
        this.challengeQuestionConfig = value;
    }

    /**
     * Gets the value of the challengeQuestionList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionList getChallengeQuestionList() {
        return challengeQuestionList;
    }

    /**
     * Sets the value of the challengeQuestionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionList(ChallengeQuestionList value) {
        this.challengeQuestionList = value;
    }

}
