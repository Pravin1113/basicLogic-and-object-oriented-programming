import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class inseert2 extends JFrame implements ActionListener

{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b;
	
   	public inseert2() {
   		
		setVisible(true);
		setTitle("Inset");
		setLocation(400, 200);
		setSize(500, 500);
		setLayout(null);
		
		
		l1=new JLabel("Name");
		l1.setBounds(50, 50, 100, 30);
		add(l1);
		t1=new JTextField();
		t1.setBounds(130,50,200,30);
		add(t1);
		l2=new JLabel("address");
		l2.setBounds(50, 90, 100, 30);
		add(l2);
		t2=new JTextField();
		t2.setBounds(130,90,200,30);
		add(t2);
		l3=new JLabel("salary");
		l3.setBounds(50, 130, 100, 30);
		add(l3);
		t3=new JTextField();
		t3.setBounds(130,130,200,30);
		add(t3);
		
		b=new JButton("add");
		b.setBounds(80,170,100,30);
		add(b);
		b.addActionListener(this);
		
		
		
		
		
	}
   	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			try {
				Class.forName("com.mysql.cj.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","");
				Statement st=con.createStatement();
				String name=t1.getText();
				int q=st.executeUpdate("delete from emp where name="+name);
				if(q>0) {
				JOptionPane.showMessageDialog(this,"record inserted");
				}
				else{
					JOptionPane.showMessageDialog(this,"record  not insert");
				}
				
				
				
			} catch (Exception e1) {
				
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new inseert2();		
	}



	

}
