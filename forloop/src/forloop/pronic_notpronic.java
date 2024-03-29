package forloop;
import java.util.*;
public class pronic_notpronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,abc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=1;i<=(n/2);i++)
		{
		if(n==(i*(i+1)))
		{
			abc=1;
			break;
		}
		}	
		if(abc==1)
		{
			System.out.println("Number is pronic");
		}
		else
		{
			System.out.println("Number is not  pronic");
		}
	}
	

}
