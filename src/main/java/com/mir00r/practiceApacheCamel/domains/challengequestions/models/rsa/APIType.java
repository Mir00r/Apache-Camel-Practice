
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum APIType {

    WEB_REDIRECT,
    DIRECT_SOAP_API,
    ANALYZE_ONLY;

    public String value() {
        return name();
    }

    public static APIType fromValue(String v) {
        return valueOf(v);
    }

}
