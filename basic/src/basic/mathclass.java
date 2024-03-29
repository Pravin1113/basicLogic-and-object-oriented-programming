package basic;
import java.util.*;
public class mathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x ,y ;    
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 2 no");
		x=sc.nextDouble();
		y=sc.nextDouble();
  
      System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
        
     
      System.out.println("Square root of y is: " + Math.sqrt(y));   
        
     
      System.out.println("Power of x and y is: " + Math.pow(x, y));      

           
      System.out.println("Logarithm of x is: " + Math.log(x));   
      System.out.println("Logarithm of y is: " + Math.log(y));  
        
    
      System.out.println("log10 of x is: " + Math.log10(x));   
      System.out.println("log10 of y is: " + Math.log10(y));    
        
 
      System.out.println("log1p of x is: " +Math.log1p(x));    

     
      System.out.println("exp of a is: " +Math.exp(x));    
        
     
      System.out.println("expm1 of a is: " +Math.expm1(x));  
  }    
   


}
