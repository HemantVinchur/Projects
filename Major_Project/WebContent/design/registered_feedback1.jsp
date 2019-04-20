<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Registered Students</title>
  </head>
  <body style="background-color:#E6E6FA">
  <jsp:include page="../common.jsp"></jsp:include>
  <jsp:include page="header1.jsp"></jsp:include>
  <form action=Admin_Controller method="post"></form>
    <h1><center>Event List</center></h1>
  				    			<%
List<JDBC_DTO> list = (List<JDBC_DTO>)request.getAttribute("student_list1");
if(list!=null && list.size()!=0){
%>
<div class='jumbotron'>
<div class='container'>
<table class="table table-dark">
 <!-- <table class="table">  -->
 	
  <thead>
    <tr>
      <th scope="col">S.NO.</th>
      <th scope="col">FIRST NAME</th>
      <th scope="col">LAST NAME</th>
      <th scope="col">ENROLLMENT NO.</th>
      <th scope="col">CONTACT</th>
      <th scope="col">EMAIL</th>
      <th scope="col">USER NAME</th>
      <th scope="col">PASSWORD</th>
      <th scope="col">FEEDBACK</th>
      <th scope="col">REPLY</th>
      <th scope="col">EVENT NAME</th>
      <th scope="col">DEPARTMENT</th>
      <th scope="col">DESCRIPTION</th>
      <th scope="col">VENUE</th>
      <th scope="col">DATE</th>
      <th scope="col">TIME</th>
 <!--      <th scope="col">Time</th>
      <th scope="col">Operations</th>  -->
    </tr>
  </thead>
  <%
int count =0;
for(JDBC_DTO dto  : list){
	++count;
%>	
  <tbody>
    <tr>
      <th scope="row"><%=count %></th>
      <td><%=dto.getFirst_name() %></td>
      <td><%=dto.getLast_name() %></td>
      <td><%=dto.getEnrollment_no() %></td>
      <td><%=dto.getContact_no() %></td>
      <td><%=dto.getEmail() %></td>
      <td><%=dto.getUser_name() %></td>
      <td><%=dto.getPassword() %></td>
      <td><%=dto.getFeedback() %></td>
      <td><%=dto.getReply() %></td>
      <td><%=dto.getEvent_name() %></td>
      <td><%=dto.getDepartment() %></td>
      <td><%=dto.getDescription() %></td>
      <td><%=dto.getVenue() %></td>
      <td><%=dto.getDate() %></td>
      <td><%=dto.getTime() %></td>
    <%--   <td><%=dto.getTime() %></td>
     <td align="center"><a href="Update_Controller?reg_id=<%=dto.getId()%>">Edit</a> / <a href="Delete_Controller?reg_id=<%=dto.getId()%>">Delete</a>/ <a href="Event_Coordinator?reg_id=<%=dto.getId()%>">Add Coordinator</a></td> --%>
    </tr>
     </tbody>

    <%
	}
%>
<%
}

else{
%>
<h3>Record Not Available</h3>
<%
}
%>
  </table>
    </div>
    	</div>
<!-- </div> -->
   <!--  <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr> -->
  </tbody>
</table>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>