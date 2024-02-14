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
			
			List<WishlistModel>list = Dao.wishlistviewdata(email);
			for(WishlistModel m :list)
			{
				
			
		%>
		
			
			<form action="insertcart.jsp">
			
			<input type="hidden" name="id" value="<%= m.getId()%>">	
			<input type="hidden" name="p_name" value="<%= m.getP_name()%>">	
			<input type="hidden" name="p_price" value="<%= m.getP_price()%>">	
			<input type="hidden" name="p_image" value="<%= m.getP_image()%>">	
			<input type="hidden" name="email" value="<%= session.getAttribute("email")%>">		
					
			<h2><%=m.getP_name() %></h2>
		
			<img src="<%=m.getP_image() %>" width="250"height="250">
			
			<h3><%=m.getP_price() %></h3>
			
			<input type="submit" value="Add to Cart">
			
			</form>
		<%
			}
		%>
		
	
	
	
	<jsp:include page="footer.jsp"/>

</body>
</html>