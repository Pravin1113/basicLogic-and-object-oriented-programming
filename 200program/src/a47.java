import java.util.Scanner;


public class a47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,n;
		 Scanner sc=new Scanner (System.in);
		 System.out.println("enter number");
		 n=sc.nextInt();
		 for(i=0;i<=n;i=i+2){
			
			 sum=sum+i;
		 }
		 System.out.println("sum="+sum);
			 
	}

}
