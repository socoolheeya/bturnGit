<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>::Bturn 로그인::</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="../../layout/header.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<h1>Bturn 로그인</h1>
				<form action="/bturn/login.do" method="post">
					<div class="row">
						<input class="form-control" type="text" name="email" placeholder="ID">
					</div>
					<div class="row">
						<input class="form-control" type="password" name="password" placeholder="PASSWORD">
					</div>
					<div class="row">
						<button class="btn btn-default" type="submit">로그인</button>
					</div>
				</form>
			</div>
			<div class="col-sm-2"></div>

		</div>
	</div>


</body>
</html>