
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthAction.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AuthAction"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ALLOW"/&amp;gt;
 *     &amp;lt;enumeration value="DENY"/&amp;gt;
 *     &amp;lt;enumeration value="TOKEN_AUTH"/&amp;gt;
 *     &amp;lt;enumeration value="NEXT_TOKEN_AUTH"/&amp;gt;
 *     &amp;lt;enumeration value="NEW_PIN"/&amp;gt;
 *     &amp;lt;enumeration value="NEXT_TOKEN_AFTER_NEW_PIN_SET"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AuthAction", namespace = "http://ws.securid.acsp.adapters.rsa.com")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum AuthAction {

    ALLOW,
    DENY,
    TOKEN_AUTH,
    NEXT_TOKEN_AUTH,
    NEW_PIN,
    NEXT_TOKEN_AFTER_NEW_PIN_SET;

    public String value() {
        return name();
    }

    public static AuthAction fromValue(String v) {
        return valueOf(v);
    }

}
