package ifdemo;

import java.util.Scanner;

public class specialornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		String s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter character");
		s1=sc.next();
		ch=s1.charAt(0);
		if(!(ch>='a' && ch<='z')||!(ch>='A' && ch<='Z')||!(ch>='0' && ch<='9'))
		{
			System.out.println(ch + " is special");
		}
		else
		{
			System.out.println(ch + " is not special");
		}	
		
}
}
