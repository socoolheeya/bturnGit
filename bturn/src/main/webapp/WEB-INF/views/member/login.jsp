<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action="/bturn/login.do" method="post">
이메일<input type="text" name="email">
패스워드<input type="text" name="password">
<button type="submit">로그인</button>
</form>
</body>
</html>