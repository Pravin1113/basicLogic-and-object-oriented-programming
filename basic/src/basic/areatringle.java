package basic;
import java.util.*;
public class areatringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double b,h,A;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of b & h");
		b=sc.nextDouble();
		h=sc.nextDouble();
		A=0.5*b*h;
		System.out.println("Area of triangle="+A);		
	}


}
