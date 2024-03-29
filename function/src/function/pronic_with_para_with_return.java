package function;

import java.util.Scanner;

public class pronic_with_para_with_return {
	static void pro(int n ){ 
		int i,abc=0;
		for(i=1;i<=(n/2);i++)
		{
		if(n==(i*(i+1)))
		{
			abc=1;
			break;
		}
		}	
		if(abc==1)
		{
			System.out.println("Number is pronic");
		}
		else
		{
			System.out.println("Number is not  pronic");
		}
	}

	public static void main(String[] args) {
		int n;
		
	       Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 number");
			n=sc.nextInt();
			pro(n);
			System.out.println("Enter 1 number");
			n=sc.nextInt();
			pro(n);
			
		// TODO Auto-generated method stub

	}

}
