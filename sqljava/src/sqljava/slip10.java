package sqljava;

import java.sql.*;
public class slip10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery("Select * from customer");
       int cnt=0;
       while(rs.next()){
    	   cnt++;
       }
       System.out.print("number are the records are="+cnt);
       
	}

}
