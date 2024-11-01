
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ActionApplyType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ActionApplyType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="STRICT"/&amp;gt;
 *     &amp;lt;enumeration value="LIGHT"/&amp;gt;
 *     &amp;lt;enumeration value="OVERRIDE"/&amp;gt;
 *     &amp;lt;enumeration value="LOG"/&amp;gt;
 *     &amp;lt;enumeration value="NONE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ActionApplyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum ActionApplyType {

    STRICT,
    LIGHT,
    OVERRIDE,
    LOG,
    NONE;

    public String value() {
        return name();
    }

    public static ActionApplyType fromValue(String v) {
        return valueOf(v);
    }

}
