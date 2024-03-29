package polumorphism;

import java.util.Scanner;

class add
{
	int a,b,c,add;
	void addition(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 number");
		a=sc.nextInt();
		b=sc.nextInt();
   		add=a+b;  
   	 System.out.println("addition"+add);      		

	}
	int addition(int c){
		add=a+b+c;
		return(add);
		
	}
}

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Scanner sc=new Scanner (System.in);	
     add a1=new add();
     a1.addition();
     System.out.println("Enter third  number");
        c=sc.nextInt();
     int add=a1.addition(c);
     System.out.println("addition"+add);  
     
	}

}
