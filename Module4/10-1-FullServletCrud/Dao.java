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
	
	//Delete
	
		public static int deletedata(int id)
		{
			
				int status = 0;
			
				//Connection call
				
				Connection con = Dao.getconnect();
				
				//Statment - PreparedStatement
				
				try 
				{
					PreparedStatement ps = con.prepareStatement("delete from info where id=?");
				
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
		
		//Edit
		public static Model editdata(int id)
		{
					
				Model m = new Model();
			
				//Connection call
				
				Connection con = Dao.getconnect();
				
				//Statment - PreparedStatement
				
				try 
				{
					PreparedStatement ps = con.prepareStatement("select * from info where id=?");
					ps.setInt(1,id);
					ResultSet set =ps.executeQuery();

					
					
				
					if(set.next())
					{
						int id1 = set.getInt(1);
						String name = set.getString(2);
						String surname = set.getString(3);
						String email = set.getString(4);
						
						m.setId(id1);
						m.setName(name);
						m.setSurname(surname);
						m.setEmail(email);
					}
				
				} 
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return m;
			
		}
		
		//Update
		
		public static int updatedata(Model m)
		{
			
			int status = 0;
			
				//Connection call
				
				Connection con = Dao.getconnect();
				
				//Statment - PreparedStatement
				
				try 
				{
					PreparedStatement ps = con.prepareStatement("update info set name=?,surname=?,email=? where id=?");
				
					ps.setString(1,m.getName());
					ps.setString(2,m.getSurname());
					ps.setString(3,m.getEmail());
					ps.setInt(4,m.getId());
				
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
