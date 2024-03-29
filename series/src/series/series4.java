package series;

import java.util.Scanner;

public class series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int i,n,sum=0;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter n number");
		   n=sc.nextInt();
		   
		for(i=1;i<=n;i++){
			sum=(i*i*i);
		
		
       System.out.println(sum);
	
	
		}
}
}