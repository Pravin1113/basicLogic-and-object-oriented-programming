package arrey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrimeNumberList{
	public static void main(String[] args) {
	    int isPrime, n=100;
	    List<Integer> list=new ArrayList<>();
	    for (int i = 2; i < n; i++) {
	       isPrime=0;
	       for (int j = 2; j<=i/2; j++) {

		    	if(i%j==0) {
		    		isPrime=1;
		    		break;
		    	}
		}
	       if(isPrime==0) {
	    	   list.add(i);
	       }
			
		}
	   
		Object[] b=list.toArray();
	
	      for (int i = 0; i < b.length; i++) {
	    	          if(i%4==0) {
	    	        	  System.out.println(b[i]);
	    	          }
	    	           }
			
		
	}
}
