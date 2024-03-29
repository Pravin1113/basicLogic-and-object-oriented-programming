package arrey;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i;		
		int a[]= {23,45,54,23};
		int fr[]=new int[a.length];
     int visited=-1;
     for ( i=0;i<a.length;i++){
    	 
    	 int count=1;
    	 for(j=i+1;j<a.length;j++){
    		 if (a[i]==a[j]){
    			count++;
    			fr[j]=visited;
    			
    		 }
    	 }
    	 if(fr[i]!=visited)
    		 fr[i]=count;
    	 
     }
     System.out.println("element are");
     for(i=0;i<a.length;i++){
    	 if(fr[i]!=visited)
    		 System.out.println(""+a[i]+"|"+fr[i]);
     }
     }

	

}
