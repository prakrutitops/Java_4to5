import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		Model m = new Model();
		m.setEmail(email);
		m.setPassword(pass);
		
		
		Model m2 = Dao.Logindata(m);
		
		if(m2!=null)
		{
			out.print("Login Success");
		}
		else
		{
			out.print("Login Fail");
		}
	
	
	
	}
}
