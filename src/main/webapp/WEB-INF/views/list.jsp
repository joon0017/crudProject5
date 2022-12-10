<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation</title>
<style>

	#list {
		font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
		border-collapse: collapse;
		width: 100%;
	}
	#list td, #list th {
		border: 1px solid #ddd;
		padding: 8px;
		text-align:center;
	}
	#list tr:nth-child(even){background-color: #f2f2f2;}
	#list tr:hover {background-color: #ddd;}
	#list th {
		padding-top: 12px;
		padding-bottom: 12px;
		text-align: center;
		background-color: #006bb3;
		color: white;
	}
	.showPhoto{
		width:100%;
		max-width:300px;
	}
	.new{
		display: block;
		outline: solid 2px black;
		background-color: cornflowerblue;
		color: white;
		position: absolute;
		font-weight: bold;
		left: 5%;
	}
	.new:hover{
		background-color: darkslateblue;
	}

	.logout{
		display: block;
		outline: solid 2px black;
		background-color: indianred;
		color: white;
		position: absolute;
		right: 5%;
	}
	.logout:hover{
		background-color: darkred;
	}
</style>

<script>
	function delete_ok(id){
		const a = confirm("정말로 삭제하겠습니까?");
		if (a) location.href='deleteok/'+id;
	}
</script>

</head>
<body>
<h1>예약 리스트</h1>
<table id="list" width="90%">
<tr>
	<th>OrderNum</th>
	<th>CustomerName</th>
	<th>CustomerNumbers</th>
	<th>Menu</th>
	<th>ContactNum</th>
	<th>Date</th>
	<th>Requests</th>
	<th>PaymentMethod</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getOrderNum()}</td>
		<td>${u.getCustomerName()}</td>
		<td>${u.getCustomerNumbers()}</td>
		<td>${u.getMenu()}</td>
		<td>${u.getContactNum()}</td>
		<td>${u.getDate()}</td>
		<td>${u.getRequests()}</td>
		<td>${u.getPaymentMethod()}</td>

		<td><a href=editform/${u.getOrderNum()}>Edit</a></td>
		<td><a href=javascript:delete_ok('${u.getOrderNum()}')>Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/><a class="new" href="add">Add New Post</a>
<a class="logout" href="../login/logout">Logout</a>
</body>
</html>