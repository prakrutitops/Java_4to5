<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="m" class="com.model.CartModel"/>
<jsp:setProperty property="*" name="m"/>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
		int status = Dao.cartadddata(m);
		
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		System.out.print(id2);
		Thread.sleep(1000);
		
		Dao.wishdeletedata(id2);
		
		Thread.sleep(1000);
		
		if(status>0)
		{
			response.sendRedirect("wishlist.jsp");
		}
		else
		{
			out.print("fail");
		}
	
		
	
	%>

	

</body>
</html>