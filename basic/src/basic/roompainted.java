package basic;
import java.util.*;
public class roompainted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double l,b,h,l1,h1,l2,h2,area;
		Scanner sc=new Scanner(System.in);
System.out.println("first enter length,breadth,height of room and then enterlength and height of door and then length and height of windows");
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		l1=sc.nextDouble();
		h1=sc.nextDouble();
		l2=sc.nextDouble();
		h2=sc.nextDouble();
		
		area=(2*(l*b + l*h + b*h))-((l1*h1)-(l*b)-(2*(l2*h2)));
		System.out.println("area to be painted="+area);
	}

}
