package oops.inheritance;

public class User2 {

	public static void main(String[] args) 
	
	{
       Telephone tel=new Smartphone();
       tel.calling();//calling from child class at runtime
       tel.dialer();
	}

}
