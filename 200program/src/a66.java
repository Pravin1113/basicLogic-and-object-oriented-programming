import java.util.Scanner;


public class a66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=1,n1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		
		for(i=1; i<=n; i++){
			sum=sum*i;
		}
		
		System.out.println(sum);
	}

}
