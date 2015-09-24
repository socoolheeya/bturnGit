<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::B turn 회원가입::</title>
</head>
<body>
	<form name="joinForm" action="join.do" method="post">
		<table>
			<tbody>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email"></td>
					<th>패스워드</th>
					<td><input type="text" name="password"></td>
					<th>핸드폰</th>
					<td><input type="text" name="phone"></td>
					<th>주소</th>
					<td><input type="text" name="address"></td>
					<th>생일</th>
					<td><input type="text" name="birthday"></td>
				</tr>
			</tbody>
		</table>
		<div>
			<button type="submit">가입하기</button>
		</div>
	</form>
</body>
</html>