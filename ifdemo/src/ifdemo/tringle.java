package ifdemo;
import java.util.*;
public class tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c;
		Scanner sc=new Scanner (System.in);
 System.out.println("enter sides");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b))
		{
			System.out.println(" Right angled triangle");
		}
		else if((a==b) && (b==c))
		{
			System.out.println("Equilateral triangle");
		}
		else if((a==b) || (b==c) || (c==a))
		{
			System.out.println("Isosceles triangle");
		}
		else if((a!=b&& b!=c && c!=a))
		{
			System.out.println("Scalene");
		}
		else
			System.out.println("No triangle");

	
	}

}
