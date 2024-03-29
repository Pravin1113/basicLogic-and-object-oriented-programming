package inheritance;
import java.util.*;
class area{
	double r ,a;
	area (double r){
		this.r=r;
		
		
	}
	void cal(){
		a=3.14*r*r;
		System.out.println("area="+a);
		
	}
} 
	class volume extends area {
		double h,v;

		volume( double r,double h) {
			super(r);
			this.h=h;
			
		}
		void cal_vol(){
			v=a*h;
			System.out.println("area="+v);
		}
}

public class single_level {

	public static void main(String[] args) {
		
		
		double r ,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r and h");
		r=sc.nextDouble();
		h=sc.nextDouble();
		volume v1=new volume(r,h);
		v1.cal();
		v1.cal_vol();
		
		

	}

}
