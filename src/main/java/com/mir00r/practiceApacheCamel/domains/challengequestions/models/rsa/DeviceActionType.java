
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeviceActionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DeviceActionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="BROWSE_DEVICES"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATE_DEVICE"/&amp;gt;
 *     &amp;lt;enumeration value="UNBIND_ALL_DEVICES"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DeviceActionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum DeviceActionType {

    BROWSE_DEVICES,
    UPDATE_DEVICE,
    UNBIND_ALL_DEVICES;

    public String value() {
        return name();
    }

    public static DeviceActionType fromValue(String v) {
        return valueOf(v);
    }

}
