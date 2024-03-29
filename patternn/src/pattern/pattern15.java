package pattern;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, n ;
		int ch=64;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		
		n=sc.nextInt();
	
		for(i=1;i<=n;i++)//row
		{
		for(j=1;j<=i ; j++ )//column
		{
		System.out.print(" "+(char)(ch+j));
		}
	    System.out.println();
		}
		for(i=n-1;i>=1;i--)//row
		{
		for(j=1;j<=i ; j++)//column
		{
		System.out.print(" "+(char)(ch+j));
		}
		System.out.println();}

}
}