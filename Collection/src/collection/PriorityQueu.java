package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> fruit= new PriorityQueue<String>();
		fruit.add("xyz");
		fruit.add("banana");
		fruit.add("apple");
		 fruit.add("mango");
		 fruit.add("chiku");
		   
	Iterator itr=fruit.iterator();
	while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		fruit.remove();
		fruit.remove();
		System.out.println("after removing");
		for (String a : fruit) {
			System.out.println(a);
		}
		

	}

}
