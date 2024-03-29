package series;
import java.util.*;
public class series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,f1,f2,x,n;
		double sum=0.0;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter x and n number");
		   		   n=sc.nextInt();
		   		x=sc.nextInt();
		   
		for(i=1;i<=n;i++){
			f1=1;
			for (k=i;k>1;k--){
				f1=i*k;
			}
			
		sum=sum+(double)(f1/i);
		
		}
	System.out.print("sum="+sum);
	}
	



}
