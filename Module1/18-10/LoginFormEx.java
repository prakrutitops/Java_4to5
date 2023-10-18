import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormEx 
{
	JFrame frame;
	JLabel fl,pl;
	JTextField tfname;
	JButton btnsubmit;
	JPasswordField tfpass;
	
	public LoginFormEx() 
	{
		frame = new JFrame();
		
		fl =new JLabel("Firstname: ");
		fl.setBounds(65, 60, 90, 14);
		
		pl =new JLabel("Password: ");
		pl.setBounds(65, 150, 90, 14);
		
		tfname = new JTextField();
		tfname.setBounds(176, 60, 186, 20);
		
		tfpass =new JPasswordField();
		tfpass.setBounds(176, 150, 186, 20);
		
		btnsubmit =new JButton("Submit");
		btnsubmit.setBounds(150, 225, 89, 23);
		
		btnsubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				
				
				
				try 
				{
					String name = tfname.getText().toString();
					String pass = tfpass.getText().toString();
					
					
					
					
					if(pass.equals("1234"))
					{
						new CheckboxEx1();
					}
					else
					{
						System.out.println("Your Password is mot Correct");
					}
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
				
				
			}
		});
		
		frame.add(fl);
		frame.add(pl);
		frame.add(tfname);
		frame.add(tfpass);
		frame.add(btnsubmit);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new LoginFormEx();
	}
}
