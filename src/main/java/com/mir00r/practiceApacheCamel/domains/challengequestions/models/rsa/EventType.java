
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EventType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EventType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NULL"/&amp;gt;
 *     &amp;lt;enumeration value="SESSION_SIGNIN"/&amp;gt;
 *     &amp;lt;enumeration value="FAILED_LOGIN_ATTEMPT"/&amp;gt;
 *     &amp;lt;enumeration value="ENROLL"/&amp;gt;
 *     &amp;lt;enumeration value="UPDATE_USER"/&amp;gt;
 *     &amp;lt;enumeration value="CREATE_USER"/&amp;gt;
 *     &amp;lt;enumeration value="OLB_ENROLL"/&amp;gt;
 *     &amp;lt;enumeration value="FAILED_OLB_ENROLL_ATTEMPT"/&amp;gt;
 *     &amp;lt;enumeration value="ACTIVATE_CARD"/&amp;gt;
 *     &amp;lt;enumeration value="OPEN_NEW_ACCOUNT"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_CREDIT"/&amp;gt;
 *     &amp;lt;enumeration value="ADD_PAYEE"/&amp;gt;
 *     &amp;lt;enumeration value="EDIT_PAYEE"/&amp;gt;
 *     &amp;lt;enumeration value="PAYMENT"/&amp;gt;
 *     &amp;lt;enumeration value="DEPOSIT"/&amp;gt;
 *     &amp;lt;enumeration value="STOCK_TRADE"/&amp;gt;
 *     &amp;lt;enumeration value="OPTIONS_TRADE"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_LOGIN_ID"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_EMAIL"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_PHONE"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_ADDRESS"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_PASSWORD"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_LIFE_QUESTIONS"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_STU"/&amp;gt;
 *     &amp;lt;enumeration value="FAILED_CHANGE_PASSWORD_ATTEMPT"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_ALERT_SETTINGS"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_STATEMENT_SETTINGS"/&amp;gt;
 *     &amp;lt;enumeration value="CHANGE_AUTH_DATA"/&amp;gt;
 *     &amp;lt;enumeration value="SEND_SECURE_MESSAGE"/&amp;gt;
 *     &amp;lt;enumeration value="READ_SECURE_MESSAGE"/&amp;gt;
 *     &amp;lt;enumeration value="VIEW_CHECK"/&amp;gt;
 *     &amp;lt;enumeration value="VIEW_STATEMENT"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_CHECK_COPY"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_STATEMENT_COPY"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_CHECKS"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_NEW_CARD"/&amp;gt;
 *     &amp;lt;enumeration value="REQUEST_NEW_PIN"/&amp;gt;
 *     &amp;lt;enumeration value="EXTRA_AUTH"/&amp;gt;
 *     &amp;lt;enumeration value="USER_DETAILS"/&amp;gt;
 *     &amp;lt;enumeration value="CLIENT_DEFINED"/&amp;gt;
 *     &amp;lt;enumeration value="WITHDRAW"/&amp;gt;
 *     &amp;lt;enumeration value="CARD_PIN_CHANGE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2024-10-28T04:59:46+08:00", comments = "JAXB RI v2.3.3")
public enum EventType {

    NULL,
    SESSION_SIGNIN,
    FAILED_LOGIN_ATTEMPT,
    ENROLL,
    UPDATE_USER,
    CREATE_USER,
    OLB_ENROLL,
    FAILED_OLB_ENROLL_ATTEMPT,
    ACTIVATE_CARD,
    OPEN_NEW_ACCOUNT,
    REQUEST_CREDIT,
    ADD_PAYEE,
    EDIT_PAYEE,
    PAYMENT,
    DEPOSIT,
    STOCK_TRADE,
    OPTIONS_TRADE,
    CHANGE_LOGIN_ID,
    CHANGE_EMAIL,
    CHANGE_PHONE,
    CHANGE_ADDRESS,
    CHANGE_PASSWORD,
    CHANGE_LIFE_QUESTIONS,
    CHANGE_STU,
    FAILED_CHANGE_PASSWORD_ATTEMPT,
    CHANGE_ALERT_SETTINGS,
    CHANGE_STATEMENT_SETTINGS,
    CHANGE_AUTH_DATA,
    SEND_SECURE_MESSAGE,
    READ_SECURE_MESSAGE,
    VIEW_CHECK,
    VIEW_STATEMENT,
    REQUEST_CHECK_COPY,
    REQUEST_STATEMENT_COPY,
    REQUEST_CHECKS,
    REQUEST_NEW_CARD,
    REQUEST_NEW_PIN,
    EXTRA_AUTH,
    USER_DETAILS,
    CLIENT_DEFINED,
    WITHDRAW,
    CARD_PIN_CHANGE;

    public String value() {
        return name();
    }

    public static EventType fromValue(String v) {
        return valueOf(v);
    }

}
