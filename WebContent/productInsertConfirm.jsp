
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
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">

		<title>商品情報確認</title>
		<style type="text/css"></style>
	</head>
	<body>

<!-- ヘッダー -->

		<jsp:include page="includeHeader.jsp" />


<!-- メイン -->
	<div id="main">

<!-- 		<div id="title">ProductInsert</div> -->
	<div id="title"></div>

		<div id="container">

		<div id="title-address">ProductInsert</div>
			<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">REGALO</span>
  		</div>
  	</div>

		<div class="top-text">こちらの商品を追加しますか？</div>






<!-- 				<div class="character-img"> -->
<!-- 					<b>画像ファイル名：</b> -->
<%-- 					<s:property value="session.imageFileName"/><br/> --%>
<%-- 					<img src="<s:property value="session.newImageFileName"/>" width="100" height="100"/><br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>商品名:</b><s:property value="session.productName" /><br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>商品かな:</b><s:property value="session.productNameKana" /><br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>商品詳細:</b><s:property value="session.productDescription" /><br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>商品カテゴリ:</b><s:property value="session.categoryId" /><br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>値段:</b><s:property value="session.price" />円<br> --%>
<!-- 				</div> -->
<!-- 				<div class="character"> -->
<%-- 					<b>販売会社:</b><s:property value="session.releaseCompany" /><br> --%>
<!-- 				</div> -->

<div class="confirm-box">


					<img id="image" src="<s:property value="session.imageFileName"/>" width="200" height="200"/><br>

				<table class="Product-Update">
				<tr><td>商品名 :</td><td><s:property value="session.productName" /></td></tr>


					<tr><td>商品かな :</td><td><s:property value="session.productNameKana" /></td></tr>

					<tr><td>商品詳細 :</td><td><s:property value="session.productDescription.replaceAll('\\n', '<br />')" escape="false" /></td></tr>

					<tr><td>商品カテゴリ :</td><td><s:property value="session.categoryId" /></td></tr>

					<tr><td>値段 :</td><td><s:property value="session.price" />円</td></tr>

					<tr><td>販売会社 :</td><td><s:property value="session.releaseCompany" /></td></tr>
</table>






				<input type="hidden" name="id" value="<s:property value="id"/>" />
				<input type="hidden" name="category" value="<s:property value="category"/>" />
				<input type="hidden" name="description" value="<s:property value="description"/>" />
				<input type="hidden" name="productId" value="<s:property value="productId" />" />
				<input type="hidden" name="productName" value="<s:property value="productName"/>" />
				<input type="hidden" name="productKanaName" value="<s:property value="productKanaName"/>" />
				<input type="hidden" name="productStock" value="<s:property value="productStock"/>" />
				<input type="hidden" name="price" value="<s:property value="price"/>" />
				<input type="hidden" name="imageName"value="<s:property value="imageName"/>" />
				<input type="hidden" name="imageFileName"value="<s:property value="imageFileName"/>" />
				<input type="hidden" name="company"value="<s:property value="company"/>" />


						<div class="submit_btn_box">

				<span id="contents-btn-set">
			<input type="button" class="button_custom"
				onclick="location.href='<s:url action="ProductInsertCompleteAction" />'"
				value="完了" /></span>
											<span id="contents-btn-set">
				<input type="button" class="button_custom"
				onclick="location.href='<s:url action="GoProductInsertAction" />'"
				value="訂正" /></span>

				</div>

</div>
			</div>
</div>


	<jsp:include page="includeFooter.jsp" />
</body>

</html>