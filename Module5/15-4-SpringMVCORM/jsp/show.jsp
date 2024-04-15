<%@page import="com.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		List<Person>list = bo.viewdata();
	%>
	
	<table border="1" cellpadding="5" cellspacing="5">
	
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		
		
		<%
			for(Person p :list)
			{
				
			
		%>
		
		<tr>
			<td><%=p.getId() %></td>
			<td><%=p.getName() %></td>
			<td><%=p.getAddress() %></td>
			<td>
				<form action="edit" method="post" name="edit">
					<input type="hidden" name="id" value="<%=p.getId()%>">
					<input type="submit" name="action" value="Edit">
				</form>
			</td>
			<td>
				<form action="delete" method="post" name="delete">
					<input type="hidden" name="id" value="<%=p.getId()%>">
					<input type="submit" name="action" value="Delete">
				</form>
			</td>
		</tr>
		
		
		
		<%
			}
		%>
	</table>
	
	

</body>
</html>