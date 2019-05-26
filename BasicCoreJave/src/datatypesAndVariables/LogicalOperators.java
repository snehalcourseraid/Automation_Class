package datatypesAndVariables;

public class LogicalOperators {

	public static void main(String[] args)
	
	{

      int a=10;
      int b=20;
      int c=30;
      //And
      if(a>b&&a>c)
      {
    	  System.out.println("a is greatest");
      }
      else
      {
    	  System.out.println("a is not greatest");
      }
      //OR
      if(a>b||a>c)
      {
    	  System.out.println("a is either greater than b or c");
      }
      else
      {
    	  System.out.println("a is smallest");
      }
       
      

	}

}
