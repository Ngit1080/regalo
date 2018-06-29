<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
 <link rel="stylesheet" type="text/css" href="./css/login-style.css">
<!--  <link rel="stylesheet" type="text/css" href="./css/form-style.css"> -->
<link rel="stylesheet" type="text/css" href="./css/style2.css">
<link type="text/css" href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Merriweather" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="./js/fade.js" type="text/javascript"></script>

<style type="text/css">





 	#container{
	position:relative;
	width:35%;
	height:565px;
	background:black;
	margin-left : 30%;
	margin-right: 30%;
	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
/* 	padding-top: 50px; */

}
#title-address {
	width:100%;
	height:150px;

/* 	background:black; */

	font-size:80px;
	line-height:200px;
/* 	border-bottom:solid 1px red; */

/* 	margin-bottom:150px; */

	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}
</style>

<title>ログイン画面</title>
</head>

<body>
 <jsp:include page="includeHeader.jsp"/>
<!-- メイン -->


<!-- ログイン -->

<div id="main">

	<!-- ヘッダー 黒いところ-->
<div id="title"><!-- Regalo --></div>
	<div id="container">


			<s:form action="LoginAction"  theme="simple">

				<div id="title-address">LOGIN</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  	</div>
</div>



				<table class="mk1">

					<tr>
						<td colspan="2">
						<div class="error-message">
							<s:iterator value="idErrorMessageList">
								<s:property /><br>
							</s:iterator>

						</div>
						</td>
					</tr>

					<tr>
							<td>
								<span class="member_form_title">ユーザーID</span>
							</td>
							<td>
								<s:textfield type="text" id="hako" name="userId" value="%{#session.saveId}" autofocus="autofocus" placeholder="1文字以上8文字以下" />
							</td>
					</tr>

					<s:if test="#session.passwordErrorMessageListSize > 0">
					<tr>
						<td colspan="2">
						<div class="error-message">
							<s:iterator value="passwordErrorMessageList">
								<s:property /><br>
							</s:iterator>

						</div>
						</td>
					</tr>
					</s:if>

					<tr>
							<td>
								<span class="member_form_title">パスワード</span>
							</td>
							<td>

								<s:password name="password" placeholder="1文字以上16文字以下" id ="hako"/>
							</td>
					</tr>

				</table>
				<br>


		<table class="mk2">
				<!-- SaveID -->
				<tr>
				<td>
				<div id="saveId">
						<s:checkbox name="saveLogin"/>
						<span class="mozi">ID保存</span>
					</div>
					<!-- 	</td>
					<td> -->
				<!-- 	<div id="saveId">
				</div> -->
					</td>
				</tr>


				<!-- ログインボタン -->
				<tr>
				<td>
				<div class="submitButton fadelink">
						<s:submit value="ログイン" class="button"/>
				</div>
				</td>
				</tr>



			<tr>
			<td>
		<!-- 	<div class="link"> -->
		       <div id="space"><span class="mozi2"><a href='<s:url action="GoUserCreateAction"><s:param name="deleteFlg" value="true" /></s:url>'>新規会員登録</a></span></div>
				</td>
			</tr>
			<tr>
			<td>
			  <div><span class="mozi2"><a href='<s:url action="GoPasswordResetAction"/>'>パスワード再設定</a></span></div>
				</td>
			</tr>
				</table>

		  <!-- </div> -->
		  </s:form>
		  </div>
		  </div>



<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>



</body>
</html>