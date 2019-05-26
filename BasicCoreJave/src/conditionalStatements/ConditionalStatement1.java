package conditionalStatements;

public class ConditionalStatement1 {

	public static void main(String[] args) 
	{

    int a=10;
    int b=20;
    int c=30;
    
   if(a>b)
   {
System.out.println("a is greater than b:"+a);
	}
   else if(a>c)
   {
	   System.out.println("a is greater than c:"+a);

}
   else
   {
	   System.out.println("a is smallest:"+a);
   }
}
}