<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">

	var request = new XMLHttpRequest();
	
	function check()
	{
		var name=document.tops.name.value;  		
		var url="ajax.jsp?val="+name;  
		
		try
		{
			request.onreadystatechange=function()
			{
				if(request.readyState==4)
				{
					var val=request.responseText; 
					document.getElementById('tops2').innerHTML=val;  
				}
			}
			request.open("GET",url,true);  
			request.send();  
			
			
		}
		catch (e) 
		{
			alert("Unable to connect to server");
		}
	}


</script>


</head>
<body>


	<form name="tops">
		<input type="text" name="name" onblur="check()"/>
	</form>
	<span id="tops2"></span>  

</body>
</html>