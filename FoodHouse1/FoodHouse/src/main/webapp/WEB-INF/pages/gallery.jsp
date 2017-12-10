
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="SpringMVC.entity.Food"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Food Club a Hotels and Restaurants Category Bootstrap responsive Website Template | Gallery :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Food Club Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->


<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css"/>
    <!-- Custom CSS -->
<link rel="stylesheet" href="css/gallery.css">
<!--// css -->
<!-- menu -->
<link type="text/css" rel="stylesheet" href="css/cm-overlay.css" />
<!-- //menu -->

<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<link href="css/lsb.css" rel="stylesheet" type="text/css">
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Great+Vibes&amp;subset=latin-ext" rel="stylesheet">
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 

<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
</head>
<body>
	<!-- banner -->
	<div class="banner jarallax">
		<!-- agileinfo-dot -->
		<div class="agileinfo-dot">
			<div class="w3layouts-header-top">
				<div class="w3-header-top-grids">
					<div class="w3-header-top-left">
						<p><i class="fa fa-home" aria-hidden="true"></i> 1st Street , mexico city</p>
					</div>
					<div class="w3-header-top-right">
						<div class="agileinfo-social-grids">
							<ul>
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-rss"></i></a></li>
								<li><a href="#"><i class="fa fa-vk"></i></a></li>
							</ul>
						</div>
						<div class="w3-header-top-right-text">
							<div class="agileinfo-social-grids">
								<ul>
									<li><a href="login">Login</a></li>
									<li><a href="signup">Signup</a></li>
								</ul>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="head">
				<div class="head-nav-grids">
					<div class="navbar-top">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
							  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							  </button>
								 <div class="navbar-brand logo ">
									<h1><a href="home">Food <span>Club</span></a></h1>
								</div>

							</div>

							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							 <ul class="nav navbar-nav link-effect-4">
							<li><a href="home" data-hover="Home">Home</a> </li>
								<li><a href="about" data-hover="About">About </a> </li>
								<li class="active"><a href="gallery"  data-hover="Gallery">Gallery</a></li>
							  	<li><a href="our_branches" data-hover="OurBranches">Our Branches</a></li>
								<li><a href="contact" data-hover="Contact">Contact</a></li>
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
			
					<div class="header-left">
						<ul>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">@example.com</a></li>
							<li><i class="fa fa-fax" aria-hidden="true"></i> +1234 567 892</li>
						</ul>
					</div>
					<div class="clearfix"></div>	
				</div>
			</div>
			<div class="w3-agile-main-heading">
				<h2>Gallery</h2>
			</div>
		</div>
		<!-- //agileinfo-dot -->
	</div>
	<!-- //banner -->
	<!-- menu -->
	<div class="container" style="padding:2em 0;">
		<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
				<ul id="myTab" class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#home-main" id="home-tab" role="tab" data-toggle="tab" aria-controls="home-main" aria-expanded="true">All</a></li>
					<li role="presentation"><a href="#learning" role="tab" id="learning-tab" data-toggle="tab" aria-controls="learning">starters</a></li>
					<li role="presentation"><a href="#playing" role="tab" id="playing-tab" data-toggle="tab" aria-controls="playing">main course</a></li>
					<li role="presentation"><a href="#painting" role="tab" id="painting-tab" data-toggle="tab" aria-controls="painting">salads</a></li>
					<li role="presentation"><a href="#school" role="tab" id="school-tab" data-toggle="tab" aria-controls="school">desserts</a></li>
				</ul>
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade in active" id="home-main" aria-labelledby="home-tab">
						<div class="w3_tab_img">
							<c:forEach items="${listFood }" var="food">
								<div class="col-sm-3 w3_tab_img_left">
									<div class="demo">
										<a class="cm-overlay" href="${food.image }">
										  <figure class="imghvr-shutter-in-out-diag-2"><img src="${food.image }" alt=" " class="img-responsive" />
										  </figure>
										</a>
									</div>
									<div class="agile-gallery-info">
										<h5>${food.name }</h5>
										<div class="product-carousel-price">
	                                    	<ins>$${food.price }</ins> <del>$${food.price_promotion }</del>
	                                	</div> 
									</div>
								</div>
							</c:forEach>
							<div class="clearfix"> </div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="learning" aria-labelledby="learning-tab">
						<div class="w3_tab_img">
							<c:forEach items="${listStarters }" var="startersFood">
								<div class="col-sm-3 w3_tab_img_left">
									<div class="demo">
										<a class="cm-overlay" href="${startersFood.image }">
											<figure class="imghvr-shutter-in-out-diag-2"><img src="${startersFood.image }" alt=" " class="img-responsive">
											</figure>
										</a>
									</div>
									<div class="agile-gallery-info">
										<h5>${startersFood.name }</h5>
										<div class="product-carousel-price">
	                                    	<ins>$${startersFood.price }</ins> <del>$${startersFood.price_promotion }</del>
	                                	</div> 
									</div>
								</div>
							</c:forEach>
							<div class="clearfix"> </div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="playing" aria-labelledby="playing-tab">
						<div class="w3_tab_img">
							<c:forEach items="${listMainCourse }" var="mainCourseFood">
								<div class="col-sm-3 w3_tab_img_left">
									<div class="demo">
										<a class="cm-overlay" href="${mainCourseFood.image }">
											<figure class="imghvr-shutter-in-out-diag-2"><img src="${mainCourseFood.image }" alt=" " class="img-responsive">
											</figure>
										</a>
									</div>
									<div class="agile-gallery-info">
										<h5>${mainCourseFood.name }</h5>
										<div class="product-carousel-price">
	                                    	<ins>$${mainCourseFood.price }</ins> <del>$${mainCourseFood.price_promotion }</del>
	                                	</div> 
									</div>
								</div>
							</c:forEach>
							
							<div class="clearfix"> </div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="painting" aria-labelledby="painting-tab">
						<div class="w3_tab_img">
							<c:forEach items="${listSalads }" var="saladsFood">
								<div class="col-sm-3 w3_tab_img_left">
									<div class="demo">
										<a class="cm-overlay" href="${saladsFood.image }">
											<figure class="imghvr-shutter-in-out-diag-2"><img src="${saladsFood.image }" alt=" " class="img-responsive">
											</figure>
										</a>
									</div>
									<div class="agile-gallery-info">
										<h5>${saladsFood.name }</h5>
										<div class="product-carousel-price">
	                                    	<ins>$${saladsFood.price }</ins> <del>$${saladsFood.price_promotion }</del>
	                                	</div> 
									</div>
								</div>
							</c:forEach>
							<div class="clearfix"> </div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="school" aria-labelledby="school-tab">
						<div class="w3_tab_img">
							<c:forEach items="${listDesserts }" var="dessertsFood">
								<div class="col-sm-3 w3_tab_img_left">
									<div class="demo">
										<a class="cm-overlay" href="${dessertsFood.image }">
											<figure class="imghvr-shutter-in-out-diag-2"><img src="${dessertsFood.image }" alt=" " class="img-responsive">
											</figure>
										</a>
									</div>
									<div class="agile-gallery-info">
										<h5>${dessertsFood.name }</h5>
										<div class="product-carousel-price">
	                                    	<ins>$${dessertsFood.price }</ins> <del>$${dessertsFood.price_promotion }</del>
	                                	</div> 
									</div>
								</div>
							</c:forEach>
							
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
		</div>
		<script src="js/jquery.tools.min.js"></script>
		<script src="js/jquery.mobile.custom.min.js"></script>
		<script src="js/jquery.cm-overlay.js"></script>
		<script>
			$(document).ready(function(){
				$('.cm-overlay').cmOverlay();
			});
		</script>
	</div>
	<!-- //menu -->
	<!-- footer -->
	<div class="w3-agile-footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h3><a href="home">Food <span>Club</span></a></h3>
					</div>
					<div class="agile-footer-info">
						<p>Maecenas pharetra scelerisque sem quis commodo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Interdum et malesuada fames ac ante ipsum primis in faucibus.</p>
					</div>
					<div class="social">
						<ul>
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-rss"></i></a></li>
							<li><a href="#"><i class="fa fa-vk"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Address</h4>
					</div>
					<div class="footer-grid-info">
						<p>Eiusmod Tempor inc
							<span>St Dolore Place,Kingsport 56777.</span>
						</p>
						<p class="phone">Phone : +1 123 456 789
							<span>Email : <a href="mailto:example@email.com">mail@example.com</a></span>
							<span>FAX : 123 456 7890</span>
						</p>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Navigation</h4>
					</div>
					<div class="footer-grid-info">
						<ul>
							<li><a href="home">Home</a></li>
							<li><a href="about">About</a></li>
							<li><a href="gallery">Gallery</a></li>
							<li><a href="icons">Icons</a></li>
							<li><a href="codes">Short Codes</a></li>
							<li><a href="contact">Contact</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Twitter Posts</h4>
					</div>
					<div class="agile-footer-grid">
						<ul class="w3agile_footer_grid_list">
							<li>Ut aut reiciendis voluptatibus maiores <a href="#">http://example.com</a> alias, ut aut reiciendis.
								<span><i class="fa fa-twitter" aria-hidden="true"></i> 02 days ago</span></li>
							<li>Itaque earum rerum hic tenetur a sapiente delectus <a href="#">http://example.com</a><span><i class="fa fa-twitter" aria-hidden="true"></i> 03 days ago</span></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="agileits-w3layouts-copyright">
				<p>© 2017 Food Club . All Rights Reserved | Design by <a href="http://w3layouts.com/"> W3layouts</a> </p>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<script src="js/jarallax.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
	<script src="js/lsb.min.js"></script>
			<script>
			$(window).load(function() {
				  $.fn.lightspeedBox();
				});
			</script>
<!-- //js -->

</body>	
</html>