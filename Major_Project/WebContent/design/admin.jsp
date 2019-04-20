<%@page import="com.mysql.cj.util.StringUtils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Welcome</title>

</head>
<body>
<jsp:include page="../common.jsp"></jsp:include>
<jsp:include page="header1.jsp"></jsp:include>
<hr/>
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
String username = (String)session.getAttribute("user_name");
String ret = (String)request.getAttribute("message");
//Cookie cookie = (Cookie)request.getAttribute("mycookie");
%>
<%-- <h3>hii, <%=cookie.getValue()%></h3> --%>
<h1><center>Admin Block</center></h1>
<h3>Hii, <%=username%></h3><br/><br/>
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