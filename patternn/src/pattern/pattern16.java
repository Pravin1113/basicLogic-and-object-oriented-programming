package pattern;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j, n ;
		int ch=96;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		
		n=sc.nextInt();
	
		for(i=n;i>=1;i--)//row
		{
		for(j=1;j<=i ; j++ )//column
		{
		System.out.print(" "+(char)(ch+j));
		}
	    System.out.println();
		}
		for(i=2;i<=n;i++)//row
		{
		for(j=1;j<=i ; j++)//column
		{
		System.out.print(" "+(char)(ch+j));
		}
		System.out.println();}
}

}
