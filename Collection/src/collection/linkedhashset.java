package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<Integer> rono=new  LinkedHashSet<Integer>();
	      rono.add(111);
	      rono.add(112);
	      rono.add(110);
	      Iterator<Integer> i=rono.iterator();
	      while(i.hasNext()) {
	    	  System.out.println(i.next());
	      }

	}

}
