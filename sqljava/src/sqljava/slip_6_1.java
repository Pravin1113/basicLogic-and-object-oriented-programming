package sqljava;
import java.util.*;
import java.sql.*;

public class slip_6_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		Connection con;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
			if(con==null)
			{
				System.out.println("connection failess...");
				System.exit(1);
				
			}
			System.out.println("connection success");
			Scanner sc=new Scanner(System.in);
			String s="insert into customer values(?,?,?)";
			ps=con.prepareStatement(s);
			System.out.println("enter custmer details....");
			System.out.println("Enter Custemer id=");
			int cid=sc.nextInt();
			ps.setInt(1,cid);
			System.out.println("enter name ");
			String name=sc.next();
			ps.setString(2, name);
			System.out.println("enter custmer address");
			String address=sc.next();
			ps.setString(3, address);
			int n=ps.executeUpdate();
			if(n>0){
				System.out.println("data inserted succesfully");
				
			}
			else {
				System.out.println("data not insrted");
				
			}
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		

	}

}
