<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

	<link rel="stylesheet" type="text/css" href="./css/style2.css">
	<link rel="stylesheet" type="text/css" href="./css/confirm-style.css">

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

/* body { */
/* 	height:auto; */
/* 	clear:both; */
/* 	color:gray; */
/* 	font-family:'Cinzell',serif; */
/* 	} */

/* .container { */
/* 	position:relative; */
/* 	width:40%; */
/* 	height:600px; */
/* 	background:black; */
/* 	margin-left : 30%; */
/* 	margin-right: 30%; */
/* /* 	padding-top: 50px; */ */
/* 	} */

 table tr td{
  	position: absolute;
 	top:50%;
 	left:50%;
 	text-align:center;
/* 	color:gray; */
 	clear:both;

/*  	padding-left:50px; */

  	-webkit-transform: translate(-50%,-50%);
  	-moz-transform: translate(-50%,-50%);
  	-ms-transform: translate(-50%,-50%);
 	-o-transform: translate(-50%,-50%);
  	transform: translate(-50%,-50%);

/* 			text-align:left; */
/* 			margin:0 auto; */
/* 			padding-left:30px; */
/* 			text-align:center; */
/*  	        font-size: 18px; */
/*  	text-shadow: 1px 2px 3px #808080; */
 	}

/*  table tr td{ */
/* 	padding-left: 50px; */

/*  } */


#title-address2{
	width:100%;
	height:120px;

/* 	background:black; */

	font-size:80px;
	line-height:70px;
/* 	border-bottom:solid 1px red; */

/* 	margin-bottom:150px; */

	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

.reset {
	padding-top: 160px;
	font-size : 25px;
	}

.member_form_title {
	margin:20px;
	float:left;
	}

.register {
	margin: 20px;
	clear:both;
	font-size: 18px;
/*  	text-shadow: 1px 2px 3px #808080; */
	}

/* #submit_btn_box { */
/* 	position:relative; */
/* 	text-align: center; */
/* /* 	width:200px; */ */
/* 	padding-top: 25px; */
/* 	padding-bottom: 25px; */
/* 	} */

/* .button2 { */
/* 	margin-top:10px; */
/* 	text-align: center; */
/* 	} */


/*------------ 文字列2段に変更 -------------*/
#title-address2 {
	width:100%;
	height:150px;

/* 	background:black; */

	font-size:80px;
	line-height:70px;
/* 	border-bottom:solid 1px red; */

/* 	margin-bottom:150px; */

	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

/*------------ 確認メッセージ -------------*/
.sentence {
		color:black;
		margin:0 auto;
		font
	text-align:center;
	padding-bottom:25px;
	margin-left:2.5%;
	margin-right:2.5%;
/* 	font-size:20px; */
	font-size: 25px;
/*  	text-shadow: 5px 5px 3px #808080; */
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
<!-- 	<div id="menu"> -->
		<jsp:include page="includeHeader.jsp"/>
<!-- 	</div> -->


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

	<!-- 現在のパスワード -->
<!-- 	<tr> -->
<%-- 		<td><span class="member_form_title">現在のパスワード   :</span></td> --%>
<!-- 		<td> -->
<!-- 			<div class="register"> -->
<%-- 				<s:property value="passCon" escape="false" /> --%>
<!-- 			</div> -->
<!-- 		</td> -->
<!-- 	</tr> -->

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

<%-- 		<s:if test="userId==null">エラー<a href="<s:url action="HomeAction"/>">ホームに戻る</a> --%>
<%-- 		</s:if> --%>

<%-- 		<s:else> --%>
			<div class="submit_btn_box">
				<s:submit class = "button_custom fadelink" value="完了"  onclick="goPasswordResetCompleteAction();"/>
<!-- 			</div> -->
				<s:submit class = "button_custom fadelink" value="訂正" onclick="goGoPasswordResetAction();"/>
<!-- 			<div class="button2"> -->
			</div>
<%-- 		</s:else> --%>
	</s:form>
	</div>
</div>
	<!-- フッター -->
		<jsp:include page="includeFooter.jsp"/>
</body>
</html>

