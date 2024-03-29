
import java.sql.*;
public class slipss
{
public static void main(String args[])
{
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","");
	Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * From employee Where salary=687");
System.out.println("eid\t"+"ename\t"+"salary\t"+"email");
while(rs.next())
{
System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+""+rs.getInt(4));
}
con.close();
rs.close();
st.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}


