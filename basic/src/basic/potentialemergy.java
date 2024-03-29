package basic;

import java.util.Scanner;

public class potentialemergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double m,g,h,pe;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of");
		m=sc.nextDouble();
		g=sc.nextDouble();
		h=sc.nextDouble();
		pe=0.5*m*g*h;
		System.out.println("potensial Energy="+pe);

}


}
