package com.mir00r.practiceApacheCamel.utils;

import org.apache.poi.ss.usermodel.Cell;

import java.io.File;

public class AppUtil {

  public static File createOutputDirectory(String pathName) {
    File outputDirectory = new File(pathName);
    if (!outputDirectory.exists()) {
      outputDirectory.mkdirs();
    }
    return outputDirectory;
  }

  public static String getCellValueAsString(Cell cell) {
    return switch (cell.getCellType()) {
      case STRING -> cell.getStringCellValue();
      case NUMERIC -> String.valueOf(cell.getNumericCellValue());
      case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
      case FORMULA -> cell.getCellFormula();
      default -> "";
    };
  }

  public static String getBeanUri(String propertyName, String methodName) {
    return "bean:${exchangeProperty." + propertyName
      + "}?method=" + methodName;
  }
  public static String getBeanUri(String propertyName) {
    return "bean:${exchangeProperty." + propertyName
      + "}";
  }

  public static String getHeaderUri(String propertyName) {
    return "${header." + propertyName
      + "}";
  }

  public static String getExpressionPredicate(String propertyName, String condition) {
    return "${exchangeProperty." + propertyName + "} " + condition;
  }
}
