package datadrivendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import datadrivendemo.Excelutils;

public class DataProviderWithExcel_002 {
	private String sTestCaseName;
	 
	 private int iTestCaseRow;
	 
	 WebDriver driver;
	 
	  @BeforeMethod
	 
	  public void beforeMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver","I:\\geckodriver.exe");
	   driver = new FirefoxDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://www.facebook.com"); 
	 
	  } 
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void f(String sUserName, String sPassword) {
	 
	     	 
	     driver.findElement(By.xpath("//*[@id='email']")).sendKeys(sUserName);
	 
	 System.out.println(sUserName);
	 
	     driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(sPassword);
	 
	 System.out.println(sPassword);
	 
	     driver.findElement(By.xpath("//*[@value='Log In']")).click();
	 
	     System.out.println(" Login Successfully");
	 
	     
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
	    driver.close();
	 
	  }
	 
	  @DataProvider
	 
	  public Object[][] Authentication() throws Exception{
	 
	     // Setting up the Test Data Excel file
	 
	 Excelutils.setExcelFile("I://testData//TestData.xlsx","Sheet1");
	 
	 sTestCaseName = this.toString();
	 
	    // From above method we get long test case name including package and class name etc.
	 
	    // The below method will refine your test case name, exactly the name use have used
	 
	    sTestCaseName = Excelutils.getTestCaseName(this.toString());
	 
	     // Fetching the Test Case row number from the Test Data Sheet
	 
	     // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 
	 iTestCaseRow = Excelutils.getRowContains(sTestCaseName,0);
	 
	     Object[][] testObjArray = Excelutils.getTableArray("I://testData//TestData.xlsx","Sheet1",iTestCaseRow);
	 
	      return (testObjArray);
	 
	 }
}
