package com.mir00r.practiceApacheCamel.domains.largeexcelfile.processors;

import com.mir00r.practiceApacheCamel.domains.commons.Constants;
import com.mir00r.practiceApacheCamel.domains.utils.AppUtil;
import com.opencsv.CSVWriter;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

@Component
public class ExcelToCsvProcessor implements Processor {

  @Override
  public void process(Exchange exchange) throws Exception {
    String filePath = exchange.getIn().getBody(String.class);
    InputStream fileInputStream = new FileInputStream(filePath);
    this.convertLargeExcelToCSV(fileInputStream, ',', 1000);
  }

  private void convertLargeExcelToCSV(InputStream excelInputStream, Character separator,
    int dataSize) throws
    IOException {
    int chunkSize = dataSize == 0 ? 1000 : dataSize; // Adjust the chunk size based on your needs
    File excelDirectory =
      AppUtil.createOutputDirectory("output/excel"); // Create a temporary directory
    File csvDirectory = AppUtil.createOutputDirectory("output/csv"); // Create a temporary directory

    try (Workbook workbook = WorkbookFactory.create(excelInputStream)) {
      for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
        Sheet originalSheet = workbook.getSheetAt(sheetIndex);

        int totalRows = originalSheet.getPhysicalNumberOfRows();
        int startRow = 0;
        int chunkNumber = 1;

        while (startRow < totalRows) {
          try (SXSSFWorkbook chunkWorkbook = new SXSSFWorkbook()) {
            Sheet chunkSheet = chunkWorkbook.createSheet("Sheet1");

            int endRow = Math.min(startRow + chunkSize, totalRows);

            for (int rowNumber = startRow; rowNumber < endRow; rowNumber++) {
              Row originalRow = originalSheet.getRow(rowNumber);
              if (originalRow != null) {
                Row chunkRow = chunkSheet.createRow(rowNumber - startRow);

                for (int colNumber = 0; colNumber < originalRow.getLastCellNum(); colNumber++) {
                  Cell originalCell = originalRow.getCell(colNumber);
                  Cell chunkCell = chunkRow.createCell(colNumber);
                  if (originalCell != null) {
                    CellType cellType = originalCell.getCellType();
                    chunkCell.setCellType(cellType);
                    switch (cellType) {
                      case STRING:
                        chunkCell.setCellValue(originalCell.getStringCellValue());
                        break;
                      case NUMERIC:
                        chunkCell.setCellValue(originalCell.getNumericCellValue());
                        break;
                      // Handle other cell types as needed
                    }
                  }
                }
              }
            }
            try (FileOutputStream chunkFileOutputStream = new FileOutputStream(
              new File(excelDirectory,
                "sheet_" + sheetIndex + "_chunk_" + chunkNumber + ".xlsx"))) {
              chunkWorkbook.write(chunkFileOutputStream);
            }
          }
          startRow += chunkSize;
          chunkNumber++;
        }
      }
    }
    // Process the chunk and convert to CSV
    processExcelChunk(excelDirectory, csvDirectory, separator);
  }

  private void processExcelChunk(File sourceDirectory, File outputDirectory, Character separator)
    throws IOException {
    File[] excelFiles = sourceDirectory.listFiles((dir, name) -> name.endsWith(".xlsx"));
    assert excelFiles != null;
    for (File excelFile : excelFiles) {
      String csvFileName = String.format("%s.csv", excelFile.getName().replace(".xlsx", ""));
      File csvFile = new File(outputDirectory, csvFileName);

      try (CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile),
        separator == null ? Constants.DEFAULT_COLUMN_SEPARATOR_CH : separator, '"', '"', "\n")) {
        for (Row row : WorkbookFactory.create(excelFile).getSheetAt(0)) {
          String[] csvRow = new String[row.getLastCellNum()];

          for (int i = 0; i < row.getLastCellNum(); i++) {
            Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            csvRow[i] = AppUtil.getCellValueAsString(cell);
          }
          csvWriter.writeNext(csvRow);
        }
      }
    }
  }


}
