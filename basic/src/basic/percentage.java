package basic;
import java.util.*;
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1,m2,m3,m4,m5,total;
		double per;
		Scanner sc=new Scanner (System.in);
  		 System.out.println("Enter 5 sub marks");
   		m1=sc.nextInt();
   		m2=sc.nextInt();
  		 m3=sc.nextInt();
   		m4=sc.nextInt();
    		m5=sc.nextInt();
 	                 total=m1+m2+m3+m4+m5;
   		per=(total/5);
    		System.out.println("Total="+total);
  		System.out.println("Per="+per);  }

}
