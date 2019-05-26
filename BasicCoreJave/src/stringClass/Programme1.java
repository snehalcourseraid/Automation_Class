package stringClass;

public class Programme1 {

	public static void main(String[] args) 
	
	{
         String str="Anand";
         int count=0;
         
         for (int i=0;i<str.length();i++)
        	 
        	 if(str.charAt(i)=='a') {count++;}
         
         System.out.println(count);
         
         for(int i=0;i<str.length();i++)
         {
        	 if(str.substring(i, i+1).equals("a"))
        	 {
        		 count++;
        	 }
         }
         
	}
	
	

}
