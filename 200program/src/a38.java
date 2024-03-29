import java.util.Scanner;


public class a38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;int s;
	     Scanner sc=new Scanner (System.in);
	     System.out.println("enter ch");
	     ch=sc.next().charAt(0);
		if (ch>='a'&&ch<='z')
			ch=1;
		else if(ch>='A'&&ch<='Z')
			ch=2;
		else if(ch>='0'&&ch<='9')
	
		ch=3;
		
			
		switch(ch){
		case 1:
		System.out.println("lowercase");
		break;
		case 2:
			System.out.println("uppercase");
			break;
		case 3:
			System.out.println("digit");
			break;
			default:
				System.out.println("special charcter");
		  break;	
		}
	}

}
