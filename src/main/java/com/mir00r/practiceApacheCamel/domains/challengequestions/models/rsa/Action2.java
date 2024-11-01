
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Action.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Action"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADD"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATE"/&amp;gt;
 *     &amp;lt;enumeration value="DELETE"/&amp;gt;
 *     &amp;lt;enumeration value="GET"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Action", namespace = "http://ws.oobgen.csd.rsa.com")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum Action2 {

    ADD,
    UPDATE,
    DELETE,
    GET;

    public String value() {
        return name();
    }

    public static Action2 fromValue(String v) {
        return valueOf(v);
    }

}
