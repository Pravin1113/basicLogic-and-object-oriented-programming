package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> rono=new  TreeSet<Integer>();
	      rono.add(111);
	      rono.add(112);
	      rono.add(110);
	      Iterator<Integer> i=rono.iterator();
	      while(i.hasNext()) {
	    	  System.out.println(i.next());
	      }
	}

}
