
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChallengeResponse2
    extends GenericResponse
{
    protected CredentialChallengeList credentialChallengeList;
    
    protected DeviceManagementResponsePayload deviceManagementResponse;
}
