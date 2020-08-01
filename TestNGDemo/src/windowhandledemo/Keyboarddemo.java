package windowhandledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboarddemo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		
		WebElement btnelement=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnelement).perform();
		
		
		/*WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
	    elementOpen.click();*/ 
	    driver.switchTo().alert().accept();
	    System.out.println("Right click Alert Accepted");
	 
	    // Close the main window 
	    WebElement weblink=driver.findElement(By.linkText("Sortable"));
	    actions.moveToElement(weblink).click().build().perform();
	}
}
