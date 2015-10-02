<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>::B Turn 회원가입::</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapc dn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
function joinByBuyer(memberType) {
	location.href="http://localhost:9090/bturn/join.do?memberType="+memberType;
}
function joinByBusinessBuyer(memberType) {
	location.href="http://localhost:9090/bturn/join.do?memberType="+memberType;
}
function joinByBusinessSeller(memberType) {
	location.href="http://localhost:9090/bturn/join.do?memberType="+memberType;
}
function joinBySeller(memberType) {
	location.href="http://localhost:9090/bturn/join.do?memberType="+memberType;
}
</script>
</head>
<body>
	<ul>
		<li>
			<p>개인구매회원</p>
			<a href="javascript:joinByBuyer(PRIVATE_BUYER)">가입하기</a>
		</li>
		<li>
			<p>사업자 구매회원</p>
			<a href="javascript:joinByBusinessBuyer(BUSINESS_BUYER)">가입하기</a>
		</li>
		<li>
			<p>사업자 셀러회원</p>
			<a href="javascript:joinByBusinessSeller(BUSINESS_SELLER)">가입하기</a>
		</li>
		<li>
			<p>개인 셀러회원</p>
			<a href="javascript:joinBySeller(PRIVATE_SELLER)">가입하기</a>
		</li>
	</ul>
</body>
</html>