package com.mir00r.practiceApacheCamel.soap.commons;

import com.mir00r.practiceApacheCamel.exceptions.ExceptionDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.camel.CamelException;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoapInputFieldValueException extends CamelException {

  private String errorDetailCode;
  private List<ExceptionDetail> argumentDetails = new ArrayList<ExceptionDetail>();
}
