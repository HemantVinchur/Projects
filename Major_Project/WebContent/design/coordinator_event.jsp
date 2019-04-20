<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event list</title>
</head>
<body>
<jsp:include page="../common.jsp"></jsp:include>
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
<h2 class="offscreen">W3C Web Resources</h2> 
<div id="hmenu"> 
<ul>
  <li><a href="./Coordinator_Index_Controller">Home</a></li>
 <!--  <li><a href="./Record">Records</a></li> --> 
  <!-- <li><a href="./Admin_Controller">Events</a></li> -->
  <li><a href="./Event_Controller">Add Event</a></li>
  <li style="margin-left:1266px;"><a href="Coordinator_Logout" >Logout</a></li> 
</ul>   
</div> 
<%-- <jsp:include page="common.jsp"></jsp:include> --%>
<%-- <jsp:include page="header.jsp"></jsp:include> --%>
<hr/>
<form action="Event_List_Controller" method="post"></form>
<%-- <%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
 response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0");
/* response.setDateHeader("Expires",-1);
session.invalidate();
 */ 
 if(session.getAttribute("user_name")==null)
	response.sendRedirect("index.jsp");
 %>
 --%>
<%
String delete_message = (String)request.getAttribute("delete_message");
if(delete_message!=null && delete_message.trim().length()!=0){
%>
<h3 style="color:brown;"><%=delete_message %></h3>
<%
}
%>
<h3 align="center">Event List</h3>
<hr/>
<table align="center" style="width:100%;" border="1">
<%
List<JDBC_DTO> list = (List<JDBC_DTO>)request.getAttribute("student_list");
if(list!=null && list.size()!=0){
%>
<thead>
	<tr>
		<td align="center">S.NO.</td>
		<td align="center">EVENT NAME</td>
		<td align="center">DEPARTMENT</td>
		<td align="center">EVENT DESCRIPTION</td>
		<td align="center">VENUE</td>
		<td align="center">DATE</td>
		<td align="center">TIME</td>
		<td align="center">OPERATIONS</td>
		

	</tr>
</thead>
<%
int count =0;
for(JDBC_DTO dto  : list){
	++count;
%>
	<tr>
		<td><%=count %></td>
		<td><%=dto.getEvent_name() %></td>
		<td><%=dto.getDepartment() %></td>
		<td><%= dto.getDescription()%></td>
		<td><%= dto.getVenue()%></td>
		<td><%= dto.getDate()%></td>
		<td><%= dto.getTime()%></td>
		<%-- <td align="center"><%=dto.getContact_no() %></td> --%>
		<td align="center"><a href="Update_Controller?reg_id=<%=dto.getId()%>">Edit</a> / <a href="Delete_Controller?reg_id=<%=dto.getId()%>">Delete</a></td>
	</tr>
<%
	}
}else{
%>
<h3>Record Not Available</h3>
<%
}
%>
</table>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>