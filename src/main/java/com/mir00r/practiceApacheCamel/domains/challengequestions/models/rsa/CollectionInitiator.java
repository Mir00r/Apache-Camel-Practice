
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CollectionInitiator.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="CollectionInitiator"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="USER_INITIATED"/&amp;gt;
 *     &amp;lt;enumeration value="CSR_INITIATED"/&amp;gt;
 *     &amp;lt;enumeration value="AUTO_INITIATED"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "CollectionInitiator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum CollectionInitiator {

    USER_INITIATED,
    CSR_INITIATED,
    AUTO_INITIATED;

    public String value() {
        return name();
    }

    public static CollectionInitiator fromValue(String v) {
        return valueOf(v);
    }

}
