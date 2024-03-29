import java.util.*;
class Emplo
{
	int eid;
	String name;
	double salary;
	static int cnt;
	Emplo(){
		cnt++;
		eid=101;
		name="sam";
		salary=6578.90;
	}
	Emplo(int eid,String name,double salary){
		cnt++;
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		
	}
	void display(){
		System.out.println(eid+"\t"+name+"\t"+salary);
	}
	static void count(){
		System.out.println("no of object="+cnt);
	}
}
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int eid,i;
       String name;
       double salary;
       Scanner sc=new Scanner (System.in);
       Emplo e1=new Emplo();
       Emplo.count();
       System.out.println("enter id name salary");
       eid=sc.nextInt();
       name=sc.next();
       salary=sc.nextDouble();
       Emplo e2=new Emplo(eid,name,salary);
       e2.display();
       Emplo.count();
       System.out.println("enter id name salary");
       eid=sc.nextInt();
       name=sc.next();
       salary=sc.nextDouble();
       Emplo e3=new Emplo(eid,name,salary);
       e3.display();
       Emplo.count();
       
       
	}

}
