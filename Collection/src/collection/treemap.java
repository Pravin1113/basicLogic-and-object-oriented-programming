package collection;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeMap<Integer, String> name=new TreeMap<Integer,String>();
    
     name.put(1,"ravi");
	  name.put(2, "avi");
	 name.put(3, "shubham");
	   
 	 
  for (Map.Entry<Integer, String> entry : name.entrySet()) {		
	  Integer i = entry.getKey();
     String s = entry.getValue();
	 System.out.println(i+" "+s);
 
  }
	 // less than key
	 
	 System.out.println("headmap"+name.headMap(2));
	 
	 // greater than or equal to
	 System.out.println("talimap"+name.tailMap(2));
	 
	 // inbetween
	 System.out.println("submap"+name.subMap(1,3));
	 
   
	}

}
