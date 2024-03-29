package arrey;

import java.util.Scanner;

public class assending_orderr {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int n,j,i,temp=0;		
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
		
		for(i=0;i<n;i++){
			for ( j=i+1;j<n;j++){
				if (a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;				}
			}
		}

	

	
	System.out.println();
	System.out.println("element are sorted in asending order");
	for(i=0;i<n;i++){
		System.out.print(a[i]+"  ");

	}

}
}
