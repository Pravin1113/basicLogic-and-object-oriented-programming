package whilee;
import java.util.*;
public class desarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1,f1=1,p,i,sum=0,num,digits=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        
        p=n;
        num=n;
        while(num>0){
        	digits++;
        	num=num/10;}
        while(n>0)
        {
        	n1=n%10;
        	n=n/10;
        	f1=1;
        	for(i=1;i<=digits;i++){
        		f1=f1*n1;
        	}
        	digits--;
        	sum=sum+f1;
        	}
        if(p==sum){
       	 System.out.println("no is disarium");
       	 
       }
       else{
       	System.out.println("no is not disarium");
       }    
	}
        

}
