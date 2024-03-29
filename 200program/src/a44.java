import java.util.*;
public class a44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i=0,n,x, flag=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter arrey size");
         n=sc.nextInt();
         int a[]=new int[n];
         for(i=0;i<n;i++){
        	 a[i]=sc.nextInt();
        	 
         }
         System.out.println("enter the elemet yo want");
         x=sc.nextInt();
         for(i=0;i<n;i++){
        	 if(a[i]==x){
        		 flag=1;
        		 break;
        	 }
         }
	
         if(flag == 1)
        	 System.out.println("Element found at position:"+(i+1));
        	 }
          {
        	 System.out.println("Element not found");
        	 }
         
	}


