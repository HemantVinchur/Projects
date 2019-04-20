<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coordinator's Reply</title>
</head>
<body>
<jsp:include page="common.jsp"></jsp:include>
<jsp:include page="student_header.jsp"></jsp:include>
<%
String username = (String)session.getAttribute("user_name");
String reply = (String)request.getAttribute("reply");
//Cookie cookie = (Cookie)request.getAttribute("mycookie");
%>
<%-- <h3>hii, <%=cookie.getValue()%></h3> --%>
<h1><center>Coordinator's Reply</center></h1>
<h3>Hii, <%=username%></h3><br/><br/>
<%
if(reply!=null)
		{
%>
 <h3><%=reply %></h3>
 <%
		}
 %>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>