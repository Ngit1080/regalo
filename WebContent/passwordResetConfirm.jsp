<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/style2.css">
<link rel="stylesheet" type="text/css" href="./css/confirm-style.css">
<link rel="stylesheet" type="text/css" href="./css/passwordReset.css">
<script src="./js/fade.js" type="text/javascript"></script>

<title>パスワード再設定確認画面</title>

<script>
function goGoPasswordResetAction(){
	document.getElementById("form").action="GoPasswordResetAction";
}

function goPasswordResetCompleteAction(){
	document.getElementById("form").action="PasswordResetCompleteAction";
}
</script>

<style type="text/css">

/*------------ 項目名の編集 -------------*/
.member_form_title {
	margin:20px;
	float:left;
	}
/*------------ 入力情報の編集 -------------*/
.register {
	margin: 20px;
	clear:both;
	font-size: 18px;
	}

/*------------ 文字列2段（タイトル）の編集 -------------*/
#title-address2 {
	width:100%;
	height:120px;
	font-size:80px;
	line-height:70px;
	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

/*------------ 確認メッセージの編集 -------------*/
.sentence {
	color:black;
	margin:0 auto;
	text-align:center;
	padding-bottom:25px;
	margin-left:2.5%;
	margin-right:2.5%;
	font-size: 25px;
	}

/*------------ セキュリティのため～の文の位置 -------------*/
h6 {
	text-align: center;
	}

/*------------ ボタンの編集 -------------*/
.submit_btn_box{
	padding-bottom: 25px;
}

</style>

</head>
<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>

<div id="main">
	<div id="title"></div>
		<div id="container">

		<div id="title-address">PASSWORD</div>
		<div id="title-address2">RESET</div>
		<div class="ribbon_box3"></div>
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  		</div>


	<div class="sentence" align="center">以下の内容でよろしいですか。</div>

	<s:form action="PasswordResetCompleteAction" id="form">

	<table class="confirm">

	<!-- ユーザーID -->
	<tr>
		<td><span class="member_form_title">ユーザーID   :</span></td>
		<td>
			<div class="register">
				<s:property value="userId" escape="false" />
			</div>
		</td>
	</tr>

	<!-- 新しいパスワード -->
	<tr>
		<td><span class="member_form_title">新しいパスワード   :</span></td>
		<td>
			<div class="register">
				<s:property value="hidePassword" escape="false" />
			</div>
		</td>
	</tr>
	</table>

	<br><br>
	<h6>(※セキュリティのため字数に関わらず16文字分出力しています。)</h6>

	<!-- 送る -->
	<s:hidden name="userId" />
	<s:hidden name="password" />
	<s:hidden name="password1" />
	<s:hidden name="password2" />

	<!-- ボタン -->
			<div class="submit_btn_box">
				<s:submit class = "button_custom fadelink" value="完了"  onclick="goPasswordResetCompleteAction();"/>
				<s:submit class = "button_custom fadelink" value="訂正" onclick="goGoPasswordResetAction();"/>
			</div>
	</s:form>
	</div>
</div>

<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>
</body>
</html>

