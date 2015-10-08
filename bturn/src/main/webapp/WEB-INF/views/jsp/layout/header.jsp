<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<div class="row">
		<div class="col-sm-8"></div>
		<div class="col-sm-4">
		<c:choose>
			<c:when test="${empty sessionScope.name }">
				<span><a href="http://localhost:9090/bturn/login.do">로그인</a></span> | <span><a
				href="http://localhost:9090/bturn/joinForm.do">회원가입</a></span> | <span><a
				href="http://localhost:9090/bturn/mybturn.do">MyBturn</a></span> | <span><a
				href="http://localhost:9090/bturn/goCart.do">장바구니</a></span> | <span><a
				href="http://localhost:9090/bturn/faq.do">고객센터</a></span>
			</c:when>
			<c:otherwise>
				<span><a href="http://localhost:9090/bturn/logout.do">로그아웃</a></span> | <span><a
				href="http://localhost:9090/bturn/memberInfo.do">회원정보</a></span> | <span><a
				href="http://localhost:9090/bturn/mybturn.do">MyBturn</a></span> | <span><a
				href="http://localhost:9090/bturn/goCart.do">장바구니</a></span> | <span><a
				href="http://localhost:9090/bturn/faq.do">고객센터</a></span>
			</c:otherwise>
		</c:choose>
		</div>
	</div>
	<hr>
	<div class="row">
		<div class="col-sm-4">
			<div>logo bturn</div>
		</div>
		<div class="col-sm-4">
			<input class="form-control" type="text" name="search">
			<button type="button" class="btn btn-info">
				<span class="glyphicon glyphicon-search"></span>검색
			</button>
		</div>
		<div class="col-sm-4"></div>
	</div>

</div>