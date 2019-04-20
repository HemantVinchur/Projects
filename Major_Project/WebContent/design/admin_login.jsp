<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->



<!doctypehtml>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">



<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="personal-style.css">
</head>

<body>
<style>
body{
	background-image:url(https://wallpapertag.com/wallpaper/full/c/a/a/157415-simplistic-wallpapers-1920x1080-lockscreen.jpg)
}
#login-name{
font-size: 65px;
font-family: arabic typesetting;
border-bottom-style: ridge;
color:white;

}
#login{
background-color:rgba(13,13,13,0.2);
min-height:500px;
padding: 40px 80px 40px 80px;
box-shadow: -10px -10px 9px #33cc33;

}
.user{
font-size: 29px;

font-family: arabic typesetting;

color: white;





}

#iconn{

background-color: #5cb85c;
border-color: #4cae4c;
color: white;

}
#iconn1{

background-color: #5cb85c;
border-color: #4cae4c;
color: white;

}

#text1{

	border-radius: 0;
	height: 40px;
}
#text2{

	border-radius: 0;
	height: 40px;
}

.btn{
	width: 50%;
	float: left;
	height: 40px;
	font-size: 18px;
}
</style>
<div class="container">
<br/>
<br/>
<br/>
<br/>

<center> <b id="login-name">ADMIN LOGIN</b> </center>>
	
	<div class="row">
		
<div class="col-md-6 col-md-offset-3" id="login">  

<form action="Login_Controller" method="post">
	
<div class="form-group">
<label class="user"> UserName  </label>
<div class="input-group">
	<span class="input-group-addon" id="iconn"> <i class="glyphicon glyphicon-user"></i></span>
<input type="text" class="form-control" id="text1" name="username" placeholder="username">
</div>
	
</div>

<div class="form-group">
<label class="user"> Password </label>
<div class="input-group">
	<span class="input-group-addon" id="iconn1"> <i class="glyphicon glyphicon-lock"></i></span>
<input type="password" class="form-control" id="text2" name="password" placeholder=" Enter Password">
</div>
</div>

<div class="form-group">

<input type="submit" class="btn btn-success" value="login" style="border-radius:0px;">
<input type="reset" class="btn btn-danger" value="reset" style="border-radius:0px;">

    </div>
    <br/><br/><br/>
    <!-- <a href="#" style="color: white; font-size: 15px; float: right; margin-right: 10px;"> Forget Password </a> -->
    <a href="#" style="color: white; font-size: 15px; float: right; margin-right: 10px;"> Register </a>







</form>





  </div>



	</div>










</div>














	</body>
	</html>