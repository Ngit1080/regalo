<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/complete-style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>
<meta http-equiv="refresh" content="3;URL='GoMasterAction'">
<title>商品情報入力完了</title>
<style type="text/css">

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


.moji1{
font-size:80px;
}

.moji2{
/* 	padding-top:50px; */
/* 	padding-bottom:25px; */
	margin-left:2.5%;
	margin-right:2.5%;
	margin-bottom:25px;
	font-size:20px;
}
#container {
position:realtive;
top:100px;
}

</style>
</head>
<body>
<!-- ヘッダー -->
<%-- <jsp:include page="includeHeader.jsp"/> --%>

<!-- メイン -->
<div id="main">
<!-- <div id="title">ProductUpdate</div> -->
<div id="container">
<div class="moji-box">
<div class="moji1 fadelink"><span>Complete!</span><br></div>
<div class="moji2 fadelink"><a href='<s:url action="GoMasterAction"/>'>管理者ページ</a><br></div>
<div class="moji2 fadelink"><span>3秒後にホームへ移動します。</span><br></div>






		</div>

</div></div>
	<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>

</body>
</html>