import java.util.Scanner;


public class a18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km,m,s;    
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometer ");
		km=sc.nextInt();
		m=km*1000;
		s=km*100000;
		System.out.println("meter= "+m);
		System.out.println("centimeter "+s);
		
	}

}
