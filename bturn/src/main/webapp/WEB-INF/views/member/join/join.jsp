<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>::B Turn 회원가입::</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapc dn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
function checkSubmit(){
	if(document.joinForm.id.value == "") {
		alert("아이디를 입력하셔야 합니다.");
		document.joinForm.id.focus();
	} else if(document.join.password.value == ""){
		alert("패스워드를 입력하셔야 합니다.");
		document.joinForm.password.focus();
	} else if(document.joinForm.agree.checked != true) {
		alert("이용 약관에 동의하셔야 합니다.");
		document.joinForm.agree.focus();
	} else if(document.join.agree1.checked != true){
		alert("개인정보 수집에 동의하셔야 합니다.");
		document.joinForm.agree1.focus();
	} else {
		document.joinForm.submit();
		return;
	}
}
</script>
</head>
<body>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<h1>회원가입</h1>
		</div>
		<div class="col-md-4"></div>
	</div>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<form name="joinForm" action="join.do" method="post">
				<table>
					<tbody>
						<tr>
							<th>아이디</th>
							<td><input class="form-control" type="text" name="id"></td>
						</tr>
						<tr>
							<th>패스워드</th>
							<td><input class="form-control" type="password" name="password"></td>
						</tr>
						<tr>
							<th>이름</th>
							<td><input class="form-control" type="text" name="name"></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><input class="form-control" type="text" name="email"></td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td><input class="form-control" type="text" name="tel"></td>
						</tr>
						<tr>
							<th>핸드폰</th>
							<td><input class="form-control" type="text" name="phone"></td>
						</tr>
						<tr>
							<th>주소</th>
							<td><input class="form-control" type="text" name="address"></td>
						</tr>
						<tr>
							<th>생일</th>
							<td><input class="form-control" type="text" name="birthday"></td>
						</tr>
					</tbody>
				</table>
				<div>
					<button class="btn btn-default btn-block" onclick="checkSubmit()">가입하기</button>
				</div>
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>

</body>
</html>