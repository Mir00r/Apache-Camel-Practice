package com.mir00r.practiceApacheCamel.domains.datasyncbetweendb.routes;

import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.mongodb3.MongoDbConstants;
import org.springframework.stereotype.Component;

import java.util.Map;

//import static org.apache.camel.processor.idempotent.MemoryIdempotentRepository.memoryIdempotentRepository;

@Component
public class DatabaseSyncRoute extends RouteBuilder {

  public static final String DIRECT_MYSQL_TO_MONGODB = "direct:mysql-to-mongodb";
  public static final String DIRECT_MONGODB_TO_MYSQL = "direct:mongodb-to-mysql";

  @Override
  public void configure() throws Exception {

    // Poll MySQL for changes and update MongoDB
//    from(
//      "sql:SELECT * FROM customer WHERE updated_at >= :#lastPollTime?dataSource=dataSource&outputType=SelectList")
//      .routeId("mysql-to-mongodb-route")
//      .idempotentConsumer(header("id"), memoryIdempotentRepository(200))
//      .setHeader(MongoDbConstants.OPERATION_HEADER, constant("save"))
//      .to("mongodb:myMongoClient?database=crm&collection=customers&operation=save");

    from(DIRECT_MYSQL_TO_MONGODB)
      .routeId("mysql-to-mongodb-route")
      .log("Starting MySQL to MongoDB sync")
//      .idempotentConsumer(header("id"), memoryIdempotentRepository(200))
//      .to("sql:SELECT * FROM customer WHERE updated_at >= :#lastPollTime?dataSource=dataSource&outputType=SelectList")
      .log("Fetched records from MySQL")
//      .setHeader(MongoDbConstants.OPERATION_HEADER, constant("save"))
//      .to("mongodb:myMongoClient?database=crm&collection=customers&operation=save")
      .log("Records saved to MongoDB");

    // Poll MongoDB for changes and update MySQL
//    from("mongodb:myMongoClient?database=crm&collection=customers&operation=findAll")
//      .routeId("mongodb-to-mysql-route")
//      .idempotentConsumer(header("_id"), memoryIdempotentRepository(200))
//      .process(exchange -> {
//        // Build SQL query dynamically based on MongoDB document
//        Map<String, Object> body = exchange.getIn().getBody(Map.class);
//        String sql = "REPLACE INTO customer (id, name, email, updated_at) VALUES ('"
//          + body.get("_id") + "', '"
//          + body.get("name") + "', '"
//          + body.get("email") + "', NOW())";
//        exchange.getIn().setBody(sql);
//      })
//      .to("jdbc:dataSource");

    from(DIRECT_MONGODB_TO_MYSQL)
      .routeId("mongodb-to-mysql-route")
      .log("Starting MongoDB to MySQL sync")
//      .to("mongodb:myMongoClient?database=crm&collection=customers&operation=findAll")
      .log("Fetched records from MongoDB")
//      .idempotentConsumer(header("_id"), memoryIdempotentRepository(200))
//      .process(exchange -> {
//        // Build SQL query dynamically based on MongoDB document
//        Map<String, Object> body = exchange.getIn().getBody(Map.class);
//        String sql = "REPLACE INTO customer (id, name, email, updated_at) VALUES ('"
//          + body.get("_id") + "', '"
//          + body.get("name") + "', '"
//          + body.get("email") + "', NOW())";
//        exchange.getIn().setBody(sql);
//      })
//      .to("jdbc:dataSource")
      .log("Records updated in MySQL");
  }
}
