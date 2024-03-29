package arrey;
import java.util.*;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0,n1,j;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];//array creation		
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		
		}		
		System.out.println("\n\nArray elements are");
	   
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n even number are");
		for(i=0;i<n;i++)
		{
		if(a[i]%2==0)
		System.out.println(""+a[i]);
		}}

}
