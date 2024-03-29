package pattern;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		
		n=sc.nextInt();
		for(i=1;i<=n;i++)//row
		{
		for(j=1;j<=n;j++)//column
		{
			if(j%2!=0){
				System.out.print("1");
			}else{
				System.out.print("0");
			}
			}
		System.out.println("");}
}

}
