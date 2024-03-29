package whilee;
import java.util.*;
public class countprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,cnt=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        while(n>0){
        	n1=n%10;
        	n=n/10;
        	if(n1==2||n1==3||n1==5||n1==7){
        	cnt++;}
        } System.out.println(cnt);
         
	
        
	
	}

}
