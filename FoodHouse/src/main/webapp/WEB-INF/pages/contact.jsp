<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Food Club a Hotels and Restaurants Category Bootstrap responsive Website Template | Contact :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Food Club Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!--// css -->
<link href="css/shopping-item.css" rel="stylesheet">
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
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
									<sec:authorize access="hasRole('ROLE_ANONYMOUS')">
										<li><a href="login">Login</a></li>
										<li><a href="signup">Signup</a></li>
									</sec:authorize>
									<sec:authorize access="hasRole('CUSTOMER')">
										<li><p>Hi, ${username }</p></li>
										<li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
									
									</sec:authorize>
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
								<li><a href="gallery"  data-hover="Gallery">Gallery</a></li>
								<li><a href="our_branches" data-hover="OurBranches">Our Branches</a></li>
								<li class="active"><a href="contact.html" data-hover="Contact">Contact</a></li>
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
			
					<sec:authorize access="hasRole('ROLE_CUSTOMER')">
					<div class="header-left shopping-item" style="margin-top: 10px;">
						<!-- <ul>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">@example.com</a></li>
							<li><i class="fa fa-fax" aria-hidden="true"></i> +1234 567 892</li>
						</ul> -->
						
    						<a href="cart.html">Cart - <span class="cart-amunt">$${cartForm.total_money }</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">${count }</span></a>
    					
						<!-- <a href="cart.html">Cart - <span class="cart-amunt">$800</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a> -->
						
					</div>
			</sec:authorize>
			<sec:authorize access="hasRole('ROLE_ANONYMOUS')">
			<div class="header-left">
				<ul>
					<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">@example.com</a></li>
					<li><i class="fa fa-fax" aria-hidden="true"></i> +1234 567 892</li>
				</ul>
			</div>
			</sec:authorize>
					<div class="clearfix"></div>	
				</div>
			</div>
			<div class="w3-agile-main-heading">
				<h2>Contact Us</h2>
			</div>
		</div>
		<!-- //agileinfo-dot -->
	</div>
	<!-- //banner -->
	<!-- contact -->
	<div class="contact-content">
		<div class="container">	
			<div class="map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d158858.18237072596!2d-0.10159865000003898!3d51.52864165000001!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1436514341845" allowfullscreen=""></iframe>
			</div>
			<div class="contact-form">
				<h3>Contact form</h3>
				<form action="#" method="post">
					<input type="text" name="Name" placeholder="Name" required="">
					<input type="text" name="Email" placeholder="Email" required="">
					<input type="text" name="Subject" placeholder="Subject" required="">
					<textarea name="Message" placeholder="Message" required=""></textarea>
					<input type="submit" value="SEND">
				</form>
			</div>
			<div class="contact-grids">
				<h3 class="map">Our Branches</h3>
				<div class="address-grids">
					<div class="col-md-4 address-text">
						<div class="address-grid">
							<h5>10-43 Jack Road, 
								<span>Glasgow, D-6 78GH</span>
							</h5>
							<div class="address-info">
								<div class="address-info-left">
									<p>Freephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>Telephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>FAX :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
								<div class="e-mail">
									<p>E-mail : <a href="mailto:example@email.com">Example@mail.com</a></p>
								</div>
						</div>
					</div>
					<div class="col-md-4 address-text">
						<div class="address-grid">
							<h5>09-45 Mary Road, 
								<span>London, J-9 09SD</span>
							</h5>
							<div class="address-info">
								<div class="address-info-left">
									<p>Freephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>Telephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>FAX :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="e-mail">
								<p>E-mail : <a href="mailto:example@email.com">Example@mail.com</a></p>
							</div>
						</div>
					</div>
					<div class="col-md-4 address-text">
						<div class="address-grid">
							<h5>34-05 Shone Road, 
								<span>Mexico, M-5 09SD</span>
							</h5>
							<div class="address-info">
								<div class="address-info-left">
									<p>Freephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>Telephone :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="address-info">
								<div class="address-info-left">
									<p>FAX :</p>
								</div>
								<div class="address-info-left address-info-right">
									<p>+1 123 456 7890</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="e-mail">
								<p>E-mail : <a href="mailto:example@email.com">Example@mail.com</a></p>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div> 			
	</div>
	<!-- //contact -->
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
				<p>� 2017 Food Club . All Rights Reserved | Design by <a href="http://w3layouts.com/"> W3layouts</a> </p>
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
</body>	
</html>