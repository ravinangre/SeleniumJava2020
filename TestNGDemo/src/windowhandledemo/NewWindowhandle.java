package windowhandledemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowhandle {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "I://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String parentwindow=driver.getWindowHandle();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,150)");
	WebElement clickbtn=driver.findElement(By.xpath("//button[@id='button1']"));
	for(int i=0;i<4;i++)
	{
	clickbtn.click();
	Thread.sleep(3000);
	}
	Set<String> childernwindowhanles=driver.getWindowHandles();
	String lastwindowhandle="";
	for(String handle:childernwindowhanles)
	{
		System.out.println("Window Handle:"+handle);
	}
	driver.get("http://www.google.com");
	driver.switchTo().window(parentwindow);
}
}
