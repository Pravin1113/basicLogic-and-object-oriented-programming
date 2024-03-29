package arrey;

import java.util.Scanner;

public class findnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i,sum=0;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter number");
		int n1=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		   
		}		
		System.out.println("\n\nArray elements are");
		for(  i=0;i<n;i++)
		{
			
			System.out.print(a[i]+"\t");
	}
		for(  i=0;i<n;i++) {
		if(n1==a[i])
		{
		System.out.println("number found "+a[i] );
		}
		
	}

}
}
