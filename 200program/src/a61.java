import java.util.Scanner;


public class a61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,sum=0,i,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        n1=n;
        while(n>0)
        {
        p=n%10;
        n=n/10;
        sum=sum*10+p;
	}
 if(n1==sum){
        	
        	System.out.println("no is palindrome");}
        	else {
        		System.out.println("no is not paindrome");
        	}
	}

}
