package newtestdemo;

import org.testng.annotations.Test;

public class Skipdemo {
	
	@Test(enabled=false)
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
	 
	  @Test
	 
	  public void Four() {
	 
	   System.out.println("This is the Test Case number Four");
	 
	  }
}
