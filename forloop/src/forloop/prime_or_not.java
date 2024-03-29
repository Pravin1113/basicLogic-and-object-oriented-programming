package forloop;
import java.util.*;
public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=2;i<=(n/2);i++)
		{
		if(n%i==0)
		{
			div=1;
			break;
		}
		}	
		if(div==0)
		{
			System.out.println("No is prime");
		}
		else
		{
			System.out.println("No is not  prime");
		}}

}
