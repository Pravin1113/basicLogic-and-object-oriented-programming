import java.util.Scanner;


public class a96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(i=n;i>=1;i--){
        for(j=n;j>=i;j--){
        	System.out.print(""+j);
        }
        System.out.println("");
        }
	}

}
