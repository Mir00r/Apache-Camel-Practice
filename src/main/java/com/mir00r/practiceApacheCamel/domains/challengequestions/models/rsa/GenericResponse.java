
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public abstract class GenericResponse {
    
    protected IdentificationData identificationData;

    protected MessageHeader messageHeader;
    
    protected StatusHeader statusHeader;

}
