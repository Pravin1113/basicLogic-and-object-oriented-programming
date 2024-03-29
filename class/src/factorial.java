import java.util.*;
class facto{
	int a, f1=1,i;
;
	   int fact (int a)
	 {   this.a=a;
    	     	 for(i=a;i>1;i--){
    		 f1=f1*i;
    	 }
    	 return(f1);
     }
}
public class factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		facto a1=new facto();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		a=sc.nextInt();
	   
	System.out.println("facto="+a1.fact(a));
	}

}
