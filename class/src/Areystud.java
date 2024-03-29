import java .util.*;
 class Arey{
	int rno;
	String sname;
	double per;
	void accept()
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
}
      public class Areystud{

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student ");
		n=sc.nextInt();
		Arey s1[]=new Arey[n];
		for(i=0;i<n;i++){
			s1[i]=new Arey();
			s1[i].accept();
			s1[i].display();
			
			
			
		}
		
	}

}
