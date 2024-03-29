import java.util.*;
public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str ;char ch; int cntd=0,cnta=0;
      Scanner sc=new Scanner (System.in);
      System.out.println("enter email");
      str=sc.nextLine();
      for (int i=0;i<=str.length()-1;i++)
      {
    	  ch=str.charAt(i);
    	  if (ch=='i'){
    	  cntd++;
    	  }
    	  if(ch=='@'){
    		  cnta++;
    		  
    	  }
    	  
      }
      if (cntd>=1&&cntd<=2 && cnta==1){
    	  System.out.println("vald email");
      }
      else{
    	  System.out.println("envalid");
      }
	}

}
