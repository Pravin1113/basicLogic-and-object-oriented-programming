package polumorphism;
import java.util.*;
class poly1{
	double l,b,a,r,h;
	 void cal_area(){
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter l and b");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("area of rectangle="+a);
	 }
	void cal_area(double r){
		this.r=r;
		a=3.14*r*r;
		System.out.println("area of circle="+a);
		
	}
	 double cal_area(double b,double h){
		 this.b=b;
		 this.h=h;
		 a=0.5*b*h;
		 return(a);
		 
	 }
	 
	 
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double r,h,b;
         Scanner sc=new Scanner(System.in);
         poly1 v1=new poly1();
         System.out.println("enter the r");
         r=sc.nextDouble();
         v1.cal_area(r);
         System.out.println("enter b and h");
         b=sc.nextDouble();
         h=sc.nextDouble();
        double a=v1.cal_area(b,h);
        System.out.println(a);
        
        v1.cal_area();
	}

}
