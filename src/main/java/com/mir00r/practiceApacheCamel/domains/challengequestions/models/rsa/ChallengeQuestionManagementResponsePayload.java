
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the Challenge Question Management response
 * 
 * &lt;p&gt;Java class for ChallengeQuestionManagementResponsePayload complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeQuestionManagementResponsePayload"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="acspAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="browsableChallQuesGroupList" type="{http://ws.csd.rsa.com}ChallengeQuestionGroupList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="callStatus" type="{http://ws.csd.rsa.com}CallStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userChallQuesDataList" type="{http://ws.csd.rsa.com}ChallengeQuestionList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionManagementResponsePayload", propOrder = {
    "acspAccountId",
    "browsableChallQuesGroupList",
    "callStatus",
    "userChallQuesDataList"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeQuestionManagementResponsePayload {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected String acspAccountId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionGroupList browsableChallQuesGroupList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CallStatus callStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionList userChallQuesDataList;

    /**
     * Gets the value of the acspAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public String getAcspAccountId() {
        return acspAccountId;
    }

    /**
     * Sets the value of the acspAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspAccountId(String value) {
        this.acspAccountId = value;
    }

    /**
     * Gets the value of the browsableChallQuesGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionGroupList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionGroupList getBrowsableChallQuesGroupList() {
        return browsableChallQuesGroupList;
    }

    /**
     * Sets the value of the browsableChallQuesGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionGroupList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setBrowsableChallQuesGroupList(ChallengeQuestionGroupList value) {
        this.browsableChallQuesGroupList = value;
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
     * Gets the value of the userChallQuesDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionList getUserChallQuesDataList() {
        return userChallQuesDataList;
    }

    /**
     * Sets the value of the userChallQuesDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserChallQuesDataList(ChallengeQuestionList value) {
        this.userChallQuesDataList = value;
    }

}
