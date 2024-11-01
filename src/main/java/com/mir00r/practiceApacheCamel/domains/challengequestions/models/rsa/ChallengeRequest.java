
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChallengeRequest
  extends GenericRequest {

  protected CredentialChallengeRequestList credentialChallengeRequestList;

}
