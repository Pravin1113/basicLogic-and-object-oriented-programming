package forloop;
import java.util.Scanner;
public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter n");
			n=sc.nextInt();
	        for(i=1;i<=n;i++)
	        {
	        System.out.print("  "+i);
	        }
	    }
	}