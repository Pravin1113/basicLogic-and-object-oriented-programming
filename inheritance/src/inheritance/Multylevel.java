package inheritance;


import java.util.*;
class araa{
	double r ,a;
	araa (double r){
		this.r=r;
		
		
	}
	void cal(){
		a=3.14*r*r;
		System.out.println("area="+a);
		
	}
} 
	class veee extends araa{
		double h,v;

		veee( double r,double h) {
			super(r);
			this.h=h;
			
		}
		void cal_vol(){
			super.cal();
			v=a*h;
			System.out.println("area="+v);
		}

}  
	class volume1 extends veee {
		
		double l,v1;
		volume1(double r,double h,double l){
			super (r,h);
			this.l=l;
			
		}
		void vol(){
			vol();
			v1=v*l;
			System.out.println("Volume="+v1);
		}
	}

public class Multylevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,h,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value r,h,l");
		r=sc.nextDouble();
		h=sc.nextDouble();
		l=sc.nextDouble();
		volume1 v1=new volume1(r,h,l);
		v1.cal();
		v1.cal_vol();
		v1.vol();
		

	}

}
