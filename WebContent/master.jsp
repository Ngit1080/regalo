<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" type="text/css" href="./css/master.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<title>管理画面</title>
<style type="text/css"></style>
</head>
<body>
	<!-- ヘッダー -->
 	<jsp:include page="includeHeader.jsp"/>
<!-- 	<header> -->


<!-- 	</header> -->
	<div id="main">
	<div id=title></div>
		<div id="container">
		<div id="title1">MASTER</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  	</div>
</div>
			<div class="insert_box">
				<p>新商品を追加する場合は</p>
				<input type="button" class="insert_btn fadelink"
					onclick="location.href='<s:url action="GoProductInsertAction" />'"
					value="こちら" />
				<br>

				<s:if test="dMessage !=''">
						<s:property value="dMessage" escape="false" />
				</s:if>
			</div>
			<!-- 商品一覧 -->
			<table class="large-table">
				<s:iterator value="productInfoDTOList">
					<s:form action="DeleteOrUpdateAction">
						<tr>
							<td><img src='<s:property value="imageFilePath"/>' width="200px" height="200px" /></td>
							<td>
								<table class="small-table">
									<s:hidden value= "%{productId}" name="productId" />
									<s:hidden value= "%{productName}" name="productName" />
									<s:hidden value= "%{productNameKana}" name="productNameKana" />
									<s:hidden value= "%{productDescription}" name="productDescription" />
									<s:hidden value= "%{categoryId}" name="categoryId" />
									<s:hidden value= "%{price}" name="price" />
									<s:hidden value= "%{imageFilePath}" name="imageFilePath" />
									<s:hidden value= "%{releaseCompany}" name="releaseCompany" />
									<tr><td>商品名</td><td><s:property value="productName"/></td></tr>
									<tr><td>ふりがな</td><td><s:property value="productNameKana"/></td></tr>
									<tr><td>値段</td><td><s:property value="price"/></td></tr>
									<tr><td>発売会社名</td><td><s:property value="releaseCompany"/></td></tr>
									<tr><td>発売年月</td><td><s:property value="releaseDate"/></td></tr>
									<tr><td>商品詳細</td><td><s:property value="productDescription"/></td></tr>

								</table>
								<%-- <ul>
									<li>商品名　<s:property value="productName"/></li>
									<li>ふりがな　<s:property value="productNameKana"/></li>
									<li>値段　<s:property value="price"/>円</li>
									<li>発売会社名　<s:property value="releaseCompany"/></li>
									<li>発売年月　<s:property value="releaseDate"/></li>
									<li>個数　<s:property value="productCount"/></li>
									<li>小計　<s:property value="subtotal"/>円</li>
								</ul> --%>
							</td>

							<td>
								<button class="insert_btn" type="submit" name="deleteFlg"
									onclick='return confirm("削除してよろしいですか？")'>削除</button>

								<button class="insert_btn"  type='submit' name='changeFlg'>変更</button>
							</td>
						</tr>
					</s:form>
				</s:iterator>
			</table>
		</div>
	</div>
<footer>
	<jsp:include page="includeFooter.jsp" />
</footer>
</body>
</html>