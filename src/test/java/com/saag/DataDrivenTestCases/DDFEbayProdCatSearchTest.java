package com.saag.DataDrivenTestCases;

import org.testng.annotations.Test;

import com.saag.TestBase.BaseTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class DDFEbayProdCatSearchTest  extends BaseTest
{

	@Test(dataProvider = "ebayData")
	public void f(String cat, String prod) {


		WebElement dd=	driver.findElement(By.id(loc.getProperty("ddcat")));
		Select s = new Select(dd);
		s.selectByVisibleText(cat);



		WebElement text =	driver.findElement(By.id(loc.getProperty("textSearch")));
		text.clear();
		text.sendKeys(prod);
		driver.findElement(By.id(loc.getProperty("btnSearch"))).click();

	}

	@DataProvider
	public Object[][] ebayData() throws Exception
	{

		Object [][] myData = null;
		
		XSSFWorkbook workbook = new XSSFWorkbook(".\\src\\test\\resources\\Excel\\DDFEbayInput.xlsx");
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();

		myData= new Object[rows-1][2];

		for(int i=1;i<rows;i++)
		{
			myData[i-1][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			myData[i-1][1]= sheet.getRow(i).getCell(1).getStringCellValue();
		}

		workbook.close();
		return myData;
	}

}
