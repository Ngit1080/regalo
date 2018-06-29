<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
if(!(session.getAttribute("masterId") == "admin")){
  out.println("本ページへのアクセスは認められていません");
  out.close();
}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" /> <meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="./css/style2.css">
		<link rel="stylesheet" href="./css/confirm-style.css">
<!-- 			<link rel="stylesheet" href="./css/style.css"> -->
<!-- 		<link rel="stylesheet" href="./css/ProductUpdate.css"> -->
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">

		<title>商品情報確認</title>
		<style type="text/css">
		td{
			font-weight: bold;
		}
		</style>
	</head>
	<body>


<!-- ヘッダー -->

		<jsp:include page="includeHeader.jsp" />

<!-- メイン -->
	<div id="main">

		<div id="title"></div>




	<div id="container">

	<div id="title-address">ProductUpdate</div>
			<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">REGALO</span>
  		</div>
  	</div>

	<div class="top-text">こちらに変更しますか？</div>

		<div class="confirm-box">


			<img id="image" src="<s:property value="session.imageFileName"/>" width="200" height="200"/>

 <table class="Product-Update">
					<tr><td>商品名 :</td><td><s:property value="session.productName" /></td></tr>


					<tr><td>商品かな :</td><td><s:property value="session.productNameKana" /></td></tr>

					<tr><td>商品詳細 :</td><td><s:property value="session.productDescription.replaceAll('\\n', '<br />')" escape="false" /></td></tr>

					<tr><td>商品カテゴリ :</td><td><s:property value="session.categoryId" /></td></tr>

					<tr><td>値段 :</td><td><s:property value="session.price" />円</td></tr>

					<tr><td >販売会社 :</td><td><s:property value="session.releaseCompany" /></td></tr>
</table>

<div class="submit_btn_box">

<span id="contents-btn-set">
			<input type="button" class="button_custom"
				onclick="location.href='<s:url action="ProductUpdateCompleteAction" />'"
				value="完了" /></span>

<s:form class="inline_form" action="DeleteOrUpdateAction">
				<s:hidden value= "true" name="deleteFlg" />
				<s:hidden value= "%{productId}" name="productId" />
				<s:hidden value= "%{productName}" name="productName" />
				<s:hidden value= "%{productNameKana}" name="productNameKana" />
				<s:hidden value= "%{productDescription}" name="productDescription" />
				<s:hidden value= "%{categoryId}" name="categoryId" />
				<s:hidden value= "%{price}" name="price" />
				<s:hidden value= "%{imageFilePath}" name="imageFilePath" />
				<s:hidden value= "%{releaseCompany}" name="releaseCompany" />


				<span id="contents-btn-set">
				<input type='submit' class="button_custom" value='訂正'>
				</span>
</s:form>


			<br>
			</div>
		</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>