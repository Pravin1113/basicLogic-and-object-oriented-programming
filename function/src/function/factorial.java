package function;
import java.util.*;

public class factorial {

	
	static int fact (){
		int n,f1=1,i;
		Scanner sc=new  Scanner (System.in);
		System.out.println("entet number");
		n=sc.nextInt();
		
			for (i=n;i>1;i--){
			f1=f1*i;
			
		}
	 return(f1);
	
	}
	
	public static void main(String[] args) {
		int f1=fact();
		System.out.println("fact="+f1);
		// TODO Auto-generated method stub

	}

}
