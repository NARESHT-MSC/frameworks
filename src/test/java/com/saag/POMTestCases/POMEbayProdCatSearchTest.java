package com.saag.POMTestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saag.TestBase.BaseTest;
import com.saag.TestBase.ClsEbay;

public class POMEbayProdCatSearchTest extends BaseTest
{
	
  @Test
  public void catSearch() 
  {
	ClsEbay obj=new ClsEbay(driver);  
	obj.fnProdCatSearch("Books", "selenium");
	
	Reporter.log("Ebay Product Search in a category Test is Successful...",true);
	  
  }
}
