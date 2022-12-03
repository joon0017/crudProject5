<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.crud.dao.BoardDAO"%>
<%@ page import="com.crud.bean.BoardVO" %>

<%--<jsp:useBean id="u" class="com.crud.bean.BoardVO" />--%>
<%--<jsp:setProperty property="*" name="u"/>--%>

<%
	request.setCharacterEncoding("UTF-8");
	BoardDAO boardDAO = new BoardDAO();

	int i = boardDAO.insertBoard(boardDAO);
	String msg = "데이터 추가 성공 !";
	if(i == 0) msg = "[에러] 데이터 추가 ";


%>

<script>
	alert('<%=msg%>');
	location.href='posts.jsp';
</script>