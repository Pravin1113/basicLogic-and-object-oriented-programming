import java.util.*;
 class patt{
    int n,i,j;
   
    void patto(){
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		n=sc.nextInt();
		
    	
    	for (i=1;i<=n;i++){
    		for(j=1;j<=i;j++){
    		
    	System.out.print(""+j);
    	}
    	System.out.println(" ");
    }
 }
 }
public class pattern {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		patt p1=new patt();
		
       p1.patto();
       
	}

}
