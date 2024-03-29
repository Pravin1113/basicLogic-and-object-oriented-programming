package sqljava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class ex1 extends JFrame implements ItemListener
{
    JComboBox cb;
    String s[]={"SalesID","Month","Amount"};
    String a[][]=new String[10][10];
    public ex1()
    {
        setLayout(null);
        cb=new JComboBox();
        cb.setBounds(350,20,100,20);
        cb.addItem("JANUARY");
        cb.addItem("FEBRUARY");
        cb.addItem("MARCH");
        cb.addItem("APRIL");
        cb.addItem("MAY");
        cb.addItem("JUN");
        cb.addItem("JULY");
        cb.addItem("AUGUST");
        cb.addItem("SEPTEMBER");
        cb.addItem("OCTOBER");
        cb.addItem("NOVEMBER");
        cb.addItem("DECEMBER");
        add(cb);
        cb.addItemListener(this);
        setSize(500,400);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
      {
        String str=cb.getSelectedItem().toString();
        try        {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","");
        	Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from books where Month='"+str+"'");
            int i=0;
            while(rs.next())
            {
                a[i][0]=rs.getString(1);
                a[i][1]=rs.getString(2);
                a[i][2]=rs.getString(3);
                i++;
            }
            con.close();
            JTable jt=new JTable(a,s);
            JScrollPane pane=new JScrollPane(jt);
            pane.setBounds(0,0,300,400);
            add(pane);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new ex1();
    }
}
