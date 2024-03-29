package forloop;
import java.util.*;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,x,n,f1=1;
       Scanner sc=new Scanner (System.in);
       System.out.println("enter x and n");
       x=sc.nextInt();
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
       f1=f1*x;
       }
       System.out.println("Power="+f1);
	}

}
