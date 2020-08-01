package newtestdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabBrowserDemo {
	public static void main(String[] args) throws InterruptedException {
	    System.out.println("Main Started");
	    System.setProperty("webdriver.gecko.driver", "I://geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com");
	    
	    // Store all currently open tabs in tabs
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    
	    // Click on link to open in new tab
	    driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	    
	    // Switch newly open Tab
	    driver.switchTo().window(tabs.get(1));
	    
	    // Perform some operation on Newly open tab
	    // Close newly open tab after performing some operations.
	    driver.close();
	    
	    // Switch to old(Parent) tab.
	    driver.switchTo().window(tabs.get(0));
	}
}
