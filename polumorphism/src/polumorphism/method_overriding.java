package polumorphism;
import java.util.*;
class area1{
	 double r;
	double a;
	area1(double r){
		this.r=r;
		
	}
	void cal_area(){
		a=3.14*r*r;
		System.out.println("radius="+r+"area="+a);
		this.a=a;
	}
}
 class volume extends area1{
	 double h,v;
	 volume(  double r, double h){
		super(r);
		 this.h=h;
	 }
	 void cal_area(){
		 super.cal_area();;
		 v=a*h;
		 System.out.println("volumw="+v);
		 
	 }
 }
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,h;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter r&h");
		r=sc.nextDouble();
		h=sc.nextDouble();
         volume v1=new volume(r,h);
         v1.cal_area();
	}

}
