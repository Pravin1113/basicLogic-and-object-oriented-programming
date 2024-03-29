import java.util.*;
public class compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.compareTo(s2)==0)
			System.out.println("both are equal");
		else if(s1.compareTo(s2)>0)
			System.out.println(s1+"greater than "+s2);
		else 
			System.out.println("s2>s1");
			

	}

}
