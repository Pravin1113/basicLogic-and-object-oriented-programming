package basic;
import java.util.*;
public class swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("  a  ="+a+"  b  ="+b);
}

}
