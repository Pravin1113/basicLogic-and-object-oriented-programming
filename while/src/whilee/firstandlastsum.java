package whilee;
import java.util.*;
public class firstandlastsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum=0,i,last,first=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        last=n%10;
        while(n>0){
        	first=n;
        n=n/10;
	}
	sum=first+last;
	System.out.println("sum="+sum);
	
	
	
	
	
	
	}

}
