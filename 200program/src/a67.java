import java.util.Scanner;


public class a67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=1,n1,cnt;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		
		for(i=1; i<=n; i++){
		 cnt=0;
			for(int j = 1;j<=n;j++){
				if(i%j==0){
					cnt++;
					
				}
			}
		
		 
		if(cnt==2){
			System.out.println(i);
		}
			
		}
	}

}
