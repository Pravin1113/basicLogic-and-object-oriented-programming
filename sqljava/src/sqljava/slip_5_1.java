package sqljava;
import java.sql.*;
import java.util.Scanner;
public class slip_5_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     int no,sal;
     String name ,desg;
     Scanner sc=new Scanner (System.in);
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
     Statement st=con.createStatement();
     System.out.println("enter no");
     no=sc.nextInt();
     System.out.println("enter name");
     name=sc.next();
     System.out.println("enter desg");
     desg=sc.next();
     System.out.println("enter salary");
     sal=sc.nextInt();
     st.executeUpdate("insert into teacher values ("+no+",'"+name+"','"+desg+"',"+sal+")");
     System.out.println("record added");
     con.close();
     st.close();
	}

}
