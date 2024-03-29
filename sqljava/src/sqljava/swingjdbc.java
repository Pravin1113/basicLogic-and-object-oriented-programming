package sqljava;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;
import java.util.Objects;

public  class swingjdbc extends JFrame implements ActionListener{
    DefaultTableModel tm;
    int a;
    JTable t ;
    JLabel lb1,lb2,lb3;
    JComboBox jcb;
    JButton up,dl,ad,dp;
    JTextField tf1,tf2,tf3;
    Connection con;
    int rn,mr;
    String nm;
    Statement stmt;
    ResultSet rs;
    JTextArea ta1,ta2;
    String [] a1 = new String[10];
   int idx=0;
    JScrollPane jsp ;
    public swingjdbc(){
        setLayout(null);
        setVisible(true);
        setBounds(150,20,950,600);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            JOptionPane.showMessageDialog(null,"Driver registered");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slips","root","");
            JOptionPane.showMessageDialog(null,"Connected");
            stmt = con.createStatement();
            String s1 = "select * from student;";
            rs = stmt.executeQuery(s1);
            t = new JTable(0,0);
            DefaultTableModel model = new DefaultTableModel();
            t.setModel(model);
            model.addColumn("Roll no");
            model.addColumn("Name");
            model.addColumn("Marks");
            jsp = new JScrollPane(t);
            add(jsp);
            jsp.setBounds(520,100,350,250);
            tm = (DefaultTableModel) t.getModel();
            tm.setRowCount(0);
            while (rs.next()){
                Object o [] ={Integer.toString(rs.getInt(1)),rs.getString(2),Integer.toString(rs.getInt(3))};
                tm.addRow(o);
            }
            try{
                int idx1=0;
                stmt = con.createStatement();
                String s2 = "select * from student;";
                rs = stmt.executeQuery(s2);

                while (rs.next()){
                    a1[idx] = Integer.toString(rs.getInt(1));
                    idx++;
                }
                JOptionPane.showMessageDialog(null,idx);
                while (rs.next()){
                    if(a1[idx1].equals(Integer.toString(rs.getInt(1)))){
                        remove(rs.getInt(1));
                    }
                }

            }catch (Exception e6){
                JOptionPane.showMessageDialog(null,e6);
            }
        }catch (Exception e1){
            JOptionPane.showMessageDialog(null,e1);
        }
        lb1 = new JLabel("Roll no : ");
        add(lb1);
        lb1.setBounds(100,70,100,100);
        tf1 = new JTextField();
        add(tf1);
        tf1.setBounds(250,105,250,30);
        lb2 = new JLabel("Name : ");
        add(lb2);
        lb2.setBounds(100,120,100,100);
        tf2 = new JTextField();
        add(tf2);
        tf2.setBounds(250,155,250,30);
        lb3 = new JLabel("Marks : ");
        add(lb3);
        lb3.setBounds(100,170,100,100);
        tf3 = new JTextField();
        add(tf3);
        tf3.setBounds(250,205,250,30);
        ad = new JButton("Add");
        add(ad);
        ad.setBounds(100,275,90,30);
        dl = new JButton("Del");
        add(dl);
        dl.setBounds(200,275,90,30);
        up = new JButton("Upd");
        add(up);
        up.setBounds(300,275,90,30);
        ta1 = new JTextArea(5,5);
        add(ta1);
        ta1.setBounds(100,320,180,30);
        
        ta2 = new JTextArea(5,5);
        add(ta2);
        ta2.setBounds(310,320,180,30);
       
        jcb = new JComboBox<>(a1);
        add(jcb);
        jcb.setBounds(400,275,90,30);
        ad.addActionListener(this);
        dl.addActionListener(this);
        up.addActionListener(this);
        jcb.addActionListener(this);
           
       
           
       
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ad)
		 try{
             rn = Integer.parseInt(tf1.getText());
             nm = tf2.getText();
             mr = Integer.parseInt(tf3.getText());
             String sql = "insert into student values("+rn+",'"+nm+"',"+mr+")";
             stmt = con.createStatement();
             int i = stmt.executeUpdate(sql);
             if(i>0){
                 JOptionPane.showMessageDialog(null,"Save successfully");
                 Object o [] = {rn,nm,mr};
                 tm.addRow(o);
             }else {
                 JOptionPane.showMessageDialog(null,"Not Save successfully");
             }
             tf1.setText("");
             tf2.setText("");
             tf3.setText("");
         }catch (Exception  e2){
             JOptionPane.showMessageDialog(null,e2);
         }
     
	if(e.getSource()==dl)
	try{
        rn = Integer.parseInt(tf1.getText());
        String sql = " delete from student where rollno="+rn+" ";
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){

        }
        int i = stmt.executeUpdate(sql);
        if(i == 0){
            JOptionPane.showMessageDialog(null,"Not Deleted");
        }else {
            JOptionPane.showMessageDialog(null,"Deleted");
            tm.removeRow(i);
        }
        con.close();
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }catch (Exception e3){
        JOptionPane.showMessageDialog(null,e3);
    }
	
	if(e.getSource()==up)
	try{
        rn = Integer.parseInt(tf1.getText());
        nm = tf2.getText();
        mr = Integer.parseInt(tf3.getText());
        String sql = "update student set name='"+nm+"',marks="+mr+" where rollno="+rn+"";
        stmt = con.createStatement();
        int i =  stmt.executeUpdate(sql);
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
	if(e.getSource()==jcb)
	try{
        a = Integer.parseInt(Objects.requireNonNull(jcb.getSelectedItem()).toString());
       stmt =con.createStatement();
       String sql = "select * from student where rollno="+a;
       rs = stmt.executeQuery(sql);
       while (rs.next()){
              ta1.setForeground(Color.green);
              ta2.setForeground(Color.CYAN);
              ta1.setText(rs.getString(2));
              ta2.setText(Integer.toString(rs.getInt(3)));
       }
   }catch (Exception e5){
       JOptionPane.showMessageDialog(null,e5);
   }
}
	


public static void main(String[] args) {
    new swingjdbc();
}
}