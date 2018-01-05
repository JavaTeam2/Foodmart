<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header-page">Quản lý đơn hàng</header>
<div class="table">
    <div class="toolbar-operation">
        <button class="button button-add">
            <span class="button-text">Tạo đơn hàng</span>
            <i class="fa fa-plus button-icon" aria-hidden="true"></i>
        </button>
        <button class="button button-filter">
            <span class="button-text">Lọc đơn hàng: [Hôm nay, theo ngày]</span>
            <i class="fa fa-filter button-icon" aria-hidden="true"></i>
        </button>
        <button class="button button-pay">
            <span class="button-text">Thanh toán</span>
            <i class="fa fa-plus button-icon" aria-hidden="true"></i>
        </button>
        <button class="button button-delete">
            <span class="button-text">Huỷ đơn hàng</span>
            <i class="fa fa-plus button-icon" aria-hidden="true"></i>
        </button>
    </div>
    <div class="row header">
        <div class="id">
            ID
        </div>
        <div class="customer-name">
            Tên khách hàng
        </div>
        <div class="order-details">
            Chi tiết đơn hàng
        </div>
        <div class="total-money">
            Tổng tiền
        </div>
        <div class="status">
            Trạng thái
        </div>
        <div class="created-date">
            Ngày tạo đơn hàng
        </div>
    </div>
    <div class="body">
        <c:forEach var="order" items="${orders}" varStatus="status">
            <div class="row">
                <div class="id" data-id="<c:out value='${order.id}'/>">
                    <c:out value="${status.index+1}"/>
                </div>
                <div class="customer-name">
                    <c:out value="${order.customer_name}"/>
                </div>
                <div class="order-details">
                    <c:set var="orderstr" value=""/>
                    <c:forEach var="orderDetail" items="${order.listUserDetails}">
                        <c:out value="${orderDetail.food_id.name}"/><br>
                    </c:forEach>
                </div>
                <div class="total-money">
                    <c:out value="${order.total_money}"/>
                </div>
                <div class="status">
                    <c:out value="${order.status}"/>
                </div>
                <div class="created-date">
                    <c:out value="${order.date_time}"/>
                </div>
            </div>
        </c:forEach>
    </div>
    <div id="create-order">
        <form class="form-create-order" action="seller/order/create" method="post">
        <div class="create-order-content">
            <div class="create-order-info">
                <label class="control" style="margin-bottom: 5px;">Loại đơn hàng</label>
                <div>
                    <input id="mangve" type="radio" name="type" value="Mang về" checked/>
                    <label for="mangve">Mang về</label>
                </div>
                <div style="margin-bottom: 10px;">
                    <input id="phucvutaiquan" type="radio" name="type" value="Phục vụ tài quán"/>
                    <label for="phucvutaiquan">Phục vụ tại quán</label>
                </div>
                <label for="customer_name" class="control">Tên khách hàng</label>
                <input type="text" id="customer_name" name="customer_name" class="control"/>
                <label for="customer_phone" class="control">Số điện thoại</label>
                <input type="number" id="customer_phone" name="customer_phone" class="control"/>
                <label for="customer_email" class="control">Email</label>
                <input type="text" id="customer_email" name="customer_email" class="control"/>
                <label for="customer_address" class="control">Địa chỉ</label>
                <input type="text" id="customer_address" name="customer_address" class="control"/>
                <label for="customer_city" class="control">Thành phố</label>
                <input type="text" id="customer_city" name="customer_city" class="control"/>
                <label for="customer_province" class="control">Tỉnh</label>
                <input type="text" id="customer_province" name="customer_province" class="control"/>
                <label for="note" class="control">Ghi chú</label>
                <input type="text" id="note" name="note" class="control"/>
            </div>
            <div class="create-order-menu">
                <div class="title">Danh sách món ăn</div>
                <div class="order-list">

                </div>
            </div>
            <div class="create-order-item">
                <input class="search-item" type="text" placeholder="Tìm kiếm món ăn"/>
                <div class="list-items">
                    <c:forEach var="item" items="${foods}">
                    <div class="item" data-id="<c:out value='${item.id}'/>" data-name="<c:out value='${item.name}'/>" data-price="<c:out value='${item.price}'/>">
                        <img src="<c:out value='${item.image}'/>"/>
                        <input type="text"  value="1"/>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <button>Tạo</button>
        </form>
    </div>
    <div id="complete-order">
        <form action="<c:url value='seller/order/complete'/>" method="post">
        <div class="complete-order-pay">
            <div class="customer-name title">Tên khách hàng</div>
            <div class="customer-name value">Trí</div>
            <div class="order-type title">Loại đơn hàng</div>
            <div class="order-type value">Mang về</div>
            <div class="order-date title">Thời gian đặt hàng</div>
            <div class="order-date value">2-2-2</div>
            <div class="order-details title">Chi tiết đơn hàng</div>
            <div class="order-details value">
                <div class="item">
                    <div class="name">Hai san</div>
                    <div class="quantity">5</div>
                    <div class="price">4000</div>
                </div><div class="item">
                    <div class="name">Hai san</div>
                    <div class="quantity">5</div>
                    <div class="price">4000</div>
                </div><div class="item">
                    <div class="name">Hai san</div>
                    <div class="quantity">5</div>
                    <div class="price">4000</div>
                </div><div class="item">
                    <div class="name">Hai san</div>
                    <div class="quantity">5</div>
                    <div class="price">4000</div>
                </div><div class="item">
                    <div class="name">Hai san</div>
                    <div class="quantity">5</div>
                    <div class="price">4000</div>
                </div>
            </div>
            <div class="total-price value">150000$</div>
            <div class="total-price"></div>
        </div>
        <input type="hidden" class="id-get" name="id" value="" required/>
        <button class="completer-order-btn">Thanh toán</button>
        </form>
    </div>
</div>