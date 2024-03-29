package arrey;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicate {

	public static void main(String[] args) {
		int a[]= {45,52,345,21,44};
		int b[]= {345,45,52,35,34};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[]c=new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		Arrays.toString(c);
		Set<Integer> list=new TreeSet<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					list.add(c[j]);
				}
			}
		}
		System.out.println(list);
	}

}
