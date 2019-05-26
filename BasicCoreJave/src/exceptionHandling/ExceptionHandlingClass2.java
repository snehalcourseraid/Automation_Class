package exceptionHandling;

public class ExceptionHandlingClass2 {

	public static void main(String[] args) 
	{
		ExceptionHandlingClass2 obj= new ExceptionHandlingClass2();
		
		try {
			obj.test(10, 0);
		}catch(Exception e)
		{
			System.out.println("Fail:"+ e.getMessage());
		}
		

		 System.out.println("Print statement");
	}
	
	
         public int test(int a, int b)
         {
         return a/b;
         }
}

