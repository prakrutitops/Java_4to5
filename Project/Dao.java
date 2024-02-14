package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import javax.print.attribute.standard.MediaSize.NA;

import com.model.CartModel;
import com.model.ContactModel;
import com.model.FooterEmailModel;
import com.model.ProductModel;
import com.model.SignupModel;
import com.model.WishlistModel;

public class Dao 
{
	
	//Connection Establish
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwingproject","root","");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	//Signup
	
	public static int SignupData(SignupModel m)
	{
		
		int status = 0;
		
			//Connection call
			
			Connection con = Dao.getconnect();
			
			//Statment - PreparedStatement
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into signup (fullname,email,phone,password) values (?,?,?,?)");
			
				ps.setString(1,m.getFullname());
				ps.setString(2,m.getEmail());
				ps.setString(3,m.getPhone());
				ps.setString(4,m.getPassword());
			
				status = ps.executeUpdate();
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return status;
		
	}
	
	//Signin
	
	public static SignupModel Logindata(SignupModel model) 
			{
				
		SignupModel obj = null;

				try {
					Connection con = Dao.getconnect();
					PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
					ps.setString(1, model.getEmail());
					ps.setString(2, model.getPassword());

					ResultSet rs = ps.executeQuery();

					if (rs.next()) 
					{
						obj = new SignupModel();
						obj.setFullname(rs.getString("fullname"));
						obj.setEmail(rs.getString("email"));
						obj.setPhone(rs.getString("phone"));
						obj.setPassword(rs.getString("password"));
						
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return obj;
			}
	
	
	
	//email sand 
	public static int footeremail(FooterEmailModel m)
	{
		
		int status = 0;
		
			//Connection call
			
			Connection con = Dao.getconnect();
			
			//Statment - PreparedStatement
			
					try 
					{
						PreparedStatement ps = con.prepareStatement("insert into newsletter (email1) values (?)");
						//System.out.println(m.getEmail1());
						ps.setString(1,m.getEmail1());
						//System.out.println(m.getEmail1());
						
						status = ps.executeUpdate();
					}		
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	 
	System.out.println(status);
	return status;
	}
	
	
	//Contact
	
		public static int ContactPage(ContactModel m)
		{
			
			int status = 0;
			
				//Connection call
				
				Connection con = Dao.getconnect();
				
				//Statment - PreparedStatement
				
				try 
				{
					PreparedStatement ps = con.prepareStatement("insert into contact (fname,lname,email,message) values (?,?,?,?)");
				
					ps.setString(1,m.getFname());
					ps.setString(2,m.getLname());
					ps.setString(3,m.getEmail());
					ps.setString(4,m.getMessage());
				
					status = ps.executeUpdate();
				} 
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return status;
			
		}
		
		//Product View
		
		public static List<ProductModel>productviewdata()
		{
			
			
				//Connection call
				
				Connection con = Dao.getconnect();
				List<ProductModel>list = new ArrayList();
				
				//Statment - PreparedStatement
				
				try 
				{
					PreparedStatement ps = con.prepareStatement("select * from products");
					ResultSet set = ps.executeQuery();
					
					while(set.next())
					{
						int id = set.getInt(1);
						String pname = set.getString(2);
						String pprice = set.getString(3);
						String pimage = set.getString(4);
						
						
						ProductModel m = new ProductModel();
						m.setId(id);
						m.setP_name(pname);
						m.setP_price(pprice);
						m.setP_image(pimage);
						list.add(m);
					}
					
				
					
				} 
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return list;
			
		}
		
		
		//wishlist insert
		
			public static int wishlistadddata(WishlistModel m)
			{
				
				int status = 0;
				
					//Connection call
					
					Connection con = Dao.getconnect();
					
					//Statment - PreparedStatement
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("insert into wishlist (p_name,p_price,p_image,email) values (?,?,?,?)");
					
						ps.setString(1,m.getP_name());
						ps.setString(2,m.getP_price());
						ps.setString(3,m.getP_image());
						ps.setString(4,m.getEmail());
					
						status = ps.executeUpdate();
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return status;
				
			}
			
			
			//Wishlist View
			
			public static List<WishlistModel>wishlistviewdata(String email)
			{
				
				
					//Connection call
					
					Connection con = Dao.getconnect();
					List<WishlistModel>list = new ArrayList();
					
					//Statment - PreparedStatement
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("select * from wishlist where email = ?");
						ps.setString(1, email);
						ResultSet set = ps.executeQuery();
						
						while(set.next())
						{
							int id = set.getInt(1);
							String pname = set.getString(2);
							String pprice = set.getString(3);
							String pimage = set.getString(4);
							
							
							WishlistModel m = new WishlistModel();
							m.setId(id);
							m.setP_name(pname);
							m.setP_price(pprice);
							m.setP_image(pimage);
							
							list.add(m);
						}
						
					
						
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return list;
				
			}
			
			
			//Cart View
			
			public static List<CartModel>cartviewdata(String email)
			{
				
				
					//Connection call
					
					Connection con = Dao.getconnect();
					List<CartModel>list = new ArrayList();
					
					//Statment - PreparedStatement
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("select * from cart where email = ?");
						ps.setString(1, email);
						ResultSet set = ps.executeQuery();
						
						while(set.next())
						{
							int id = set.getInt(1);
							String pname = set.getString(2);
							String pprice = set.getString(3);
							String pimage = set.getString(4);
							
							
							CartModel m = new CartModel();
							m.setId(id);
							m.setP_name(pname);
							m.setP_price(pprice);
							m.setP_image(pimage);
							
							
							list.add(m);
						}
						
					
						
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return list;
				
			}
			
			
			//cart insert
			
			public static int cartadddata(CartModel m)
			{
				
				int status = 0;
				
					//Connection call
					
					Connection con = Dao.getconnect();
					
					//Statment - PreparedStatement
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("insert into cart (p_name,p_price,p_image,email) values (?,?,?,?)");
					
						ps.setString(1,m.getP_name());
						ps.setString(2,m.getP_price());
						ps.setString(3,m.getP_image());
						ps.setString(4,m.getEmail());
					
						status = ps.executeUpdate();
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return status;
				
			}
			
			//cart delete
			
			public static int wishdeletedata(int id)
			{
				
				int status = 0;
				
					//Connection call
					
					Connection con = Dao.getconnect();
					
					//Statment - PreparedStatement
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("delete from wishlist where id =?");
					
						ps.setInt(1,id);
						
						status = ps.executeUpdate();
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					return status;
				
			}
			
			
			
		

}
