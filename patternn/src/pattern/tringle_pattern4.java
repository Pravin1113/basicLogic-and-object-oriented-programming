package pattern;

import java.util.Scanner;

public class tringle_pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k;
		 Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 numbers");
		n=sc.nextInt();  
		for(i=1;i<=n;i++)//row
		{

		for(k=n;k>i;k--)//spaces
		{
		System.out.print(" ");
		}

		for(j=1;j<=i;j++)//column
		{
		System.out.print("*");//remove space
		}
		System.out.println();
		}}

}
