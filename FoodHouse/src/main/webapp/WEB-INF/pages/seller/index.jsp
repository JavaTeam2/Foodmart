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
                <div class="id">
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
                    <div class="order">
                        <div class="food-name">
                            Tôm hùm
                        </div>
                        <div class="food-quantity">
                            x3
                        </div>
                        <div class="food-price">
                            500000
                        </div>
                    </div><div class="order">
                        <div class="food-name">
                            Tôm hùm
                        </div>
                        <div class="food-quantity">
                            x3
                        </div>
                        <div class="food-price">
                            500000
                        </div>
                    </div><div class="order">
                        <div class="food-name">
                            Tôm hùm
                        </div>
                        <div class="food-quantity">
                            x3
                        </div>
                        <div class="food-price">
                            500000
                        </div>
                    </div>
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
</div>