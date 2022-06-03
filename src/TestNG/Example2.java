package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {
	 @Test
     public void test4()
     {
    	 System.out.println("Running test 4");
     }
     
     @Test
     public void test5()
     {
    	 System.out.println("Running test 5");
    	// Assert.fail();
    	 }
     
     @Test
     public void test6()
     {
    	 System.out.println("Running test 6");

}
}