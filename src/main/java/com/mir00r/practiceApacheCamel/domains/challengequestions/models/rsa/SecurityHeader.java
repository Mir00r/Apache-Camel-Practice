
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class SecurityHeader {

    protected String callerCredential;

    protected String callerId;

    protected AuthorizationMethod method;

}
