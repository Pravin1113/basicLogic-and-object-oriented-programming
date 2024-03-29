import java.util.*;
public class a37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char ch;
     Scanner sc=new Scanner (System.in);
     System.out.println("enter ch");
     ch=sc.next().charAt(0);
     
	if (ch>=65&&ch<=90)
		System.out.println("uppercase");
	else if(ch>=97&&ch<=122)
		System.out.println("lowercase");
	else if(ch>=48&&ch<=58)
		System.out.println("digit");
	else
		System.out.println("special charcter");
	
	}

}
