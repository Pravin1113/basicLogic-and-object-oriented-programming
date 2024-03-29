package series;
import java.util.*;
public class series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n,x,sum=0,k=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter x and n number");
	   x=sc.nextInt();
	   n=sc.nextInt();
	   
	for(i=1;i<=n;i++){
		
		System.out.println(k+"*"+x+"+");
		sum=sum+(k*x);
		k=k+2;
	}
	
	System.out.println("="+sum);
	}

}
