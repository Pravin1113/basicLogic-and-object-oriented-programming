package function;
import java.util.*;
public class no_para_with_return {
	public static int add()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a, b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return(c);
	}

	public static void main(String[] args) {
		
		int c=add();
		System.out.println("addition="+c);
		// TODO Auto-generated method stub

	}

}
