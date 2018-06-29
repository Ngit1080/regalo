<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/productList.css">
<!-- <link rel="stylesheet" type="text/css" href="./js/fade.js"> -->
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="./js/fade.js" type="text/javascript"></script>

<title>商品一覧</title>
</head>

<style>

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


</style>
<body>

	<jsp:include page="includeHeader.jsp"/>

	<div id="main">

		<!-- <div id="title">
			Products
		</div> -->

		<div id="error">
			<s:iterator value="messageList">
				<s:property/>
			</s:iterator>
			<br>
			<s:iterator value="errorMessageList">
				<s:property/>
			</s:iterator>
		</div>





		<!-- 商品一覧 -->
		<div id="container"  class="clearfix">
		<div id="title-address">Products</div>

			<div class="ribbon_box3">
	  			<div class="ribbon_area">
	    			<span class="ribbon14">Regalo</span>
	    		</div>
			</div>

			<s:iterator value="productInfoList">
				<div id="wrapper" class="ratio-1_1">
					<div id="products">
						<!-- 各商品のURL作成 -->
						<s:url id="url" action="GoProductDetailAction">
							<s:param name="productId" value="%{productId}"/>
						</s:url>

						<!-- 商品画像 -->
						<s:a id="imageContainer" href="%{url}" class="fadelink">
							<img id="image" src='<s:property value="imageFilePath"/>' width="300px" height="300px" alt='<s:property value="imageFileName"/>'/>
						</s:a>

						<br>
						<div id="productDetail">

							<div class="datailHover">

								<s:a href="%{url}">
                            <!--商品名 -->
								<s:property value="productName"/>
								<br>
									<!-- 商品名かな -->
									<span class="productNameKana">
										<s:property value="productNameKana"/>
									</span>
<!-- 									商品名 -->
<%-- 									<s:property value="productName"/> --%>

								</s:a>

								<br>
								<!-- 価格 -->
								<div id="price">
									<span>&yen;</span>
									<fmt:formatNumber value="${price}"/>
								</div>
							</div>

						</div>
					</div>
				</div>
			</s:iterator>
		</div>

	</div>

	<!-- フッター -->
<%-- 	<jsp:include page="includeFooter.jsp"/> --%>

</body>
</html>