package pattern;

public class number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		System.out.println("enter number");
		
		for(int i=1;i<=n;i++){
			int p=5;
		
		for(int k=1;k<=i;k++){
			System.out.print(" ");
		}
			for(int j=i;j<=n;j++){
	System.out.print(p+++"");
}
			System.out.println("");
		}
	}
}