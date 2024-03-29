package basic;
import java.util.*;
public class meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int km,meter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of meter");
       meter=sc.nextInt();
		km=meter/1000;
		meter=meter%1000;
		System.out.println("Km="+km+"Meter="+meter);
		}


}
