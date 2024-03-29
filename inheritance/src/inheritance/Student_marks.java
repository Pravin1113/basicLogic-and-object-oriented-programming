package inheritance;
import java.util.Scanner;

class stud
{
int id;String name,add;
stud(int id,String name,String add)
{
	   this.id=id;
       this.name=name;
       this.add=add;

}

void info()
  {
      System.out.println("id="+id);
      System.out.println("name="+name);
      System.out.println("add="+add);
}
}


class marks extends stud
{
int m1,m2,m3;
marks(int id,String name,String add,int m1,int m2,int m3)
{
     super(id,name,add);
     this.m1=m1;
     this.m2=m2;
     this.m3=m3;

} 
void show()
{
        super.info();
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);

}
}


class result extends marks
{
double tot,per;
  result( int id,String name,String add,int m1,int m2,int m3)
{
      super(id,name,add,m1,m2,m3);

} 
void cal()
{

     tot=m1+m2+m3;
     per=tot/3;
     System.out.println("tot="+tot);
     System.out.println("per="+per);
}
}

public class Student_marks {
	public static void main(String[] args) 
	{
		
		int id ,m1 ,m2 ,m3 ;String name,add;
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("enter id,name,add");
		id=sc.nextInt();
		name=sc.next();

		add=sc.next();
		System.out.println("Enter marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		
		
	   result r1=new result(id,name,add,m1,m2,m3);	
		r1.show();
		r1.cal();
		
	}
}


	 