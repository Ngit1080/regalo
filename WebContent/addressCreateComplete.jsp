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
<link rel="stylesheet" href="./css/addressCreate.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/includeFooter.css">
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<meta http-equiv="refresh" content="3;URL='BuyProductConfirmAction'">

<title>宛先情報完了画面</title>

<script>
$(function(){
	$(document).keydown(function(event){
		// クリックされたキーのコード
		var keyCode = event.keyCode;

		// ファンクションキーを制御する
		if(keyCode == 116 )// F5キーの制御
		{
			return false;
		}
	});
});
</script>

<style type="text/css">







</style>
</head>
<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>
<div id="main">
 	<div id="container">
 		<div class="moji-box">
 			<div class ="moji1 fadelink">
				<span>Completed!</span><br></div>
					<div class="moji2 fadelink"><span>3秒後に決済確認画面に移動します。</span><br></div>
		</div>
	</div>
</div>

<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>

</body>
</html>
