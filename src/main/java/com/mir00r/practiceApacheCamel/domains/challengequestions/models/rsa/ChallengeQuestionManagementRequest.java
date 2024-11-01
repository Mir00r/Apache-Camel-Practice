
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This requests the results of the challenge question management method
 * 
 * &lt;p&gt;Java class for ChallengeQuestionManagementRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeQuestionManagementRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="credentialProvisioningStatus" type="{http://ws.csd.rsa.com}CredentialProvisioningStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="payload" type="{http://ws.csd.rsa.com}ChallengeQuestionManagementRequestPayload" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeQuestionManagementRequest", propOrder = {
    "credentialProvisioningStatus",
    "payload"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeQuestionManagementRequest {

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialProvisioningStatus credentialProvisioningStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ChallengeQuestionManagementRequestPayload payload;

    /**
     * Gets the value of the credentialProvisioningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialProvisioningStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialProvisioningStatus getCredentialProvisioningStatus() {
        return credentialProvisioningStatus;
    }

    /**
     * Sets the value of the credentialProvisioningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialProvisioningStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialProvisioningStatus(CredentialProvisioningStatus value) {
        this.credentialProvisioningStatus = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionManagementRequestPayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ChallengeQuestionManagementRequestPayload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionManagementRequestPayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setPayload(ChallengeQuestionManagementRequestPayload value) {
        this.payload = value;
    }

}
