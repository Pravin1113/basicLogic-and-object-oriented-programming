package sqljava;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Slip_12_2 extends JFrame implements ActionListener{
	  JLabel l1,l2,l3;
	  JTextField t1,t2,t3;
	  JButton b1,b2;
	  Connection con;
	  PreparedStatement st;
	  Slip_12_2(){
		  setVisible(true);
		  setSize(500,500);
		  setBackground(Color.red);
		 setLayout(new FlowLayout());
		 l1=new JLabel("account no:");
		 l2=new JLabel("account type:");
		 l3=new JLabel("account balance:");
		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 t3=new JTextField(10);
		 b1=new JButton("insert");
		 b2= new JButton("exit");
		 Panel p=new Panel();
		 p.setLayout(new GridLayout(6,2));
		 p.add(l1); p.add(t1);
		 p.add(l2);  p.add(t2);
		 p.add(l3);  p.add(t3);
		 p.add(b1);  p.add(b2);
		 add(p);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
			 
		 }catch(Exception e){
			 
		 }
	  }
	  

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1){
			try{
				int no=Integer.parseInt(t1.getText());
				String a=t2.getText();
				int ab=Integer.parseInt(t3.getText());
				st=con.prepareStatement("insert into account values(?,?,?)");
				st.setInt(1,no);
				st.setString(2,a);
				st.setInt(3,ab);
				int k=st.executeUpdate();
				if(k>0){
					JOptionPane.showMessageDialog(this,"record insert");
				}
				else{
					JOptionPane.showMessageDialog(this,"record  not insert");
				}
				
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(this,e1);
			}
		}
		if(e.getSource()==b2){
			dispose();
		}
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
    new Slip_12_2();
}
}

