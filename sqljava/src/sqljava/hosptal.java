package sqljava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class hosptal extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4;
JTable jt;
JScrollPane sp;

hosptal()
{
setSize(700,700);
setTitle("Hospital Database");
setLayout(null);

l1=new JLabel("Hospital No");
l2=new JLabel("Hospital Name");
l3=new JLabel("Address");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);

b1=new JButton("Add");
b2=new JButton("Delete");
b3=new JButton("Update");
b4=new JButton("Show");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);

l1.setBounds(100,100,100,20);
t1.setBounds(250,100,100,20);
l2.setBounds(100,150,100,20);
t2.setBounds(250,150,100,20);
l3.setBounds(100,200,100,20);
t3.setBounds(250,200,100,20);

b1.setBounds(100,250,100,20);
b2.setBounds(250,250,100,20);
b3.setBounds(400,250,100,20);
b4.setBounds(250,300,100,20);

setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
PreparedStatement ps=con.prepareStatement("insert into hospital values(?,?,?)");
String hno=t1.getText();
String hname=t2.getText();
String add=t3.getText();
ps.setString(1,hno);
ps.setString(2,hname);
ps.setString(3,add);
int i=ps.executeUpdate();
System.out.println(i+" records inserted");
}
catch(Exception e)
{
System.out.println(e);
}
}
else if(ae.getSource()==b2)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
PreparedStatement ps=con.prepareStatement("delete from hospital where hno=?");
String hno=t1.getText();
ps.setString(1,hno);
int i=ps.executeUpdate();
System.out.println(i+" records deleted");
}
catch(Exception e)
{
System.out.println(e);
}
}
else if(ae.getSource()==b3)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
PreparedStatement ps=con.prepareStatement("update hospital set hname=?,address=? where hno=?");
String hno=t1.getText();
String hname=t2.getText();
String add=t3.getText();
ps.setString(3,hno);
ps.setString(1,hname);
ps.setString(2,add);
int i=ps.executeUpdate();
System.out.println(i+" records updated");
}
catch(Exception e)
{
System.out.println(e);
}
}
else if(ae.getSource()==b4)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
PreparedStatement ps=con.prepareStatement("select * from hospital");
ResultSet rs=ps.executeQuery();
String data[][]=new String[10][3];
int i=0;
while(rs.next())
{
data[i][0]=rs.getString(1);
data[i][1]=rs.getString(2);
data[i][2]=rs.getString(3);
i++;
}
String col[]={"Hospital No","Hospital Name","Address"};
jt=new JTable(data,col);
sp=new JScrollPane(jt);
add(sp);
sp.setBounds(100,400,300,200);
setVisible(true);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String args[])
{
new hosptal();
}
}