import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task1 
{
	JFrame frame;
	JLabel fl,ll,el,pl,cl;
	JTextField tfname,tfsurname,tfemail;
	JButton btnsubmit;
	JPasswordField tfpass,tfcpass;
	
	public Task1() 
	{
		frame = new JFrame();
		
		fl =new JLabel("Firstname: ");
		fl.setBounds(65, 60, 90, 14);
		
		ll =new JLabel("Lastname: ");
		ll.setBounds(65, 90, 90, 14);
		
		el =new JLabel("Email: ");
		el.setBounds(65, 120, 90, 14);
		
		pl =new JLabel("Password: ");
		pl.setBounds(65, 150, 90, 14);
		
		cl =new JLabel("Confirm Pass: ");
		cl.setBounds(65, 180, 90, 14);
		
		tfname = new JTextField();
		tfname.setBounds(176, 60, 186, 20);
		
		tfsurname =new JTextField();
		tfsurname.setBounds(176, 90, 186, 20);
		
		tfemail = new JTextField();
		tfemail.setBounds(176, 120, 186, 20);
		
		tfpass =new JPasswordField();
		tfpass.setBounds(176, 150, 186, 20);
		
		tfcpass = new JPasswordField();
		tfcpass.setBounds(176, 180, 186, 20);
		
		btnsubmit =new JButton("Submit");
		btnsubmit.setBounds(150, 225, 89, 23);
		
		btnsubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				
				
				
				try 
				{
					String name = tfname.getText().toString();
					String surname = tfsurname.getText().toString();
					String email = tfemail.getText().toString();
					String pass = tfpass.getText().toString();
					String cpass = tfcpass.getText().toString();
					
					String name1 = "\n Your Name is :";
					String surname1 = "\n Your Surname is : "; 
					String email1= "\n Your Email is : ";
					String pass1 = "\n Your Password is : ";
					String cpass1 = "\n Your Confirm Password is: ";
					
					if(pass.equals(cpass))
					{
						FileOutputStream fout = new FileOutputStream("E://topstech.txt");
						fout.write(name1.getBytes());
						fout.write(name.getBytes());
						fout.write(surname1.getBytes());
						fout.write(surname.getBytes());
						fout.write(email1.getBytes());
						fout.write(email.getBytes());
						fout.write(pass1.getBytes());
						fout.write(pass.getBytes());
						fout.write(cpass1.getBytes());
						fout.write(cpass.getBytes());
					}
					else
					{
						System.out.println("Your Password and Confirm Password are not same");
					}
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("success");
				
				
				
			}
		});
		
		frame.add(fl);
		frame.add(ll);
		frame.add(el);
		frame.add(pl);
		frame.add(cl);
		frame.add(tfname);
		frame.add(tfsurname);
		frame.add(tfemail);
		frame.add(tfpass);
		frame.add(tfcpass);
		frame.add(btnsubmit);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Task1();
	}
}
