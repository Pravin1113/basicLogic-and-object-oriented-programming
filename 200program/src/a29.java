import java.util.*;
public class a29 {
	 public static void main(System[]args){
		//To find the roots of the given Quadratic Equation
		 
		 double a, b, c;
		 double root1, root2, imaginary, discriminant;
		 System.out.print("Enter the Values of a, b, c of Quadratic Equation : ");
		 Scanner sc=new Scanner(System.in);
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		 c = sc.nextDouble();
		 discriminant = (b * b) - (4 * a *c);
		 if ( discriminant > 0 )
		 {
		 root1 = ( -b + Math.sqrt ( discriminant ) / ( 2 * a ));
		 root2 = ( -b - Math.sqrt ( discriminant ) / ( 2 * a ));
		 System.out.println("\n Two Distinct Real Roots Exists: \nroot1 = " + root1 + " and root2 = " + root2);
		 }
		 else
		 if ( discriminant == 0 )
		 {
		 root1 = root2 = -b / (2 * a);
		 System.out.println("\n Two Equal and Real Roots Exists:\n root1 = " + root1 + " and root2 = " + root2);
		 }
		 else
		 if ( discriminant < 0 )
		 {
		 root1 = root2 = -b / ( 2 * a );
		 imaginary =Math.sqrt ( -discriminant ) / ( 2 * a );
		 System.out.println("\n Two Distinct Complex Roots Exists:\n root1 = " + root1 + " + " + imaginary + " and root2 = " + root2 +" - " +imaginary);
		 }
	 }

}
