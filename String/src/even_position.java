import java.util.Scanner;


public class even_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				String str;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter string");
				str=sc.next();
				for(int i=0;i<str.length();i++){
					if (i%2==0){
					System.out.println("char at"+i+"place"+str.charAt(i));
				}
				
				
				

			}

		}

	

}
