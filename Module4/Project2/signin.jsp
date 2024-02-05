<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
		
		<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
		
		
		
		<form action="login.jsp">
			
			<!-- form-group// -->
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email address"
					type="email">
			</div>
			<!-- form-group// -->
			
		
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-lock"></i>
					</span>
				</div>
				<input class="form-control" placeholder="Enter password"
					type="password" name="password">
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Login</button>
			</div>
			<!-- form-group// -->
			<p class="text-center">Do You want to Signup? <a href="signup.jsp">Sign up</a>
			</p>
		</form>
		</article>
	</div>
	<!-- card.// -->

	</div>
	<!--container end.//-->
	
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>