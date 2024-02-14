<%@page import="com.model.CartModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"/>
	
		
	<center>
	<table>
	
		<%
			String email = session.getAttribute("email").toString();
			
			List<CartModel>list = Dao.cartviewdata(email);
			for(CartModel m :list)
			{
				
			
		%>
		
			
			
					
			<h2><%=m.getP_name() %></h2>
		
			<img src="<%=m.getP_image() %>" width="250"height="250">
			
			<h3><%=m.getP_price() %></h3>
			
		
		<%
			}
		%>
		
	
	
	
	<jsp:include page="footer.jsp"/>

</body>
</html>