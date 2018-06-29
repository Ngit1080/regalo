
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productDetail.css">

		<link rel="stylesheet" href="./css/confirm-style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="./js/fade.js" type="text/javascript"></script>

<title>商品詳細</title>

<style type="text/css">

#title-address {
	width:100%;
	height:150px;
	font-size:80px;
	line-height:200px;
	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

td{
	font-weight: bold;
}


#imageContainer{
    padding-bottom:25px;
}
</style>


</head>
<body>
	<!-- ヘッダー -->
	<jsp:include page="includeHeader.jsp"/>
	<s:form action="CartInsertAction" theme="simple">
	<div id="main">

		<!-- <div id="title">
			Product Detail
		</div> -->

		<div id="container">
		<div id="title-address">Product Detail</div>

				<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  		</div>
  	</div>

			<s:iterator value="productInfoList">



				<!-- 商品画像 -->
				<div id="imageContainer">
					<img id="image" src='<s:property value="imageFilePath"/>'/>
				</div>

<!-- 				<div id="productDetail"> -->
<table>
					<!-- 商品名 -->

					<tr><td>商品名 :</td><td><s:property value="productName"/></td></tr>

					<!-- 商品名かな -->
					<tr><td>商品名かな :</td><td><s:property value="productNameKana"/></td></tr>



					<!-- 値段 -->
<!-- 					<div id="price"> -->
						<tr><td>値段</td><td>&yen;<fmt:formatNumber value="${price}"/></td></tr>
<!-- 					</div> -->



					<!-- 発売会社名 -->
					<tr><td>販売会社 :</td><td><s:property value="releaseCompany"/></td></tr>



					<!-- 発売年月日 -->
					<tr><td>発売年月日 :</td><td><s:property value="releaseDate"/></td></tr>



					<!-- 商品詳細情報 -->
					<tr><td>商品詳細 :</td><td><s:property value="productDescription"/></td></tr>
			</table>



<!-- 				</div> -->

			</s:iterator>

			<div id="cartButtonWrapper">
				<!-- 購入個数 -->
					<select name="productCount" id="cartCount">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>

				<button type="submit" class="cartButton fadelink">カートへ</button>
			</div>


			<br>

			<div id="relationTitle">
				<h3>関連商品</h3>
			</div>

			<!-- 関連商品 -->
			<div id="relation" class="clearfix">
			<s:iterator value="relationInfoList">

				<div id="products" class="ratio-1_1">

							<!-- 各商品のURL作成 -->
							<s:url id="url" action="GoProductDetailAction">
								<s:param name="productId" value="%{productId}"/>
							</s:url>

							<!-- 商品画像 -->
							<s:a id="relationImageContainer" href="%{url}" class="fadelink">
								<img id="relationImage" src='<s:property value="imageFilePath"/>' alt='<s:property value="imageFileName"/>'/>
							</s:a>

							<br>
							<s:a href="%{url}">
								<div id="relationProductDetail">

									<div class="detailHover">

										<!-- 商品名 -->
										<s:property value="productName"/>

									</div>

								</div>
							</s:a>



				</div>
			</s:iterator>
			</div>


		</div>

	</div>
	</s:form>




	<!-- フッター -->
	<jsp:include page="includeFooter.jsp"/>


</body>


</html>
