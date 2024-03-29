package swing;
import java.awt.*;

import javax.swing.*;

public class butten extends Frame{
	JButton b,b1;
	butten(){
		setLayout(null);
		b=new JButton("login");
		b.setBounds(50, 100, 95, 30);
		add(b);
		b1=new JButton("reset");
		b1.setBounds(160, 100, 95, 30);
		add(b1);
		setSize(500,500);
		 setVisible(true);
		 setTitle("login");
		 setLocation(500,300);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new butten();   
	}

}
