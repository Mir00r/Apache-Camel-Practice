
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ChallengeResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChallengeResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="credentialChallengeList" type="{http://ws.csd.rsa.com}CredentialChallengeList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeResponse", propOrder = {
    "credentialChallengeList",
    "deviceManagementResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class ChallengeResponse2
    extends GenericResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialChallengeList credentialChallengeList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementResponsePayload deviceManagementResponse;

    /**
     * Gets the value of the credentialChallengeList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialChallengeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialChallengeList getCredentialChallengeList() {
        return credentialChallengeList;
    }

    /**
     * Sets the value of the credentialChallengeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialChallengeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialChallengeList(CredentialChallengeList value) {
        this.credentialChallengeList = value;
    }

    /**
     * Gets the value of the deviceManagementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceManagementResponsePayload getDeviceManagementResponse() {
        return deviceManagementResponse;
    }

    /**
     * Sets the value of the deviceManagementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementResponsePayload }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceManagementResponse(DeviceManagementResponsePayload value) {
        this.deviceManagementResponse = value;
    }

}
