<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="css/roles.css" rel="stylesheet" type="text/css">
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div style="border: 1px solid #ccc;padding:5px;margin-bottom:20px;">
 
  <a href="${pageContext.request.contextPath}/welcome">Home</a>
 
  | &nbsp;
  
   <a href="${pageContext.request.contextPath}/userInfo">User Info</a>
  
  | &nbsp;
  
  <a href="${pageContext.request.contextPath}/admin">Admin</a>
  <div>
	<sec:authorize access="hasRole('ADMIN')">
    	<label><a href="#">Edit this page</a> | This part is visible only to ADMIN</label>
    </sec:authorize>
  </div>
  <div class="anonymous">
	<h1>Welcome Anonymous User!</h1>
  </div>
	
	<div class="customer"> 	
		<h1>Welcome Customer!</h1>
	</div>
	
	<div class="manager">
		<h1>Welcome Manager!</h1>
	</div>
	
	<div class="admin">
		<h1>Welcome Admin!</h1>
	</div>
  <c:if test="${pageContext.request.userPrincipal.name != null}">
  
     | &nbsp;
     <a href="${pageContext.request.contextPath}/logout">Logout</a>
     
  </c:if>
  
</div>