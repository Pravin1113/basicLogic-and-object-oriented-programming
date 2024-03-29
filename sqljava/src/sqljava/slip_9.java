package sqljava;

import java.sql.DriverManager;
import java.sql.*;

public class slip_9 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
		Statement st=con.createStatement();
		int k=st.executeUpdate("delete from student where name like 'G%'");
		if(k>0)
			System.out.println("record deleted");
		else
			System.out.println("record  not deleted");

	}

}
