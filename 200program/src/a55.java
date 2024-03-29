import java.util.*;
public class a55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,n,n1=0,p=0,z=0;
    int a[]=new int[50];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    System.out.println("enter this number");
    for(i=0;i<n;i++){
    	a[i]=sc.nextInt();
    	
    }
    for(i=0;i<n;i++){
    	if(a[i]==0){
    		z++;}
    	else if(a[i]>0){
    		p++;
    		
    	}
    	else{
    		n1++;
    	}
    }
    System.out.println("The count of Positive Numbers are: " + p );
    System.out.println("\nThe count of Negative Numbers are: " + n1 );
    System.out.println("\nThe count of Zeros are: " + z );
	}

}
