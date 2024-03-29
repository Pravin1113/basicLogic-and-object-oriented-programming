package basic;
import java.util.*;
public class kineticenergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double m,v,ke;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of m & v");
		m=sc.nextDouble();//ip
		v=sc.nextDouble();
		ke=0.5*m*v*v;
		System.out.println("Kinetic Energy="+ke);}

}
