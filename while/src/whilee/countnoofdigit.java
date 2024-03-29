package whilee;
import java.util.*;
public class countnoofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,cnt=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        while(n>0){
        	n=n/10;
        	cnt++;}
        System.out.println(cnt);
        }
	
	

}
