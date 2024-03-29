package forloop;

public class FibbonacciNumber {
       static boolean perfect_square(int val) {
    	   int s=(int) Math.sqrt(val);
    	   return (s*s==val);
       }   
       static boolean fibbonacci(int n) {
    	   return perfect_square(5*n*n+4)||perfect_square(5*n*n+4);
       }
	public static void main(String[] args) {
		
		int n=4;
		if(n>0) {
			System.out.println("Is Fibbonacci number "+fibbonacci(n));
		}
		
			
	

	}

}
