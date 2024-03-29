package forloop;
import java.util.*;
public class sum_upto_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
	for(i=2;i<=n;i=i+2)
	{
		
			sum=sum+i;
			
		
		
	
	
	}
	System.out.println(sum);

	}
}
