
import java.util.*;
class Student{
	int id;String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display(){
		
		System.out.println("id="+id);
		System.out.println("name="+name);
		
	}
}
    class compony extends Student{
    	String cname;double salery;
    	compony(int id,String name,String cname,double salery){
    		super (id,name);
    		this.cname=cname;
    		this.salery=salery;
    		    		
    	}
    	void show(){
    		System.out.println("cname="+cname);
    		System.out.println("salery="+salery);
    	}
    	
    }
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;String name,cname;double salery;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value");
		id=sc.nextInt();
		name=sc.next();
		cname=sc.next();
		salery=sc.nextDouble();
		compony c1=new compony(id,name,cname,salery);
		c1.display();
		c1.show();
		

	}

}
