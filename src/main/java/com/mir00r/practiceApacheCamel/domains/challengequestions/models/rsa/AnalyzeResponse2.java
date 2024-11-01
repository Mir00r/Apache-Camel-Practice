
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnalyzeResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AnalyzeResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="collectableCredentialList" type="{http://ws.csd.rsa.com}CollectableCredentialList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="credentialAuthResultList" type="{http://ws.csd.rsa.com}CredentialAuthResultList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="requiredCredentialList" type="{http://ws.csd.rsa.com}RequiredCredentialList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="riskResult" type="{http://ws.csd.rsa.com}RiskResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="serverRedirectData" type="{http://ws.csd.rsa.com}ServerRedirectData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="siteToUserData" type="{http://ws.csd.rsa.com}SiteToUserData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyzeResponse", propOrder = {
    "collectableCredentialList",
    "credentialAuthResultList",
    "deviceManagementResponse",
    "requiredCredentialList",
    "riskResult",
    "serverRedirectData",
    "siteToUserData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class AnalyzeResponse2
    extends GenericResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CollectableCredentialList collectableCredentialList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialAuthResultList credentialAuthResultList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementResponsePayload deviceManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected RequiredCredentialList requiredCredentialList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected RiskResult riskResult;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected ServerRedirectData serverRedirectData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SiteToUserData siteToUserData;

    /**
     * Gets the value of the collectableCredentialList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectableCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CollectableCredentialList getCollectableCredentialList() {
        return collectableCredentialList;
    }

    /**
     * Sets the value of the collectableCredentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectableCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCollectableCredentialList(CollectableCredentialList value) {
        this.collectableCredentialList = value;
    }

    /**
     * Gets the value of the credentialAuthResultList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialAuthResultList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialAuthResultList getCredentialAuthResultList() {
        return credentialAuthResultList;
    }

    /**
     * Sets the value of the credentialAuthResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialAuthResultList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialAuthResultList(CredentialAuthResultList value) {
        this.credentialAuthResultList = value;
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

    /**
     * Gets the value of the requiredCredentialList property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public RequiredCredentialList getRequiredCredentialList() {
        return requiredCredentialList;
    }

    /**
     * Sets the value of the requiredCredentialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRequiredCredentialList(RequiredCredentialList value) {
        this.requiredCredentialList = value;
    }

    /**
     * Gets the value of the riskResult property.
     * 
     * @return
     *     possible object is
     *     {@link RiskResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public RiskResult getRiskResult() {
        return riskResult;
    }

    /**
     * Sets the value of the riskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskResult }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setRiskResult(RiskResult value) {
        this.riskResult = value;
    }

    /**
     * Gets the value of the serverRedirectData property.
     * 
     * @return
     *     possible object is
     *     {@link ServerRedirectData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public ServerRedirectData getServerRedirectData() {
        return serverRedirectData;
    }

    /**
     * Sets the value of the serverRedirectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerRedirectData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setServerRedirectData(ServerRedirectData value) {
        this.serverRedirectData = value;
    }

    /**
     * Gets the value of the siteToUserData property.
     * 
     * @return
     *     possible object is
     *     {@link SiteToUserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public SiteToUserData getSiteToUserData() {
        return siteToUserData;
    }

    /**
     * Sets the value of the siteToUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteToUserData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSiteToUserData(SiteToUserData value) {
        this.siteToUserData = value;
    }

}
