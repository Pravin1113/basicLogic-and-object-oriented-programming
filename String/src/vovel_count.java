import java.util.Scanner;


public class vovel_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("total no of vowel="+count);

	}

}
