package com.mir00r.practiceApacheCamel.domains.largeexcelfile.routes;

import com.mir00r.practiceApacheCamel.domains.largeexcelfile.processors.ExcelToCsvProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcelToCSVRoute extends RouteBuilder {

  public static final String DIRECT_PROCESS_EXCEL_FILE = "direct:processExcelFile";

  private final ExcelToCsvProcessor excelToCsvProcessor;

  @Autowired
  public ExcelToCSVRoute(ExcelToCsvProcessor excelToCsvProcessor) {
    this.excelToCsvProcessor = excelToCsvProcessor;
  }

  @Override
  public void configure() throws Exception {

    from(DIRECT_PROCESS_EXCEL_FILE)
      .routeId("largeExcelToCSVRoute")
      .log("Processing Excel file: ${body}")
      .process(this.excelToCsvProcessor)
      .log("Chunk written: ${header.CamelFileName}");
  }
}
