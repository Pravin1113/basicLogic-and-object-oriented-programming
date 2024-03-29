package function;

import java.util.Scanner;

public class perfect_nopara_with_ret {
	 static String per(){
		 int i,n,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 number");
			n=sc.nextInt();
			for(i=1;i<=(n/2);i++)
				if(n%i==0){
					sum=sum+i;
			
				}
	 if(sum==n)
		 return "no is perfect";
		 else
			 return "no is not perfect";
	 		 
	 
	 }

	public static void main(String[] args) {
		String f1=per();
		System.out.println(""+f1);
		// TODO Auto-generated method stub

	}

}
