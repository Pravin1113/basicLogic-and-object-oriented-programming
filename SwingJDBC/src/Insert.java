import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public  class Insert extends JFrame implements ActionListener {

	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton addd;
	
	Insert(){
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
	 addd=new JButton("insert");
	 
	
	 add(l1); add(t1);
	 add(l2);  add(t2);
	 add(l3);  add(t3);
	 add(addd); 
	 
	 addd.addActionListener(this);
	  
	 }
  

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addd) 
			 try{
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","");
				 String name= t1.getText();
				 String add=t2.getText();
				 int salary=Integer.parseInt(t3.getText());
				 
				 
			PreparedStatement ps= con.prepareStatement("insert into emp value (?,?,?)");
			ps.setString(1, name);
			ps.setString(2, add);
			ps.setInt(3, salary);
			int k=ps.executeUpdate();
			if(k>0){
				JOptionPane.showMessageDialog(this,"record insert");
			}
			else{
				JOptionPane.showMessageDialog(this,"record  not insert");
			}
			
			
			
		
		 }catch(Exception e1){
			 
		 }
	
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Insert();

	}


}