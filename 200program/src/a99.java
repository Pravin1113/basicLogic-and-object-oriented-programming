import java.util.Scanner;


public class a99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,n,l=1;
	        Scanner sc=new Scanner (System.in);
	        System.out.println("enter number");
	        n=sc.nextInt();
	        for(i=1;i<=n;i++){
	        	for(int k=1;k<i;k++)
	        		 System.out.print(" ");
	        	
	        for(j=i;j<=n;j++){
	        	System.out.print(""+j);
	        	
	        
	        	}
	        System.out.println("");
	        }
	}

}
