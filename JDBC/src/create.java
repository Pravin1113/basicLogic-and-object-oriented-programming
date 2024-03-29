import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			Statement smt=con.createStatement();
			smt.executeUpdate("create table emp(eno int,ename varchar(12),esal float(10))");
			System.out.println("table created succesfully");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
