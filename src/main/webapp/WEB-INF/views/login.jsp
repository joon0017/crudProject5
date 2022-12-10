<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    .img,label{
        display: inline-block;
    }
    label{
        width:130px;
    }
    button{
        background: #006bb3;
        color:white;
        font-size: 15px;
    }
</style>
</head>

<body>
<div style="width:100%;text-align: center;padding-top: 100px">
<div id="img">
<img src="../img/1.png" alt="titleImage" />
</div>
<form method="post" action="loginOk">
    <div><label>User ID: </label><input type="text" name="userid"/></div>
    <div><label>Password: </label><input type="password" name="password"/></div>
    <button type="submit">Login</button>
</form>
</div>