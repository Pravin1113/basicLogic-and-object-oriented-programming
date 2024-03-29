package basic;
import java.util.*;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double F,C,K;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in Farheinet");
		F=sc.nextDouble();
		C=(9/5)*(F-32);
		K=C+272.13;
		System.out.println("Temp in C = "+C);
		System.out.println("Temp in Kelvin = "+K); 
}

}
