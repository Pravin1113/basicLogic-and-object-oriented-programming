import java.util.Scanner;


public class a17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bs,DA,HRA,gs;    
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic sallery");
		bs=sc.nextDouble();
		DA=bs*0.40;
		HRA=bs*0.20;
		gs=DA+HRA+bs;
		System.out.println("gross salary="+gs);
	}

}
