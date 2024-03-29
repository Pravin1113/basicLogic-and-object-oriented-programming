package ifdemo;
import  java.util.*;
public class divisible7and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 numbers");
		n=sc.nextInt();
		if(n%5==0 && n%7==0) 
		{
			System.out.println(n+" is divisible by 5 and 7");

		}
		else
		{
			System.out.println(n+" is not divisible by 5 and 7");
		}
		
		
	}	



}
