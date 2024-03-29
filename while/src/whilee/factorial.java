package whilee;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long n,f1=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        i=n;
        while(i>1)
        {
        	f1=f1*i;
        	i--;
        }
        System.out.println("fact="+f1);
        }
	
	

}
