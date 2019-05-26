package oops.abstraction;

public class User2 {

	public static void main(String[] args) 
	{
      RBI acc=bankFeature("ICICI");
      acc.creditcard();
      acc.debitcard();
      acc.netbanking();
      acc.savingAccount();
      acc.Demonetization();
      
      SupremeCourt.RBIGuidlines();
    		  
	}
	
	public static RBI bankFeature(String bankname)

	{
		RBI acc=null;
		
		if(bankname.equals("HDFC"))
		{
		   acc=new HDFC();
		}
		else if(bankname.equals("ICICI"))
				{
					acc=new ICICI();
				}
				else if(bankname.equals("Axis"))
				{
					acc=new Axis();
				}
				
			return acc;
	}
}