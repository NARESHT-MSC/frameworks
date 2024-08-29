package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EbayCategoryProdSearchTest {

	@Test
	public static void productsearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");

		WebElement cat = driver.findElement(By.cssSelector("select#gh-cat"));

		Select s = new Select(cat);
		s.selectByVisibleText("Books");

		WebElement text =driver.findElement(By.cssSelector("input#gh-ac"));
		text.clear();

		text.sendKeys("selenium");
		driver.findElement(By.cssSelector("input#gh-btn")).click();
		Reporter.log("under category product search was successful..", true);

	}

}
