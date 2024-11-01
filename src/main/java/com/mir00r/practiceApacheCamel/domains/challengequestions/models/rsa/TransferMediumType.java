
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TransferMediumType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TransferMediumType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="INTERNAL"/&amp;gt;
 *     &amp;lt;enumeration value="BILLPAY_MAIL"/&amp;gt;
 *     &amp;lt;enumeration value="BILLPAY_ELEC"/&amp;gt;
 *     &amp;lt;enumeration value="BALANCE_TRANSFER"/&amp;gt;
 *     &amp;lt;enumeration value="ACH"/&amp;gt;
 *     &amp;lt;enumeration value="WIRE"/&amp;gt;
 *     &amp;lt;enumeration value="INTL_WIRE"/&amp;gt;
 *     &amp;lt;enumeration value="CHECK"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TransferMediumType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum TransferMediumType {

    INTERNAL,
    BILLPAY_MAIL,
    BILLPAY_ELEC,
    BALANCE_TRANSFER,
    ACH,
    WIRE,
    INTL_WIRE,
    CHECK;

    public String value() {
        return name();
    }

    public static TransferMediumType fromValue(String v) {
        return valueOf(v);
    }

}
