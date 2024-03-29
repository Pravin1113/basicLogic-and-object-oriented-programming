package multyple_inheritance;
import java.util.*;
interface marks 
   {
	final int outof=300;
	abstract void getmark();
	 abstract void showmark();
    }
class student
     {	
	Scanner sc=new Scanner (System.in);
	int id;
	String name,add;
	  student(int id,String name,String add){
		 
		  this.name=name;
		  this.add=add;
		  
	  }
	  void accept(){
		  System.out.println("Enter id");
		  id=sc.nextInt();
		  System.out.println("Enter name");
		  name=sc.next();
		  System.out.println("Enter address");
		  add=sc.next();
	  }
	  void display(){
		  System.out.println("Student id="+id+"name="+name+"address="+add);
	  }
}
      class result extends student implements marks{
    	  double m1,m2,m3,total;
    	  double per;
    	  result(int id,String name,String add ,double m1,double m2,double m3)
    	  { 
    		  super (id,name,add);
    		  this.m1=m1;
    		  this.m2=m2;
    		  this.m3=m3;
    		  
    		  }
    	  public void getmark(){
    		  System.out.println("Enter m1,m2,m3 marks : ");
    	        m1 = sc.nextInt();
    	        m3 = sc.nextInt();
    	        m2 = sc.nextInt();
    	    
    	  }
    	  public void showmark(){
    		  total = m1+m2+m3;
    	        System.out.println("Total marks out of "+outof+" is "+total);
    	        per = total/3;
    	        System.out.println("Percentage is "+per);
    	  }
    	  void showGrade(){

    	        if(m1 >= 35 && m2 >=35 && m3 >=35) {
    	            if (per >= 90 && per <= 100) {
    	                System.out.println("Grade is O");
    	            } else if (per >= 75 && per < 90) {
    	                System.out.println("Grade is A+");
    	            } else if (per >= 60 && per < 75) {
    	                System.out.println("Grade is A");
    	            } else if (per >= 50 && per < 60) {
    	                System.out.println("Grade is B");
    	            } else if (per >= 35 && per < 50) {
    	                System.out.println("Grade is C");
    	            } else {
    	                System.out.println("Fail");
    	            }
    	        }else {
    	            System.out.println("Fail");
    	  }
    	  }
      }
public class multyple {
 public static void main(String []args){
         
 Scanner sc=new Scanner(System.in);
    int n,id,m1,m2,m3,ch,i;
    String name,address;
           System.out.println("Enter number of students: ");
           n = sc.nextInt();
     result[]r1=new result[n];
     for (i=0;i<n;i++){
    	 System.out.println("<-- New Student -->");
         System.out.println("Enter id :");
         id = sc.nextInt();
         System.out.println("Enter name :");
         name = sc.next();
         System.out.println("Enter address :");
         address = sc.next();
         System.out.println("Enter m1,m2,m3 marks : ");
         m1 = sc.nextInt();
         m3 = sc.nextInt();
         m2 = sc.nextInt();
         r1[i] = new result(id,name,address,m1,m2,m3);
         do {
             System.out.println("\n1.Get Marks\n2.Show Marks\n3.Show Grade\n4.Exit");
             ch = sc.nextInt();
             switch (ch){
                 case 1 :{
                     r1[i].getmark();
                 }
                 case 2 :{
                     r1[i].showmark();
                 }
                 case 3 :{
                     r1[i].showGrade();
                 }
                 case 4 :{
                     System.out.println("Exit");
                 }
                 default : {
                     System.out.println("Enter proper choice");
                 }
             }
         }while (ch != 4);
     }
 }

}

