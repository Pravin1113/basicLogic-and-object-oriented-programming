
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.net.aso.l;

public class UPDATE extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton update;
	
	
	UPDATE(){
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
		 update=new JButton("insert");
		 
		
		 add(l1); add(t1);
		 add(l2);  add(t2);
		 add(l3);  add(t3);
		 add(update); 
	update.addActionListener( this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		if(e.getSource()==update) {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","");
			Statement st=con.createStatement();

			String l1=t1.getText();
		   					

		String l2=t2.getText();
		String l3=t3.getText().toString();
                         
			    					
		   String str1="UPDATE emp SET address='"+l2+"',salary="+l3+" where name LIKE '" +  l1 +"' ";
			st.executeUpdate(str1);
			JOptionPane.showMessageDialog(null, "Record is Modified");
		}
				catch(Exception e1) {
					
				}
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new UPDATE();
	}
	
	

}
