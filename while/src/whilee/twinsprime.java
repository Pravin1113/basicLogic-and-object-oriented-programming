package whilee;
import java.util.*;
public class twinsprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1,div=0,p,i,div1=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        n1=sc.nextInt();
	for(i=2;i<=(n/2);i++){
	  if(n%i==0){
		  div=1;
		  break;
	  }
	}
	for(i=2;i<=(n1/2);i++){
	if(n1%i==0)
	{
		div1=1;
		break;
	}
	
	}
    if(div==0&&div1==0&&((n-n1==-2)||(n-n1==2))){
    	System.out.println("twins");
    }
    	else{
    		System.out.println(" not twins");
    	}
    }
}
