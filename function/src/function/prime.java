package function;

import java.util.Scanner;

public class prime {
	static String fact (){
		int n,div=0,i;
		Scanner sc=new  Scanner (System.in);
		System.out.println("entet number");
		n=sc.nextInt();
		for(i=2;i<(n/2);i++){
			if (n%i==0){
			div=1;
			break;
		}
     
	}
	if (div==0)
		return "no is prime";
		else 
			return "no is not prime";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f1=fact();
		System.out.println(""+f1);

	}

}
