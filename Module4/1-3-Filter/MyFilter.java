import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");
		
		if(name.equalsIgnoreCase("")||email.equalsIgnoreCase("")||mobile.equalsIgnoreCase("")||pass.equalsIgnoreCase("")) {
			
			out.println("All feilds are mandetary");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else if(name.equalsIgnoreCase(null)||email.equalsIgnoreCase(null)||mobile.equalsIgnoreCase(null)||pass.equalsIgnoreCase(null)){
			
			out.println("Feilds are not  getting value ");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else if(pass.equals("admin")) 
		{
			chain.doFilter(request, response);
			
			request.getRequestDispatcher("index2.jsp").forward(request, response);
			
		}
		
		
		
	}

}
