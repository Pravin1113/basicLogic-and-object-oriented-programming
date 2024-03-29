

import java.sql.*;
import java.util.Scanner;

public class employee {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("drive reg");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","" );
    System.out.println("conn success");
    Statement st=con.createStatement();
    int eid,salary;
    String ename,email,desig;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the employee details");
	
	
	eid = sc.nextInt();
	ename = sc.next();
	 salary = sc.nextInt();
	 email = sc.next();
	 desig=sc.next();
	String s="insert into employee values("+eid+",'"+ename+"',"+salary+",'"+email+"'"+desig+"')";
    
	
 int i1=st.executeUpdate(s);
 if(i1>0)
	 System.out.println("save succesfully");
 else
	 System.out.println("save unsuccesfully");
 con.close();
	}

}
