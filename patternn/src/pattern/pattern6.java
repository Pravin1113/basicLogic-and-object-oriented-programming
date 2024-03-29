package pattern;

import java.util.*;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=1;
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
		if(k<9){
				System.out.print( ""+k);
				k=k+1;
		}	
		}
		System.out.println(" ");
		}
	}

}
