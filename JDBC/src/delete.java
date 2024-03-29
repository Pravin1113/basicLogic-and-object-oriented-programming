import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
        Statement stmt=con.createStatement();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while (true)
        {
        	System.out.println("enter deletian id");
        	int eno=Integer.parseInt(br.readLine());
        	
        	int count=stmt.executeUpdate("delete from emp where eno="+eno);
        	if(count==1)
        		System.out.println("record delete succsfully");
        	else
        	
        		System.out.println("record not found");
        	
        }
	}

}
