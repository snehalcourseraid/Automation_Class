package functions;

public class Car 

{
  String name;
  String color;
 static int wheels=4;
  
 
 
 public Car(String name, String color)
 {
	this.name=name;
	this.color=color;
	
 }
  public Car() 
  {
	//Default constructor
  }
public void driving()
  {
	  System.out.println("I am driving "+name+" "+"with color"+color+" "+"which has" +wheels+ "wheels");
  }
}
