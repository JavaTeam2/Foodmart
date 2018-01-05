<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link href="<c:url value='/css/seller.css'/>" rel="stylesheet"/>
    <script src="<c:url value='/js/jquery-3.2.1.min.js'/>"></script>
    <script src="<c:url value='/js/uglipop.min.js'/>"></script>
    <link href="<c:url value='/css/font-awesome.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/'/><tiles:getAsString name='css'/>" rel="stylesheet" />
    <script src="<c:url value='/js/seller/seller.js'/>"  defer></script>
    <script src="<c:url value='/'/><tiles:getAsString name='js'/>"></script>
    <script src="<c:url value='/js/jquery.validate.min.js'/>"></script>
</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
            <div class="close">
            </div>
            <div class="list">
                <div class="branch">
                    <div class="img-wrapper">
                    <img src="${branch.image}"/>
                    </div>
                    <div class="list-title">Chi nhánh <c:out value="${branch.id}"/></div>
                </div>
                <a class="item" href="<c:url value='/seller'/>">
                    <div class="title">
                    Quản lý đơn hàng
                    </div>
                </a>
                <a class="item" href="<c:url value='/seller/report'/>">
                    <div class="title">
                    Quản lý chi phí
                    </div>
                </a>
                <a class="item" href="<c:url value='/logout'/>">
                    <div class="title">
                        Đăng xuất
                    </div>
                </a>
            </div>
        </div>
        <div class="content">
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
</body>
</html>
