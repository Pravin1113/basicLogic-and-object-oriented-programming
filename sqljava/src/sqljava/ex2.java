package sqljava;
import java.sql.*;
import java.util.Scanner;

public class ex2{

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		System.out.println("Driver reg");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","");  
		System.out.println("conn sucess");
		Statement st=con.createStatement();
	int tid;
	String name,desg;
	float sal;
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr roll,name,phone per");
	int rollno = sc.nextInt();
	name=sc.next();
	int phonno = sc.nextInt();
	double per = sc.nextDouble();
	
	String s="insert into student values("+rollno+",'"+name+"',"+phonno+","+per+")";
	int i=st.executeUpdate(s);
	if(i>0)
	System.out.println("Save successfully");
	else
		System.out.println("Save unsuccessfully");
	
			
	con.close();
}
}
