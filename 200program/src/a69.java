import java.util.Scanner;


public class a69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,f1=0,f2=1,f3,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
   int n=sc.nextInt();
   if(n==0){
	   System.out.println("invalid no");
   }
   else if(n==1){
	   System.out.println(f1);
   }
   else{
	   System.out.println(f1+"\t"+f2);
   }
   for(i=3;i<n;i++){
	   f3=f2+f1;
	   System.out.println(f3);
	   f1=f2;
	   f2=f3;
   }
	}

}
