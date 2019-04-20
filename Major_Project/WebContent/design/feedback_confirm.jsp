<%@page import="com.mysql.cj.util.StringUtils"%>
<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


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
<%-- <jsp:include page="../common.jsp"></jsp:include> --%>
<hr/>
<h2 class="offscreen">W3C Web Resources</h2> 
<div id="hmenu"> 
<ul> 
<% 
String reg_id = (String)request.getAttribute("name");
JDBC_DTO dto = new JDBC_DTO();
%>

  <li><a href="index.jsp">Home</a></li>
 <!--  <li><a href="./Record">Records</a></li> --> 
  <li><a href="./GetAllStudent_Controller">Events</a></li>
  <li><a href="./Contactus_Controller">Registration details</a></li>
  <li><a href="./Contactus_Controller?reg_id=<%=reg_id%>">Feedback</a></li>
  <li><a href="./Coordinator_reply_Controller?reg_id=<%=reg_id%>">Coordinator's Reply</a></li>
  <li style="margin-left:1266px;"><a href="./Student_Logout" >Logout</a></li> 
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
/* String username = (String)session.getAttribute("first_name"); */
String ret = (String)request.getAttribute("message");
//Cookie cookie = (Cookie)request.getAttribute("mycookie");
%>
<h3>Hii, <%=reg_id%></h3>
<h3></h3><br/><br/>
<%
if(ret!=null)
		{
%>
 <h3><%=ret %></h3>
 <%
		}
 %>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>