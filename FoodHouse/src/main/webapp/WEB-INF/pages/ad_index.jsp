<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>FoodHouse admin page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">








<<<<<<< HEAD


=======
>>>>>>> b06dff696a631b5ba3b6b9a69b6b6997a8ef6a39
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }








<<<<<<< HEAD


=======
>>>>>>> b06dff696a631b5ba3b6b9a69b6b6997a8ef6a39
</script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<!-- Custom Theme files -->
<link href="css/ad_style.css" rel="stylesheet" type="text/css"
	media="all" />
<!--js-->
<script src="js/jquery-2.1.1.min.js"></script>
<!--icons-css-->
<link href="css/font-awesome.css" rel="stylesheet">
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'
	rel='stylesheet' type='text/css'>
<!--static chart-->
<script src="js/Chart.min.js"></script>
<!--//charts-->
<!-- geo chart -->
<script src="//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js"
	type="text/javascript"></script>
<script>
	window.modernizr
			|| document
					.write('<script src="lib/modernizr/modernizr-custom.js"><\/script>')
</script>
<!--<script src="lib/html5shiv/html5shiv.js"></script>-->
<!-- Chartinator  -->
<script src="js/chartinator.js"></script>
<script type="text/javascript">
	jQuery(function($) {

		var chart3 = $('#geoChart').chartinator(
				{
					tableSel : '.geoChart',

					columns : [ {
						role : 'tooltip',
						type : 'string'
					} ],

					colIndexes : [ 2 ],

					rows : [ [ 'China - 2015' ], [ 'Colombia - 2015' ],
							[ 'France - 2015' ], [ 'Italy - 2015' ],
							[ 'Japan - 2015' ], [ 'Kazakhstan - 2015' ],
							[ 'Mexico - 2015' ], [ 'Poland - 2015' ],
							[ 'Russia - 2015' ], [ 'Spain - 2015' ],
							[ 'Tanzania - 2015' ], [ 'Turkey - 2015' ] ],

					ignoreCol : [ 2 ],

					chartType : 'GeoChart',

					chartAspectRatio : 1.5,

					chartZoom : 1.75,

					chartOffset : [ -12, 0 ],

					chartOptions : {

						width : null,

						backgroundColor : '#fff',

						datalessRegionColor : '#F5F5F5',

						region : 'world',

						resolution : 'countries',

						legend : 'none',

						colorAxis : {

							colors : [ '#679CCA', '#337AB7' ]
						},
						tooltip : {

							trigger : 'focus',

							isHtml : true
						}
					}

				});
	});
</script>
<!--geo chart-->

<!--skycons-icons-->
<script src="js/skycons.js"></script>
<!--//skycons-icons-->
</head>
<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<!--header start here-->
				<div class="header-main">
					<div class="header-left">
						<div class="logo-name">
							<a href="admin">
								<h1>FoodHouse</h1>
							</a>
						</div>
					</div>
					<div>
						<div class="profile_details">
							<ul>
								<li class="dropdown profile_details_drop"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown"
									aria-expanded="false">
										<div class="profile_img">
											<span class="prfil-img"><img src="images/admin/p1.png"
												alt=""> </span>
											<div class="user-name">
												<p>Malorum</p>
												<span>Administrator</span>
											</div>
											<i class="fa fa-angle-down lnr"></i> <i
												class="fa fa-angle-up lnr"></i>
											<div class="clearfix"></div>
										</div>
								</a>
									<ul class="dropdown-menu drp-mnu">
										<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
										<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
										<li><a href="#"><i class="fa fa-sign-out"></i> Logout</a>
										</li>
									</ul></li>
							</ul>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
			<!--heder end here-->
			<!-- script-for sticky-nav -->
			<script>
				$(document).ready(function() {
					var navoffeset = $(".header-main").offset().top;
					$(window).scroll(function() {
						var scrollpos = $(window).scrollTop();
						if (scrollpos >= navoffeset) {
							$(".header-main").addClass("fixed");
						} else {
							$(".header-main").removeClass("fixed");
						}
					});

				});
			</script>
			<!-- /script-for sticky-nav -->
			<!--inner block start here-->
			<div class="inner-block">
				<!--market updates updates-->
				<div class="market-updates">
					<div class="col-md-4 market-update-gd">
						<div class="market-update-block clr-block-1">
							<div class="col-md-8 market-update-left">
								<h3>83</h3>
								<h4>Registered User</h4>
								<p>Other hand, we denounce</p>
							</div>
							<div class="col-md-4 market-update-right">
								<i class="fa fa-file-text-o"> </i>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="col-md-4 market-update-gd">
						<div class="market-update-block clr-block-2">
							<div class="col-md-8 market-update-left">
								<h3>135</h3>
								<h4>Daily Visitors</h4>
								<p>Other hand, we denounce</p>
							</div>
							<div class="col-md-4 market-update-right">
								<i class="fa fa-eye"> </i>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="col-md-4 market-update-gd">
						<div class="market-update-block clr-block-3">
							<div class="col-md-8 market-update-left">
								<h3>23</h3>
								<h4>New Messages</h4>
								<p>Other hand, we denounce</p>
							</div>
							<div class="col-md-4 market-update-right">
								<i class="fa fa-envelope-o"> </i>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--market updates end here-->
				<!--mainpage chit-chating-->
				<div class="chit-chat-layer1">
					<div class="col-md-6 chit-chat-layer1-left">
						<div class="work-progres">
							<div class="chit-chat-heading">Recent Followers</div>
							<div class="table-responsive">
								<table class="table table-hover">
									<thead>
										<tr>
											<th>#</th>
											<th>Project</th>
											<th>Manager</th>

											<th>Status</th>
											<th>Progress</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Face book</td>
											<td>Malorum</td>

											<td><span class="label label-danger">in progress</span></td>
											<td><span class="badge badge-info">50%</span></td>
										</tr>
										<tr>
											<td>2</td>
											<td>Twitter</td>
											<td>Evan</td>

											<td><span class="label label-success">completed</span></td>
											<td><span class="badge badge-success">100%</span></td>
										</tr>
										<tr>
											<td>3</td>
											<td>Google</td>
											<td>John</td>

											<td><span class="label label-warning">in progress</span></td>
											<td><span class="badge badge-warning">75%</span></td>
										</tr>
										<tr>
											<td>4</td>
											<td>LinkedIn</td>
											<td>Danial</td>

											<td><span class="label label-info">in progress</span></td>
											<td><span class="badge badge-info">65%</span></td>
										</tr>
										<tr>
											<td>5</td>
											<td>Tumblr</td>
											<td>David</td>

											<td><span class="label label-warning">in progress</span></td>
											<td><span class="badge badge-danger">95%</span></td>
										</tr>
										<tr>
											<td>6</td>
											<td>Tesla</td>
											<td>Mickey</td>

											<td><span class="label label-info">in progress</span></td>
											<td><span class="badge badge-success">95%</span></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="col-md-6 chit-chat-layer1-rit">
						<div class="geo-chart">
							<section id="charts1" class="charts">
								<div class="wrapper-flex">

									<table id="myTable"
										class="geoChart tableChart data-table col-table"
										style="display: none;">
										<caption>Student Nationalities Table</caption>
										<tr>
											<th scope="col" data-type="string">Country</th>
											<th scope="col" data-type="number">Number of Students</th>
											<th scope="col" data-role="annotation">Annotation</th>
										</tr>
										<tr>
											<td>China</td>
											<td align="right">20</td>
											<td align="right">20</td>
										</tr>
										<tr>
											<td>Colombia</td>
											<td align="right">5</td>
											<td align="right">5</td>
										</tr>
										<tr>
											<td>France</td>
											<td align="right">3</td>
											<td align="right">3</td>
										</tr>
										<tr>
											<td>Italy</td>
											<td align="right">1</td>
											<td align="right">1</td>
										</tr>
										<tr>
											<td>Japan</td>
											<td align="right">18</td>
											<td align="right">18</td>
										</tr>
										<tr>
											<td>Kazakhstan</td>
											<td align="right">1</td>
											<td align="right">1</td>
										</tr>
										<tr>
											<td>Mexico</td>
											<td align="right">1</td>
											<td align="right">1</td>
										</tr>
										<tr>
											<td>Poland</td>
											<td align="right">1</td>
											<td align="right">1</td>
										</tr>
										<tr>
											<td>Russia</td>
											<td align="right">11</td>
											<td align="right">11</td>
										</tr>
										<tr>
											<td>Spain</td>
											<td align="right">2</td>
											<td align="right">2</td>
										</tr>
										<tr>
											<td>Tanzania</td>
											<td align="right">1</td>
											<td align="right">1</td>
										</tr>
										<tr>
											<td>Turkey</td>
											<td align="right">2</td>
											<td align="right">2</td>
										</tr>

									</table>

									<div class="col geo_main">
										<h3 id="geoChartTitle">World Market</h3>
										<div id="geoChart" class="chart"></div>
									</div>


								</div>
								<!-- .wrapper-flex -->
							</section>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--main page chit chating end here-->
			<!--inner block end here-->
			<!--copy rights start here-->
			<div class="copyrights">
				<p>
					Â© 2016 Shoppy. All Rights Reserved | Design by <a
						href="http://w3layouts.com/" target="_blank">W3layouts</a>
				</p>
			</div>
			<!--COPY rights end here-->
		</div>
	</div>
	<!--slider menu-->
	<div class="sidebar-menu">
		<div class="logo">
			<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
			</a> <a href="#"> <span id="logo"></span> <!--<img id="logo" src="" alt="Logo"/>-->
			</a>
		</div>
		<div class="menu">
			<ul id="menu">
				<li id="menu-home"><a href="#"><i class="fa fa-tachometer"></i><span>Dashboard</span></a></li>

				<li><a href="admin/categories"><i class="glyphicon glyphicon-th-list"></i><span>Categories
							Foods</span></a></li>
				<li><a href="admin/branchs"><i class="fa fa-map-marker"></i><span>
							Branchs</span></a></li>
				<li><a href="admin/foods"><i
						class="fa fa-book nav_icon"></i><span> Foods</span></a></li>
			</ul>
		</div>
	</div>
	<div class="clearfix"></div>
	</div>
	<!--slide bar menu end here-->
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}
					toggle = !toggle;
				});
	</script>
	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	<script src="js/bootstrap.js">
		
	</script>
	<!-- mother grid end here-->
</body>
</html>
