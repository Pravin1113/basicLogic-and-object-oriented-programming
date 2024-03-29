package collection;

import java.util.Hashtable;
import java.util.*;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> name= new Hashtable<>();
		name.put(1,"ravi");
		  name.put(2, "avi");
		 name.put(3, "shubham");
		 
//		  System.out.println("intiate map"+name);
//		  
//		  name.putIfAbsent(4,"pravin");
//		  System.out.println("upadated map"+name);
//		  
//		  for(Map.Entry m:name.entrySet()) {
//			  System.out.println(m.getKey()+" "+m.getValue()+" ");
//		  }
		 System.out.println(name.getOrDefault(1, "not found"));
		 System.out.println(name.getOrDefault(4, "not found"));
		  
		
	}

}
