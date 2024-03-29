package ifdemo;
import java.util.*;
public class renge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 3  number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a<c)
		{
		System.out.println(a +" is between "+ b +" and "+c);
		}
		else
		{
		System.out.println(a +" is not between"+ b +" and "+c);
		}}

}
