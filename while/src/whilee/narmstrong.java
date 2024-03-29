package whilee;
import java.util.*;
public class narmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,r,j, n,n1,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value");
        r=sc.nextInt();
	 for(j=1;j<=r;j++){
		sum=0;
		n=j;
		while(n>0){
			n1=n%10;
			n=n/10;
			sum=sum+(n1*n1*n1);
		}
	 if(j==sum){
		 System.out.println(" number is armstrong");
		 }
	 
	
	 }
	
	
	
	}

}
