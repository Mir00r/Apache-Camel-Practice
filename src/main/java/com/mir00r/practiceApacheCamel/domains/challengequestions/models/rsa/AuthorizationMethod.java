
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthorizationMethod.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AuthorizationMethod"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PASSWORD"/&amp;gt;
 *     &amp;lt;enumeration value="SECRET_HMAC_SHA1"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AuthorizationMethod")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum AuthorizationMethod {

    PASSWORD("PASSWORD"),
    @XmlEnumValue("SECRET_HMAC_SHA1")
    SECRET_HMAC_SHA_1("SECRET_HMAC_SHA1");
    private final String value;

    AuthorizationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationMethod fromValue(String v) {
        for (AuthorizationMethod c: AuthorizationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
