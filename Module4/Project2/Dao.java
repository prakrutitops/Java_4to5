package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import javax.print.attribute.standard.MediaSize.NA;

import com.model.SignupModel;

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
}
