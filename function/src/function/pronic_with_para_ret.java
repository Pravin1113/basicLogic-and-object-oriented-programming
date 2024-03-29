package function;

import java.util.Scanner;

public class pronic_with_para_ret {
	static String pro(int n){
	int i,abc=0;
	for(i=1;i<=(n/2);i++)
	
	if(n==(i*(i+1)))
	{
		abc=1;
		break;
	}
		
	if(abc==1)
	
		return "Number is pronic";
	
	else
	
		return "Number is not  pronic";
	
}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
		String s1=pro(n);
		System.out.println(""+s1);
		// TODO Auto-generated method stub

	}

}
