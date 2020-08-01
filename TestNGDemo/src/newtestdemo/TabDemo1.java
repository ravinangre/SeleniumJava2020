package newtestdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TabDemo1 {
	 @Test
	  public void openSameUrlInMultipleTab() throws InterruptedException {
		 	System.setProperty("webdriver.gecko.driver", "I://geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    {
		         
		        driver.navigate().to("http://google.com");
		        WebElement body = driver.findElement(By.tagName("body"));

		        body.sendKeys(Keys.CONTROL + "t");
		        driver.get("http://www.facebook.com");
		    }
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.open('http://www.yahoo.com');");
		    Thread.sleep(10000);
		    driver.quit();
	 }
}

