import java.util.Scanner;


public class a93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,l=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(""+i);
				
				
			}
		
			System.out.println("");
		
		}
	}

}
