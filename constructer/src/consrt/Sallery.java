package consrt;
import java.util.*;
class salery{
	int id;
	String name;
	Double saleery;
	 salery(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		id=sc.nextInt();
		name=sc.next();
		saleery=sc.nextDouble();
	}
	 void display(){
		System.out.println("id="+id);
		System.out.println("employee name="+name);
		System.out.println("salery="+saleery);

	}
}
public class Sallery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salery s1=new salery();
		s1.display();

	}

}
