package ifdemo;
import java.util.*;
public class monthlyincome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			double amt,comm;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter amount");
			amt=sc.nextDouble();
			
			if(amt<5000)
			{
				
				System.out.println("no commision");
			}
			else if(amt<10000 && amt>=5000)
			{
				comm=200+amt*(0.03);
				System.out.println("commision =" +comm);
			}
			else if(amt>=10000 && amt<20000)
			{

				comm=250+amt*(0.05);
				System.out.println("commision =" +comm);
			}
			else if(amt>=20000 && amt<30000)
			{

				comm=300+amt*(0.09);
				System.out.println("commision =" +comm);
			}
			else if(amt>=30000 && amt<40000)
			{

				comm=325+amt*(0.12);
				System.out.println("commision =" +comm);
			}
			else if(amt>=40000 && amt<50000)
			{

				comm=370+amt*(0.14);
				System.out.println("commision =" +comm);
			}
			else
			{

				comm=375+amt*(0.16);
				System.out.println("commision =" +comm);
			}

		}

	

}
