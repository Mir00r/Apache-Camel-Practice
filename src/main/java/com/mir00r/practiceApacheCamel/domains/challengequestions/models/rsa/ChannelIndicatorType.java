
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ChannelIndicatorType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ChannelIndicatorType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="WEB"/&amp;gt;
 *     &amp;lt;enumeration value="IVR"/&amp;gt;
 *     &amp;lt;enumeration value="CALL_CENTER"/&amp;gt;
 *     &amp;lt;enumeration value="BRANCH"/&amp;gt;
 *     &amp;lt;enumeration value="ATM"/&amp;gt;
 *     &amp;lt;enumeration value="MOBILE"/&amp;gt;
 *     &amp;lt;enumeration value="OTHER"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ChannelIndicatorType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum ChannelIndicatorType {

    WEB,
    IVR,
    CALL_CENTER,
    BRANCH,
    ATM,
    MOBILE,
    OTHER;

    public String value() {
        return name();
    }

    public static ChannelIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
