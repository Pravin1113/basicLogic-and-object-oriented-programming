import java.util.*;
public class a11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int m,h,v;
		float k;
		double e,p,g=9.8;
		System.out.println("Enter Mass of the body \n");
		Scanner sc=new Scanner(System.in);;
		m=sc.nextInt();
		System.out.println("Enter deplacement of body \n");
		h=sc.nextInt();
		System.out.println("Enter velocity of the body ");
		v=sc.nextInt();
		p=m*g*h;
		// Potential Energy formula
		System.out.println("Potential energy of the body :"+p);
		k=m*v*v/2;
		//Kinetic Energy formula
		System.out.println("kinetic energy of the body :"+k);
		e=p+k;
		System.out.println("Mechanical energy of the body :"+e);
	}

}
