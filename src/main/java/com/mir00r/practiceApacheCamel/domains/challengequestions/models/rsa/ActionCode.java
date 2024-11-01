
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ActionCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ActionCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NONE"/&amp;gt;
 *     &amp;lt;enumeration value="ALLOW"/&amp;gt;
 *     &amp;lt;enumeration value="REVIEW"/&amp;gt;
 *     &amp;lt;enumeration value="DELAY_AND_REVIEW"/&amp;gt;
 *     &amp;lt;enumeration value="STOP_AND_REVIEW"/&amp;gt;
 *     &amp;lt;enumeration value="ELEVATE_SECURITY"/&amp;gt;
 *     &amp;lt;enumeration value="REDIRECT_CHALLENGE"/&amp;gt;
 *     &amp;lt;enumeration value="REDIRECT_COLLECT"/&amp;gt;
 *     &amp;lt;enumeration value="CHALLENGE"/&amp;gt;
 *     &amp;lt;enumeration value="COLLECT"/&amp;gt;
 *     &amp;lt;enumeration value="DENY"/&amp;gt;
 *     &amp;lt;enumeration value="BLOCK"/&amp;gt;
 *     &amp;lt;enumeration value="LOCKED"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ActionCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum ActionCode {

    NONE,
    ALLOW,
    REVIEW,
    DELAY_AND_REVIEW,
    STOP_AND_REVIEW,
    ELEVATE_SECURITY,
    REDIRECT_CHALLENGE,
    REDIRECT_COLLECT,
    CHALLENGE,
    COLLECT,
    DENY,
    BLOCK,
    LOCKED;

    public String value() {
        return name();
    }

    public static ActionCode fromValue(String v) {
        return valueOf(v);
    }

}
