package newtestdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class tabdemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","I://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(2000);

// open the second tab
driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "t");
driver.get("https://www.facebook.com");
Thread.sleep(2000);

// switch to the previous tab
driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "" + Keys.SHIFT + "" + Keys.TAB);
Thread.sleep(2000);
	}
}