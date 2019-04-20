<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="file:///E:/FrontEndWorkSpace/bootstrap-4.0.0-dist/css/bootstrap.min.css">
    <title>Document</title>
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
     <!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style>
body{
		color: #fff;
		background: #63738a;
		font-family: 'Roboto', sans-serif;
	}
    .header {
        color: #36A0FF;
        font-size: 27px;
        padding: 10px;
    }

    .bigicon {
        font-size: 35px;
        color: #36A0FF;
    }
</style>
</head>

<body>
<jsp:include page="../common.jsp"></jsp:include>
   <%--  <%

    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires","0");
 /*    response.setDateHeader("Expires",-1);
    session.invalidate();
  */
  if(session.getAttribute("user_name")==null)
	response.sendRedirect("index.jsp");
  %>
 --%>    
   
    <%
    
   /*  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma","no-cache");
    response.setHeader("Expires","0");
    if(session.getAttribute("user_name")==null)
    	response.sendRedirect("index.jsp");
 */    %>    
 
 <form action="Event_Controller" method="post">
       
<div class="container">
 <div class="row">
       
		</div>
	

    <div class="row">
        <div class="col-md-11">
	
			<div class="form-group">
                          
            <div class="well well-sm">
                <form class="form-horizontal" method="post">
                    <fieldset>
                        <legend class="text-center header">Events</legend>
			
                         
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="fname" name="ename" type="text" placeholder="Event Name" class="form-control" required="required">
                            </div>
                        </div>
   <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
  <input id="lname" name="dname" type="text" placeholder="Department" class="form-control"  required="required">
     </div>
                        </div>
                
                      <div  class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="email" type="text" placeholder="Event discription" class="form-control"  required="required">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="venue" class="form-control"  required="required">
                            </div>
                        </div>
                  <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="dphone" name="dphone" type="date" pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))" placeholder="date" class="form-control" required="required">
                            </div>
                        </div>



  <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="tphone" name="tphone" type="time"  min="08:30" max="16:00" placeholder="time" class="form-control" required="required">
                            </div>
                        </div>

    </div>
    </div>
    </div>
       <div class="col-md-1">
			 <a href="LogOut_Controller" class="btn btn-primary">Logout</a>
</div>
    </div>
    </div>
                         <div class="row">
		<div class="col-md-6">	
		</div>
		<div class="col-md-6">				
 <div class="form-group">
            <button type="submit" name="submit" value="submit" class="btn btn-primary">Submit</button>
        </div>
        </div>
                       </div> 
                        </div>
                        
                        </div>
                    </fieldset>
                </form>
				  
            </div>
			 		
        </div>

<script type="text/javascript" src="./jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="./bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script type="text/javascript">
	$('.form_date').datetimepicker({
       // language:  'fr',
        weekStart: 1,
      //  todayBtn:  1,
		autoclose: 1,
		//todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	</script>
</body>
</html>