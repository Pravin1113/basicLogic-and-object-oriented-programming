package consrt;

import java.util.Scanner;

 public class Const {
	int bid,price;
	String bname,auther;
	
	 Const()
	  {
		 
		Scanner sc=new Scanner(System.in);
			System.out.println("enter bid,bname auther price");
			bid=sc.nextInt();
			bname=sc.next();
			auther=sc.next();
			price=sc.nextInt();

	
	}
	void display(){
		System.out.println("bid ="+bid);
		System.out.println("bname="+bname);
		System.out.println("auther="+auther);
		System.out.println("price="+price);
		
	}
	

	public  void main(String[] args) {
		
        Const s1=new Const();
                s1.display();
        



	

	
	

}


}
