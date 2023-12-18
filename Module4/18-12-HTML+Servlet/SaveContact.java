import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveContact extends HttpServlet
{
		//doGet
		//doPost
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			//super.doPost(req, resp);
			
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String subject =req.getParameter("subject");
			String message =req.getParameter("message");
			
			
//			System.out.println(name);
//			System.out.println(email);
//			System.out.println(subject);
//			System.out.println(message);
			
			out.print("Your Name is : "+name);
			out.print("<br>");
			out.print("Your Email is :"+email);
			out.print("<br>");
			out.print("Your Subject is :"+subject);
			out.print("<br>");
			out.print("Your Message is : "+message);
			
			if(email.equals("vivek@gmail.com"))
			{
				resp.sendRedirect("view.html");
			}
			else
			{
				out.print("Fail");
			}
		
		}
	
}
