<%@page import="com.hv.jdbc.JDBC_DTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Events</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Conference project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/events.css">
<link rel="stylesheet" type="text/css" href="styles/events_responsive.css">
</head>
<body>

<div class="super_container">

	<!-- Menu -->

	<div class="menu trans_500">
		<div class="menu_content d-flex flex-column align-items-center justify-content-center text-center">
			<div class="menu_close_container"><div class="menu_close"></div></div>
			<div class="logo menu_logo">
				<a href="#">
					
				</a>
			</div>
			<ul>
				<li class="menu_item"><a href="index.jsp">Home</a></li>
				<li class="menu_item"><a href="#">About us</a></li>
				<li class="menu_item"><a href="speakers.jsp">Speakers</a></li>
				<li class="menu_item"><a href="#">Tickets</a></li>
				<li class="menu_item"><a href="news.jsp">News</a></li>
				<li class="menu_item"><a href="contact.jsp">Contact</a></li>
			</ul>
		</div>
		<div class="menu_social">
			<div class="menu_social_title">Follow uf on Social Media</div>
			<ul>
				<li><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a></li>
				<li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
			</ul>
		</div>
	</div>
	
	<!-- Home -->

	<div class="home">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/events.jpg" data-speed="0.8"></div>

		<!-- Header -->

		<header class="header" id="header">
			<div>
				<div class="header_top">
					<div class="container">
						<div class="row">
							<div class="col">
								
									<div>
										<a href="#">
											
										</a>	
									</div>
									
							</div>
						</div>
					</div>
				</div>
				<div class="header_nav" id="header_nav_pin">
					<div class="header_nav_inner">
						<div class="header_nav_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="header_nav_content d-flex flex-row align-items-center justify-content-start">
											<nav class="main_nav">
												<ul>
													<li><a href="index.jsp">Home</a></li>
													<li><a href="#">About Us</a></li>
													<li><a href="speakers.jsp">Speakers</a></li>
													<li class="active"><a href="#">Events</a></li>
													<li><a href="news.jsp">News</a></li>
													<li><a href="contact.jsp">Contact</a></li>
												</ul>
											</nav>
											<div class="header_extra ml-auto">
												<div class="header_search"><i class="fa fa-search" aria-hidden="true"></i></div>
												<div class="button header_button"><a href="#">Buy Tickets Now!</a></div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="search_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="search_content d-flex flex-row align-items-center justify-content-end">
											<form action="#" id="search_container_form" class="search_container_form">
												<input type="text" class="search_container_input" placeholder="Search" required="required">
												<button class="search_container_button"><i class="fa fa-search" aria-hidden="true"></i></button>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>	
			</div>
		</header>
<form action="Event_Student" method="post"></form>
		<div class="home_content_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content d-flex flex-row align-items-end justify-content-start">
							<div class="current_page">Events</div>
							<div class="breadcrumbs ml-auto">
								<ul>
									<li><a href="index.jsp">Home</a></li>
									<li>Events</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%
List<JDBC_DTO> list = (List<JDBC_DTO>)session.getAttribute("student_list");
if(list!=null && list.size()!=0){
%>
	<!-- Events -->

	<div class="events">
		<div class="container">
			<div class="row">
				<div class="col">
					
					<!-- Event -->

<%
int count =0;
for(JDBC_DTO dto  : list){
  System.out.println("jsp");
	++count;
%>

					<div class="event">
						<div class="row row-lg-eq-height">
							<div class="col-lg-6 event_col">
								<div class="event_image_container">
									<div class="background_image" style="background-image:url(images/event_9.jpg)"></div>
									<div class="date_container">
										<a href="#">
											<span class="date_content d-flex flex-column align-items-center justify-content-center">
												<div class="date_day"><%= dto.getDate()%></div>
											<!-- 	<div class="date_month">May</div> -->
											</span>
										</a>	
									</div>
								</div>
							</div>
						<div class="col-lg-6 event_col">
								<div class="event_content">
									<div class="event_title"><%=dto.getEvent_name() %></div>
									<div class="event_location"><%= dto.getVenue()%></div>
									<div class="event_text">
										<p><%= dto.getDescription()%></p>
									</div>

									<div class="event_speakers">
										<!-- Event Speaker -->
										<div class="event_speaker d-flex flex-row align-items-center justify-content-start">
											<div><div class="event_speaker_image"><img src="images/event_speaker_1.jpg" alt=""></div></div>
											<div class="event_speaker_content">
												<div class="event_speaker_name">Michael Smith</div>
												<div class="event_speaker_title">Marketing Specialist</div>
											</div>
										</div>
										<!-- Event Speaker -->
										<div class="event_speaker d-flex flex-row align-items-center justify-content-start">
											<div><div class="event_speaker_image"><img src="images/event_speaker_2.jpg" alt=""></div></div>
											<div class="event_speaker_content">
												<div class="event_speaker_name">Jessica Williams</div>
												<div class="event_speaker_title">Marketing Specialist</div>
											</div>
										</div>
									</div>
									<div class="event_buttons">
										<div class="button event_button event_button_1"><a href="Registration_Controller?reg_id=<%=dto.getId()%>">Buy Tickets Now!</a></div>
										<div class="button_2 event_button event_button_2"><a href="#">Read more</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
							<%
	}
}else{
%>
<h3>Record Not Available</h3>
<%
}
%>

			<div class="row">
				<div class="col">
					<div class="pagination">
						<ul>
							<li class="active"><a href="#">01.</a></li>
							<li><a href="#">02.</a></li>
							<li><a href="#">03.</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Call to action -->

	<div class="cta">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/cta_1.jpg" data-speed="0.8"></div>
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="cta_content text-center">
						<div class="cta_title">Get your tickets now!</div>
						<div class="button cta_button"><a href="#">Find out more</a></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->

	<footer class="footer">
		<div class="footer_content">
			<div class="container">
				<div class="row">
					
					<!-- Footer Column -->
					<div class="col-lg-4 footer_col">
						<div class="footer_about">
							<div>
								<a href="#">
									
								</a>	
							</div>
							<div class="footer_about_text">
								<p>Donec quis metus ac arcu luctus accumsan. Nunc in justo tincidunt, sodales nunc id, finibus nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>
							</div>
						</div>
					</div>

					<!-- Footer Column -->
					<div class="col-lg-3 footer_col">
						<div class="footer_links">
							<ul>
								<li><a href="#">About Us</a></li>
								<li><a href="#">Services</a></li>
								<li><a href="#">Speakers</a></li>
								<li><a href="#">Event Dates</a></li>
								<li><a href="#">Information</a></li>
								<li><a href="#">Calendar</a></li>
							</ul>
						</div>
					</div>

					<!-- Footer Column -->
					<div class="col-lg-3 footer_col">
						<div class="footer_links">
							<ul>
								<li><a href="#">Logistics</a></li>
								<li><a href="#">Our Partners</a></li>
								<li><a href="#">Testimonials</a></li>
								<li><a href="#">Price Plans</a></li>
								<li><a href="#">News</a></li>
								<li><a href="#">Contact</a></li>
							</ul>
						</div>
					</div>

					<!-- Footer Column -->
					<div class="col-lg-2 footer_col">
						<div class="footer_links">
							<ul>
								<li><a href="#">About Us</a></li>
								<li><a href="#">Services</a></li>
								<li><a href="#">Speakers</a></li>
								<li><a href="#">Event Dates</a></li>
								<li><a href="#">Information</a></li>
								<li><a href="#">Calendar</a></li>
							</ul>
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="footer_extra">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="footer_extra_content d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-lg-start justify-content-center">
							<div class="footer_social">
								<div class="footer_social_title">Follow us on Social Media</div>
								<ul class="footer_social_list">
									<li><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
									<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
									<li><a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
									<li><a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a></li>
									<li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
								</ul>
							</div>
							<div class="footer_extra_right ml-lg-auto text-lg-right">
								<div class="footer_extra_links">
									<ul>
										<li><a href="contact.jsp">Contact us</a></li>
										<li><a href="#">Sitemap</a></li>
										<li><a href="#">Privacy</a></li>
									</ul>
								</div>
								<div class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
		
</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="js/events.js"></script>
</body>
</html>