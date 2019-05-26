package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Demo2 
{
	@BeforeTest
    public void beforeTest()
    {
   	 System.out.println("Before Demo 2");
    }
    @AfterTest
    public void afterTest()
    {
   	 System.out.println("After Demo 2");
    }
}
