import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Search extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton addd;
	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);
	Search(){
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
		 addd=new JButton("Show");
		 
		
		 add(l1); add(t1);
		 add(l2);  add(t2);
		 add(l3);  add(t3);
		 add(addd); 
		 
		 addd.addActionListener(this);
		 scrlPane.setBounds(0,430,627,200);
		   add(scrlPane);
		    tabGrid.setFont(new Font ("Verdana",0,13));
		    
		    model.addColumn("name");
		 
		    model.addColumn("Address");
		    model.addColumn("salary");
		  
		 }

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addd) {
			int r=0;
			try{
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","");
				 Statement stmt= con.createStatement();
				 String s1=t1.getText();
				 String s="select *from emp where name='"+s1+"'";
				ResultSet rs = stmt.executeQuery(s );
					
	                while(rs.next())
	                {
	                	model.insertRow(r++, new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)  });
	                }

	            }

	            catch(Exception ex)
	            {
	                    JOptionPane.showMessageDialog(null,"Error Occured : " + ex);
	            }
	                }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Search();
	}
	}


