import java.util.*;
public class a30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,sum=0,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       n=sc.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++){
    	   System.out.println("Enter number "+(i+1)+":");
    	   a[i]=sc.nextInt();
    	   sum=a[i]+sum;
       }
       System.out.println("sum="+sum);
	}

}