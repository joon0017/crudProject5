<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
		 pageEncoding="UTF-8"%>
<%@page import="com.crud.dao.BoardDAO, com.crud.bean.BoardVO, java.util.*, com.crud.HomeController"%>
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
</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deletepost?id=' + id;
	}
</script>
</head>
<body>
<h1>예약 리스트</h1>
<%
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> list = boardDAO.getBoardList();
	request.setAttribute("list",list);
%>
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

		<td><a href="editform.jsp?id=${u.getOrderNum()}">Edit</a></td>
		<td><a href="javascript:delete_ok('${u.getOrderNum()}')">Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/><a href="addpostform">Add New Post</a>
</body>
</html>