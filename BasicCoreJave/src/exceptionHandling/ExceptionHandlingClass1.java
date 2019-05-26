package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandlingClass1 {

	public static void main(String[] args) throws InterruptedException
	
	{
          //abnormal behaviour of code

		
		int a=10;int b=0;
		
		System.out.println(a/b);
		
		RBI obj=null;
		obj.creditcard();
		
		String str="Snehal";
		System.out.println(str.charAt(7));
		
		System.out.println("Snehal");
		
		//Exception type2:check Exception
		Thread.sleep(3000);
		System.out.println("Doe");
		Test.login();
	}

}
