package forloop;
import java.util.*;
public class display_nth_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch=96;int n;
		String s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter character & range");
		s1=sc.next();
		ch=s1.charAt(0);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		System.out.print("\t"+(ch++));

		}}

}
