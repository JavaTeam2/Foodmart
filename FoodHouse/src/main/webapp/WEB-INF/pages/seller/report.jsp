<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header-page">Quản lý chi phí <a href="<c:url value='/seller/report-monthly'/>" class="sublink">Nhập chi phí cho tháng</a></header>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="year" value="${now}" pattern="yyyy-MM-dd" />

<div class="table">
    <form class="form-cost" action="<c:url value='/seller/report/create'/>" method="post">
        <input id="date" type="date" name="date" value="${year}" max="${year}"/>
        <input id="cause" name="cause" placeholder="Nhập lý do"/>
        <input id="cost" name="cost" placeholder="Nhập chi phí"/>
        <input id="submit" type="submit" value="Tạo"/>
    </form>
    <div class="row header">
        <div class="id">ID</div>
        <div class="cause">Lí do</div>
        <div class="cost">Chi phí</div>
        <div class="date">Thời gian</div>
    </div>
    <c:forEach var="item" items="${reports}">
    <div class="row">
        <div class="id"><c:out value="${item.id}"/></div>
        <div class="cause"><c:out value="${item.cause}"/></div>
        <div class="cost"><c:out value="${item.cost}"/></div>
        <div class="date"><c:out value="${item.date}"/></div>
    </div>
    </c:forEach>
</div>