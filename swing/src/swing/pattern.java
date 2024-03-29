package swing;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class pattern extends JFrame implements ActionListener//2
 {
	JButton b;
    JLabel l1;
    TextArea t1;
    JTextField t2;
    pattern(){
    setLayout(null);
    Frame f=new Frame();
    
    l1=new JLabel("enter number");
    l1.setBounds(50,50,100,30);
    add(l1);
    t2=new JTextField(20);
	add(t2);
	t2.setBounds(50,90,200,30);
    t1=new TextArea();
    t1.setBounds(50,170,200,50);
    add(t1);
    b=new JButton("print");
    b.setBounds(50, 500, 100, 20);
	add(b);
	b.addActionListener(this);//3
    setSize(500,500);
	 setVisible(true);
	 setTitle("login");
	 setLocation(500,300);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new pattern();
	}
	public void actionPerformed(ActionEvent e)//4
	{
		if(e.getSource()==b){
		int n;
		n=Integer.parseInt(t2.getText());
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
		
				t1.setText("*");

		}
			t1.setText(" ");
			
		}
		}
	}
}
