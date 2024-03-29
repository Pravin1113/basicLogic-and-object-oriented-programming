package arrey;
import java.util.*;
public class maximum_4_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,max,min;		
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
	max=min=a[0];
	for(i=1;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
			
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	  System.out.println(" max="+max);
	  System.out.println("Min="+min);	}

}
