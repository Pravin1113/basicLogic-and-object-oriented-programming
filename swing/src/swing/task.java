package swing;
import java.awt.*;

import javax.swing.*;
public class task extends Frame {
	private static final String EXIT_ON_CLOSE = null;
	JButton b;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	task(){
		setLayout(null);
		l1=new JLabel("employee no");
		l1.setBounds(50,50,100,30);
		t1=new JTextField("");
		t1.setBounds(170,50,200,30);
		l2=new JLabel("name");
		l2.setBounds(50,90,100,30);
		t2=new JTextField("");
		t2.setBounds(170,90,200,30);
		l3=new JLabel("Adress");
		l3.setBounds(50,130,100,30);
		t3=new JTextField("");
		t3.setBounds(170,130,200,30);
		l4=new JLabel("email");
		l4.setBounds(50,160,100,30);
		t4=new JTextField("");
		t4.setBounds(170,170,200,30);
		l5=new JLabel("phone no");
		l5.setBounds(50,200,100,30);
		t5=new JTextField("");
		t5.setBounds(170,210,200,30);
		b=new JButton("Sign up");
		b.setBounds(150,280,100,30);
		add(b);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(t1);add(t2);add(t3);add(t4);add(t5);
		setSize(500,500);
		 setVisible(true);
		 setTitle("login");
		 setLocation(500,300);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
     
	private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new task();

	}

}
