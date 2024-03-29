package ifdemo;
import java.util.*;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1,m2,m3,total;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();		
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Total="+total+"\nPer="+per);
		if(per>=70 && per<=100)
		{
		System.out.println("Distinction");
		}
		else if(per>=60 && per<70)  
		{
			System.out.println(" First class");
		}
		else if(per>=55 && per<60)  
		{
			System.out.println(" Higher");
		}
		else if(per>=50 && per<55)  
		{
			System.out.println(" Second");
		}
		else if(per>=40 && per<50)  
		{
			System.out.println(" Pass");
		}
		else
		{
		System.out.println("Fail");	
		}

		
		}

}
