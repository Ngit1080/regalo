<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="refresh" content="3;URL='StartAction'">

<title>エラーページ</title>
</head>

<style type="text/css">

#title1 {

	line-height:150px;

	}


h4.text{
		padding-top: 0px;
		text-align: center;
		font-size:25px;
		color: black;
}

h3.text{
		padding-top: 0px;
		text-align: center;
		font-size:25px;
		text-shadow: 1px 1px 0px white;
}

a:link { color: #FFFFFF;
 } /*… 未訪問のリンク */

a:hover { color: #660033;
}/* … ポイント時のリンク*/

 a:visited{
		color: #660033;
} /*訪問済み*/

a {
text-decoration: none;
}/* … 下線削除*/

</style>
<body>



<%-- 	<jsp:include page="includeHeader.jsp"/> --%>

<div id = "main">
	<div id = "title">

	</div>
	<div id = "container">

		<div id = "title-address">Error</div>
			<div class="ribbon_box3"></div>
  			<div class="ribbon_area">
    		<span class="ribbon14">Regalo</span>
    		</div>

			<h4 class = "text">3秒後にホームページに戻ります</h4>

			<h4 class = "text">ジャンプしない場合は、以下のリンクをクリックしてください</h4>
			<h3 class = "text"><a href='/regalo/StartAction.action'>ホーム画面へ</a></h3>


		</div>

</div>
<jsp:include page="includeFooter.jsp"/>


</body>
</html>