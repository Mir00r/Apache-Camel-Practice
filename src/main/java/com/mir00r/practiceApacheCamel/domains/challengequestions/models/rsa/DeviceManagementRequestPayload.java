
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This defines the device management request payload
 * 
 * &lt;p&gt;Java class for DeviceManagementRequestPayload complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DeviceManagementRequestPayload"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="actionTypeList" type="{http://ws.csd.rsa.com}DeviceActionTypeList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceData" type="{http://ws.csd.rsa.com}DeviceData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceManagementRequestPayload", propOrder = {
    "actionTypeList",
    "deviceData"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public class DeviceManagementRequestPayload {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceActionTypeList actionTypeList;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    protected DeviceData deviceData;

    /**
     * Gets the value of the actionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceActionTypeList getActionTypeList() {
        return actionTypeList;
    }

    /**
     * Sets the value of the actionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceActionTypeList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setActionTypeList(DeviceActionTypeList value) {
        this.actionTypeList = value;
    }

    /**
     * Gets the value of the deviceData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public DeviceData getDeviceData() {
        return deviceData;
    }

    /**
     * Sets the value of the deviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
    public void setDeviceData(DeviceData value) {
        this.deviceData = value;
    }

}
