package com.mir00r.practiceApacheCamel.domains.largeexcelfile.controllers;

import com.mir00r.practiceApacheCamel.domains.largeexcelfile.routes.ExcelToCSVRoute;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("/api")
public class ExcelProcessingController {

  private final ProducerTemplate producerTemplate;

  @Autowired
  public ExcelProcessingController(ProducerTemplate producerTemplate) {
    this.producerTemplate = producerTemplate;
  }

  // Endpoint for uploading Excel files
  @PostMapping("/v1/excel/upload")
  public ResponseEntity<String> uploadExcelFile(@RequestParam("file") MultipartFile file) throws
    IOException {
    // Save the uploaded file to a temporary directory
    Path tempFile = Files.createTempFile("uploaded-", ".xlsx");
    file.transferTo(tempFile);

    // Start the Camel route and pass the file path
    this.producerTemplate.sendBody(ExcelToCSVRoute.DIRECT_PROCESS_EXCEL_FILE, tempFile.toString());

    return ResponseEntity.ok("File uploaded and processing started.");
  }
}
