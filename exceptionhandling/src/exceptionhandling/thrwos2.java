package exceptionhandling;
import java.util.*;
class pravin extends Exception{
	public String toString(){
		return"name is invalid";
	}
}
public class thrwos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int cnt=0;
     Scanner sc=new Scanner (System.in);
     System.out.println("enter name");
     String s1=sc.next();
     try{
    	 for(int i=0;i<s1.length();i++){
    	 char ch=s1.charAt(i);
    	 if(Character.isLetter(ch)){
    		 cnt++;
    		 
    	 }
    	 else{
    		 throw new pravin();
    	 }
    	 }
    	 
     }
     catch( pravin e){
    	 System.out.println(e);
    	 
     }
     if(cnt==s1.length()){
    	 System.out.println("name is valid");
    	 
     }
     
	}

}
