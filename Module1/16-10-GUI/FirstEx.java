import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstEx implements ActionListener
{
	//Declare
	
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	
	public FirstEx() 
	{
		
		//Initialize
		
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(150, 100, 120, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(150, 140, 120, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(150, 180, 120, 20);
		tf3.setEditable(false);
		
		
		btn1 = new JButton("+");
		btn1.setBounds(150, 232, 47, 23);
		
		btn2 = new JButton("-");
		btn2.setBounds(210, 232, 47, 23);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//ActionListener
		
		
		/*
		 * btn1 = new JButton("Button 1"); btn1.setBounds(10, 176, 89, 23);
		 * 
		 * btn2 = new JButton("Button 2"); btn2.setBounds(100, 176, 89, 23);
		 * 
		 * btn3 = new JButton("Button 3"); btn3.setBounds(190, 176, 89, 23);
		 * 
		 * btn4 = new JButton("Button 4"); btn4.setBounds(270, 176, 89, 23);
		 */
		
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new FirstEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c= 0;
		
		if(e.getSource()==btn1)
		{
			c =Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btn2)
		{
			c = Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
	}
	
}
