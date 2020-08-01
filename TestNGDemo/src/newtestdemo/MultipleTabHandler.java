package newtestdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultipleTabHandler {

	WebDriver driver;
	@Test
	public void multipletab() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","I://geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String mainwindow=driver.getWindowHandle();
		
		Actions act=new Actions(driver);
		WebElement ctrl1=driver.findElement(By.xpath("//body[@id='gsr']"));
		act.click(ctrl1).sendKeys(Keys.CONTROL +"t").build().perform();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
	}
}
