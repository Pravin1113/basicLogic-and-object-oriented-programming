package sqljava;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import com.mysql.jdbc.PreparedStatement;


 
	public class proj extends Frame implements ActionListener
 {
		 JButton b,b1;
	     JLabel l1,l2,l3,l4,l5;
	     JTextField t1,t2,t3;
	     String[] s={"id","name","phone","course"};
	     Connection con;
    	 PreparedStatement inset;
	     proj(){
	    	 
	     setLayout(null);
	     l1=new JLabel("Student name");
		 add(l1);
	    l1.setBounds(50,50,100,30);
	    l2=new JLabel("mobile ");
		add(l2);
	    l2.setBounds(50,100,100,30);
	    l3=new JLabel("course");
		 add(l3);
	    l3.setBounds(50,150,100,30);
	    t1=new JTextField(20);
		add(t1);
		t1.setBounds(170,50,100,30);
		t2=new JTextField(20);
		add(t2);
		t2.setBounds(170,100,100,30);
		t3=new JTextField(20);
		add(t3);
		t3.setBounds(170,150,100,30);
		b=new JButton("add");
		add(b);
		b.setBounds(50, 200, 100, 30);
		b1=new JButton("delete");
		b1.setBounds(150, 200, 100, 30);
		add(b1);
		JTable jt=new JTable(10,4);
        JScrollPane pane=new JScrollPane(jt);
        pane.setBounds(300,50,300,400);
        add(pane);
		setSize(800,500);
		setVisible(true);
		setTitle("Login");
		setLocation(500,300);
		b.addActionListener(this);
	
		
	}
	     
	     public static void main(String[] args) 
			{
				new proj();

			}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 String name=t1.getText();
	    	 String mobile=t2.getText();
	    	 String course=t3.getText();
	    	 if(e.getSource()==b)
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
	    	 JOptionPane.showMessageDialog(this,"Driver reg");
	 		Connection con1;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			JOptionPane.showMessageDialog(this,"conn sucess");
	 		try {
				inset=(PreparedStatement) con.prepareStatement("insert into  student(name,mobile,course)values(?,?,?)");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		try {
				inset.setString(1,name);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		try {
				inset.setString(2, mobile);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	 		try {
				inset.setString(2, course);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		try {
				inset.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		JOptionPane.showMessageDialog(this,"record added");
	     }
		}
	
	    