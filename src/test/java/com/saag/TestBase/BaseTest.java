package com.saag.TestBase;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  
	public static  WebDriver driver;
	public static Properties config=new Properties();
	public static Properties loc=new Properties();
	public static FileInputStream fis;
	
  @BeforeSuite
  public void beforeSuite() throws Exception {
	  
	  fis =new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
	  config.load(fis);
	  fis =new FileInputStream(".\\src\\test\\resources\\properties\\loc.properties");
	  loc.load(fis);
	  
	  String browserName=config.getProperty("browser");
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if(browserName.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get(config.getProperty("url"));
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.close();
  }

}
