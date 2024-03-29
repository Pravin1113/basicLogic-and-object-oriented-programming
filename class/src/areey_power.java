import java.util.*;
class pow{
	int n,x,f1=1,i;
	void accept(int n){
	this.n=n;
	}
	int power(int x){
		
		for(i=1;i<=n;i++){
			f1=f1*x;
		}
		return(f1);
			
		
	}
}
public class areey_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n,n1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("no of records");
		n1=sc.nextInt();
		pow p1[]=new pow[n1];
		System.out.println("enter value n");
		 n=sc.nextInt();
		for (i=0;i<=n;i++){
			p1[i]=new pow();
			
			
		
		 
         p1[i].accept(n);
		System.out.println("enter value x");
		x=sc.nextInt();
		p1[i].power(x);
          System.out.println("power="+p1[i].power(x));
	}

}
}
