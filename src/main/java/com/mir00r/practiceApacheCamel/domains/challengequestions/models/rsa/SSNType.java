
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SSNType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SSNType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SSN4"/&amp;gt;
 *     &amp;lt;enumeration value="SSN9"/&amp;gt;
 *     &amp;lt;enumeration value="SSN5"/&amp;gt;
 *     &amp;lt;enumeration value="OTHER"/&amp;gt;
 *     &amp;lt;enumeration value="NOSSN"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SSNType", namespace = "http://ws.kba.csd.rsa.com")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum SSNType {

    @XmlEnumValue("SSN4")
    SSN_4("SSN4"),
    @XmlEnumValue("SSN9")
    SSN_9("SSN9"),
    @XmlEnumValue("SSN5")
    SSN_5("SSN5"),
    OTHER("OTHER"),
    NOSSN("NOSSN");
    private final String value;

    SSNType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SSNType fromValue(String v) {
        for (SSNType c: SSNType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
