package com.ita.pom.actitime;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestData {
 

  @DataProvider
  public Object[][] companies() {
    return new Object[][] {
      new Object[] { "IBM" },
      new Object[] { "Wipro" },
      new Object[] { "Oracle" }
    };
  }
  
  
  
  
  
  
}
