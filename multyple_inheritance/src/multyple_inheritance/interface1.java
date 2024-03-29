package multyple_inheritance;

import java.util.Scanner;

interface intoperation{
	abstract void even_odd();
	abstract void pos_neg();
	


    class mynumber implements intoperation
   {
	   int n;
	   mynumber (int n)
	   {
		   this.n=n;
		   
	   }
	  
	   public void even_odd()
	   {
		   
			if(n%2==0) 
			{
				System.out.println(n+" is Even");

			}
			else
			{
				System.out.println(n+" is Odd");
			}
	   

	   }
	public  void pos_neg(){
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1  number");
		n=sc.nextInt();
		if(n>0)
		{
		 System.out.println(n+" is positive");

		}
		else if(n<0)
		{

			 System.out.println(n+" is negative");

		}
		else 

		{
			System.out.println(n+" is Zero");

		}
	
	}
	
	
		
	
   }
  public  class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1  number");
		n=sc.nextInt();
     intoperation b=new mynumber(n);
     b.even_odd();
     b.pos_neg();
	}

}
    
}
