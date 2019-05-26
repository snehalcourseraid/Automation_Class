package oops.abstraction;

public abstract class Sprint1 extends MSWord
{

	@Override
	public void edit()
	{
       System.out.println("MSWORD edit feature");		
	}

	@Override
	public void delete() 
	{
		System.out.println("MSWORD delete feature");
		
	}
	
}