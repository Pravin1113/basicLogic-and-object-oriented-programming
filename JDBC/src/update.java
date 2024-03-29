import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String value;int id; double sal;
		
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
            Statement stmt=con.createStatement();
             Scanner sc=new Scanner(System.in);
             
             System.out.println("enter Emp ID");
             value=sc.next();
             id=Integer.parseInt(value);
              
              System.out.println("enter Emp salary");
              value=sc.next();
              sal=Double.parseDouble(value);
             
              
              int count=stmt.executeUpdate("update emp set esal="+sal+"where eno="+id);
  		    if(count==1)
  		    	System.out.println("record updated");
  		    else
  		    	System.out.println("record not found");
             

	}

}
