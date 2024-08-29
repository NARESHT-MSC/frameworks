package com.saag.POMTestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saag.TestBase.BaseTest;
import com.saag.TestBase.ClsEbay;

public class POMEbayProdSearchTest extends BaseTest {
  @Test
  public void productSearch() 
  {
	  ClsEbay cls = new ClsEbay(driver);
	  cls.fnProdSearch("sony");
	  
	  Reporter.log("Ebay Product Search Test is Successful...",true);
	  
  }
  
  
}
