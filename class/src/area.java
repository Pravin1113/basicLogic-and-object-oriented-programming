import java.util.*;
public class area {
	static double r;
	double A;
	void accept(double r){
		this.r=r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value r");
		r=sc.nextInt();
	}
	double cal_area(){
		A=3.14*r*r;
		return(A);
		
	}
	

	public static void main(String[] args) {
		double r1,A;
		Scanner sc=new Scanner(System.in);
		area a1=new area();
		
//		a1.accept(r);
        A=a1.cal_area();
      
        System.out.println("area="+A);
        
        
	}

}
