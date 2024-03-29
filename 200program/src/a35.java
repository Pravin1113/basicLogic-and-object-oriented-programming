import java.util.*;
public class a35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter character");
      ch=sc.next().charAt(0);
      if(ch>=65&&ch<=90)
    	  System.out.println("upper case");
      else if(ch>=97&&ch<=122)
    	  System.out.println("lowecase");
      else
    	  System.out.println("no alphabet");
	}

}
