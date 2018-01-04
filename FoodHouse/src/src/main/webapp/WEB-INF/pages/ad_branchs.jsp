
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Branchs</title>
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
		<h3>Branchs</h3>
		<br /> <a href="${pageContext.request.contextPath}/admin/branchs/add"
			class="btn btn-success">Add new branch</a> </br> </br>

		<form
			action="${pageContext.request.contextPath}/admin/branchs/delete-branch"
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
						<th>Address</th>
						<th>Province</th>
						<th>City</th>
						<th>Phone</th>
						<th>Open time</th>
						<th>Close time</th>
						<th>Table quantity</th>
						<th>Image</th>
						<th>Description</th>
						<th>Edit</th>
						<th>Delete</th>
					</thead>
					<tbody>
						<c:forEach items="${branchs}" var="branchs">
							<tr>
								<td><label><input type="checkbox" name="check"
										value="${branchs.id }"></label></td>
								<td>${branchs.id }</td>
								<td>${branchs.name }</td>
								<td>${branchs.address }</td>
								<td>${branchs.province }</td>
								<td>${branchs.city }</td>
								<td>${branchs.phone }</td>
								<td>${branchs.open_time }</td>
								<td>${branchs.close_time }</td>
								<td>${branchs.table_quantity }</td>
								<td style="width: 20%" ><a href="${branchs.image }"> <img
										src="${branchs.image }" class="w3-border w3-padding"
										alt="Lights" style="width: 25%; white-space:nowrap;">
								</a></td>
								<td>${branchs.description }</td>

								<td><a
									href="${pageContext.request.contextPath}/admin/branchs/edit-branch/${branchs.id}"
									class="btn btn-primary btn-sm"> <span
										class="glyphicon glyphicon-edit"></span>
								</a></td>

								<td><a
									href="${pageContext.request.contextPath}/admin/branchs/delete-branch/${branchs.id}"
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