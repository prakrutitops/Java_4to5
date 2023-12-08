import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2,btn3,btn4;
	JPanel jp,jp2;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 =new JTextField(20);
		tf2 =new JTextField(20);
		btn1 =new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String name = tf1.getText().toString();
				String surname = tf2.getText().toString();
				
				String host="jdbc:mysql://localhost:3306/";
				String db="test";
				String url=host+db;
				
				
				//Class is a one class and forname is a method for driver connectivity
				
				try 
				{
					//connection establish
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					//Query Write
					String query = "insert into details values(null,'"+name+"','"+surname+"')";
					
					//Query Run 
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(query);
					
					if(status>0)
					{
						insertframe.setVisible(false);
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
		
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="test";
		String url=host+db;
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			//Query
			String query ="Select * from details";
			
			
			
			//Query Run 
			Statement stmt = con.createStatement();
			
			//fetch -> Resulset->data fetch bulk
			ResultSet set = stmt.executeQuery(query);
			
			System.out.println("Name \t"+" "+"Surname \t");
			
			//divide
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				
				System.out.println(name+" "+"\t"+surname);
				
			}
			
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void updatedata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="test";
		String url=host+db;
	
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			updateframe = new JFrame();
			
			jp = new JPanel();
			jp2 = new JPanel();
			
			tf1 = new JTextField(20);
			tf2 = new JTextField(20);
			tf3 = new JTextField(20);
			btn3 = new JButton("Edit");
			btn4 = new JButton("Update");
			
			jp.add(tf3);
			jp.add(btn3);
			
			jp2.add(tf1);
			jp2.add(tf2);
			jp2.add(btn4);
			jp2.setVisible(false);
			jp.add(jp2);
			
			
			btn3.addActionListener(new ActionListener() {
				
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					jp2.setVisible(true);
					jp.setVisible(false);
					
					String host="jdbc:mysql://localhost:3306/";
					String db="test";
					String url=host+db;
					String id = tf3.getText().toString();
				
						try 
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(url,"root","");

							String query = "select * from details where id='"+id+"'";
							Statement stmt = con.createStatement();
							
							ResultSet set = stmt.executeQuery(query);
							
							if(set.next())
							{
								int id1 = set.getInt(1);
								String name = set.getString(2);
								String surname = set.getString(3);
								
								tf1.setText(name);
								tf2.setText(surname);
								
								
								btn4.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
									
										
										String host="jdbc:mysql://localhost:3306/";
										String db="test";
										String url=host+db;
										
										
										try 
										{
											Class.forName("com.mysql.jdbc.Driver");
											Connection con = DriverManager.getConnection(url,"root","");
											
											String name = tf1.getText().toString();
											String surname = tf2.getText().toString();
									
											String query = "update details set name='"+name+"',surname='"+surname+"'where id='"+id+"'"; 
										
											Statement stmt = con.createStatement();
											
											int data = stmt.executeUpdate(query);
											
											if(data>0)
											{
												updateframe.setVisible(false);
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
							
							}
							
							
							
						}
						catch (Exception e1) 
						{
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
					
					
				}
			});
			
			
			
			updateframe.add(jp);
			updateframe.add(jp2);
			updateframe.setSize(500,500);
			updateframe.setLayout(new FlowLayout());
			updateframe.setVisible(true);
			
			
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}
	
	
	
	
	public void deletedata()
	{
		deleteframe = new JFrame();
		tf3 = new JTextField(10);
		btn2 = new JButton("Delete");
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String host="jdbc:mysql://localhost:3306/";
				String db="test";
				String url=host+db;
				String id = tf3.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String query = "delete from details where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(query);
					
					if(data>0)
					{
						deleteframe.setVisible(false);
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
		
		deleteframe.add(tf3);
		deleteframe.add(btn2);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
	}
	
	
}
