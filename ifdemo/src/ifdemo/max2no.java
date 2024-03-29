package ifdemo;
import java.util.*;
public class max2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2  number");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
		 System.out.println(a+" is max");

		}
		else if(b>a)
		{

			 System.out.println(b+" is max");

		}
		else 

		{
			System.out.println("euquals");

		}
		
}

}
