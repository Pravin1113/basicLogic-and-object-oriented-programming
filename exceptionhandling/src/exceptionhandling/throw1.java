package exceptionhandling;

import java.util.Scanner;

class OIT extends Exception{
	public String toString(){
		return "no is equal or less than 0";
		
	}
}

public class throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,f=0,l,s=0;
         Scanner sc=new Scanner (System.in);
         System.out.println("enter no");
         n=sc.nextInt();
         try{
        	 if(n<=0)
        	 {
        		 throw new OIT();
        	 }
        	 else{
        		 l=n%10;
        		 while(n>0)
        		 {
        			 f=n;
        			 n=n/10;
        			 
        		 }
        		 s=f+l;
        		 System.out.println("sum="+s);
        	 } 
        	 }
         catch(OIT e){
        	 System.out.println(e);
         }
	}

}
