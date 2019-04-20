<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update student</title>
</head>
<body style="background-color:#E6E6FA">
<jsp:include page="../common.jsp"></jsp:include>
 <jsp:include page="header1.jsp"></jsp:include>
<%-- <%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
 response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0");
/* response.setDateHeader("Expires",-1);
session.invalidate();
  */ if(session.getAttribute("user_name")==null)
	response.sendRedirect("index.jsp");
 %>
 --%>
<%-- <jsp:include page="/admin/header.jsp"></jsp:include> --%>
<hr/>
<%
JDBC_DTO dto = (JDBC_DTO)request.getAttribute("student");
String message = (String)request.getAttribute("message");
if(message!=null){
	%>
	<h1><%=message%></h1>
	<%
}
if(dto!=null){
%>
<h1 align="center">Update list</h1>
<form action="Update_Controller" method="post">
<table align="center">
<tr>
<td>Event Name </td>
<td>:<input type="text" name="eventName" value="<%=dto.getEvent_name()%>" placeholder="Event name"  required="required"/></td>
 <input type="hidden"  name="id" value="<%=dto.getId()%>"/>
 </tr>
<tr>
<td>Department Name </td>
<td>:<input type="text" name="departmentName" value="<%=dto.getDepartment()%>" placeholder="Department name"  required="required"/></td>
 </tr>
 <tr>
<td>Event Description </td>
<td>:<input type="text" name="eventDescription" value="<%=dto.getDescription()%>" placeholder="Event Description"  required="required"/></td>
 </tr>
 <tr>
<td>Venue</td>
<td>:<input type="text" name="venue"  value="<%=dto.getVenue()%>" placeholder="Venue"  required="required"/></td>
 </tr>
 <tr>
<td>Date </td>
<td>:<input type="date" pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))" name="date" value="<%=dto.getDate()%>" placeholder="Date" required="required"/></td>
 </tr>
<tr>
<td>Time </td>
<td>:<input type="time"  min="08:30" max="16:00" name="time" value="<%=dto.getTime()%>" placeholder="Time"/></td>
 </tr>
<tr>

<td colspan="2" align="right">
<input type="submit" name="submit" value="submit"/>
</td>
 </tr>
</table>
</form>
<%
}else if(message!=null){
%>
	<h3 style="color:green;"><%=message %></h3>
<% 
}else{
%>
<h3 style="color:brown;">Something went wrong!</h3>
<%
}
%>
</body>
</html>