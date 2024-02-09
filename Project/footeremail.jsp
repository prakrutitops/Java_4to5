<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<jsp:useBean id="m2" class="com.model.FooterEmailModel"/>
<jsp:setProperty property="*" name="m2"/>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		
	
		
		<%
		
		int status = Dao.footeremail(m2);
		
		
		
		if(status>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			out.print("fail");
		}
	
		
	
	%>
	
</body>
</html>