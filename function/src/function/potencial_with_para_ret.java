package function;

import java.util.Scanner;

public class potencial_with_para_ret {
	static double PE(double m,double g,double h){
		double pe;
		pe=m*g*h;
		return(pe);
	}
	

	public static void main(String[] args) {
		Double m,g,h,pe;
	       Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 number");
			m=sc.nextDouble();
			g=sc.nextDouble();
			h=sc.nextDouble();
		pe=PE(m,g,h);
		System.out.println("pe="+pe);
		
		// TODO Auto-generated method stub

	}

}
