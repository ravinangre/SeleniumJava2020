package windowhandledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboarddemo2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/autocomplete/");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//input[@id='tags']"));
		// Actions introduced using Actions class
		Actions actions=new Actions(driver);
		actions.keyDown(textbox,Keys.SHIFT);
		actions.sendKeys("inspire");
		actions.keyUp(Keys.SHIFT);
		actions.build().perform();
		System.out.println("succesfully send keys in uppercase");
	}
}
