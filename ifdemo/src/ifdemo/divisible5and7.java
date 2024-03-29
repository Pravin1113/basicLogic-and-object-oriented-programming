package ifdemo;
import java.util.*;
public class divisible5and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 numbers");//System.out.println() cout<<
		n=sc.nextInt();//scanf()
		if(n%5==0 || n%7==0) 
		{
			System.out.println(n+" is divisible by 5 or 7");

		}
		else
		{
			System.out.println(n+" is not divisible by 5 and 7");
		}
		
		
	}	



}
