package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 
{
    @Test
	public void testcase1()
   {
	   System.out.println("Test case 1");
   }
    @Test
	public void testcase2()
   {
	   System.out.println("Test case 2");
   }
    @Test
	public void testcase3()
   {
	   System.out.println("Test case 3");
   }
    
    @BeforeMethod
    public void beforeMethod()
    {
    	System.out.println("Before method class 1");
    }
    
    @AfterMethod
    public void afterMethod()
    {
    	System.out.println("After method class 1");
    }
    
    @BeforeClass
    public void beforeClass()
    {
    	System.out.println("Before class class 1");
    }
    @AfterClass
    public void afterClass()
    {
    	System.out.println("After class class 1");
    }
}
