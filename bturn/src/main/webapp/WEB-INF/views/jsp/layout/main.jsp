<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>::B Turn::</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
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
				<%@ include file="topCenter.jsp"%>
				<div class="row">
					<c:if test="empty ${productList }">
						<div class="row"></div>
					</c:if>
					<c:forEach var="product" items="${prodcutList }">
						<div class="row">
							<ul>
								<li>
									<div class="col-lg-4">
										<div class="row">
											<c:url var="productDetail"
												value="http://localhost:9090/bturn/productDetail.do">
												<c:param name="productNo" value="${product.productNo }" />
											</c:url>
											<a href="${productDetail }"> <img alt=""
												src="${product.imageURL }">
											</a>
										</div>
										<div class="row">
											<p>${product.name }</p>
										</div>
										<div class="row">
											<p>${product.price }</p>
										</div>
									</div>
								</li>
								<li>
									<div class="col-lg-4"></div>
								</li>
								<li>
									<div class="col-lg-4"></div>
								</li>
								<li></li>

							</ul>

						</div>
					</c:forEach>
				</div>
			</div>
			<div class="col-sm-2"></div>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>