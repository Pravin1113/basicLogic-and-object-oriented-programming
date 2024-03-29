package forloop;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long i,n,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
		         f1=f1*i;			
		}
			System.out.println("Fact="+f1);
	}
	

}
