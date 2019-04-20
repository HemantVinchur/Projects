<%@page import="com.hv.controller.Coordinator_login"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="file:///E:/FrontEndWorkSpace/bootstrap-4.0.0-dist/css/bootstrap.min.css">
    
    <title>Feedback</title>
   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

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
<%-- <jsp:include page="common.jsp"></jsp:include> --%>
    <!-- <form action="/Reply_Controller"></form> -->

<div class="container">
    <div class="row">
        <div class="col-md-11">
            <div class="well well-sm">
                <form class="form-horizontal" method="post">
                    <fieldset>
                        <legend class="text-center header">Feedback Form</legend>

<!--                         <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="fname" name="fname" type="text" placeholder="First Name" class="form-control" required pattern="[a-zA-Z]{1,15}" required="required">
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="lname" name="lname" type="text" placeholder="Last Name" class="form-control" required pattern="[a-zA-Z]{1,15}" required="required">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="email" type="email" placeholder="Email Address" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="Phone" class="form-control" required pattern="[0-9]{10,10}" required="required">
                            </div>
                        </div>
 -->
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-8">
                                <textarea class="form-control" id="message" name="message" placeholder="Enter your massage for us here. We will get back to you within 2 business days." rows="7" required="required"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 text-center">
     
							<button type="submit" name="submit" value="submit" class="btn btn-primary btn-lg"><a href="Reply_Controller?reg_id=<%=Coordinator_login.coid%>">Submit</a></button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
        
       <!--  <div class="col-md-1">
			 <a href="LogOut_Controller" class="btn btn-primary">Logout</a>
</div> -->
    </div>
</div>


</body>
</html>