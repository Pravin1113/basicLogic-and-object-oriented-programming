package pattern;

import java.util.Scanner;

public class number_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,k;
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(i=n;i>=1;i--){
			
			for (j=i;j>=1;j--){
				System.out.print(""+j);
				
			}
		
		System.out.println();
}}

}
