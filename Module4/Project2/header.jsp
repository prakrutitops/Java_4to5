<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
   <!-- basic -->
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <!-- mobile metas -->
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="viewport" content="initial-scale=1, maximum-scale=1">
   <!-- site metas -->
   <title>webwing</title>
   <meta name="keywords" content="">
   <meta name="description" content="">
   <meta name="author" content="">
   <!-- bootstrap css -->
   <link rel="stylesheet" href="css/bootstrap.min.css">
   <!-- style css -->
   <link rel="stylesheet" href="css/style.css">
   <!-- Responsive-->
   <link rel="stylesheet" href="css/responsive.css">
   <link rel="stylesheet" href="css/owl.carousel.min.css">
   <!-- fevicon -->
   <link rel="icon" href="images/fevicon.png" type="image/gif" />
   <!-- Scrollbar Custom CSS -->
   <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
   <!-- Tweaks for older IEs-->
   <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
   <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
      
 <style type="text/css">
 
 	
 	.swd-button 
	{
		background: #f2db18;
		border: 1px solid white;
		border-radius: 5px;
		color: white;
		display: inline-block;
		font: bold 12px Arial, Helvetica, sans-serif;
		padding: 10px 15px;
		text-decoration: none;
		text-transform: uppercase;
		margin-top: 15px;
	}
 	
 
 </style>     
      
      
      
</head>
<!-- body -->

<body class="main-layout">
   <!-- loader  -->
   <div class="loader_bg">
      <div class="loader"><img src="images/loading.gif" alt="#" /></div>
   </div>
   <!-- end loader -->
   <!-- header -->
   <header>
      <!-- header inner -->
      <div class="header">
         <div class="header_to d_none">
            <div class="container">
            
            
            <div class="row">
                 
                    <div class="col-md-6 col-sm-6 " style="margin-left: 400px;">
                     <ul class="social_icon1">
                        <li> Follow Us
                        </li>
                        <li> <a href="https://www.facebook.com/AmazonIN/"><i class="fa fa-facebook" aria-hidden="true"></i>
                           </a>
                        </li>
                        <li> <a href="https://www.instagram.com/amazon/?hl=en"><i class="fa fa-instagram" aria-hidden="true"></i>
                           </a>
                        </li>
                     </ul>
                  </div>
               </div>
                        
                 
                 <div class="col-md-6 col-sm-6 " style="margin-left: 800px;">
                     
                     
                     <%
                     		if(session.getAttribute("webwing")!=null)
                     		{
                     			
                     		
                     	%>
                     	
                     	<p>
                     		<label style="color: white;">Your Name :<%=session.getAttribute("fullname") %></label>
                     	</p>
                     	<p>
                     		<label style="color: white;">Your Email :<%=session.getAttribute("email") %></label>
                     	</p>
                     	<p>
                     		<label style="color: white;">Your Phone :<%=session.getAttribute("phone") %></label>
                        </p>
                        
                        <%
                        
                     		}
                     	
                     			
                        %>
                        
                    	
                     		
                  		
                        
                        
                     
                     
                  </div>
                 
                 
                 
               
            
            
          <%--      <div class="row">
                 
                  <div class="col-md-6 col-sm-6 "style="margin-left: 800px;">
                    <!--  <ul class="social_icon1"> -->
                     	
                     	<%
                     		if(session.getAttribute("webwing")!=null)
                     		{
                     			
                     		
                     	%>
                     	
                     	<p>
                     		<label style="color: white;">Your Name :<%=session.getAttribute("fullname") %></label>
                     	</p>
                     	<p>
                     		<label style="color: white;">Your Email :<%=session.getAttribute("email") %></label>
                     	</p>
                     	<p>
                     		<label style="color: white;">Your Phone :<%=session.getAttribute("phone") %></label>
                        </p>
                        
                        <%
                        
                     		}
                     		else
                     		{
                     			
                     			
                        %>
                        
                    
                     		
                  </div>
                        
                        
                        <%
                     		}
                        %>
                     
                     <!-- </ul> -->
                  </div> --%>
               </div>
            </div>
         </div>
         <div class="header_midil">
            <div class="container">
               <div class="row d_flex">
                  <div class="col-md-4 col-sm-4 d_none">
                     <ul class="conta_icon">
                        <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Call Us : +01 1234567890</a> </li>
                     </ul>
                  </div>
                  <div class="col-md-4 col-sm-4 ">
                     <a class="logo" href="#"><img src="images/logo.png" alt="#" /></a>
                  </div>
                  <div class="col-md-4 col-sm-4 d_none">
                     <ul class="conta_icon ">
                        <li><a href="#"><i class="fa fa-envelope" aria-hidden="true"></i> demo@gmail.com</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
         </div>
         <div class="header_bo">
            <div class="container">
               <div class="row">
                  <div class="col-md-9 col-sm-7">
                     <nav class="navigation navbar navbar-expand-md navbar-dark ">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                           <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarsExample04">
                           <ul class="navbar-nav mr-auto">
                              <li class="nav-item active">
                                 <a class="nav-link" href="index.html"> Home </a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="about.html">about</a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="service.html">services</a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="team.html">team </a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="client.html">Clients</a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="contact.html"> contact us </a>
                              </li>
                           </ul>
                        </div>
                     </nav>
                  </div>
                  
                  <div class="col-md-3 col-sm-5 d_none">
                  
                  	<%
                  		
                  	if(session.getAttribute("webwing")!=null)
                  	{
                  		
                  	
                  	%>
                  	 <a class="swd-button" href="logout.jsp">Logout</a>
                  
                  	 
                  	 <%
                  	}
                  	else
                  	{
                  		
                  	
                  	 %>
                  	 	<a class="swd-button" href="signup.jsp">Signup</a>
                  	<a class="swd-button" href="signin.jsp">Signin</a>
                  	<%
                  	}
                  	%>
                  
                  </div>
                  
                  
                 <!--  <div class="col-md-3 col-sm-5 d_none">
                     <ul class="sign">
                       
                        <li><a class="sign_btn" href="#">Signup</a></li>
                        <li><a class="sign_btn" href="#">Login</a></li>
                     </ul>
                  </div> -->
               </div>
            </div>
         </div>
      </div>
   </header>
   <!-- end header inner -->
   <!-- end header -->