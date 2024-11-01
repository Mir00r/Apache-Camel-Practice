
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CollectionReason.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="CollectionReason"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CSR_REQUESTED"/&amp;gt;
 *     &amp;lt;enumeration value="USER_SETTINGS"/&amp;gt;
 *     &amp;lt;enumeration value="FIRST_COLLECTION"/&amp;gt;
 *     &amp;lt;enumeration value="REFRESH_AFTER_FAILURE"/&amp;gt;
 *     &amp;lt;enumeration value="ADDITIONAL_COLLECTION"/&amp;gt;
 *     &amp;lt;enumeration value="REFRESH_COLLECTION"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "CollectionReason")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum CollectionReason {

    CSR_REQUESTED,
    USER_SETTINGS,
    FIRST_COLLECTION,
    REFRESH_AFTER_FAILURE,
    ADDITIONAL_COLLECTION,
    REFRESH_COLLECTION;

    public String value() {
        return name();
    }

    public static CollectionReason fromValue(String v) {
        return valueOf(v);
    }

}
