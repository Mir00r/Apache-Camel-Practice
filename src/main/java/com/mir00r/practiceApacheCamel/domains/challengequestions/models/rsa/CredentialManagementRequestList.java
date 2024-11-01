
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CredentialManagementRequestList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialManagementRequestList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}CredentialRequestList"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="challengeQuestionManagementRequest" type="{http://ws.csd.rsa.com}ChallengeQuestionManagementRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobEmailManagementRequest" type="{http://ws.csd.rsa.com}OobEmailManagementRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oobPhoneManagementRequest" type="{http://ws.csd.rsa.com}OobPhoneManagementRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="acspManagementRequestData" type="{http://ws.csd.rsa.com}AcspManagementRequestData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialManagementRequestList", propOrder = {
    "challengeQuestionManagementRequest",
    "oobEmailManagementRequest",
    "oobPhoneManagementRequest",
    "acspManagementRequestData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class CredentialManagementRequestList
    extends CredentialRequestList
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionManagementRequest challengeQuestionManagementRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobEmailManagementRequest oobEmailManagementRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected OobPhoneManagementRequest oobPhoneManagementRequest;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected AcspManagementRequestData acspManagementRequestData;

    /**
     * Gets the value of the challengeQuestionManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionManagementRequest getChallengeQuestionManagementRequest() {
        return challengeQuestionManagementRequest;
    }

    /**
     * Sets the value of the challengeQuestionManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setChallengeQuestionManagementRequest(ChallengeQuestionManagementRequest value) {
        this.challengeQuestionManagementRequest = value;
    }

    /**
     * Gets the value of the oobEmailManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobEmailManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobEmailManagementRequest getOobEmailManagementRequest() {
        return oobEmailManagementRequest;
    }

    /**
     * Sets the value of the oobEmailManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobEmailManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobEmailManagementRequest(OobEmailManagementRequest value) {
        this.oobEmailManagementRequest = value;
    }

    /**
     * Gets the value of the oobPhoneManagementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OobPhoneManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public OobPhoneManagementRequest getOobPhoneManagementRequest() {
        return oobPhoneManagementRequest;
    }

    /**
     * Sets the value of the oobPhoneManagementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OobPhoneManagementRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setOobPhoneManagementRequest(OobPhoneManagementRequest value) {
        this.oobPhoneManagementRequest = value;
    }

    /**
     * Gets the value of the acspManagementRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link AcspManagementRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public AcspManagementRequestData getAcspManagementRequestData() {
        return acspManagementRequestData;
    }

    /**
     * Sets the value of the acspManagementRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcspManagementRequestData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setAcspManagementRequestData(AcspManagementRequestData value) {
        this.acspManagementRequestData = value;
    }

}
