package arrey;
import java.util.*;
public class sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,sum=0;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];//array creation		
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
			sum=sum+a[i];
		}		
		System.out.println("\n\nArray elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}		
	   double avg=sum/n;
	 System.out.println("\nSum="+sum+"\nAverage="+avg);
	 }

}
