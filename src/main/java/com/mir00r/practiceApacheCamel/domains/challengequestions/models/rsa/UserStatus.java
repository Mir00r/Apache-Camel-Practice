
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UserStatus.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="UserStatus"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NOTENROLLED"/&amp;gt;
 *     &amp;lt;enumeration value="UNVERIFIED"/&amp;gt;
 *     &amp;lt;enumeration value="VERIFIED"/&amp;gt;
 *     &amp;lt;enumeration value="DELETE"/&amp;gt;
 *     &amp;lt;enumeration value="LOCKOUT"/&amp;gt;
 *     &amp;lt;enumeration value="UNLOCKED"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "UserStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum UserStatus {

    NOTENROLLED,
    UNVERIFIED,
    VERIFIED,
    DELETE,
    LOCKOUT,
    UNLOCKED;

    public String value() {
        return name();
    }

    public static UserStatus fromValue(String v) {
        return valueOf(v);
    }

}
