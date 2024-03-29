package forloop;
import java.util.*;
public class multyplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			f1=n*i;
			System.out.println(n+" * "+i+ " = "+f1);  //or System.out.println(f1);
		}
			
	}
	
}


