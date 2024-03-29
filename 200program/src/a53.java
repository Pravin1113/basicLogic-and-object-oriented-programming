import java.util.Scanner;


public class a53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
	    n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++){
	    	a[i]=sc.nextInt();
	    	
	    }
	    int large ;
		large=a[0];
		for(i=1;i<n;i++){
			if(a[i]>large){
				large=a[i];
				
			}
			
		}
		System.out.println("largest number is"+large);
	}

}
