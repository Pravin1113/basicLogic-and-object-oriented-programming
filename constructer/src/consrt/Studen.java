package consrt;

import java.util.*;

public class Studen {
	int rno;
	String sname;
	double per;
	 Studen()
	{
		
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		rno=sc.nextInt();
		sname=sc.next();
		per=sc.nextDouble();
		
	}
	void display(){
		System.out.println("roll no="+rno);
		System.out.println("student name="+sname);
		System.out.println("per="+per);
		
	}
	

	public static void main(String[] args) {
		
        Studen s1=new Studen();
                s1.display();
        



	
}	

}
