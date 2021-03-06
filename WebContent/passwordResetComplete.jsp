<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/includeFooter.css">
<link rel="stylesheet" href="./css/complete-style.css">
<link rel="stylesheet" href="./css/style.css">
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<meta http-equiv="refresh" content="3;URL='GoHomeAction'">

<title>パスワード再設定完了画面</title>

</head>
<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>

<div id="main">
	<div id="container">
		<div class ="moji-box">
			<div class ="moji1 fadelink">
				<span>Completed!</span><br></div>
					<div class="moji2 fadelink"><span>3秒後にホーム画面に移動します。</span><br></div>
		</div>
	</div>
</div>

<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>

</body>
</html>