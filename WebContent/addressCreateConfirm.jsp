<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" href="./css/confirm-style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<title>宛先情報確認画面</title>

<script>
function goAddressCreatetAction(){
	document.getElementById("form").action="GoAddressCreateAction";
}

function goAddressCreateCompleteAction(){
	document.getElementById("form").action="AddressCreateCompleteAction";
}
</script>
<style type="text/css">

/*------------ コンテナ -------------*/
.container {
	position:relative;
/* 	width:40%; */
/* 	height:800px; */
	width:auto;
	height:auto;
/* 	background:black; */
	margin-left:30%;
	margin-right:30%;
	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
	}

/*------------ テーブル -------------*/
table {
/*  	position: absolute; */
/* 	top:55%; */
/* 	left:50%; */
	margin:0 auto;
	text-align:left;
	color:black;
/*  	clear:both; */

/*   	-webkit-transform: translate(-50%,-50%); */
/*   	-moz-transform: translate(-50%,-50%); */
/*   	-ms-transform: translate(-50%,-50%); */
/*   	-o-transform: translate(-50%,-50%); */
/*   	transform: translate(-50%,-50%); */
 	}

/*------------ 確認メッセージ -------------*/
.reset {
/* 	padding-top: 55px; */
	margin:0 auto;
	padding:35px;
	font-size:25px;
	text-align: center;
	}

/*------------ 入力情報 -------------*/
.register {
	font-weight: bold;
	}

/*------------ ボタン -------------*/
.button {
/*  	position:relative; */
/*  	width:200px; */
 	text-align:center;
 	padding-top: 30px;
 	padding-bottom: 30px;
/*  	margin:0 auto;; */
/* 	margin-top:395px; */
	}

</style>
</head>
<body>
	<!-- ヘッダー -->
<!-- 	<div id="menu"> -->
		<jsp:include page="includeHeader.jsp"/>
<!-- 	</div> -->

	<div id="main">

<div id="title"></div>

			<div class="container">

	<s:form action="GoAddressCreateAction" id="form">

	<div id="title-address">ADDRESS</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  		</div>
  	</div>

	<div class="reset" align="center">以下の内容でよろしいですか。</div>


	<table class="form_text">

	<!-- 姓 -->
	<tr>
		<td><span class="member_form_title">姓  :</span></td>
		<td>
			<div class="register">
				<s:property value="familyName"/><s:hidden name="familyName" value="%{familyName}"/>
			</div>
		</td>
	</tr>

	<!-- 名 -->
	<tr>
		<td><span class="member_form_title">名  :</span></td>
		<td>
			<div class="register">
				<s:property value="firstName"/><s:hidden name="firstName" value="%{firstName}"/>
			</div>
		</td>
	</tr>

	<!-- 姓仮名 -->
	<tr>
		<td><span class="member_form_title">姓仮名  :</span></td>
		<td>
			<div class="register">
				<s:property value="familyNameKana"/><s:hidden name="familyNameKana" value="%{familyNameKana}"/>
			</div>
		</td>
	</tr>

	<!-- 名仮名 -->
	<tr>
		<td><span class="member_form_title">名仮名  :</span></td>
		<td>
			<div class="register">
				<s:property value="firstNameKana"/><s:hidden name="firstNameKana" value="%{firstNameKana}"/>
			</div>
		</td>
	</tr>

	<!-- 性別 -->
	<tr>
		<td><span class="member_form_title">性別  :</span></td>

		<td>
			<div class="register">
				<s:if test="sex==0">
					男性
				</s:if>

				<s:else>
					女性
				</s:else>
			</div>
		</td>
		<td>
			<div class="register">
				<s:hidden name="sex" value="%{sex}"/>
			</div>
		</td>
	</tr>

	<!-- 住所 -->
	<tr>
		<td><span class="member_form_title">住所  :</span></td>
		<td>
			<div class="register">
				<s:property value="userAddress"/><s:hidden name="userAddress" value="%{userAddress}"/>
			</div>
		</td>
	</tr>

	<!-- 電話番号 -->
	<tr>
		<td><span class="member_form_title">電話番号  :</span></td>
		<td>
			<div class="register">
				<s:property value="telNumber"/><s:hidden name="telNumber" value="%{telNumber}"/>
			</div>
		</td>
	</tr>

	<!-- メールアドレス -->
	<tr>
		<td><span class="member_form_title">メールアドレス  :</span></td>
		<td>
			<div class="register">
				<s:property value="email"/><s:hidden name="email" value="%{email}"/>
			</div>
		</td>
	</tr>
</table>

	<!-- 送信ボタン -->
			<div class="button">
				<s:submit value="完了" class="button_custom fadelink"  onclick="goAddressCreateCompleteAction();"/>
				<s:submit value="訂正" class="button_custom fadelink" onclick="goGoAddressCreateAction();"/>
			</div>
		</s:form>
	</div>
</div>
	<!-- フッター -->
	<jsp:include page="includeFooter.jsp"/>

</body>
</html>
