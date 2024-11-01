
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for QueryResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QueryResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://ws.csd.rsa.com}GenericResponse"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="browsableGroupNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="credentialManagementResponseList" type="{http://ws.csd.rsa.com}CredentialManagementResponseList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceManagementResponse" type="{http://ws.csd.rsa.com}DeviceManagementResponsePayload" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="siteToUserBrowseResponse" type="{http://ws.csd.rsa.com}SiteToUserBrowseResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="siteToUserData" type="{http://ws.csd.rsa.com}SiteToUserData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="systemCredentials" type="{http://ws.csd.rsa.com}CredentialList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userCredentials" type="{http://ws.csd.rsa.com}CredentialList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userPreference" type="{http://ws.csd.rsa.com}UserPreference" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponse", propOrder = {
    "browsableGroupNames",
    "credentialManagementResponseList",
    "deviceManagementResponse",
    "siteToUserBrowseResponse",
    "siteToUserData",
    "systemCredentials",
    "userCredentials",
    "userPreference"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class QueryResponse2
    extends GenericResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected List<String> browsableGroupNames;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialManagementResponseList credentialManagementResponseList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceManagementResponsePayload deviceManagementResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SiteToUserBrowseResponse siteToUserBrowseResponse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected SiteToUserData siteToUserData;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialList systemCredentials;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected CredentialList userCredentials;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected UserPreference userPreference;

    /**
     * Gets the value of the browsableGroupNames property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the browsableGroupNames property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBrowsableGroupNames().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public List<String> getBrowsableGroupNames() {
        if (browsableGroupNames == null) {
            browsableGroupNames = new ArrayList<String>();
        }
        return this.browsableGroupNames;
    }

    /**
     * Gets the value of the credentialManagementResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialManagementResponseList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialManagementResponseList getCredentialManagementResponseList() {
        return credentialManagementResponseList;
    }

    /**
     * Sets the value of the credentialManagementResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialManagementResponseList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setCredentialManagementResponseList(CredentialManagementResponseList value) {
        this.credentialManagementResponseList = value;
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
     * Gets the value of the siteToUserBrowseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SiteToUserBrowseResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public SiteToUserBrowseResponse getSiteToUserBrowseResponse() {
        return siteToUserBrowseResponse;
    }

    /**
     * Sets the value of the siteToUserBrowseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteToUserBrowseResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSiteToUserBrowseResponse(SiteToUserBrowseResponse value) {
        this.siteToUserBrowseResponse = value;
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

    /**
     * Gets the value of the systemCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialList getSystemCredentials() {
        return systemCredentials;
    }

    /**
     * Sets the value of the systemCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setSystemCredentials(CredentialList value) {
        this.systemCredentials = value;
    }

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public CredentialList getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserCredentials(CredentialList value) {
        this.userCredentials = value;
    }

    /**
     * Gets the value of the userPreference property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public UserPreference getUserPreference() {
        return userPreference;
    }

    /**
     * Sets the value of the userPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setUserPreference(UserPreference value) {
        this.userPreference = value;
    }

}
