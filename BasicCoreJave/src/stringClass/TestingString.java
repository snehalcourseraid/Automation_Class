package stringClass;

public class TestingString {

	public static void main(String[] args) 
	{
          String str="Snehal";
         String str2="snehal";
         String test="my name is snehal";
         //charAtt
         System.out.println(str.charAt(3));
         
         //length
         System.out.println(str.length());
         
         //Equals
         
         System.out.println(str.equals(str2));
         
         //equal ignorecase
         System.out.println(str.compareToIgnoreCase(str2));
         
         //Replace
         
         System.out.println(str.replace("Sne", "Den"));
         
         //Split
         //enhanced for loop
         String[] arr=test.split("  ");
         for (String s :arr)
         {
        	 System.out.println(s);
        	 
         }
         
         //sub string
         
         System.out.println(str.substring(3));
         System.out.println(str.substring(2, 4));
         
	}
	
	
}
	
