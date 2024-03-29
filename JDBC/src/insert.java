import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
         
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			PreparedStatement psmt=con.prepareStatement("insert into emp value(?,?,?)")	;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter emp id");
		    int eno=sc.nextInt();
		    
		    System.out.println("enter emp name");
		    String ename=sc.next();
		    
		    System.out.println("enter emp salary");
		     double esal=sc.nextDouble();
		    
		    psmt.setInt(1, eno);
		    psmt.setString(2, ename);
		    psmt.setDouble(3, esal);
		    
		    
		    int count=psmt.executeUpdate();
		    if(count==1)
		    	System.out.println("record insreted");
		    else
		    	System.out.println("record not insrted");
		 
		 
	}

}
