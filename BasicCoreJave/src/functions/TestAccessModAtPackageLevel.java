package functions;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicMethod();
		obj.noAccessMethod();
		obj.protectedMethod();
		

	}

}
