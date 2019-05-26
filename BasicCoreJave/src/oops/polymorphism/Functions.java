package oops.polymorphism;


public class Functions 
{


public Functions sd()
{
	//write a function which will return class object
	return new Functions();
}


	public int sum(int a, int b)
	{
		return a+b;
	}
	   
    public int sum(int a, int b, int c)
    
    {
    	return a+b+c;
    }
    
    public int sum(String b, int a)
    {
    	return a;
    	
    }
    
}