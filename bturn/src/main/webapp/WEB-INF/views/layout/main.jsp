<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
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
	<%@ include file="header.jsp"%>
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="col-sm-2">
				<%@ include file="leftbar.jsp"%>
			</div>
			<div class="col-sm-8">
				<div class="container">
					<br>
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
							<li data-target="#myCarousel" data-slide-to="3"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">
							<div class="item active">
								<img src="../../image/ctgr.jpg" alt="카테고리" width="460" height="345">
							</div>

							<div class="item">
								<img src="../../image/ctgr1.jpg" alt="카테고리2" width="460" height="345">
							</div>

							<div class="item">
								<img src="../../image/ctgr2.jpg" alt="카테고리3" width="460" height="345">
							</div>

							<div class="item">
								<img src="../../image/ctgr3.jpg" alt="Flower" width="460" height="345">
							</div>
						</div>

						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel" role="button"
							data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"
							role="button" data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							<span class="sr-only">Next</span>
						</a>
					</div>
				</div>
				<div class="row">
					<jsp:include page="../product/productList.jsp"/>
				</div>
			</div>
			<div class="col-sm-2"></div>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>