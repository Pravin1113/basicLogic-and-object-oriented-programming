package assignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;
public class task extends Frame implements ActionListener {
	
	JButton b,c;
	JLabel l1,l2,l3,l4,l5, la;
	JTextField t1,t2,t3,t4,t5;
	task(){
		setLayout(null);
		 la = new JLabel("ADD EMPLOYEE");
		la.setBounds(50,20,100,30);
		l1=new JLabel("employee ID");
		l1.setBounds(50,50,100,30);
		t1=new JTextField("");
		t1.setBounds(170,50,200,30);
		l2=new JLabel("Ename");
		l2.setBounds(50,90,100,30);
		t2=new JTextField("");
		t2.setBounds(170,90,200,30);
		l3=new JLabel("year of Experience");
		l3.setBounds(50,130,100,30);
		t3=new JTextField("");
		t3.setBounds(170,130,200,30);
		l4=new JLabel("Date of joining");
		l4.setBounds(50,170,100,30);
		t4=new JTextField("");
		t4.setBounds(170,170,200,30);
		l5=new JLabel("Designation");
		l5.setBounds(50,210,100,30);
	    t5 = new JTextField("");
		t5.setBounds(170,210,200,30);
		b=new JButton("Save");
		b.setBounds(100,280,100,30);
		add(b);
		c=new JButton("cancel");
		c.setBounds(250,280,100,30);
		add(c);
		add(l1);add(l2);add(l3);add(l4);;add(t1);add(t2);add(t3);add(t4);add(t5);add(l5);add(la);
		setSize(500,500);
		 setVisible(true);
		 setTitle("login");
		 setLocation(500,300);
		 b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) 
			 try{
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
				 int id=Integer.parseInt(t1.getText());
				 String name= t2.getText();
				 int YOE=Integer.parseInt(t3.getText());
				 String DOJ=t4.getText();
				 String des=t5.getText();
				
				 
				 
			PreparedStatement ps= con.prepareStatement("insert into task value (?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, YOE);
			ps.setString(4, DOJ);
			ps.setString(5, des);
			int k=ps.executeUpdate();
			if(k>0){
				JOptionPane.showMessageDialog(this,"record insert");
			}
			else{
				JOptionPane.showMessageDialog(this,"record  not insert");
			}
			con.close();
			
			
			
		
		 }catch(Exception e1){
			 
	
		 }
		
	
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new task();

	}

}
