package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) 
	{
          HashSet<String> set=new HashSet<>();
          
          set.add("Anand");
          set.add("Snehal");
          
          Iterator<String> it=set.iterator();
          
          
	}

}
