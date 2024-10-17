package com.mir00r.practiceApacheCamel.domains.era.processors;

import com.mir00r.practiceApacheCamel.domains.era.models.Order;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor implements Processor {

  @Override
  public void process(Exchange exchange) throws Exception {
    Object body = exchange.getIn().getBody();

    // Assuming the body is an Order object or some other format that needs transformation
    Order order;
    if (body instanceof Order) {
      order = (Order) body;
      // Perform any necessary transformations here
      // For simplicity, we assume the order is already in the correct format
    } else {
      // Handle other formats (e.g., plain text, CSV from FTP, etc.)
      // Example: parse data and create an Order object
      order = new Order("123", "John Doe", "Product XYZ", 100.0, "FTP");
    }
    exchange.getIn().setBody(order);
  }
}
