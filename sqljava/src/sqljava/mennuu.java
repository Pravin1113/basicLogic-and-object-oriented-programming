package sqljava;
import java.util.*;
import java.sql.*;

public class mennuu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     int ch, roll,marks,k;
     String name,sql;
     Statement stmt;
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("Driver reg");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","");  
     System.out.println("conn succesfull");
     Scanner sc=new Scanner(System.in);
     do{
    	 System.out.println("MENU");
    	 System.out.println("1.insert\n2.Update\n3.Delete\n4.Display\n5.Search\6:exit");
       System.out.println("enter your choice");
       ch=sc.nextInt();
       switch(ch)
       {
       case 1:
    	   stmt=con.createStatement();
    		System.out.println("enetr roll,name,phone per");
    		int rollno = sc.nextInt();
    		name=sc.next();
    
    		int per = sc.nextInt();
    		
    		String s="insert into student values("+rollno+",'"+name+"',"+per+")";
    		int i=stmt.executeUpdate(s);
    		if(i>0)
    		System.out.println("Save successfully");
    		else
    			System.out.println("Save unsuccessfully");
    		stmt.close();
    		break;
       case 2:
    	   stmt=con.createStatement();
   		
   		System.out.println("enetr name");
   		name=sc.next();
   		System.out.println("enetr per");
	     per = sc.nextInt();
	     System.out.println("enetr roll");
   		 rollno = sc.nextInt();
		
		String s1="update student set name='"+name+"',per="+per+",where rollno="+rollno+"";
		 i=stmt.executeUpdate(s1);
		if(i>0)
		System.out.println("record updated");
		else
			System.out.println("check roll no");
		stmt.close();
		break;
     
       case 3:
    	   stmt=con.createStatement();
   		System.out.println("enetr roll");
   		 rollno = sc.nextInt();
   		name=sc.next();
   	    
	      per = sc.nextInt();
		
		String s2="delete from student where rollno="+rollno+"";
		 i=stmt.executeUpdate(s2);
		if(i>0)
		System.out.println("record delete");
		else
			System.out.println("check roll no");
		stmt.close();
		break;
       case 4:
    	   stmt=con.createStatement();
    	   String s3="Select* from student";
    	   ResultSet res=stmt.executeQuery(s3);
    	   while(res.next()){
    		   System.out.println(res.getInt("rollno")+"\t"+res.getString(2)+"\t"+res.getInt(3));
    		   
    	   }
    	   break;
       case 5:
    	   stmt=con.createStatement();
    	   System.out.println("enetr roll");
     		 rollno = sc.nextInt();
     		name=sc.next();
    	   String s4="Select* from student where rollno="+rollno+"";
    	   ResultSet res1=stmt.executeQuery(s4);
    	   while(res1.next()){
    		   System.out.println(res1.getInt("rollno")+"\t"+res1.getString(2)+"\t"+res1.getInt(3));
    		   
    	   }
    	   
    	   break;
       case 6:
    	   System.exit(0);
    	   default:System.out.println("invalid choice");
     }
     }while(ch<=6);
	}

}