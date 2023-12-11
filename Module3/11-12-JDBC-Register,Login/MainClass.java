import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainClass implements ActionListener
{
	JFrame frame;
	JButton Reg, Lin;
	JLabel wel;
	
	public MainClass() 
	{
		
		frame = new JFrame("Welcome Page");
		frame.setSize(450, 300);
		
		Reg = new JButton("Sign Up");
		Reg.setBounds(144, 55, 101, 38);
		Reg.addActionListener(this);
		
		Lin = new JButton("Login");
		Lin.setBounds(144, 125, 101, 38);
		Lin.addActionListener(this);
		
		wel = new JLabel("WELCOME");
		wel.setBounds(166, 11, 61, 38);
		frame.add(Reg);
		frame.add(Lin);
		frame.add(wel);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Operations o1 = new Operations();
		
		if(e.getSource()==Reg)
		{
			o1.Register();
		}
		if(e.getSource()==Lin)
		{
			o1.Login();
		}
	}
}
