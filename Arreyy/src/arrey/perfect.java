package arrey;
import java.util.*;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,i,div,n1,j;
  
   Scanner sc=new Scanner(System.in);
    System.out.println("enter arrey size");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter"+n+"element");
    for (i=0;i<n;i++){
    	a[i]=sc.nextInt();
    	
    }
    System.out.println("\n\n arrey elemet are");
    for(i=0;i<n;i++)
    {
    	System.out.print(a[i]+"\t");
    }
    System.out.println("\n\n even and odd elemet are");
	
	for(i=0;i<n;i++){
		if(a[i]%2==0){
			System.out.println("even"+a[i]);
		}
		else{
			System.out.println("odd"+a[i]);
		}
			}
	
	}

}
