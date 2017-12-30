
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Foods</title>
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

.table td {
	text-align: center;
}

.table th {
	text-align: center;
}
</style>
</head>

<body>


	<jsp:include page="ad_header.jsp"></jsp:include>

	<div class="container">
		<h3>Foods</h3>
		<br /> <a href="${pageContext.request.contextPath}/admin/foods/add"
			class="btn btn-success">Add new food</a> </br> </br>

		<form
			action="${pageContext.request.contextPath}/admin/foods/delete-foods"
			method="POST">
			<button type="submit" class="btn btn-danger btn-sm">
				<span class="glyphicon glyphicon-trash"></span>
			</button>
			</br> </br>
			<div class="content table-responsive table-full-width">
				<table class="table table-hover table-striped">
					<thead>
						<th>Select</th>
						<th>Count</th>
						<th>Name</th>
						<th>Price</th>
						<th>Promotion</th>
						<th>Image</th>
						<th>Description</th>
						<th>Edit</th>
						<th>Delete</th>
					</thead>
					<tbody>
						<c:forEach items="${foods}" var="foods">
							<tr>
								<td><label><input type="checkbox" name="check"
										value="${foods.id }"></label></td>
								<td>${foods.id }</td>
								<td>${foods.name }</td>
								<td>${foods.price }</td>
								<td>${foods.price_promotion }</td>

								<td style="width: 20%" ><a href="${foods.image }"> <img
										src="${foods.image }" class="w3-border w3-padding"
										alt="Lights" style="width: 25%; white-space:nowrap;">
								</a></td>
								<td>${foods.description }</td>

								<td><a
									href="${pageContext.request.contextPath}/admin/foods/edit-food/${foods.id}"
									class="btn btn-primary btn-sm"> <span
										class="glyphicon glyphicon-edit"></span>
								</a></td>

								<td><a
									href="${pageContext.request.contextPath}/admin/foods/delete-food/${foods.id}"
									class="btn btn-danger btn-sm"> <span
										class="glyphicon glyphicon-trash"></span>
								</a></td>

							</tr>

						</c:forEach>

					</tbody>
				</table>
			</div>
		</form>
		<br>
	</div>


	<jsp:include page="ad_footer.jsp"></jsp:include>

</body>

</html>