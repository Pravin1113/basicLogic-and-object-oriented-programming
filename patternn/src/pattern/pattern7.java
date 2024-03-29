package pattern;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int ch=64;
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				
		
				System.out.print(" "+(char)(ch+j));

		}
		System.out.println(" ");
		}
	}


	

}
