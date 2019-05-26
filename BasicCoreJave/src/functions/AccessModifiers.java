package functions;

public class AccessModifiers 

{
  public static void main(String[] args) 
  
  {
	AccessModifiers obj= new AccessModifiers();
	obj.publicMethod();
	obj.privateMethod();
	obj.noAccessMethod();
	obj.protectedMethod();
  }
  
  // public method
  
  public void publicMethod()
  {
	  System.out.println("Public Method");
  }
  
  private void privateMethod()
  {
	  System.out.println("private Method");
  }
  
   void noAccessMethod()
  {
	  System.out.println("No acess Method");
  }
  
  protected void protectedMethod()
  {
	  System.out.println("protected Method");
  }
}
