package function;
import java.util.*;
public class with_para_no_return {
	
	public static void add(int a,int b){
		int c;
		c=a+b;
		System.out.println("addition="+c);
		
	}
	

	public static void main(String[] args) {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value");
      a=sc.nextInt();
      b=sc.nextInt();
      add(a,b);
      

	}

}
