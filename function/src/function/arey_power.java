package function;

import java.util.Scanner;

public class arey_power {
	 static int power(){
		 int a,i,b,f1=1;
		 Scanner sc=new  Scanner (System.in);
			System.out.println("entet number");
			a=sc.nextInt();
			b=sc.nextInt();
			for(i=1;i<=b;i++)
				f1=f1*a;
			return(f1);
			
	 }

	public static void main(String[] args) {
		int f1=power();
		System.out.println("power="+f1);
	}

}
