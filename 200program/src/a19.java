import java.util.Scanner;
		
public class a19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,dollar=71.16;
		System.out.println("Enter dollars:");
		Scanner obj= new Scanner(System.in);
		a = obj.nextDouble();
		b = a *dollar;
		System.out.println("Convert Rupees is :" +b);
	}

}
