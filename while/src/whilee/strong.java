 
package whilee;
import java.util.*;
public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n,n1,f1=1,p,i,sum=0;
	        Scanner sc=new Scanner (System.in);
	        System.out.println("enter value");
	        n=sc.nextInt();
	        p=n;
	
	        while(0<n){
	        f1=1;
	        n1=n%10;
	        n=n/10;
	        for(i=n1;i>1;i--){
	        	f1=f1*i;
	        }
	        sum=sum+f1;
	        
	        
	        }
	        
	        if(p==sum){
	        	 System.out.println("no is strong");
	        	 
	        }
	        else{
	        	System.out.println("no is not strong");
	        }
	}

}
 