import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Operations 
{
	
	String host="jdbc:mysql://localhost:3306/";
	String dbname="test";
	String url=host+dbname;
	
	JFrame Lgin, Sup;
	JTextField Uname, Fname, Email;
	JPasswordField Pass;
	JLabel Un, Fn, Em, Ps, Er;
	JButton Log, Sig;
	String iun,ips;
	
	public void Register()
	{
		
		Sup = new JFrame("Sign up here!");
		Sup.setSize(450, 300);
		Sup.setLayout(null);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Fn = new JLabel("Full Name");
		Fn.setBounds(44, 107, 70, 17);
		
		Em = new JLabel("Email Id");
		Em.setBounds(44, 145, 70, 17);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Fname = new JTextField();
		Fname.setBounds(115, 104, 195, 20);
		
		Email = new JTextField();
		Email.setBounds(115, 142, 195, 20);
		
		Sig = new JButton("Sign Up");
		Sig.setBounds(115, 188, 89, 23);
		Sig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String fname = Fname.getText().toString();
				String uname = Uname.getText().toString();
				String email = Email.getText().toString();
				String pass = Pass.getText().toString();
				
				
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "insert into data (fname,uname,email,password) values ('"+fname+"','"+uname+"','"+email+"','"+pass+"')";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						Sup.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		Sup.add(Em);
		Sup.add(Email);
		Sup.add(Ps);
		Sup.add(Fn);
		Sup.add(Fname);
		Sup.add(Un);
		Sup.add(Uname);
		Sup.add(Pass);
		Sup.add(Sig);
		Sup.setVisible(true);
		
	}
	public void Login()
	{
		Lgin = new JFrame("Sign up here!");
		Lgin.setSize(450, 300);
		Lgin.setLayout(null);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Log = new JButton("Log In");
		Log.setBounds(115, 188, 89, 23);
		Log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String uname = Uname.getText().toString();
				String pass = Pass.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql = "select uname,password from data where uname ='"+uname+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						iun = set.getString(1);
						ips = set.getString(2);
						
						if(ips.equals(pass))
						{
							JOptionPane.showMessageDialog(Log, "Login Successfull");
							Lgin.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(Log, "Wrong Passowrd!!\nLogin unsuccessfull");
						}
						
					}
					else
					{
						JOptionPane.showMessageDialog(Log, "Username is wrong !!\nLogin unsuccessfull");

					}
					
				
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
			}
		});
		
		
		Lgin.add(Un);
		Lgin.add(Uname);
		Lgin.add(Ps);
		Lgin.add(Pass);
		Lgin.add(Log);
		Lgin.setVisible(true);
	}
	
	
	
	
	
	
}
