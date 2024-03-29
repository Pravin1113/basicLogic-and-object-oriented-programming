package ifdemo;
import java.util.*;
public class capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		String s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter character");
		s1=sc.next();
		ch=s1.charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch + " is alphabate");
		}
		else
		{
			System.out.println(ch + " is not alphabate");
		}		
	}


}
