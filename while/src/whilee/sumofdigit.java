package whilee;
import java.util.*;
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
	   while(n>0)
	   {
		   n1=n%10;
		   n=n/10;
		   sum=sum+n1;
	   }
	   System.out.println("sum of digit="+sum);
	   }
	
	

}
