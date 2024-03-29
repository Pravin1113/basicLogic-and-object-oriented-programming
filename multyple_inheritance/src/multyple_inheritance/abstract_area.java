package multyple_inheritance;
import java.util.*;
abstract class area
{
	abstract void cal_area();
	abstract void cal_vol();
	
}
class circle1 extends area
{
	double r,a,v;
	

   circle1(double r){
	   this.r=r;
   }
   public void cal_area()
   {
	 
	   a=3.14*r*r;
	   System.out.println("Area="+a);
   }
   public void cal_vol()
   {
	   v=(4/3)*3.14*r*r*r;
	   System.out.println("volume="+v);
   }
}

class cone extends area
{
	double r,h,a,v;
	cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void cal_area(){
		a=r*h*h;
		System.out.println("Area="+a);
	}
	 public void cal_vol()
	   {
		 v=r*r;
		   System.out.println("volume="+v);

	   }
}

public class abstract_area {

	public static void main(String[] args) {
		
             double r,h;
             Scanner sc=new Scanner (System.in);
             System.out.println("enter r");
             r=sc.nextDouble();  
             area c1=new circle1(r);
             c1.cal_area();
             c1.cal_vol();
             
             System.out.println("enter r");
             r=sc.nextDouble();
             System.out.println("enter h");
             h=sc.nextDouble();

             
             cone c2=new cone (r,h);
             c2.cal_area();
             c2.cal_vol();
             
	}

}
