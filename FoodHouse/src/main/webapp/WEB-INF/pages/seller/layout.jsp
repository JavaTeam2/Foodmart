<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link href="css/seller.css" rel="stylesheet"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
    <script src="js/seller.js" defer></script>
</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
            <div class="close">
            </div>
            <div class="list">
                <a class="item" href="<c:url value='/seller'/>">
                    <div class="title">
                    Quản lý đơn hàng
                    </div>
                </a>
                <a class="item" href="<c:url value='/seller'/>">
                    <div class="title">
                    Quản lý chi phí
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
