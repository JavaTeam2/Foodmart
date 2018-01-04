
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>Add Branch</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}
/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}
/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
</style>
</head>

<body>

	<jsp:include page="ad_header.jsp"></jsp:include>

	<div class="container">
		<h1>Add new branch</h1>
		<br /> ${message}
		<form:form method="post"
			action="${pageContext.request.contextPath}/admin/branchs/add "
			modelAttribute="branchForm">
			<div class="form-group">
				<label>Name</label>
				<form:input path="name" class="form-control" />
			</div>

			<div class="form-group">
				<label>Address</label>
				<form:input path="address" class="form-control" />
			</div>

			<div class="form-group">
				<label>Province</label>
				<form:input path="province" class="form-control" />
			</div>

			<div class="form-group">
				<label>City</label>
				<form:input path="city" class="form-control" />
			</div>

			<div class="form-group">
				<label>Phone</label>
				<form:input path="phone" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Open time</label>
				<form:input path="open_time" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Close time</label>
				<form:input path="close_time" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Table quantity</label>
				<form:input path="table_quantity" class="form-control" />
			</div>
			
				<div class="form-group">
				<label>Image</label> <form:input type="file"
					class="form-control-file" path="image"/>
			</div>
			
			<div class="form-group">
				<label>Description</label>
				<form:input path="description" class="form-control" />
			</div>
			
			<button type="submit" class="btn btn-primary">Save</button>
			<br />
			<br />
		</form:form>
	</div>

	<jsp:include page="ad_footer.jsp"></jsp:include>

</body>

</html>