<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		SignupModel m = new SignupModel();
		m.setEmail(email);
		m.setPassword(pass);
		
		
		
		
		SignupModel m2 = Dao.Logindata(m);
		
		if(m2!=null)
		{
			
			
			//true
			session.setAttribute("webwing",true);
			session.setAttribute("email",email);
			session.setAttribute("pass",pass);
			session.setAttribute("fullname",m2.getFullname());
			session.setAttribute("phone",m2.getPhone());
			response.sendRedirect("index.jsp");
		}
		else
		{
			out.print("Login Fail");
		}
	
	
		
		
	%>


</body>
</html>