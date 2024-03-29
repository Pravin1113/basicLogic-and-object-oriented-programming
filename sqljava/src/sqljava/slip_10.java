package sqljava;
import java.sql.DriverManager;
import java.sql.*;

public class slip_10 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from student");
		while(rs.next());
		System.out.println(rs.getInt(1));
		
	}
}
		