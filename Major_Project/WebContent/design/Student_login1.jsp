<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@page import="com.mysql.cj.util.StringUtils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html lang="en">
<head>
    <!-- ========== Meta Tags ========== -->
    <meta charset="UTF-8">
    <meta name="description" content="Evento -Event Html Template">
    <meta name="keywords" content="Evento , Event , Html, Template">
    <meta name="author" content="ColorLib">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <!-- ========== Title ========== -->
    <title></title>
    <!-- ========== Favicon Ico ========== -->
    <!--<link rel="icon" href="fav.ico">-->
    <!-- ========== STYLESHEETS ========== -->
    <!-- Bootstrap CSS -->
    <link href="evento/assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Fonts Icon CSS -->
    <link href="evento/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="evento/assets/css/et-line.css" rel="stylesheet">
    <link href="evento/assets/css/ionicons.min.css" rel="stylesheet">
    <!-- Carousel CSS -->
    <link href="evento/assets/css/owl.carousel.min.css" rel="stylesheet">
    <link href="evento/assets/css/owl.theme.default.min.css" rel="stylesheet">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <!-- Custom styles for this template -->
    <link href="evento/assets/css/main.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../common.jsp"></jsp:include>
<div class="loader">
    <div class="loader-outter"></div>
    <div class="loader-inner"></div>
</div>

<!--header start here -->
<header class="header navbar fixed-top navbar-expand-md">
    <div class="container">
       
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#headernav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="lnr lnr-text-align-right"></span>
        </button>
        <div class="collapse navbar-collapse flex-sm-row-reverse" id="headernav">
            <ul class=" nav navbar-nav menu">
            <% 
int reg_id = (Integer)session.getAttribute("id");
String name =(String)request.getAttribute("user_name");
JDBC_DTO dto = new JDBC_DTO();
%>
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="./GetAllStudent_Controller"> Events</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="./Contactus_Controller">Registration details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="./Contactus_Controller?reg_id=<%=reg_id%>">Feedback</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="./Coordinator_reply_Controller?reg_id=<%=name%>">Coordinator's Reply</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="./Student_Logout">Logout</a>
                </li>
                <!-- <li class="nav-item">
                    <a class="nav-link " href="./LogOut_Controller">Logout</a>
                </li>
                 -->
                    </a>
                </li>
            </ul>
        </div>
    </div>
</header>
<!--header end here-->

<!--cover section slider -->
<section id="home" class="home-cover">
    <div class="cover_slider owl-carousel owl-theme">
        <div class="cover_item" style="background: url('evento/assets/img/bg/slider.png');">
             <div class="slider_content">
                <div class="slider-content-inner">
                    <div class="container">
                        <div class="slider-content-center">
                            
                    </div>
                </div>
            </div>
        </div>
        <div class="cover_item" style="background: url('evento/assets/img/bg/slider.png');">
            <div class="slider_content">
                <div class="slider-content-inner">
                    <div class="container">
                        <div class="slider-content-left">
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="cover_item" style="background: url('evento/assets/img/bg/slider.png');">
           
                    </div>
                </div>
            </div>
        </div>
    </div>
   
</section>
<!--cover section slider end -->



<!--footer start -->
<footer>
    <div class="container">
        <div class="row justify-content-center">

            <div class="col-md-4 col-12">
                <div class="footer_box">
                    <div class="footer_header">
                        
                    </div>
                    <div class="footer_box_body">
                       
                        
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4">
                <div class="footer_box">
                    <div class="footer_header">
                       
                    </div>
                    <div class="footer_box_body">
                        <ul class="instagram_list">
                           
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4">
                <div class="footer_box">
                    <div class="footer_header">
                       
                    </div>
                    
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<div class="copyright_footer">
    <div class="container">
        <div class="row justify-content-center">
           
            <div class="col-12 col-md-6 ">
                
            </div>
        </div>
    </div>
</div>
<!--footer end -->

<!-- jquery -->
<script src="evento/assets/js/jquery.min.js"></script>
<!-- bootstrap -->
<script src="evento/assets/js/popper.js"></script>
<script src="evento/assets/js/bootstrap.min.js"></script>
<script src="evento/assets/js/waypoints.min.js"></script>
<!--slick carousel -->
<script src="evento/assets/js/owl.carousel.min.js"></script>
<!--parallax -->
<script src="evento/assets/js/parallax.min.js"></script>
<!--Counter up -->
<script src="evento/assets/js/jquery.counterup.min.js"></script>
<!--Counter down -->
<script src="evento/assets/js/jquery.countdown.min.js"></script>
<!-- WOW JS -->
<script src="evento/assets/js/wow.min.js"></script>
<!-- Custom js -->
<script src="evento/assets/js/main.js"></script>
</body>
</html>