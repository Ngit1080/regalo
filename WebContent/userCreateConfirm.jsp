<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" /> <meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="./css/style2.css">
		<link rel="stylesheet" type="text/css" href="./css/includeHeader.css">
		<link rel="stylesheet" href="./css/confirm-style.css">
<!-- 			<link rel="stylesheet" href="./css/style.css"> -->
<!-- 		<link rel="stylesheet" href="./css/ProductUpdate.css"> -->
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">

		<title>登録情報確認</title>
		<style type="text/css"></style>

		<script type="text/javascript">

	function goGoUserCreateAction() {
		document.getElementById("deleteFlg").value="false";
	}
</script>
	</head>
	<body>



<!-- ヘッダー -->

		<jsp:include page="includeHeader.jsp" />

<!-- メイン -->
	<div id="main">

<!-- 	<div id="title">ProductUpdate</div> -->
	<div id = "title"></div>

	<div id="container">



	<div id="title-address">USER</div>
			<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  		</div>
  	</div>

	<div class="top-text">登録内容</div>

		<div class="confirm-box">




 <table class="Product-Update">
					<tr><td><span class="member_form_title">名前 :</span></td><td><s:property value="familyName" />

							<s:property value="firstName" />
							</td></tr>


					<tr><td class="member_form_title">ふりがな:</td><td><s:property value="familyNameKana" />

							<s:property value="firstNameKana" />

					</td></tr>

					<tr><td class="member_form_title">ユーザーID:</td><td><s:property value="userId" />

					</td></tr>

					<tr><td class="member_form_title">パスワード:</td><td><s:property value="password" />
							</td></tr>

					<tr><td class="member_form_title">性別:</td><td><s:if test="sex==0">
								男性
							</s:if>
							<s:else>
								女性
							</s:else>
							<s:hidden name="sex" value="%{sex}" /></td></tr>

					<tr><td class="member_form_title">メールアドレス:</td><td><s:property value="email" />
							</td></tr>
</table>

<div class="submit_btn_box">

<s:hidden name="familyName" value="%{familyName}" />
<s:hidden name="firstName" value="%{firstName}" />
<s:hidden name="familyNameKana" value="%{familyNameKana}" />
<s:hidden name="firstNameKana" value="%{firstNameKana}" />
<s:hidden name="userId" value="%{userId}" />
<s:hidden name="password" value="%{password}" />
<s:form class="inline_form" action="GoUserCreateAction">






<s:hidden name="email" value="%{email}" />
<%-- 				<s:hidden value= "true" name="deleteFlg" /> --%>
<%-- 				<s:hidden value= "%{productId}" name="productId" /> --%>
<%-- 				<s:hidden value= "%{productName}" name="productName" /> --%>
<%-- 				<s:hidden value= "%{productNameKana}" name="productNameKana" /> --%>
<%-- 				<s:hidden value= "%{productDescription}" name="productDescription" /> --%>
<%-- 				<s:hidden value= "%{categoryId}" name="categoryId" /> --%>
<%-- 				<s:hidden value= "%{price}" name="price" /> --%>
<%-- 				<s:hidden value= "%{imageFilePath}" name="imageFilePath" /> --%>
<%-- 				<s:hidden value= "%{releaseCompany}" name="releaseCompany" /> --%>


<span id="contents-btn-set">
			<input class = "button_custom" type="button"
				onclick="location.href='<s:url action="UserCreateCompleteAction" />'"
				value="完了" /></span>

				<span id="contents-btn-set">
				<input class = "button_custom" type='submit' value='訂正'>
				<s:hidden name="deleteFlg" value="false" id="deleteFlg"/>
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