package functions;

public class Fun1 
{

	public static void main(String[] args) 
	{
		//function calling
		int add=sum(30,20);
		int add2=sum(10,20);
		
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
		
		Fun1 obj=new Fun1();
		obj.message("Snehal");
	}


public static int sum(int a, int b)
   {
	
	return a+b;
	//System.out.println(a+b);
	
    }

public void message(String message)

{
	System.out.println("Message is"+" "+message);
}
}