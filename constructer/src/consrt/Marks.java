package consrt;
import java.util.Scanner;
public  class Marks
{
	int rollno;
	String name;
	double per;
	Marks()
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextDouble();
	}
		void display()
		{     
		System.out.println("Roll No="+rollno);
		System.out.println("Name="+name);
		System.out.println("Percentage="+per);
	}
	
	
	public static void main(String[] args) 
	{
		Marks s=new Marks();
		
		s.display();
	}

}
