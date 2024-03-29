package exceptionhandling;
import java.util.*;
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
         Scanner sc=new Scanner(System.in);
	System.out.println("enter two number");
	a=sc.nextInt();
	b=sc.nextInt();
	try{
	c=a/b;
	System.out.println("division="+c);
	}
	catch(ArithmeticException e){
		System.out.println("divided by 0");
		
	}
	c=a*b;
	System.out.println("multyplication="+c);
	
	}

}
