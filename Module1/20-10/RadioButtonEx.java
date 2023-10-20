import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class RadioButtonEx implements ActionListener
{
	JFrame frame;
	JRadioButton rb1,rb2;
	JPanel jp,jp2;
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton btnlogin;
	
	public RadioButtonEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		rb1 = new JRadioButton("Admin");
		rb1.setBounds(113, 7, 109, 23);
		rb1.setSelected(true);
		
		
		rb2 = new JRadioButton("Manager");
		rb2.setBounds(284, 7, 109, 23);
		
		l1 = new JLabel("");
		l1.setBounds(200, 90, 109, 23);
		
		l2 = new JLabel("");
		l2.setBounds(200, 90, 109, 23);
		
		tf1 = new JTextField(10);
		tf1.setBounds(230, 147, 86, 20);
		
		tf2 = new JTextField(10);
		tf2.setBounds(230, 191, 86, 20);
		
		btnlogin = new JButton("Login");
		btnlogin.setBounds(230, 257, 89, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(l1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new RadioButtonEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==rb1)
		{
			l1.setText("xyz");
		}
		
		if(e.getSource()==rb2)
		{
			l1.setText("abc");
		}
	}
}
