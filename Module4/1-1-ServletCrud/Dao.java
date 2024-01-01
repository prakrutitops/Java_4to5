import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public static int savedata(Model m)
	{
		
		int status = 0;
		
			//Connection call
			
			Connection con = Dao.getconnect();
			
			//Statment - PreparedStatement
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into info (name,surname,email) values (?,?,?)");
			
				ps.setString(1,m.getName());
				ps.setString(2,m.getSurname());
				ps.setString(3,m.getEmail());
			
				status = ps.executeUpdate();
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return status;
		
	}
	
	//View
	
	public static List<Model> viewdata()
	{
		
		
			//Connection call
			
			Connection con = Dao.getconnect();
			List<Model>list = new ArrayList();
			
			//Statment - PreparedStatement
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("select * from info");
				ResultSet set = ps.executeQuery();
				
				while(set.next())
				{
					int id = set.getInt(1);
					String name = set.getString(2);
					String surname = set.getString(3);
					String email = set.getString(4);
					
					Model m = new Model();
					m.setId(id);
					m.setName(name);
					m.setSurname(surname);
					m.setEmail(email);
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
	
	
	
}
