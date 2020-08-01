package newdemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {

	@Test
	 
	  public void One() {
	 
	      System.out.println("This is the Test Case number One");
	 
	  }
	 
	  @Test
	 
	  public void Two() {
	 
	   System.out.println("This is the Test Case number Two");
	 
	  }
	 
	  @Test
	 
	  public void Three() {
	 
	   System.out.println("This is the Test Case number Three");
	 
	 }
	 
	  @BeforeTest
	 
	  public void Four() {
	 
	   System.out.println("This is the Test Case number Four");
	 
	  }
}
