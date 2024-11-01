
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RequestType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RequestType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ANALYZE"/&amp;gt;
 *     &amp;lt;enumeration value="AUTHENTICATE"/&amp;gt;
 *     &amp;lt;enumeration value="CHALLENGE"/&amp;gt;
 *     &amp;lt;enumeration value="CREATEUSER"/&amp;gt;
 *     &amp;lt;enumeration value="NOTIFY"/&amp;gt;
 *     &amp;lt;enumeration value="QUERY"/&amp;gt;
 *     &amp;lt;enumeration value="QUERYAUTHSTATUS"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATEUSER"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum RequestType {

    ANALYZE,
    AUTHENTICATE,
    CHALLENGE,
    CREATEUSER,
    NOTIFY,
    QUERY,
    QUERYAUTHSTATUS,
    UPDATEUSER;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
