import java.util.Scanner;


public class a58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0,n1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		
		for(i=1; i<n; i++){
			if(n%i==0){
				sum=sum+i;
			}
			
			
		}
		if(n==sum)
			System.out.println("number is perfect");
			else
				System.out.println("number is not perfect");
		}
	

}
