package basic;
import java.util.*;
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bs,gs,hra,ta,da,tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value bs");
		bs=sc.nextDouble();
		 hra=bs*0.50;
		 ta=bs*0.40;
         da=bs*0.60;
		tax=bs*0.05;
		gs=(bs+hra+ta+da)-tax;
		System.out.println("Home Rental Allowance="+hra);
		System.out.println("TA="+ta);
		System.out.println("Da="+da);
		System.out.println("TAX"+tax);
		System.out.println("GS="+gs);
}

}
