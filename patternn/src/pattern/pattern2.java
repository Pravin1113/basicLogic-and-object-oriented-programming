package pattern;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=9;
     Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++)
	
		if(j==5&&i>=1||i==5&&j>=1){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	
	System.out.println(" ");
	}

}
}