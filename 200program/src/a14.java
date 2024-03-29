import java.util.Scanner;


public class a14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		float f,a,c;
		System.out.println("Enter the temperature in farenheit:\n");
		Scanner obj1=new Scanner(System.in);
		f=obj1.nextFloat();
		a=f-32;
		c=a*5/9;
		System.out.println("Temperature converting to celcius is:"+c);
		
	}

}
