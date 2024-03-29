package inheritance;
import java.util.*;

class movie{
	String title;int no;double amount;
	movie(String title,int no,double amount){
		this.title=title;
		
		
		this.amount=amount;
		this.no=no;
		
	}
	void display(){
		System.out.println("title="+title);
		System.out.println("amount="+amount);
		System.out.println("no of tickets="+no);
	}
	
}
class taxfree extends movie{
	double final_amt;
	taxfree( String title,int no,double amount)
	{
		super(title,no,amount);

	}
	void calc(){
		final_amt=amount*no;
		System.out.println(" final amount="+final_amt);
		this.final_amt=final_amt;
	}
}
class taxed extends movie{
	double tax=0.05,final_amt,total;
	taxed(String title,int no,double amount){
		super(title,no, amount);
		
	}
	void calcc(){
		
		total= (amount*no)*tax;
		final_amt=total+(amount*no);
		System.out.println(" tax="+total);
		System.out.println(" final amount="+final_amt);
	}
}

public class movie_tick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;String title;
		int no,ch; 
		Scanner sc=new Scanner (System.in);

		do
		{
			System.out.println("1:taxfree movie");
			System.out.println("2:taxed movie");
			System.out.println("3:exit");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch){
			case 1:
		System.out.println("enter title  amount and tickes");
		title=sc.next();
		amount=sc.nextDouble();
		no=sc.nextInt();
		taxfree t1=new taxfree(title,no,amount);
		t1.display();
		t1.calc();
		break;
			case 2:
		System.out.println("enter title amount and tickets");
		title=sc.next();
		amount=sc.nextDouble();
		no=sc.nextInt();
		taxed t2=new taxed(title,no,amount);
		t2.display();
		t2.calcc();
       break;
			case 3:
				System.exit(0);
				break;
				default:System.out.println("invalid choice");
			}
		}
		while(ch<=3);
	}

}
