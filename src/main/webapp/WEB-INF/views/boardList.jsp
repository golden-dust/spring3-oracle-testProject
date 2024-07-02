<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<style>
	table, tr, td {
		padding: 3px;
	}
</style>
</head>
<body>
	<h2>
		<a href="./">HOME</a> | 게시글 목록
	</h2>
	<hr>
	<table>
	<tr>
		<th>글번호</th>
		<th>글제목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:forEach items="${postlist}" var="post">
	<tr>
		<td>${post.BNUM}</td>
		<td>${post.BTITLE}</td>
		<td>${post.MNAME}</td>
		<td>${post.BDATE}</td>
	</tr>
	<c:set var="boardsize" value="${boardsize-1}" />
	</c:forEach>
	</table>
</body>
</html>