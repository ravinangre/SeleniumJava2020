package newtestdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertdemo1 {
	  @Test
	 
	  public void test() {
	 
	   String sValue = "Inspire";
	 
	   System.out.println(" What is your class name");
	 
	   Assert.assertEquals("Inspire", sValue);
	 
	   Assert.assertEquals(false, false);
	   System.out.println(sValue);
	  }
}
