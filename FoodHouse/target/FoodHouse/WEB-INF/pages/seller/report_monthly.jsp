<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="year" value="${now}" pattern="yyyy-MM" />
<div class="form-wrapper">
<form class="form-cost" action="<c:url value='/seller/report-monthly/create'/>" method="post">
<header class="header-page">Nhập chi phí cho tháng <a href="<c:url value='/seller/report'/>" class="sublink">Quay lại quản lý chi phí</a>
</header>

<div class="table">
    <div class="row">
    <input type="month" value="${year}" name="date" max="${year}"/>
    </div>
    <div class="row title">Tiền thuê quán</div>
    <div class="row">
        <input type="hidden" name="cause" value="Tiền thuê quán"/>
        <input name="cost" class="cost" placeholder="Nhập chi phí"/>
    </div>
    <div class="row title">Trả lương nhân viên</div>
    <div class="row">
        <input type="hidden" name="cause" value="Trả lương nhân viên"/>
        <input name="cost" class="cost" placeholder="Nhập chi phí"/>
    </div>
    <input id="submit" type="submit"  value="Tạo"/>
</div>
</form>
</div>