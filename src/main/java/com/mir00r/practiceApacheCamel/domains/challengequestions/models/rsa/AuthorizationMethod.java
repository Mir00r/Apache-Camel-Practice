
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

public enum AuthorizationMethod {

    PASSWORD("PASSWORD"),

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
