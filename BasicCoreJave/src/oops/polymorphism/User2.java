package oops.polymorphism;

public class User2 {

	public static void main(String[] args)
	
	{
		//without accessing class this class is able to call object of a another class
           
		NoDirectObject ref= NoDirectObject.obj();	
		ref.age=30;
		
		NoDirectObject ref2= NoDirectObject.obj();	
		ref2.age=20;		
				
		System.out.println(ref2.age);
		System.out.println(ref.age);
		
		 
	}

}
