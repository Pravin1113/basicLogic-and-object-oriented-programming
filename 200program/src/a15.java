import java.util.*;
public class a15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b;
       
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swaping a= "+a+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" after swaping a= "+a+"b="+b);
	}

}
