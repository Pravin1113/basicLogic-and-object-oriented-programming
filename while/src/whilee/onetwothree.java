package whilee;
import java.util.*;
public class onetwothree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,n1,sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        while(n>0){
        	n1=n%10;
        	n=n/10;
        	sum=(sum*10)+n1;
        	}
        n=sum;
        while(n>0){
        	n1=n%10;
        	n=n/10;
        	switch(n1){
        	case 0:System.out.print("zero");break;
        	case 1:System.out.print("one");break;
        	case 2:System.out.print("two");break;
        	case 3:System.out.print("three");break;
        	case 4:System.out.print("four");break;
        	case 5:System.out.print("five");break;
        	case 6:System.out.print("six");break;
        	case 7:System.out.print("seven");break;
        	case 8:System.out.print("eight");break;
        	case 9:System.out.print("nine");break;
        	}
        }
        	
        }

}
