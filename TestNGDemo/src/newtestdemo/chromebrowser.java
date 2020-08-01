package newtestdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class chromebrowser {
@Test
public void main()
{
	
	System.setProperty("webdriver.gecko.driver","I:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	}

}
