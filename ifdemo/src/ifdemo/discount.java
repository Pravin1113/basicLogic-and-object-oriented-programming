package ifdemo;
import java.util.*;
public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amt,disc,total;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter amount");
		amt=sc.nextDouble();
		if(amt<10000)
		{
			System.out.println("No disc");
		}
		else if(amt>=10000 && amt<20000)
		{
			disc=amt*0.05;
			total=amt-disc;
			System.out.println("Disc amt="+disc +" Total= "+total);
		}
		else if(amt>=20000 && amt<50000)
		{
			disc=amt*0.07;
			total=amt-disc;
			System.out.println("Disc amt="+disc +" Total= "+total);
		}
		else 
		{
			disc=amt*0.10;
			total=amt-disc;
			System.out.println("Disc amt="+disc +" Total= "+total);
		}
	}



}
