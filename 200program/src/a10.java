import java.util.Scanner;
public class a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		double p, rate, t, sim,com;
		System.out.println("Enter amount:");
		Scanner obj=new Scanner(System. in);
		p=obj.nextDouble();
		System. out. println("Enter the No.of years:");
		t=obj.nextDouble();
		System.out. println("Enter the Rate of interest");
		rate=obj.nextDouble();
		sim=(p * t * rate)/100;
		// Formula for simple interest
		com=p * Math.pow(1.0+rate/100.0,t) - p;
		// Formula for compound interest
		System.out.println("Simple Interest="+sim );
		System.out. println("Compound Interest="+com);
		}

	
}
