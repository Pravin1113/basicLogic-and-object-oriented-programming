package pattern;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,k=1;
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			k=5;
			for (j=1;j<=i;j++){
				
				System.out.print(""+k--);
				
			}
		
		System.out.println();
}
	



}



}
