<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<style>
ul, li, div {
	margin: 2px;
	padding: 0
}

#content {
	width: 1400px;
	height: auto;
	margin: auto;
}

#title ul {
	width: 100%;
	height: 60px;
	line-height: 60px;
	background-color: #666
}

.order ul {
	width: 100%;
	height: 40px;
	line-height: 40px;
	background-color: #999999
}

。del {
	width: 100%;
	height: 40px;
	line-height: 40px;
	background-color: blue;
}

li {
	float: left;
	width: 250px;
	list-style: none
}
</style>
<script src="js/jquery-3.1.0.min.js"></script>
<body>
	<h1>HELLO WORLD</h1>
	<div id="content">
		<div id="title">
			<ul>
				<li>订单编号</li>
				<li>收货人</li>
				<li>配送地址</li>
				<li>总金额</li>
				<li>下单日期</li>
			</ul>
		</div>
		<c:forEach items="${list }" var="order">
			<div class="order" meg="${order.id }">
				<ul>
					<li>${order.id}</li>
					<li>${order.name}</li>
					<li>${order.address}</li>
					<li>${order.fee}</li>
					<li><fmt:formatDate value="${order.dates}"
							pattern="yyyy-MM-dd HH:mm:ss" /></li>
				</ul>
			</div>
		</c:forEach>
	</div>
	<script type="text/javascript">
		$(function() {
			$(".order")
					.dblclick(
							function() {
								$(".del").remove()
								var id = $(this).attr("meg");
								var ss = $(this)

								var str = "<ul class =\"del\"><li>产品id</li><li> 产品名称 </li><li> 数量</li><li> 价格</li><li> 订单编号</li></ul>";
								$.post("showOrderItems", {
									orderId : id
								}, function(res) {
									$.each(res, function(i, n) {
										str += "<ul class =\"del\">" + "<li>"
												+ n.id + "</li>" + "<li>"
												+ n.proName + "</li>" + "<li>"
												+ n.count + "</li>" + "<li>"
												+ n.fee + "</li>" + "<li>"
												+ n.orderId + "</li>" + "</ul>"

									})
									ss.after(str).css("background-color",
											"blue")
									str = null;
								}, 'json')
							})
		})
	</script>

</body>
</html>