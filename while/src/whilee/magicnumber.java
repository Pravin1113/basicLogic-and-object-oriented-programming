package whilee;
import java.util.*;
public class magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        while(n>9){
        	sum=0;
        
        while(n>0){
        	n1=n%10;
        	n=n/10;
        	sum=sum+n1;
        }
        n=sum;
        }
        if (n==1){
        	System.out.println("no is magic");
        	
        }
        else{
        	System.out.println("no is not magic");
        }
	
	
	
	}

}
