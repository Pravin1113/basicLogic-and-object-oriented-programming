
import java.sql.*;
import java.util.Scanner;

public class mobiles {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("drive reg");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","" );
    System.out.println("conn success");
    Statement st=con.createStatement();
    int id ,price,n;
	String cname,color;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the mobiles ");
	n=sc.nextInt();
	Array s1[]=new Array[n];
	for( int i=0;i<n;i++){
	System.out.println("enter id,cname,color,price");
	id=sc.nextInt();
	cname=sc.next();
	color=sc.next();
	price=sc.nextInt();
	String s="insert into mobile values("+id+",'"+cname+"','"+color+"',"+price+")";
    
	
 int i1=st.executeUpdate(s);
 if(i1>0)
	 System.out.println("save succesfully");
 else
	 System.out.println("save unsuccesfully");
	}
 con.close();

	}
}
