package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandlingClass3 {

	public static void main(String[] args) throws InterruptedException
	{
        try{//Exception type 1:Unchecked Exception
		int a=10;int b=10;
		
		System.out.println(a/b);
		
		RBI obj=null;
		//obj.creditcard();
		
		String str="Snehal";
		System.out.println(str.charAt(7));
		
		System.out.println("Snehal");
		
		//Exception type2:check Exception
		Thread.sleep(3000);
		System.out.println("Doe");
		Test.login();
      }catch(ArithmeticException e)
        {
    	  System.out.println("Divident is zero");
        }catch(NullPointerException e)
        {
        System.out.println("RBI reference is not initialized");
        }catch(RuntimeException e)
        {
        System.out.println(e.getMessage());
        }
        System.out.println("Last step");
        
	}

}
