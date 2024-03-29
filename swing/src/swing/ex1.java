package swing;


	import java.awt.*;

	import javax.swing.*;

	import java.awt.event.*;//1
	public class ex1 extends JFrame implements ActionListener//2

	{   JLabel lblun,lblpsw,lblres; 
	JTextField t1,t2,t3;

		JButton b1,b2,b3,b4,b5;

		ex1()
		{
			setLayout(null);
			
			lblun=new JLabel("Number1");
			add(lblun);
			
			
			lblun.setBackground(Color.BLUE);
			lblun.setForeground(Color.RED);
			t1=new JTextField(20);
			add(t1);
			lblpsw=new JLabel("Number2");
			add(lblpsw);
			
			t2=new JTextField(20);
			add(t2);
			lblres=new JLabel("Number3");
			add(lblres);
			
			t3=new JTextField(20);
			add(t3);
			b1=new JButton("Addition");
			add(b1);
			b2=new JButton("Max");
			add(b2);
			b3=new JButton("Power");
			add(b3);
			b4=new JButton("Atm");
			add(b4);
			b5=new JButton("Sum of Digit");
			add(b5);
			lblun.setBounds(100,100,100,20);//x,y,w,h
			t1.setBounds(230,100,100,20);
			
			lblpsw.setBounds(100,140,100,20);//x,y,w,h
			t2.setBounds(230,140,100,20);
			lblres.setBounds(100,180,100,20);//x,y,w,h
			t3.setBounds(230,180,100,20);
			
			b1.setBounds(120, 240, 100, 20);b2.setBounds(260, 240, 100, 20);b3.setBounds(380, 240, 100, 20);
			b4.setBounds(500, 240, 100, 20);b5.setBounds(600, 240, 100, 20);
			b1.addActionListener(this);//3
			b2.addActionListener(this);
			b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);
			setSize(800,500);
			setVisible(true);
			setTitle("Login");
			setLocation(500,300);
			
		}
		
		public static void main(String[] args) 
		{
			new ex1();

		}

		@Override
		public void actionPerformed(ActionEvent e)//4
		{
			int a,b,c;
			if(e.getSource()==b1)//5
			{
			
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a+b;
				t3.setText(Integer.toString(c));			
			}
			if(e.getSource()==b2)
			{
				
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=(a>b)?a:b;
				t3.setText(""+c);	
			}
			if(e.getSource()==b3)
			{
				
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				int f1=1,i;
				for(i=1;i<=b;i++)
					f1=f1*a;
				t3.setText(""+f1);	
			}
			if(e.getSource()==b4)
			{
				
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				if(a>b)
				t3.setText("Insuffient Balance");	
				else
					t3.setText("BAlance"+(a-b));	
			}
			if(e.getSource()==b5)
			{
				int n1,sum=0;
				a=Integer.parseInt(t1.getText());
				while(a>0)
				{
					n1=a%10;
					a=a/10;
					sum=sum+n1;
				}
				
				JOptionPane.showMessageDialog(null, "Sum of digit"+sum);
					
			}
		}

	}

	