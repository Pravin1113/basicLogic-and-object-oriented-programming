import java.util.Scanner;


public class a97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,j,n;
	        Scanner sc=new Scanner (System.in);
	        System.out.println("enter number");
	        n=sc.nextInt();
	        for(i=1;i<=n;i++){
	        for(j=n;j>=i;j--){
	        	System.out.print(""+i);
	        }
	        System.out.println("");
	        }
	}

}
