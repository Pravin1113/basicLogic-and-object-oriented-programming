package sqljava;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

public class ex3 extends JFrame {
JLabel lb1,lb2,lb3;
JComboBox jcb;
JButton up,dl,ad,dp;
JTextField tf1,tf2,tf3;
int rollno,marks;
String name;
Connection con;
int rn,mr;
String nm;

ResultSet rs;
JTextArea ta1,ta2;
String [] a1 = new String[10];
int idx=0;
public ex3(){
try{
Class.forName("com.mysql.jdbc.Driver");
JOptionPane.showMessageDialog(null,"Driver registered");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","");
JOptionPane.showMessageDialog(null,"Connected");
try{
 Statement stmt = con.createStatement();
String s1 = "select rollno from student;";
rs = stmt.executeQuery(s1);
while (rs.next()){
a1[idx] = Integer.toString(rs.getInt(1));
idx++;
}
}catch (Exception e6){
JOptionPane.showMessageDialog(null,e6);
}
}catch (Exception e1){
JOptionPane.showMessageDialog(null,e1);
}
setLayout(null);
setTitle("Student Management System");
setVisible(true);
setBounds(300,50,700,600);
lb1 = new JLabel("Roll no : ");
add(lb1);
lb1.setBounds(100,50,100,100);
tf1 = new JTextField();
add(tf1);
tf1.setBounds(250,85,250,30);
lb2 = new JLabel("Name : ");
add(lb2);
lb2.setBounds(100,100,100,100);
tf2 = new JTextField();
add(tf2);
tf2.setBounds(250,135,250,30);
lb3 = new JLabel("per : ");
add(lb3);
lb3.setBounds(100,150,100,100);
tf3 = new JTextField();
add(tf3);
tf3.setBounds(250,185,250,30);
ad = new JButton("Add");
add(ad);
ad.setBounds(100,255,90,30);
dl = new JButton("Del");
add(dl);
dl.setBounds(200,255,90,30);
up = new JButton("Upd");
add(up);
up.setBounds(300,255,90,30);
dp = new JButton("Dis");
add(dp);
dp.setBounds(420,300,70,30);
ta1 = new JTextArea(5,5);
add(ta1);
ta1.setBounds(100,300,150,30);
ta1.setBackground(Color.BLACK);
ta2 = new JTextArea(5,5);
add(ta2);
ta2.setBounds(260,300,150,30);
ta2.setBackground(Color.BLACK);
jcb = new JComboBox<>(a1);
add(jcb);
jcb.setBounds(400,255,90,30);
int per=0;
ad.addActionListener((ActionListener) this);
dl.addActionListener((ActionListener) this);


up.addActionListener((ActionListener) this);
dp.addActionListener((ActionListener) this);setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new ex3();


}

public void actionPerformed(ActionEvent e){
Statement stmt;
if(e.getSource()==dl)//5
{
try{
rn = Integer.parseInt(tf1.getText());
String sql = " delete from student where rollno="+rollno+" ";
stmt = con.createStatement();
int i = stmt.executeUpdate(sql);
if(i == 0){
JOptionPane.showMessageDialog(null,"Not Deleted");
}else {
JOptionPane.showMessageDialog(null,"Deleted");
}
con.close();
tf1.setText("");
tf2.setText("");
tf3.setText("");
}catch (Exception e3){
JOptionPane.showMessageDialog(null,e3);
}
if(e.getSource()==dp)//5
{
try{
int a = Integer.parseInt(jcb.getSelectedItem().toString());
stmt =(Statement) con.createStatement();
String sql = "select * from student where rollno="+a;
rs = stmt.executeQuery(sql);
while (rs.next()){
if(a == rs.getInt(1)){
ta1.setForeground(Color.CYAN);
ta2.setForeground(Color.CYAN);
ta1.setText(rs.getString(2));
ta2.setText(Integer.toString(rs.getInt(3)));
}else {
JOptionPane.showMessageDialog(null,"Roll no not available indatabase");
}
}
}catch (Exception e5){
JOptionPane.showMessageDialog(null,e5);
}
}
if(e.getSource()==up)//
try{
rn = Integer.parseInt(tf1.getText());
nm = tf2.getText();
int per = Integer.parseInt(tf3.getText());
String sql = "update student set name='"+name+"',marks="+per+" where rollno="+rollno;
stmt = (Statement) con.createStatement();
int i = stmt.executeUpdate(sql);
if(i>0){
JOptionPane.showMessageDialog(null,"Updated");
}else {
JOptionPane.showMessageDialog(null,"Not Updated");
}
con.close();
tf1.setText("");
tf2.setText("");
tf3.setText("");
}catch (Exception e4){
JOptionPane.showMessageDialog(null,e4);
}
}
if(e.getSource()==ad){
try{
rollno = Integer.parseInt(tf1.getText());
name= tf2.getText();
int per = Integer.parseInt(tf3.getText());
String sql = "insert into student values("+rollno+",'"+name+"',"+per+")";
stmt = (Statement) con.createStatement();
int i = stmt.executeUpdate(sql);
if(i>0){
JOptionPane.showMessageDialog(null,"Save successfully");
}else {
JOptionPane.showMessageDialog(null,"Not Save successfully");
}
con.close();
tf1.setText("");
tf2.setText("");
tf3.setText("");
}catch (Exception e2){
JOptionPane.showMessageDialog(null,e2);
}

}
}
}
