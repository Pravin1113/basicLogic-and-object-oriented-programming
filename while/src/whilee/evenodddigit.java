package whilee;
import java.util.*;
public class evenodddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1,a=0,b=0,c=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        while(n>0){
        	n1=n%10;
        	n=n/10;
        	if (n1==0){
        		a++;
        	}else if(n1%2==0){
        		b++;
        	}else{
        		c++;}
        }
        	System.out.println("no of zero digit="+a);
        	System.out.println("no of even digit="+b);
        	System.out.println("no of odd digit="+c);
        
	
        
	}

}
