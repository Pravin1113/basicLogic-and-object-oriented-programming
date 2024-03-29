package collection;

import java.util.HashMap;
import java.util.Map;


public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> name=new HashMap<Integer, String>();
		name.put(1, "Pravin");
		name.put(2, "ravi");
		name.put(3, "Shubham");
		name.put(4, "avi");
		name.remove(1);
		name.replaceAll((k,v)->"pravin");
		for (Map.Entry <Integer, String> entry : name.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+""+val);
		}
		}
		

	}
