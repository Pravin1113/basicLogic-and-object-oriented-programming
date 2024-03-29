package forloop;
import java.util.*;
public class perfect_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=1;i<=(n/2);i++)
		{
		if(n%i==0)
		{
			sum=sum+i;
		}
		}	
		if(sum==n)
		{
			System.out.println("No is perfect");
		}
		else
		{
			System.out.println("No is not  perfect");
		}}

}
