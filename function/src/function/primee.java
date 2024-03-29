package function;

import java.util.Scanner;

public class primee {
	public static void prime(int n){
		int i,div=0;
		
		for(i=2;i<=n/2;i++){
			if(n%i==0){
			div=1;
			break;}
		}
		if (div==1)
			System.out.println("it not prime");
		else
			System.out.println("prime");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt(); 
	       prime(n);
         
	}

}
