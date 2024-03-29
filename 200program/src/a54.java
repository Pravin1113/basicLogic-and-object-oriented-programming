import java.util.Scanner;


public class a54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
	    n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++){
	    	a[i]=sc.nextInt();
	    	
	    }
	    for (int i1 = 0; i1 < n; i1++)
	    {
	    for(int j = i1 + 1; j < n; j++)
	    {
	    if (a[i1] > a[j])
	    {
	    int min = a[i1];
	    a[i1] = a[j];
	    a[j] = min;
	    }
	    }
	    }
	    System.out.println("The Second Smallest element in the array is :"+a[1]);
	    

	}

}
