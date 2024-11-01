
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialManagementResponseList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialManagementResponseList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialResponseList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionManagementResponse" type="{http://ws.csd.rsa.com}ChallengeQuestionManagementResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailManagementResponse" type="{http://ws.csd.rsa.com}OobEmailManagementResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneManagementResponse" type="{http://ws.csd.rsa.com}OobPhoneManagementResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspManagementResponseData" type="{http://ws.csd.rsa.com}AcspManagementResponseData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialManagementResponseList", propOrder = {
    "challengeQuestionManagementResponse",
    "oobEmailManagementResponse",
    "oobPhoneManagementResponse",
    "acspManagementResponseData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialManagementResponseList
    extends CredentialResponseList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionManagementResponse challengeQuestionManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailManagementResponse oobEmailManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneManagementResponse oobPhoneManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspManagementResponseData acspManagementResponseData;

    /**
     * Gets the value of the challengeQuestionManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionManagementResponse getChallengeQuestionManagementResponse() {
        return challengeQuestionManagementResponse;
    }

    /**
     * Sets the value of the challengeQuestionManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionManagementResponse(ChallengeQuestionManagementResponse value) {
        this.challengeQuestionManagementResponse = value;
    }

    /**
     * Gets the value of the oobEmailManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailManagementResponse getOobEmailManagementResponse() {
        return oobEmailManagementResponse;
    }

    /**
     * Sets the value of the oobEmailManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailManagementResponse(OobEmailManagementResponse value) {
        this.oobEmailManagementResponse = value;
    }

    /**
     * Gets the value of the oobPhoneManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneManagementResponse getOobPhoneManagementResponse() {
        return oobPhoneManagementResponse;
    }

    /**
     * Sets the value of the oobPhoneManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneManagementResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneManagementResponse(OobPhoneManagementResponse value) {
        this.oobPhoneManagementResponse = value;
    }

    /**
     * Gets the value of the acspManagementResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspManagementResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspManagementResponseData getAcspManagementResponseData() {
        return acspManagementResponseData;
    }

    /**
     * Sets the value of the acspManagementResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspManagementResponseData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspManagementResponseData(AcspManagementResponseData value) {
        this.acspManagementResponseData = value;
    }

}
