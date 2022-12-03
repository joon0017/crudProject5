<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 신청</title>
</head>
<body>

<h1>새로운 예약 신청</h1>
<form action="addpost.jsp" method="post" enctype="multipart/form-data">
<table>
    <tr><td>Customer Name:</td><td><input type="text" name="CustomerName"/> </td></tr>
    <tr><td>Number of Customers:</td><td><input type="text" name="CustomerNum"/></td></tr>
    <tr><td>Menu:</td><td><input type="text" name="Menu"/></td></tr>
    <tr><td>Contact Number:</td><td><input type="text" name="ContactNum"/></td></tr>
    <tr><td>Requests:</td><td><textarea cols="50" rows="5" name="Requests"></textarea></td></tr>
    <tr><td>Payment Method:</td><td>
        <input type="radio" name="payment" value="card" checked/>카드
        <input type="radio" name="payment" value="cash"/>현금
        <input type="radio" name="payment" value="transfer"/>계죄이체</td></tr>
</td></tr>


<tr><td><a href="addpost">View All Records</a></td><td align="right"><input type="submit" value="Add Post"/></td></tr>
</table>
</form>

</body>
</html>