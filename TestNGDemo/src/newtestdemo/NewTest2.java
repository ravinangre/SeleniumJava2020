package newtestdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  @Test
  public void first() {
	  System.out.println("first test case");
  }
  @Test
  public void second() {
	  System.out.println("Second test case");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before every test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After every test method");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test case");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test case");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before test Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After test Suite");
  }

}
