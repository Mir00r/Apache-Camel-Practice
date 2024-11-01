
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class StatusHeader {

    protected Integer reasonCode;
    
    protected String reasonDescription;
    
    protected Integer statusCode;
}
