package pattern;
import java.util.*;
public class box_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
	     Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++){
			for (j=1;j<=n;j++){
				if(i==1||j==1||i==n||j==n){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	}
		System.out.println();

	}
}
}