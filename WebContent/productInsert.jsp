<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" type="text/css" href="./css/confirm-style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">


<title>商品情報入力</title>
</head>


<style type="text/css">

.error-message{
	color:red;
	text-align:center;
	}


.container{
	position:relative;
	width:35%;
  	height:auto;
/*     height:auto; */
/* 	background:black; */
	margin-left : 30%;
	margin-right: 30%;
	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
/* 	padding-top: 50px; */

}


#title-address {
	width:100%;
	height:150px;

/* 	background:black; */

	font-size:80px;
	line-height:200px;
/* 	border-bottom:solid 1px red; */

/* 	margin-bottom:150px; */

	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

.button1 {
  	text-align: center;
   	padding-top: 720px;
  	margin-left:10px;
  /* 	margin-top: 485px; */
/*   	margin-top: 480px; */
/*   	clear:both; */
	/*margin-right:10px;*/
 	}

.submit_btn_box{
	padding-bottom: 25px;
}


</style>



<body>
		<!-- ヘッダー -->
		<jsp:include page="includeHeader.jsp"/>

<div id="main">
<div id="title"></div>
<div class="container">

<div id="title-address">ProductInsert</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  	</div>
</div>
<s:if test="!#session.categoryIdErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
		<s:iterator value="#session.categoryIdErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>

<s:if test="!#session.productIdErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
		<s:iterator value="#session.productIdErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.productNameErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.productNameErrorMessageList"><s:property /><br></s:iterator>
</div>
</div>
</s:if>
<s:if test="!#session.productNameKanaErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.productNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.productDescriptionErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.productDescriptionErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.priceErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.priceErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!session.imageFilePathErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.imageFileNameErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>

<s:if test="!session.imageFileNameErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.imageFileNameErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>

<s:if test="!#session.releaseCompanyErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.releaseCompanyErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>

<s:form action="ProductInsertConfirmAction" theme="simple" id="form" method="post" enctype="multipart/form-data">


<table class="vertical-list-table">
<%-- <s:if test="!#session.productIdErrorMessageList.isEmpty()"> --%>
<!-- 	<div class="error"> -->
<!-- 	<div class="error-message"> -->
<%-- 		<s:iterator value="#session.productIdErrorMessageList"><s:property /><br></s:iterator> --%>
<!-- 	</div> -->
<!-- 	</div> -->
<%-- </s:if> --%>
<tr>
	<th scope="row">商品ID</th>
	<td><s:textfield name="productId" value="%{#session.productId}" label="商品ID" placeholder="商品ID" class="txt" /></td>
</tr>

<s:if test="!#session.productNameErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.productNameErrorMessageList"><s:property /><br></s:iterator>
</div>
</div>
</s:if>
<tr>
	<th scope="row">商品名</th>
	<td><s:textfield name="productName" value="%{#session.productName}" label="商品名" placeholder="商品名" class="txt" /></td>
</tr>
<tr>
	<th scope="row">商品名かな</th>
	<td><s:textfield name="productNameKana" value="%{#session.productNameKana}" label="商品名かな" placeholder="商品名かな" class="txt" /></td>
</tr>
<tr>
	<th scope="row">商品詳細</th>
	<td><s:textfield name="productDescription" value="%{productDescription}" label="商品詳細" placeholder="商品詳細" class="txt" /></td>
</tr>
<tr>
	<th scope="row">商品カテゴリー</th>
	<td>
<%-- 		<select name="categoryId"> --%>
<!-- 			<option selected="selected">選択してください</option> -->
<!-- 			<option value="2">FOOD</option> -->
<!--  			<option value="3">WINE</option> -->
<!--  			<option value="4">ACCESSORIES</option> -->
<!--  			<option value="5">WATCH</option> -->
<%-- 		</select>	 --%>
		<s:select name="categoryId" list="#session.categoryList" listValue="categoryName" listKey="categoryId" class="category" id="categoryId"/></td>

</tr>
<tr>
	<th scope="row">価格</th>
	<td><s:textfield name="price" list="%{#session.price}" value="%{#session.price}" label="価格" placeholder="価格"/></td>
</tr>
<%-- <tr>
	<th scope="row">画像ファイル名</th>
	<td><s:textfield name="imageFileName" value="%{#session.imageFileName}" label="画像ファイル名" placeholder="画像ファイル名" class="txt" /></td>
</tr> --%>
<tr>
	<th scope="row">画像</th>
	<td><!-- <input type="file" accept='image/*' name="imageFilePath" id="file" /> -->
		<div class="file">
				<s:file name="userImage" />
		</div>
	<td>
</tr>
<tr>
	<th scope="row">販売会社</th>
	<td><s:textfield name="releaseCompany" value="%{#session.releaseCompany}" label="販売会社" placeholder="販売会社" class="txt" /></td>
</tr>

</table>

<div class="submit_btn_box">
<span id=".contents-btn-set">
<s:submit  class="button_custom" value="登録" />
</span>
<span id=".contents-btn-set">

<input  class="button_custom" type="button"
	onclick="location.href='<s:url action="GoMasterAction" />'"
	value="戻る" />
</span>

</div>
</s:form>

</div>
</div>
<!-- フッター -->
	<s:include value="includeFooter.jsp"/>




</body>
</html>