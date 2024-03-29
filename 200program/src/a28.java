import java.util.Scanner;


public class a28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        if(n%4==0){
       	 System.out.println("given is leap year");
       	 
        }
        else{
       	 System.out.println("not leap year");
        }
	}

}
