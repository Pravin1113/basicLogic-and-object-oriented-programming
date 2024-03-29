package sqljava;
import java.sql.*;

public class slip3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select *from employee where department='computer science'");
    System.out.println("eno\t"+"ename\t"+"department\t"+"sal");
    while(rs.next()){
    	System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+""+rs.getInt(4));
    }
    con.close();
    rs.close();
    st.close();
	}

}
