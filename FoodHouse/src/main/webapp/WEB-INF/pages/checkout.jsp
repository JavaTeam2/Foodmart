<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
<link rel="stylesheet" href="css/checkout.css" type="text/css"/>
<link href="css/shopping-item.css" rel="stylesheet">
    <!-- Custom CSS -->

<!--// css -->


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
							<li><a href="${pageContext.request.contextPath}/home" data-hover="Home">Home</a> </li>
								<li><a href="about" data-hover="About">About </a> </li>
								<li><a href="gallery"  data-hover="Gallery">Gallery</a></li>
							  	<li><a href="our_branches" data-hover="OurBranches">Our Branches</a></li>
								<li><a href="contact" data-hover="Contact">Contact</a></li>
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
			
					
					<div class="header-left shopping-item" style="margin-top: 10px;">
						<!-- <ul>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">@example.com</a></li>
							<li><i class="fa fa-fax" aria-hidden="true"></i> +1234 567 892</li>
						</ul> -->
						
    						<a href="shoppingCart">Cart - <span class="cart-amunt">$${cartForm.total_money }</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">${count }</span></a>
    					
						<!-- <a href="cart.html">Cart - <span class="cart-amunt">$800</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a> -->
						
					</div>
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
				<h2>Checkout</h2>
			</div>
		</div>
		<!-- //agileinfo-dot -->
	</div>
	<!-- //banner -->
	
	<!-- checkout -->
	<div class="single-product-area">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Search Products</h2>
                        <form action="">
                            <input type="text" placeholder="Search products...">
                            <input type="submit" value="Search">
                        </form>
                    </div>
                    
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Products</h2>
                       <c:forEach items="${listSpecial }" var="food">
                        	<div class="thubmnail-recent">
	                            <img src="${food.image }" class="recent-thumb" alt="">
	                            <h2><a href="single-product.html">${food.name }</a></h2>
	                            <div class="product-sidebar-price">
	                                <ins>$${food.price }</ins> <del>$${food.price_promotion }</del>
	                            </div>                             
                        	</div>
                        </c:forEach>
                    </div>
                    
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Recent Posts</h2>
                        <ul>
                            <c:forEach items="${listSpecial }" var="food">
                        		<li><a href="#">${food.name }</a></li>
                        	</c:forEach>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <div class="woocommerce-info">Returning customer? <a class="showlogin" data-toggle="collapse" href="#login-form-wrap" aria-expanded="false" aria-controls="login-form-wrap">Click here to login</a>
                            </div>

                            <form id="login-form-wrap" class="login collapse" method="post">


                                <p>If you have shopped with us before, please enter your details in the boxes below. If you are a new customer please proceed to the Billing &amp; Shipping section.</p>

                                <p class="form-row form-row-first">
                                    <label for="username">Username or email <span class="required">*</span>
                                    </label>
                                    <input type="text" id="username" name="username" class="input-text">
                                </p>
                                <p class="form-row form-row-last">
                                    <label for="password">Password <span class="required">*</span>
                                    </label>
                                    <input type="password" id="password" name="password" class="input-text">
                                </p>
                                <div class="clear"></div>


                                <p class="form-row">
                                    <input type="submit" value="Login" name="login" class="button">
                                    <label class="inline" for="rememberme"><input type="checkbox" value="forever" id="rememberme" name="rememberme"> Remember me </label>
                                </p>
                                <p class="lost_password">
                                    <a href="#">Lost your password?</a>
                                </p>

                                <div class="clear"></div>
                            </form>

                            <div class="woocommerce-info">Have a coupon? <a class="showcoupon" data-toggle="collapse" href="#coupon-collapse-wrap" aria-expanded="false" aria-controls="coupon-collapse-wrap">Click here to enter your code</a>
                            </div>

                            <form id="coupon-collapse-wrap" method="post" class="checkout_coupon collapse">

                                <p class="form-row form-row-first">
                                    <input type="text" value="" id="coupon_code" placeholder="Coupon code" class="input-text" name="coupon_code">
                                </p>

                                <p class="form-row form-row-last">
                                    <input type="submit" value="Apply Coupon" name="apply_coupon" class="button">
                                </p>

                                <div class="clear"></div>
                            </form>

                            <form:form action="${pageContext.request.contextPath}/checkoutConfirmation" method="POST"  modelAttribute="cartForm">

                                <div id="customer_details" class="col2-set">
                                <sec:authorize access="hasRole('ROLE_CUSTOMER')">
                                    <div class="col-1">
                                        <div class="woocommerce-billing-fields">
                                            <h3>User Information</h3>
                                            
											
                                            <p id="billing_first_name_field" class="form-row form-row-first validate-required">
                                                <label class="" for="billing_first_name">Name 
                                                </label>
                                                <input readonly type="text"  value="${user.name }" placeholder="" id="billing_first_name" name="billing_first_name" class="input-text ">
                                            </p>

                                            <div class="clear"></div>


                                            <p id="billing_address_1_field" class="form-row form-row-wide address-field validate-required">
                                                <label class="" for="billing_address_1">Address 
                                                </label>
                                                <input readonly type="text" value="${user.address }" placeholder="Street address" id="billing_address_1" name="billing_address_1" class="input-text ">
                                            </p>

                                            <p id="billing_city_field" class="form-row form-row-wide address-field validate-required" data-o_class="form-row form-row-wide address-field validate-required">
                                                <label  class="" for="billing_city">Town / City 
                                                </label>
                                                <input readonly type="text" value="${user.city }" placeholder="Town / City" id="billing_city" name="billing_city" class="input-text ">
                                            </p>


                                            <div class="clear"></div>

                                            <p id="billing_email_field" class="form-row form-row-first validate-required validate-email">
                                                <label class="" for="billing_email">Email Address 
                                                </label>
                                                <input readonly type="text" value="${user.email }" placeholder="" id="billing_email" name="billing_email" class="input-text ">
                                            </p>

                                            <p id="billing_phone_field" class="form-row form-row-last validate-required validate-phone">
                                                <label class="" for="billing_phone">Phone 
                                                </label>
                                                <input readonly type="text" value="${user.phone }" placeholder="" id="billing_phone" name="billing_phone" class="input-text ">
                                            </p>
                                            <div class="clear"></div>

                                        </div>
                                    </div>
								</sec:authorize>
                                    <div class="col-2">
                                        <div class="woocommerce-shipping-fields">
                                        <h3 id="ship-to-different-address">
                        <label class="checkbox" for="ship-to-different-address-checkbox">Ship to address?</label>
                        
                        </h3>	
                                        		
                                            <div class="shipping_address" style="display: block;">
                                                
												<form:input type="hidden" path="id"/>
												<form:input type="hidden" path="customer_id.id"/>
												<form:input type="hidden" path="customer_province"/>
												<form:input type="hidden" path="total_money"/>
												<form:input type="hidden" path="date_time"/>
												<form:input type="hidden" path="status"/>
												<%-- <form:input type="" path="listUserDetails"/> --%>
												<c:forEach items="${cartForm.listUserDetails }" var = "cartLine" varStatus="i">
													<form:input type="hidden" path="listUserDetails[${i.index}].id"/>
                                                    <form:input type="hidden" path="listUserDetails[${i.index}].order_id.id"/>
                                                    <form:input type="hidden" path="listUserDetails[${i.index}].food_id.id"/>
                                                    <form:input type="hidden" path="listUserDetails[${i.index}].price"/>
												</c:forEach>
												
                                                <p id="shipping_first_name_field" class="form-row form-row-first validate-required">
                                                    <label class="" for="shipping_first_name">Name 
                                                    </label>
                                                    <form:input type="text" path="customer_name" placeholder="" id="shipping_first_name" name="shipping_first_name" class="input-text "/>
                                                </p>

                                               
                                                <div class="clear"></div>


                                                <p id="shipping_address_1_field" class="form-row form-row-wide address-field validate-required">
                                                    <label class="" for="shipping_address_1">Address 
                                                    </label>
                                                    <form:input type="text" path="customer_address" placeholder="Street address" id="shipping_address_1" name="shipping_address_1" class="input-text "/>
                                                </p>

                                                <p id="shipping_city_field" class="form-row form-row-wide address-field validate-required" data-o_class="form-row form-row-wide address-field validate-required">
                                                    <label class="" for="shipping_city">Town / City 
                                                    </label>
                                                    <form:input type="text" path="customer_city" placeholder="Town / City" id="shipping_city" name="shipping_city" class="input-text "/>
                                                </p>
												
												<p id="shipping_email_field" class="form-row form-row-first validate-required validate-email">
                                                <label class="" for="shipping_email">Email Address 
                                                </label>
                                                <form:input type="text" path="customer_email" placeholder="" id="shipping_email" name="billing_email" class="input-text "/>
                                            </p>
												
												<p id="shipping_city_field" class="form-row form-row-last validate-required validate-phone">
	                                                <label class="" for="shipping_phone">Phone 
	                                                </label>
	                                                <form:input type="text" path="customer_phone" placeholder="" id="shipping_phone" name="shipping_phone" class="input-text "/>
                                            	</p>
												
                                                <div class="clear"></div>
											<p id="shipping_country_field" class="form-row form-row-wide address-field update_totals_on_change validate-required woocommerce-validated">
                                                    <label class="" for="shipping_branch">Branch 
                                                    </label>
                                                    <select  class="country_to_state country_select" id="shipping_branch" name="shipping_branch">
                                                    	<c:forEach items="${listBranch }" var="branch">
                                                    		<option value="${branch.id }">${branch.name }</option>
                                                    	</c:forEach>
                                                        
                                                        
                                                    </select>
                                                </p>

                                            </div>

                                            <p id="order_comments_field" class="form-row notes">
                                                <label class="" for="order_comments">Order Notes</label>
                                                <form:textarea path="note" cols="5" rows="2" placeholder="Notes about your order, e.g. special notes for delivery." id="order_comments" class="input-text " name="order_comments"></form:textarea>
                                            </p>


                                        </div>

                                    </div>

                                </div>

                                <h3 id="order_review_heading">Your order</h3>

                                <div id="order_review" style="position: relative;">
                                    <table class="shop_table">
                                        <thead>
                                            <tr>
                                                <th class="product-name">Product</th>
                                                <th class="product-total">Total</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="cart_item">
                                                <td class="product-name">
                                                    Ship cost <strong class="product-quantity">x 1</strong> </td>
                                                <td class="product-total">
                                                    <span class="amount">$0.0</span> </td>
                                            </tr>
                                        </tbody>
                                        <tfoot>

                                            <tr class="cart-subtotal">
                                                <th>Cart Subtotal</th>
                                                <td><span class="amount">$${cartForm.total_money }</span>
                                                </td>
                                            </tr>

                                            <tr class="shipping">
                                                <th>Shipping and Handling</th>
                                                <td>

                                                    Free Shipping
                                                    <input type="hidden" class="shipping_method" value="free_shipping" id="shipping_method_0" data-index="0" name="shipping_method[0]">
                                                </td>
                                            </tr>


                                            <tr class="order-total">
                                                <th>Order Total</th>
                                                <td><strong><span class="amount">$${cartForm.total_money }</span></strong> </td>
                                            </tr>

                                        </tfoot>
                                    </table>


                                    <div id="payment">
                                        <ul class="payment_methods methods">
                                            <li class="payment_method_bacs">
                                                <input type="radio" data-order_button_text="" checked="checked" value="bacs" name="payment_method" class="input-radio" id="payment_method_bacs">
                                                <label for="payment_method_bacs">Direct Bank Transfer </label>
                                                <div class="payment_box payment_method_bacs">
                                                    <p>Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order won’t be shipped until the funds have cleared in our account.</p>
                                                </div>
                                            </li>
                                            <li class="payment_method_cheque">
                                                <input type="radio" data-order_button_text="" value="cheque" name="payment_method" class="input-radio" id="payment_method_cheque">
                                                <label for="payment_method_cheque">Cheque Payment </label>
                                                <div style="display:none;" class="payment_box payment_method_cheque">
                                                    <p>Please send your cheque to Store Name, Store Street, Store Town, Store State / County, Store Postcode.</p>
                                                </div>
                                            </li>
                                            <li class="payment_method_paypal">
                                                <input type="radio" data-order_button_text="Proceed to PayPal" value="paypal" name="payment_method" class="input-radio" id="payment_method_paypal">
                                                <label for="payment_method_paypal">PayPal <img alt="PayPal Acceptance Mark" src="https://www.paypalobjects.com/webstatic/mktg/Logo/AM_mc_vs_ms_ae_UK.png"><a title="What is PayPal?" onclick="javascript:window.open('https://www.paypal.com/gb/webapps/mpp/paypal-popup','WIPaypal','toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=yes, width=1060, height=700'); return false;" class="about_paypal" href="https://www.paypal.com/gb/webapps/mpp/paypal-popup">What is PayPal?</a>
                                                </label>
                                                <div style="display:none;" class="payment_box payment_method_paypal">
                                                    <p>Pay via PayPal; you can pay with your credit card if you don’t have a PayPal account.</p>
                                                </div>
                                            </li>
                                        </ul>

                                        <div class="form-row place-order">

                                            <input type="submit" value="Place order" name="Place order" class="button">


                                        </div>

                                        <div class="clear"></div>

                                    </div>
                                </div>
                            </form:form>

                        </div>                       
                    </div>                    
                </div>
            </div>
        </div>
    </div>
	<!-- //checkout -->
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

