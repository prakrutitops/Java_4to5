<%@page import="com.dao.Dao"%>
<%@page import="com.model.ProductModel"%>
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
			List<ProductModel>list = Dao.productviewdata();
			for(ProductModel m :list)
			{
				
			
		%>
		
			<h2><%=m.getP_name() %></h2>
		
			<img src="<%=m.getP_image() %>" width="250"height="250">
			
			<h3><%=m.getP_price() %></h3>
			
		
		<%
			}
		%>
		
	<jsp:include page="footer.jsp"/>	
	
	</table>
	</center>
	
	
	


</body>
</html>