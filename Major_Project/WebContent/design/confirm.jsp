<%@page import="com.hv.controller.Student_Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="file:///E:/FrontEndWorkSpace/bootstrap-4.0.0-dist/css/bootstrap.min.css">

<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>Bootstrap Simple Registration Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">

<title>Welcome</title>
</head>
<body>
<style>
/* CSS Document */ 

.offscreen { 
  position: absolute; 
  top: -30em; 
  left: -300em; 
} 

div#hmenu { 
   margin: 0; 
   padding: .3em 0 .3em 0; 
   background: #ddeebb; 
   width: 100%; 
   text-align: left; 
} 

div#hmenu ul { 
   list-style: none; 
   margin: 0; 
   padding: 0; 
} 

div#hmenu ul li { 
   margin: 0; 
   padding: 0; 
   display: inline; 
} 

div#hmenu ul a:link{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #004415; 
} 

div#hmenu ul a:visited{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #227755; 
} 

div#hmenu ul a:active{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #227755; 
} 

div#hmenu ul a:hover{ 
   margin: 0; 
   padding: .3em .4em .3em .4em; 
   text-decoration: none; 
   font-weight: bold; 
   font-size: medium; 
   color: #f6f0cc; 
   background-color: #227755; 
}

</style>
<jsp:include page="../common.jsp"></jsp:include>
<hr/>
<h2 class="offscreen">W3C Web Resources</h2> 
<div id="hmenu"> 
<ul> 
   <li><a href="index.jsp">Home</a></li>
  <!-- <li><a href="./GetAllStudent_Controller">Event List</a></li>  -->
   <!-- <li><a href="#">About US</a></li>  -->
   <li><a href="./GetAllStudent_Controller">Events</a></li>
  <!-- <li><a href="./Contactus_Controller">Feedback</a></li> -->
  <!-- <li><a href="#">Help</a></li> -->
 <!--  <li style="margin-left:1266px;"><a href="LogOut_Controller" >Logout</a></li> --> 
</ul>   
</div> 

<%

/*  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
 response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0"); */
//response.setDateHeader("Expires",-1);
//session.invalidate();
/* String userName = (String)session.getAttribute("user_name");
System.out.println("1 index.jsp");
 if(StringUtils.isNullOrEmpty(userName)){
	 System.out.println("2 index.jsp");
	 response.sendRedirect("/index.jsp");
	 System.out.println("3 index.jsp");
 } */
String username = (String)session.getAttribute("first_name");
String ret = (String)request.getAttribute("message");
//Cookie cookie = (Cookie)request.getAttribute("mycookie");
%>

<%-- <h3>hii, <%=cookie.getValue()%></h3> --%>
<h3>Hii, <%=username%></h3><br/><br/>
Do you want to register for the event.
   <div class="form-group">
   
                            <div class="col-md-12 text-center">
     <form action="./Registration_Controller?reg_id=<%=Student_Login.stid%>" method="post">
					 <button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg">Submit</button>
                          </form> 
                            </div>
                        </div>
                           <div class="form-group">
                            <div class="col-md-12 text-center">
     
					 <button type="submit" name="cancel" value="cancel" class="btn btn-primary btn-lg">Cancel</button>
                         
                            </div>
                            
                        </div>
                        

                        
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>