package ifdemo;
import java.util.*;
public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit;
		double UC,ElectricityCharge = 0.0,EC,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		unit=sc.nextInt();
		if(unit<=100)
		       {
		    	   ElectricityCharge =unit*3.44;
		    	  System.out.println("Electricity charge :"+ElectricityCharge);
		       }
		       else if(unit>=101 &&unit<=300 )
		       {
		    	   ElectricityCharge=unit*7.34;
		    	  System.out.println("Electricity charge :"+ElectricityCharge);
		       }
		       else if(unit>=301 && unit<=500)
		       {
		    	   ElectricityCharge=unit*10.36;
		    	 System.out.println("Electricity charge :"+ElectricityCharge);
		       }
		       else if(unit>=501 && unit<=1000)
		       {
		    	   ElectricityCharge=unit*11.82;
		    	   
		    	 System.out.println("Electricity charge :"+ElectricityCharge);
		       }
		       else
		       {
		    	   ElectricityCharge=unit*11.92;
		    	  System.out.println("Electricity charge :"+ElectricityCharge);
		       }
		           UC=unit*1.38;
		           EC=((102+ElectricityCharge+UC)*0.16);
		           total=102+ElectricityCharge+UC+EC;
		          System.out.println("Unit Charge="+UC);
		          System.out.println("tax="+EC);
		          System.out.println("Total bill="+total);
		     
		}
		

}
