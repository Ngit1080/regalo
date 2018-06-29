<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>


	<link rel="stylesheet" type="text/css" href="./css/style2.css">
	<link rel="stylesheet" type="text/css" href="./css/confirm-style.css">

	<link rel="stylesheet" type="text/css" href="">
	<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">


<title>マイページ</title>

  <style type="text/css">


/* myPage データ */


 	.myPage{
  			text-align:center;
      		margin:0 auto;
     		color: black;
/*      		font-family: cursive,serif; */
     		width: 50%;
 			height: 0 auto;
 			word-wrap: normal;
 			font-weight: bold;
 /* 			padding-top: 0px; */
 /* 			padding-left: 15px; */

 	}


		.text{
				text-align:left;
				font-weight: 300;
				font-size: 18px;
/* 				margin: 20px 20px 20px 20px; */
				position: relative;
 				top:30px;
 				right: 40px;
 				font-weight: bold;

		}

		.myPageDate{
				text-align:left;
				font-weight: 300;
				font-size: 25px;
/* 				margin: 30px 20px 30px 20px; */
				position: relative;
				right: -50%;
				font-weight: bold;

		}

		.myPagEwmail{
				text-align:left;
				font-weight: 300;
				font-size: 18px;
/* 				margin: 30px 20px 30px 20px; */
				font-family: Vollkorn;
				position: relative;
				top:5px;
				right: -50%;
				font-weight: bold;
		}


/*------------ VIPページ -------------*/

#container2{
	position:relative;
/* 	width:35%; */
    width:auto;
/* 	height:800px; */
    height:auto;
 	background:black;
	margin-left : 30%;
	margin-right: 30%;
	border-radius:50px;
/* 	background-color:rgba(215,149,71,0.1); */
	border:solid 1px gray;
/* 	padding-top: 50px; */

}

.ribbon14vip {
    display: inline-block;
    position: absolute;
    padding: 7px 0;
    left: -23px;
    top: 22px;
    width: 160px;
    text-align: center;
    font-size: 18px;
    line-height: 16px;
    background: #800000;
    color: #fff;
    letter-spacing: 0.05em;
    -webkit-transform: rotate(45deg);
    -ms-transform: rotate(45deg);
    transform: rotate(45deg);
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);

    font-family:'Cinzell',serif;
}

 	.myPage2{
  			text-align:center;
      		margin:0 auto;
     		color: white;
     		font-weight:bold;
     		width: 50%;
 			height: 0 auto;
 			word-wrap: normal
 /* 			padding-top: 0px; */
 /* 			padding-left: 15px; */
 	}

#title-address2 {
	width:100%;
	height:150px;

/* 	background:black; */

	font-size:80px;
	line-height:200px;
/* 	border-bottom:solid 1px red; */

/* 	margin-bottom:150px; */

	color:white;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}


		 a{
			width: 20%;
 			height: 20%;
 			position: relative;
 			top:25px;
 			left: 42%
	}

		img{
			width: 20%;
 			height: 21%;
 			position: relative;
 			left: 40%
		}

		 a:visited{
				color: white;
		} /*訪問済み*/
		a:link {
				color: white;
 		} /*… 未訪問のリンク */

		 a:hover {
				color: #B8860B;
		} /* … ポイント時のリンク*/

		 a {
				text-decoration: none;
				font-size: 20px;
				text-align: center;

		} /* … 下線削除*/




/*------------ ボタン編集 ----------*/

		.submit_btn_box{
			padding-top: 50px;
			padding-bottom: 50px;
			padding-left: 23px;
		}

		.vipimg{
			width: 100%;
 			height: 20%;
 			background-color: black;
		}
button.del{
	position: relative;
	display: block;
	width: 120px;
	padding: 0.8em;
	text-align: center;
	font-weight: bold;
	text-decoration: none;
	color: #fff;
	text-shadow: 0 0 5px rgba(255, 255, 255, 0.0);
	background: black;
	transition: .4s;
	border-radius: 4px;

	margin:0 auto;
}
button.del:hover{
	text-shadow: -6px 0px 15px rgba(255, 255, 240, 0.83), 6px 0px 15px rgba(255, 255, 240, 0.83);
	transition: .4s;
}

</style>


</head>
<body>
<!-- ヘッダー -->
		<jsp:include page="includeHeader.jsp"/>


	<div id="main">

		<div id = "title">
		</div>

<!-- 一般会員 -->
		<s:if test="#session.rank == 0">


		<div id = "container">


		<div id = "title-address">
				<span>MY PAGE</span>
					<div class="ribbon_box3"></div>
  					<div class="ribbon_area">
    				<span class="ribbon14">Regalo</span>
    				</div>
		</div>


			<s:iterator value="myPageList">

					<div class="myPage">

									<div class="text">氏名：</div>
									<div class=myPageDate>
											<s:property value="familyName"/>
											<s:property value="firstName"/>
									</div>

									<div class="text">ふりがな：</div>
									<div class=myPageDate>
											<s:property value="familyNameKana"/>
											<s:property value="firstNameKana"/>
									</div>

									<div class="text">性別：</div>
									<div class=myPageDate>
											<s:if test="sex==0">男性</s:if>
											<s:else>女性</s:else>
									</div>

									<div class="text">メールアドレス：</div>
									<div class=myPagEwmail>
											<s:property value="email"/>
									</div>

					</div>

			</s:iterator>

<br>


							<s:form action="GoBuyProductHistoryAction">
							<div class = "submit_btn_box">
									<button class = "del fadelink" type="submit">商品履歴</button>
							</div>
							</s:form>

		</div>

				</s:if>

<!-- 一般会員ここまで -->




<!-- VIP会員ここから -->


			<s:if test="#session.rank == 1">
					<div id = "container2">


		<div id = "title-address2">
				<span>MY PAGE</span>
					<div class="ribbon_box3"></div>
  					<div class="ribbon_area">
    				<span class="ribbon14vip">Regalo</span>
    				</div>
		</div>


		<div class = "vipimg">
		<img src="./images/viphaikei3.jpg">
		</div>


			<s:iterator value="myPageList">

					<div class="myPage2">

									<div class="text">氏名：</div>
									<div class=myPageDate>
											<s:property value="familyName"/>
											<s:property value="firstName"/>
									</div>

									<div class="text">ふりがな：</div>
									<div class=myPageDate>
											<s:property value="familyNameKana"/>
											<s:property value="firstNameKana"/>
									</div>

									<div class="text">性別：</div>
									<div class=myPageDate>
											<s:if test="sex==0">男性</s:if>
											<s:else>女性</s:else>
									</div>

									<div class="text">メールアドレス：</div>
									<div class=myPagEwmail>
											<s:property value="email"/>
									</div>

					</div>

			</s:iterator>

<br>



								<a href="welcomeVipClass.jsp">VIP会員ページ</a>



							<s:form action="GoBuyProductHistoryAction">
							<div class = "submit_btn_box">
									<button class = "del fadelink" type="submit">商品履歴</button>
							</div>
							</s:form>

		</div>

			</s:if>

<!-- VIP会員ここまで -->


	</div>








<!-- フッダー -->
	<jsp:include page="includeFooter.jsp"/>

</body>
</html>