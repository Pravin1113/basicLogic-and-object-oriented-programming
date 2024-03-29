package ifdemo;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 numbers");
		n=sc.nextInt();
		if(n%4==0) 
		{
			System.out.println(" leap");

		}
		else
		{
			System.out.println("not leap");
		}
		
		
	}	

}
