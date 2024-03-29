
package polumorphism;
import java.util.*;
class maxi
{
	int a,b,c,max;
	void max2(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter  number");
		a=sc.nextInt();
		b=sc.nextInt();
   		max=(a>b)?a:b;  
    		

	}
	int max2(int c){
		max=(a>b)?(a>c)?a:c:(b>a)?(b>c)?b:c:c;
		return(max);
		
	}
}

public class maximm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
			Scanner sc=new Scanner (System.in);	
         maxi m1=new maxi();
         m1.max2();
     
            c=sc.nextInt();
         int max=m1.max2(c);
         System.out.println("Max"+max);  
         
	}

}
