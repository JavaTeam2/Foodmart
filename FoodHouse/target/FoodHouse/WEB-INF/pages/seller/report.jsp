<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header-page">Quản lý chi phí</header>
<form action="<c:url value='/seller/report/create'/>" method="post">
    <label for="cause">Lý do</label>
    <input id="cause" name="cause"/>
    <label for="cost">Chi phí</label>
    <input id="cost" name="cost"/>
    <input type="submit"/>
</form>