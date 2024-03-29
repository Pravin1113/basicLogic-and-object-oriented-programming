import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class delete extends JFrame implements ActionListener{

	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton addd;
	
	delete(){
	setVisible(true);
	setSize(500,500);
	 setBackground(Color.red);
	 setLayout(new FlowLayout());
	 l1=new JLabel("name");
	 l2=new JLabel("address");
	 l3=new JLabel("salary");
	 t1=new JTextField(10);
	 t2=new JTextField(10);
	 t3=new JTextField(10);
	 addd=new JButton("delete");
	 
	
	 add(l1); add(t1);
	 add(l2);  add(t2);
	 add(l3);  add(t3);
	 add(addd); 
	 
	 addd.addActionListener(this);
	  
	 }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addd)
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","");
				 PreparedStatement pst = con.prepareStatement("Delete from emp where name=?");
			    	
   		      String tid1=t1.getText();
     	          pst.setString(1,tid1);
     
                 JOptionPane.showMessageDialog(null,"Record Is Deleted ");
                 pst.executeUpdate();
				 
				 
				 
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new	delete();

	}

}
