package series;
import java.util.*;
public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,f1,f2,x,n;
		double sum=0.0;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter x and n number");
		   x=sc.nextInt();
		   n=sc.nextInt();
		   
		for(i=1;i<=n;i++){
			f1=1;
			f2=1;
			for (k=i;k>1;k--){
				f1=f1*k;
			}
			for(j=1;j<=i;j++){
				f2=f2*x;
			
			}
		sum=sum+(double)(f1/f2);
		
		}
	System.out.print("sum="+sum);
	}
	
}
