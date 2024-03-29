import java.util.*;
public class ccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str;char ch; int small=0,capital=0,digit=0,special=0;
      Scanner sc=new Scanner (System.in);
      System.out.println("enter string");
      str=sc.nextLine();
      for( int i=0;i<=str.length()-1;i++){
    	  ch=str.charAt(i);
    	  
    	  if(ch>='A'&& ch<='Z'){
    		  capital++;
    		  
    	  }
    	  else  if(ch>='a'&& ch<='z'){
    		  small++;
    		  
    	  }
    	  else if(ch>='0'&& ch<='9'){
    		  digit++;
    	  }
    	  else 
    		  special++;
    		  
      }
      System.out.println("capital character="+capital);
      System.out.println("specail charcter="+special);
      System.out.println("number="+digit);
      System.out.println("small character="+small);
      
	}

}
