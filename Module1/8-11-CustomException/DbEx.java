package com.a811;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbEx 
{
	public static Connection getconnect() throws ClassNotFoundException, SQLException 
	{
		Connection con = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("","root","");
		
		
		return con;
	}
}
