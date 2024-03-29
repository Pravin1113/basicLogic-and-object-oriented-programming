package function;

import java.util.Scanner;

public class fact_withpara_no_ret {
         static void fact(int a){
        	 int f1=1,i;
        	 for(i=a;i>1;i--){
        		 f1=f1*i;
        	 }
        	 System.out.println("fact="+f1);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		a=sc.nextInt();
	
	
	fact(a);
	
	System.out.println("Enter 1 number");
	a=sc.nextInt();


fact(a);
	
	}

}
