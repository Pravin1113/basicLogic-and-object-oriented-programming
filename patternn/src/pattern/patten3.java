package pattern;

public class patten3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
		 System.out.println("enter number");
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
		
			if(j==1||i==j||i==n){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
			}
			System.out.println(" ");	
		
		
		}
	}
			

}
