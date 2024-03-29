package swing;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class task2 extends Frame  {
	 JButton b,b1;
     JLabel l1,l2,l3,l4,l5;
     JTextField t1,t2,t3,t4,t5;
     task2(){
     setLayout(null);
     
     l1=new JLabel("employee no");
     l1.setBounds(50,50,100,30);
     t1=new JTextField("");
     t1.setBounds(170,50,200,30);
     l2=new JLabel("name");
     l2.setBounds(50,100,100,30);
     t2=new JTextField();
     t2.setBounds(170,100,200,30);
     l3=new JLabel("adress");
     l3.setBounds(50,150,100,30);
     t3=new JTextField("");
     t3.setBounds(170,150,200,30);
     l4=new JLabel("Email");
     l4.setBounds(50,200,100,30);
     t4=new JTextField("");
     t4.setBounds(170,200,200,30);
     add(l1);add(t1);add(t2);add(l2);add(l3);add(t3);add(l4);add(t4);
     setSize(500,500);
	 setVisible(true);
	 setTitle("login");
	 setLocation(500,300);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new task2();
	}

}
