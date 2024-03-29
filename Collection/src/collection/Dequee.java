package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<String> fruit=new ArrayDeque<>();
        fruit.add("mango");
        fruit.add("banana");
		fruit.add("apple");
		 fruit.add("mango");
		 fruit.add("chiku");
//		 Iterator<String> itr= fruit.iterator();
//		 while(itr.hasNext()) {
//			 System.out.println(itr.next());
//		 }
		 fruit.removeLast();
		 Iterator<String> itr= fruit.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
