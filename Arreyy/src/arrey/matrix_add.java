package arrey;
import java.util.*;
public class matrix_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows & cols");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m+1][n+1];//matrix
		{
		System.out.println("Enter  "+(m*n)+" Elements");//Matrix Accept
		for(i=0;i<m;i++)//row
		{
		for(j=0;j<n;j++)//col
		{
		a[i][j]=sc.nextInt();
		
		}
		}
		System.out.println("element are ");

		for(i=0;i<m;i++)//row
		{
		for(j=0;j<n;j++)
		{
			System.out.print("\t"+a[i][j]);
		}
		System.out.println();
		}
		System.out.println("sum of matrix are ");
		 
		for (i=0;i<m;i++)
		{
			sum=0;
			for (j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
				sum=sum+a[i][j];
			}
				System.out.print(sum+"\t");
				System.out.println();
			}
		
		
		System.out.println(" ");
		int summ=0;
		for (i=0;i<n;i++){
			int sum1=0;
			for (j=0;j<m;j++)
			{
				sum1=sum1+a[j][i];
				
			
			System.out.print(sum1+"\t");
			summ=sum1+a[i][j];
	       
		}
		System.out.print(sum1+"\t");
		summ=summ+sum1;
	}
	System.out.print(+summ+"\t");
}

}		
		
		
}		
		
		