package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) 
	
	{

     boolean login=true;
     
     if(login)
     {
    	 System.out.println("Login is successful");
    	 
    	 boolean logodisplayed=false;
    	 if(logodisplayed)
    	 {
    		 System.out.println("Logo is displayed");
    	 }
    	 else {
    		 System.out.println("Home page is displayed");
    	 }
     }else
     {
    	 System.out.println("Login failed");
     }

	}

}
