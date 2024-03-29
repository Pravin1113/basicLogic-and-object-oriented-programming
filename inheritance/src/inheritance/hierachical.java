package inheritance;
import java.util.*;
class Empp
{
	double id;
	String name,desg;
	Empp(Double id,String name,String desg)
	{
		this.id=id;
		this.name=name;
		
		this.desg=desg;
		
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("desg="+desg);
	}
}
class partt extends Empp
  {
	int nhr;double hor,salary;
	

    partt(Double id,String name,String desg,int nhr,double hor)
    {
    	super(id,name,desg);
    	this.nhr=nhr;
    	this.hor=hor;
    
    	
    }
    void cal_part()
    {
    	System.out.println("nhr="+nhr);
		System.out.println("hor="+hor);
		salary=nhr*hor;
		System.out.println("salary="+salary);
	
    }
}
    
    class fullt extends Empp
    {
    	int day;double dayr,salary;
    	fullt(Double id,String name,String desg,int day,double dayr)
    	{
        	super(id,name,desg);
        	this.day=day;
        	this.dayr=dayr;
        	this.salary=salary;
        	
        }
        void cal_fpart()
        {
        	System.out.println("day="+day);
    		System.out.println("day rate="+dayr);
    		salary=day*dayr;
    		System.out.println("salary="+salary);
    	
        }
    	
    }
    
    
    
public class hierachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double id,dayr, hor,salary;String desg,name;
		int day,nhr,ch;
		Scanner sc=new Scanner (System.in);
		do
		{
			System.out.println("1:accept details of part time empolyee");
			System.out.println("2:accept details of full time empolyee");
			System.out.println("3:exit");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			System.out.println("enter id,name");
			id=sc.nextDouble();
			name=sc.next();
			System.out.println("enter desg,nhr,hor");
			desg=sc.next();
			nhr=sc.nextInt();
			hor=sc.nextDouble();
			partt p1=new partt(id,name,desg,nhr,hor);
		
			p1.cal_part();
			break;
			case 2:
				System.out.println("enter id,name");
				id=sc.nextDouble();
				name=sc.next();
				System.out.println("enter desg,nhr,hor");
				desg=sc.next();
				day=sc.nextInt();
				dayr=sc.nextDouble();
				fullt f1=new fullt(id,name,desg,day,dayr);
				
				f1.cal_fpart();
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
		



