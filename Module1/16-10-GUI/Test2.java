import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test2 implements ActionListener
{
	JFrame frame;
	JButton btn1,btn2;
	
	
	public Test2() 
	{
		
		
		frame =new JFrame();
		
		btn1 = new JButton("+");
		btn1.setBounds(150, 232, 47, 23);
		
		btn2 = new JButton("-");
		btn2.setBounds(210, 232, 47, 23);
		
		/*
		 * btn1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * } });
		 * 
		 * btn2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * } });
		 */
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			
		}
		if(e.getSource()==btn2)
		{
			
		}
	}

}
