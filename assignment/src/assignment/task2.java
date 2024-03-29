package assignment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class task2 extends JFrame implements ActionListener {
	 JTextField t;
	 JButton a;

	
	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);
    

    task2(){
    	 setSize(630,570);

         setLayout(null);

 	setTitle("EXAM DETAILS");

 	setResizable(false);

   	setLocation(300,160);
    	
		t=new JTextField("");
    	t.setBounds(30,30,100,30);
    	add(t);
    	a=new JButton("Add");
    	a.setBounds(350,30,100,30);
    	add(a);
    	
    
    	scrlPane.setBounds(0,80,627,200);
    add(scrlPane);
    

     
     model.addColumn("E_ID");
     model.addColumn("E_NAME");
     model.addColumn("YOE");
     model.addColumn("DOJ");
     model.addColumn("Designation");
    
    
	 setVisible(true);
	 a.addActionListener(this);

}
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    	 
    	 if(e.getSource()==a) {
 			int r=0;
 			try{
 				 Class.forName("com.mysql.jdbc.Driver");
 				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
 				 Statement stmt= con.createStatement();
 				int id=Integer.parseInt(t.getText());
 				 String s="select *from task where EmpID='"+id+"'";
 				ResultSet rs = stmt.executeQuery(s );
 					
 				 while(rs.next())
 	             {
 	             	model.insertRow(r++, new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5) });
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
		new task2();

	}

	

}
