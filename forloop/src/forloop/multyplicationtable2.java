package forloop;

import java.util.Scanner;

public class multyplicationtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,x,sum=0;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the number");
	      n=sc.nextInt();
	      x=sc.nextInt();
	      for(i=1;i<=n;i++){
	    	  sum=sum+n;
	      
	    	  System.out.println(sum);
	    	  
	      }

}
}