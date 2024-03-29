package sqljava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class font implements ItemListener
{
	Choice c,d;
	Checkbox c1,c2,c3;
	JTextField tf;
	static String style,size;
	int sz;
	font(Choice C,Choice D,JTextField t,Checkbox C1,Checkbox C2,Checkbox C3)
	{
		c=C;
		d=D;
		tf=t;
		c1=C1;
		c2=C2;
		c3=C3;
	}
	public void itemStateChanged(ItemEvent e)
	{
		style=c.getSelectedItem();
		size=d.getSelectedItem();
		sz=Integer.parseInt(size);
		tf.setFont(new Font(style,Font.PLAIN,sz));
		if(c1.getState())
		{
			tf.setFont(new Font(style,Font.BOLD,sz));
		}
		if(c2.getState())
		{
					tf.setFont(new Font(style,Font.ITALIC,sz));
		}
		if(c1.getState() && c2.getState())
		{
			tf.setFont(new Font(style,Font.BOLD + Font.ITALIC,sz));
		}
		/*if(c3.getState())
				{
					tf.setFont(new Font(style,Font.UNDERLINE_ON,sz));
		}*/
	}
}

class GUI
{
	public static void main(String a[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(null);
		Choice c=new Choice();
		c.add("Century Schoolbook L");
		c.add("DejaVu Sans");
		c.add("Hershey-Script-Simplex");
		c.add("KacstTitleL");
		c.add("Nimbus Mono L");
		c.add("URW Chancery L");
		c.setBounds(140,100,150,30);
		Choice d=new Choice();
		d.add("10");
		d.add("12");
		d.add("14");
		d.add("16");
		d.setBounds(140,160,150,30);
		Checkbox cb1=new Checkbox("Bold");
		Checkbox cb2=new Checkbox("Italic");
		Checkbox cb3=new Checkbox("Underline");
		cb1.setBounds(300,100,50,20);
		cb2.setBounds(300,130,50,20);
        cb3.setBounds(300,160,50,20);
        JTextField tf=new JTextField(50);
        tf.setBounds(140,200,200,50);
        f.add(tf);
		f.add(c);
		f.add(d);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(tf);
		c.addItemListener(new font(c,d,tf,cb1,cb2,cb3));
		d.addItemListener(new font(c,d,tf,cb1,cb2,cb3));
		cb1.addItemListener(new font(c,d,tf,cb1,cb2,cb3));
		cb2.addItemListener(new font(c,d,tf,cb1,cb2,cb3));
		cb3.addItemListener(new font(c,d,tf,cb1,cb2,cb3));
		f.setVisible(true);
	}
}
