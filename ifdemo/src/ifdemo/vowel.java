package ifdemo;
import java.util.*;
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			char ch;
			String s1;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter character");
			s1=sc.next();//string accept
			ch=s1.charAt(0);
			if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I')
			{
				System.out.println(ch + " is vowel");
			}
			else
			{
				System.out.println(ch + " is not vowel");
			}		
		}
	

}
