import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class search {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
          
		
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");
        
        while(rs.next())
        {
        	int eid=rs.getInt(1);
        	String name=rs.getString(2);
        	double sal=rs.getDouble(3);
        	
        	System.out.println("emp id= "+eid+" name= "+name+" salary= "+sal);
        }
        
        
	}

}
