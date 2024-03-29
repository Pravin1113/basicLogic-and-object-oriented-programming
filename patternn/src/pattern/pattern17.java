package pattern;
import java.util.Scanner;
public class pattern17 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			int ch=96;
		     Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			n=sc.nextInt();
			for(int i=1;i<=n;i++){
				for(int k=n;k>=i;k--){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					ch=ch+1;
			
					System.out.print(""+(char)(ch));

			}
			System.out.println(" ");
			}
		


		

	}

}
