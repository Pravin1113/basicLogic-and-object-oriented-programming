package ifdemo;
import java.util.*;
public class reng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 3  number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b>a&&b<c)
		{
		System.out.println(b +" is between "+ a +" and "+c);
		}
		else
		{
		System.out.println(b +" is not between"+ a +" and "+c);
		}}

}
