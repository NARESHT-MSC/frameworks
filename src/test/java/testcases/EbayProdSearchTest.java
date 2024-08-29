package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EbayProdSearchTest {
	
	@Test
	public static void productsearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		
	WebElement text =driver.findElement(By.cssSelector("input#gh-ac"));
	text.clear();
	text.sendKeys("sony");
	driver.findElement(By.cssSelector("input#gh-btn")).click();
	Reporter.log("product search was successful..", true);

	}

}
