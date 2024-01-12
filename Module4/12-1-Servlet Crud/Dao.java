import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import javax.print.attribute.standard.MediaSize.NA;

public class Dao 
{
	
	//Connection Establish
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	//Insert
	
	public static int registerdata(Model m)
	{
		
		int status = 0;
		
			//Connection call
			
			Connection con = Dao.getconnect();
			
			//Statment - PreparedStatement
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into register (name,email,password) values (?,?,?)");
			
				ps.setString(1,m.getName());
				ps.setString(2,m.getEmail());
				ps.setString(3,m.getPassword());
			
				status = ps.executeUpdate();
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return status;
		
	}
	//Login
		public static Model Logindata(Model model) 
		{
			
			Model obj = null;

			try {
				Connection con = Dao.getconnect();
				PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
				ps.setString(1, model.getEmail());
				ps.setString(2, model.getPassword());

				ResultSet rs = ps.executeQuery();

				if (rs.next()) 
				{
					obj = new Model();
					obj.setName(rs.getString("name"));
					obj.setEmail(rs.getString("email"));
					obj.setPassword(rs.getString("password"));
					
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return obj;
		}
	
}