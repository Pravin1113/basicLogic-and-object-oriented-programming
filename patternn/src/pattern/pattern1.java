package pattern;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int k=0, n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
	
	n=sc.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==n||i == 1||i==n||i==1){
				if(i==1&&j==1||i==n&&j==n||i==n&&j==1){
					System.out.print(" ");
				}
				else{
					System.out.print(" " + "*");
				}
			}
			else{
				k=(j+i-3);
				if(k>9){
					System.out.print(" "+(k-9));

				}else{
					System.out.print(" "+k);

				}
			}
		}
		System.out.println(" ");

	
	}
	
	
	
	}

}
