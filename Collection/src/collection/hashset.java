package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<Integer> rono=new HashSet<Integer>();
      rono.add(111);
      rono.add(112);
      rono.add(113);
      Iterator<Integer> i=rono.iterator();
      while(i.hasNext()) {
    	  System.out.println(i.next());
      }
	}

}
