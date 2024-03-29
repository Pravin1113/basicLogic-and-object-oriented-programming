package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> name=new LinkedHashMap<>();
		 name.put(1,"ravi");
		 name.put(2, "avi");
		 name.put(3, "shubham");
		   
//		 
//	 for (Map.Entry<Integer, String> entry : name.entrySet()) {
//			 Integer i = entry.getKey();
//		String s = entry.getValue();
//		System.out.println(i+""+s);
//		
//		}
//	 System.out.println("keys:"+name.keySet());
//	 
//	 System.out.println("values:"+name.values());
//
//	 System.out.println("key value pairs:"+name.entrySet());
		 System.out.println(""+name);
	}

}
