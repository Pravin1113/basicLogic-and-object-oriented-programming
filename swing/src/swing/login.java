package swing;
import java.awt.*;

import javax.swing.*;
public class login  extends Frame{
        JButton b,b1;
        JLabel l1,l2;
        JTextField t1,t2;
        login(){
        setLayout(null);
        
        l1=new JLabel("User name");
        l1.setBounds(50,50,100,30);
        t1=new JTextField("admin");
        t1.setBounds(170,50,200,30);
        
        l2=new JLabel("password");
        l2.setBounds(50,100,100,30);
        t2=new JTextField();
        t2.setBounds(170,100,200,30);
        b=new JButton("login");
		b.setBounds(50, 200, 95, 30);
		add(b);
		b1=new JButton("reset");
		b1.setBounds(260, 200, 95, 30);
		add(b1);
		add(l1);add(l2);add(t1);add(t2);
		setSize(500,500);
		 setVisible(true);
		 setTitle("login");
		 setLocation(500,300);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new login();

	}

}
