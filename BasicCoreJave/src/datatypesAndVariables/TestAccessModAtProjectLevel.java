package datatypesAndVariables;

import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers 
{

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicMethod();
		
		TestAccessModAtProjectLevel obj1=new TestAccessModAtProjectLevel();
		obj1.protectedMethod();

	}

}
