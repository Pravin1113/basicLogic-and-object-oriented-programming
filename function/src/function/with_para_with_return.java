package function;
import java.util.*;
public class with_para_with_return {
	
	static int pra(int a , int b){
		 int c;
		 c=a+b;
		 return(c);
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		a=sc.nextInt();
		b=sc.nextInt();
		int c=pra(a,b);
System.out.println("add="+c);

		
	}

}
