package MapInterface;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) 
	{
       HashMap<Integer, String> map=new HashMap<>();
       
       map.put(1, "Deepak");
       map.put(2, "Preksha");
       map.put(3, "Saloni");
       map.put(4, "Vijay");
       map.put(4, "Snehal");
       map.put(null, "Test");
       
       System.out.println(map.get(4));
       
       
       System.out.println(map.get(null));
       
	}

}
