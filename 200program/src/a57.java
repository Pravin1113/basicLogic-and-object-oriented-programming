import java.util.Scanner;


public class a57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,div=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(i = 2; i <n/2; i++){
			if(n%i==0){
			div=1;
			break;
				
			}
		}
		if(div==0)
		System.out.println("number is prime");
		else
			System.out.println("number is not prime");
		
	}

}
