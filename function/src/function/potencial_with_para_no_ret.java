package function;

import java.util.Scanner;

public class potencial_with_para_no_ret {
       static void pe(double m,double g,double h){
    	   double pe;
    	   pe=m*g*h;
    	   System.out.println("pe="+pe);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Double m,g,h;
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		m=sc.nextDouble();
		g=sc.nextDouble();
		h=sc.nextDouble();
	
	
	pe(m, g, h);
       
	}

}
