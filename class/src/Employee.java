import java.util.*;
public class Employee{
	int eid;
	String name ;
    double salary;
    Employee()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter id  salary");
    	eid=sc.nextInt();
    	name=sc.next();
    	salary=sc.nextDouble();
    }
    void display(){
    	System.out.println("emp id="+eid);
    	System.out.println("name="+name);
    	System.out.println("salry="+salary);
    }
    	
    
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		
	}

}
