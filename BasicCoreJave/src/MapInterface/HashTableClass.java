package MapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args)
	{
		Hashtable<Integer, String> map=new Hashtable<>();
	       
	       map.put(1, "Deepak");
	       map.put(2, "Preksha");
	       map.put(3, "Saloni");
	       map.put(4, "Vijay");
	       map.put(null, "Snehal");
	       
	       System.out.println(map.get(2));
	       
	 }

}
