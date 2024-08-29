package com.saag.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay extends BaseTest 
{

	public  WebDriver wb;

	public  ClsEbay(WebDriver b)
	{
		wb=b;
	}

	public void fnProdSearch(String pName)
	{
		WebElement text = driver.findElement(By.id(loc.getProperty("textSearch")));
		text.clear();
		text.sendKeys(pName);
		driver.findElement(By.id(loc.getProperty("btnSearch"))).click();
	}

	public void fnProdCatSearch(String cat,String pName)
	{
		WebElement dd = driver.findElement(By.id(loc.getProperty("ddcat")));
		Select s = new Select(dd);
		s.selectByVisibleText(cat);

		fnProdSearch(pName);

	}



}
