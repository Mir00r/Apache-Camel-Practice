package com.mir00r.practiceApacheCamel.domains.mqinteg.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mir00r.practiceApacheCamel.domains.mqinteg.models.ProductRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Service;

@Service
public class ProductRequestProcessor implements Processor {

  @Override
  public void process(Exchange exchange) throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    ProductRequest productRequest = exchange.getIn().getBody(ProductRequest.class);
    String json = objectMapper.writeValueAsString(productRequest);
    exchange.getIn().setBody(json.getBytes()); // convert JSON to byte[]
  }
}
