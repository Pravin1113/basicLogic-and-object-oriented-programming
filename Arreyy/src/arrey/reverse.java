package arrey;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j,i;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		
		}		
		System.out.println("\n\nArray elements are");
		for(  i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n\n reverse Array elements are");
		for(i=n-1;i>=0;i--){
			System.out.print(""+a[i]);
		}

	}

}
