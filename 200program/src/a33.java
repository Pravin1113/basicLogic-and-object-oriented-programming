import java.util.*;
public class a33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c,n,s;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       n=sc.nextInt();
       a=n%10;
       c=n/100;
       b=(n/10)%10;
       s=a+c;
       if
	 (s==b)
    	System.out.println("number is equal");
       
       else 
    	  System.out.println ("no not equal");
    	   
	}

}
