package multyple_inheritance;

import java.util.*;
interface bank
{
	abstract float rateofinterest();
	
}
class sbi implements bank
{
	public float rateofinterest()
	{
		return 9.15f;
		
	}
}
 class pnb implements bank
 { 
	 public float rateofintrest()
	 {
	 return 9.7f;
	 }

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 9.7f;
	}

	


	
 }
 
  
public class interface_sbi {

	public static void main(String[] args) {
		
          bank b=new sbi();
          System.out.println("rate of intrest:"+b.rateofinterest());
          pnb b1=new pnb();
          System.out.println("rate of intrest:"+b1.rateofinterest());
	}

}
