<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>
		<a href="./">HOME</a> | 게시판 글쓰기
	</h2>
	<hr>
	<form action="writeOk">
		글쓴이 : <input type="text" name="MNAME"><br><br>
		글제목 : <input type="text" name="BTITLE"><br><br>
		글내용<br><br>
		<textarea rows="10" cols="40" name="BCONTENT"></textarea><br><br>
		<input type="submit" value="작성">
	</form>
	
</body>
</html>