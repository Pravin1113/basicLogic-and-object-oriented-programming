import java.util.Scanner;


public class a62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,sum=0,i,p,pro=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        n1=n;
        while(n>0)
        {
        p=n%10;
        n=n/10;
        sum=sum+p;
        pro=pro*p;
        }
        System.out.println("addition="+sum);
        System.out.println("product="+pro);
	}

}
