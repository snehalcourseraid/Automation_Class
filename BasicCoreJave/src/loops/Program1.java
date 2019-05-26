package loops;

public class Program1 {

	public static void main(String[] args) 
	
	{
	    int n=1;
	    
        System.out.println(n);	
        System.out.println(n + " "+(n+1));
		System.out.println(n+ " "+(n+1)+" "+(n+2));	
		System.out.println(n+ " "+(n+1)+" "+(n+2)+ " "+(n+3));	
		
	

	for(int i=1;i<=1;i++)
	{
		System.out.println(i);
		for(int j=1; j<=2;j++)
		System.out.print(j);
		System.out.println(" ");
		for(int k=1; k<=3;k++)
	    System.out.print(k);
		System.out.println(" ");
		for(int l=1; l<=4;l++)
	    System.out.print(l);
		
	}
	
	

}
}