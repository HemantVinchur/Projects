<%@page import="com.hv.jdbc.JDBC_DTO"%>
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
<%int reg_id = (Integer)request.getAttribute("id"); %>
  <li><a href="index.jsp">Home</a></li>
 <!--  <li><a href="./Record">Records</a></li> --> 
  <li><a href="./Event_List_Controller">Events</a></li>
  <li><a href="./Contactus_Controller">Registration details</a></li>
  <li><a href="./Contactus_Controller">Students Feedback</a></li>
  <li><a href="./Coordinator_reply_Controller?reg_id=<%=reg_id%>">Coordinator's Reply</a></li>
  <li style="margin-left:1266px;"><a href="./Student_Logout" >Logout</a></li> 
</ul>   
</div> 