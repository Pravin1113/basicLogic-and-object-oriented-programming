package arrey;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class DuplicateNo{
	public static void main(String[] args) {
		int a[]=new int[] {23,45,34,54,23,34,};
		HashSet<Integer> s=new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
			
			
		}
		for (Integer integer : s) {
			System.out.println(integer);
			
		}
	    
	    }
}