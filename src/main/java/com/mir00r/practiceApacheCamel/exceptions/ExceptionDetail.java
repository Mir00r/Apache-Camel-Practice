package com.mir00r.practiceApacheCamel.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionDetail implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private String argument;
  private String type;
}
