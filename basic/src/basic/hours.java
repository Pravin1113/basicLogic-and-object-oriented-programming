package basic;
import java.util.*;
public class hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sec,h,m,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Seconds");
		sec=sc.nextInt();
		h=sec/3600;
		sec=sec%3600;
		m=sec/60;
		s=sec%60;
		System.out.println(h+" : "+m+" : "+s);
}

}
