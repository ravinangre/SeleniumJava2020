package newtestdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameters {
	private static WebDriver driver;
	 
	  @Test 
	 
	  @Parameters({ "sUsername", "sPassword" })
	  public void test(String sUsername, String sPassword) {
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sUsername);
			 
	      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sPassword);
	 
	      driver.findElement(By.xpath("//input[@value='Log In']")).click();
	      
	      String title=driver.getTitle();
	   
	      System.out.println(title);
	 
	      Assert.assertTrue(driver.getTitle().contains(title), "User is succefully logged in");
	  }
	  @BeforeMethod
	  public void beforemethod() {

	   System.setProperty("webdriver.chrome.driver","I:\\chromedriver_win32\\chromedriver.exe");
	   
	   driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://www.facebook.com");
	 
	      driver.manage().window().maximize();
	  }
	 @AfterMethod
	 public void aftermethod() {
	      driver.quit();
	 }
}
