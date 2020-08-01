package newtestdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertsdemo {
	private static WebDriver driver;
	 
	  @Test
	 
	  public void f() {
		  
		  System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		  driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.google.com");
	 
	      WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	 
	 
	      Assert.assertTrue(gmail.isDisplayed());
	 
	 
	      gmail.click();
	 
	  }
}
