<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/complete-style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/includeFooter.css">
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<meta http-equiv="refresh" content="3;URL='BuyProductConfirmAction'">
<title>宛先情報完了画面</title>
<style type="text/css">

/*------------ コンテナ -------------*/
#container {
	position:realtive;
	top:100px;
	}


.moji-box{
	color:white;
	margin:0 auto;
	text-align:center;
	padding-top:50px;
	padding-bottom:25px;
	margin-left:2.5%;
	margin-right:2.5%;
	margin-bottom:25px;
/* 	font-size:20px; */
	}

/*------------ Completedの編集 -------------*/
.moji1 {
	font-size:80px;
	}

/*------------ 3秒後に～の文の編集 -------------*/
.moji2{
/* 	padding-top:50px; */
/* 	padding-bottom:25px; */
	margin-left:2.5%;
	margin-right:2.5%;
	margin-bottom:25px;
	font-size:20px;
	}


</style>
</head>
<body>
	<!-- ヘッダー -->
<!-- 	<div id="menu"> -->
		<jsp:include page="includeHeader.jsp"/>
<!-- 	</div> -->

 	<div id="main">

<%--  	<s:form action="BuyProductConfirmAction"> --%>

<!--  		<div id="title">REGALO</div> -->

 		<div id="container">
 			<div class="moji-box">
 			<div class ="moji1 fadelink">
<span>Completed!</span><br></div>
			<div class="moji2 fadelink"><span>3秒後に決済確認画面に移動します。</span><br></div>
</div>
	<!-- 送信ボタン -->
<!-- 			<div class="button"> -->
<%-- 				<s:submit value="決済確認画面へ"/> --%>
<!-- 			</div> -->
		</div>
<%-- 	</s:form> --%>
</div>
	<!-- フッター -->
	<jsp:include page="includeFooter.jsp"/>

</body>
</html>
