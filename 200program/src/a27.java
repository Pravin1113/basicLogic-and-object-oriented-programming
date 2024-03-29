import java.util.Scanner;


public class a27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b&&a>=c){
       	 System.out.println(a+" is greter");
       	 
        }
        else if(b>=a&&b>=c){
       	 System.out.println(b+" is greater");
        }
        else{
        	System.out.println(c+"is grater");
        }
	}

}
