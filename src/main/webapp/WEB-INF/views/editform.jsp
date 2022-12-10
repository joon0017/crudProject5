<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
	<style>
		.imgshow{
			width:100%;
			max-width:300px;
		}
	</style>
</head>
<body>

<h1>Edit Form</h1>
	<form modelAttribute="u" method="post" action="../editok/${u.getOrderNum()}" />
<table>
	<tr><td>Customer Name: </td><td><input type="text" name="CustomerName" value="${u.getCustomerName()}"></td></tr>
	<tr><td>Number of Customers: </td><td><input type="text" name="CustomerNumbers" value="${u.getCustomerNumbers()}"/></td></tr>
	<tr><td>Menu: </td><td><input type="text" name="Menu" value="${u.getMenu()}" /></td></tr>
	<tr><td>Contact Number: </td><td><input type="text" name="ContactNum" value="${u.getContactNum()}"></td></tr>
	<tr><td><div><br><br>추가 요청사항 및 결제방식 변경</div></td></tr>
	<tr><td>Requests: </td><td><input type="text" name="Requests" value="${u.getRequests()}"></td></tr>
	<tr><td>Payment Method</td><td><input type="radio" value="카드" name="PaymentMethod" checked>카드
		<input type="radio" value="현금" name="PaymentMethod">현금
		<input type="radio" value="계좌이체" name="PaymentMethod">계좌이체</td></tr>
	<tr><td colspan="2"><input type="submit" value="수정하기"/>
<input type="button" value="취소" onclick="history.back()"/></td></tr>
</table>
</form>

</body>
</html>