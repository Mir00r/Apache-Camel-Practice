package com.mir00r.practiceApacheCamel.domains.era.aggregations;


import com.mir00r.practiceApacheCamel.domains.era.models.Order;
import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import java.util.ArrayList;
import java.util.List;

public class OrderAggregationStrategy implements AggregationStrategy {

  @Override
  public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    Order newOrder = newExchange.getIn().getBody(Order.class);

    if (oldExchange == null) {
      // First message, just return it
      List<Order> orders = new ArrayList<>();
      orders.add(newOrder);
      newExchange.getIn().setBody(orders);
      return newExchange;
    }

    // There are already messages, so we aggregate
    List<Order> existingOrders = oldExchange.getIn().getBody(List.class);
    existingOrders.add(newOrder);
    oldExchange.getIn().setBody(existingOrders);
    return oldExchange;
  }
}
