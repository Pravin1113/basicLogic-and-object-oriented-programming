package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyList {

	public static void main(String[] args) {
	ArrayList<String> fruit=new ArrayList<>();
	
   fruit.add("apple");
   fruit.add("mango");
   fruit.add("chiku");
    
   Iterator<String> itr=fruit.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
	
	
	
	}
}
