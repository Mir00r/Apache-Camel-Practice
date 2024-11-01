
package com.mir00r.practiceApacheCamel.domains.challengequestions.models.rsa;

import lombok.Data;

@Data
public class MessageHeader {
    
    protected APIType apiType;
    
    protected String requestId;
    
    protected RequestType requestType;
    
    protected String timeStamp;
    
    protected String version;
}
