package exceptionhandling;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try{
	   int a[]=new int[5];
	   a[5]=30/0;
   }
   catch(ArithmeticException e){
	   System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e1){
	   System.out.println("error");
	   
   }
   System.out.println("rest of the code");
   
	}

}
