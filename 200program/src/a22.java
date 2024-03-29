import java.util.*;
public class a22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,s,area;
		System.out.println("Enter the 1st side of the triangle\n");
		Scanner obj1=new Scanner(System.in);
		a=obj1.nextDouble();
		System.out.println("Enter the 2nd side of the triangle\n");
		b=obj1.nextDouble();
		System.out.println("Enter the 3rd side of the triangle\n");
		c=obj1.nextDouble();
		/* compute s */
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of a triangle is :"+area );
	}

}
