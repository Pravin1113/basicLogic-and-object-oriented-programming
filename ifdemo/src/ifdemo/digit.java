package ifdemo;

import java.util.Scanner;

public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		String s1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 numbers");
		s1=sc.next();
		ch=s1.charAt(0);
		if((ch>='0' && ch<='9'))
		{
			System.out.println(ch + " is digit");
		}
		else
		{
			System.out.println(ch + " is not digit");
		}	
		}

}
