package arrey;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int []b= {34,4,5,23,23,89};
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]==b[j]) {
					System.out.println(b[i]+" ");
				}
				
			}
		}
		
	}

}
