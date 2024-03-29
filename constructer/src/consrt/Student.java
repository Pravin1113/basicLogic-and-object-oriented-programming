package consrt;


import java.util.*;

 class Markss {
	 
	 int rno;
	  String sname;
	  double per;
	Markss()
	
	{
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter rno,sname,per");
		rno=sc.nextInt();
		sname=sc.next();
		per=sc.nextDouble();

		
	}
	void display(){
		System.out.println("roll no=" +rno);
		System.out.println("student name=" +sname);
		System.out.println("per=" +per);
		
	}
}
  public class Student {
	public static void main(String[] args) {
		Markss m1=new Markss();
		m1.display();
		
	}
  }
  