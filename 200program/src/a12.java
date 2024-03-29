import java.util.Scanner;


public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h ,m,s,sec;    
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		sec=sc.nextInt();
		h=sec/3600;
		sec=sec%3600;
		m=sec/60;
		sec=sec%60;
		s=sec/1;
		System.out.println(h+":"+m+":"+s);
		
		
	}

}
