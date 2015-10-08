<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::B Turn 상품추가::</title>
</head>
<body>
<form action="/insertProduct.do">
	<table>
		<tbody>
			<tr>
				<th>상품명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>상품가격</th>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<th>상품이미지</th>
				<td><input type="text" name="imageUrl"></td>
			</tr>
			<tr>
				<th>상품설명</th>
				<td><textarea rows="5" cols="20" name="description"></textarea></td>
			</tr>
			<tr>
				<th>상품옵션</th>
				<td><input type="text" name="productOption"><span><button type="button" name="addOption">+</button></span></td>
			</tr>
			<tr>
				<th>카테고리</th>
				<td><input type="text" name="categoryName"></td>
			</tr>
			<tr>
				<th>판매자 ID</th>
				<td><input type="text" name="sellerId"></td>
			</tr>
			<tr>
				<th>판매자 이름</th>
				<td><input type="text" name="sellerName"></td>
			</tr>
			<tr>
				<th>판매자 연락처</th>
				<td><input type="text" name="sellerContact"></td>
			</tr>	
			<tr>
				<th>반품 주소</th>
				<td><input type="text" name="returnAddress"></td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>