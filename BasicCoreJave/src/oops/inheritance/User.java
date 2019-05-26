package oops.inheritance;

public class User {

	public static void main(String[] args) 
	
	{

		Smartphone phone= new Smartphone();
		phone.internet();
		phone.texting();
		phone.calling();
		
		Telephone tel= new Telephone();//parent class can have properties or objects of child class
		tel=new Mobile();
		tel=new Smartphone();
	}

}
