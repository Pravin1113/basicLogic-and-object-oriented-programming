package pattern;

import java.util.Scanner;

public class tringle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j, n,k ;
		int ch=96;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		
		n=sc.nextInt();
		for(i=1;i<=n;i++)//row
		{
		for(k=n;k>i;k--)//spaces
		{
		System.out.print( " ");
		}
		for(j=1;j<=i;j++)//column
		{
		System.out.print(" "+(char)(ch+j));
	
		}
		System.out.println();
		}}

}
