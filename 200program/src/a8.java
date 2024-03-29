import java.util.Scanner;


public class a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r ,V,h;    
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		r=sc.nextDouble();
		h=sc.nextDouble();
        V=3.14*r*r*h;
		System.out.println("volume of cylinder="+V);
	}

}
