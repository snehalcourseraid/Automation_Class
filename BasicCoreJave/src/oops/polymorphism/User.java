package oops.polymorphism;

public class User 
{

	public static void main(String[] args)
	
	{
      
		Functions obj=new Functions();
		int addition=obj.sum(1, 2);
		System.out.println(addition);
		addition=obj.sum(3, 2, 1);
        System.out.println(addition);
        
        System.out.println(obj);
	}

}
