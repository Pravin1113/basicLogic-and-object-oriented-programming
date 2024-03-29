package forloop;
import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,f1=0,f2=1,f3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		if(n<=0)
		{
		System.out.println("invalid no");
		}
		else if(n==1)
		{
		System.out.println(""+f1);
		}
		else
		{
		System.out.print(f1+" "+f2);
		for(i=3;i<=n;i++)
		{
	     f3=f1+f2;
	     System.out.print(" "+f3);
		f1=f2;
		f2=f3;
			}
		

}
	}
}
