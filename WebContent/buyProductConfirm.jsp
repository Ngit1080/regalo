<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 金額、日付表示カスタムタグ -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- 	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css"> --%>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<%--     <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/favicon.ico"> --%>
<%--     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mt_style.css"> --%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/settlement_style.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

	<link rel="stylesheet" type="text/css" href="./css/style2.css">
	<link rel="stylesheet" type="text/css" href="./css/confirm-style.css">

	<link rel="stylesheet" type="text/css" href="">
	<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">


<script src="./js/fade.js" type="text/javascript"></script>

<title>決済確認画面</title>
</head>
 <style type="text/css">
	#container{
	position:relative;
	width:auto;
/* 	height:800px; */
    height:auto;
/* 	background:black; */
	margin-left:25%;
	margin-right:25%;
	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
	text-align: center;
/* 	padding-top: 50px; */

}


.message{
	font-size:25px;
	line-height:30px;
	color:black;
/* 	font-family:'Cinzell',serif; */
	text-align: center;
	margin:0 auto;

}

.totalprice{
    font-size:25px;
	line-height:30px;
/*  	font-family:'Cinzell',serif; */
	margin: 20px 20px 20px 20px;
	text-align: center;
}

.box{
		margin:0 auto;
}

.top-text{
	color:white;
	text-align:center;
	padding-top:50px;
	font-size:30px;
	padding-bottom:10px;
	text-shadow: 1px 2px 3px white;
}

.back{
	padding-top: 25px;
	padding-bottom: 25px;
	text-align: center;
}

.main_content{
	width: 50%;
	height: 170px;
	margin-left: 30%;
}

.main_content{
	margin-top: 50px;
}

table {
			text-align:left;
			margin:0 auto;
		}
img{
	margin-right:40px;
	border-radius:10px;
}
.confirm-box{
	margin-top:80px;
	padding-top:20px;
	text-align: left;
	border-radius:50px;
	border:solid 1px black;
}
.destination_title{
	margin-left:80px;
}

/* #img{
	width:30%;
	height:170px;
	float: left;
} */

label {
	color:black;
	font-weight: bold;
	}

.button_custom2{
	position: relative;
	display: block;
	width: 160px;
	padding: 0.8em;
	text-align: center;
	font-weight: bold;
	text-decoration: none;
	color: #fff;
	text-shadow: 0 0 5px rgba(255, 255, 255, 0.0);
	background: black;
	transition: .4s;
	border-radius: 4px;

	display: inline-block;

	margin:0 auto;
}
.button_custom2:hover{
	text-shadow: -6px 0px 15px rgba(255, 255, 240, 0.83), 6px 0px 15px rgba(255, 255, 240, 0.83);
	transition: .4s;
}

 </style>

<body>





<!-- ここからヘッダー -->
	<jsp:include page="includeHeader.jsp" />
<!-- ヘッダーここまで -->



<!-- ここからメイン -->
	<div id="main">
		<div id="title">

	</div>

	<div id = "container">
			<div id="title-address">
					<span>Confirm</span>
					<div class="ribbon_box3"></div>
  					<div class="ribbon_area">
    				<span class="ribbon14">Regalo</span>
    				</div>
			</div>

			<span class="message">購入情報は以下になります</span>

			<s:form action="BuyProductCompleteAction">

			<table class="large-table">
				<s:iterator value="cartList">

						<tr>
							<td><!-- 画像 -->

								<s:url id="url" action="ProDetailAction">
								<s:param name="id" value="productId" /></s:url>
								<s:a href="%{url}">
								<img id = "img" src='<s:property value="imageFilePath"/>' width="200px" height="200px" alt="画像なし"/>
								</s:a>


								<s:url id="url" action="ProDetailAction"><s:param name="id" value="productId" /></s:url>
								<s:a href="%{url}"></s:a>
							</td>
							<td>
								<table class="small-table">
									<tr><td>ふりがな　：　</td><td><s:property value="productNameKana" /></td></tr>
									<tr><td>商品名　　：　</td><td><s:property value="productName" /></td></tr>
									<tr><td>値段　　　：　</td><td>&yen;<fmt:formatNumber value="${price}" /></td></tr>
									<tr><td>購入数　　：　</td><td><s:property value="productCount" />点</td></tr>
									<tr><td>発売会社　：　</td><td><s:property value="releaseCompany" /></td></tr>
									<tr><td>発売日　　：　</td><td><fmt:parseDate var="date2" value="${ReleaseDate}" pattern="yyyy-MM-dd" /><fmt:formatDate value="${date2}" pattern="yyyy年M月d日" /></td></tr>

								</table>
							</td>
						</tr>

						<div class="submit_btn_box">
						<!-- <input class = "button_custom fadelink" type="submit" value="購入"></input> -->


					</div>






				</s:iterator>
			</table>
			<h2 class="totalprice">
						合計金額:&yen;
						<fmt:formatNumber value="${totalPrice}" />
			</h2>

			<button type="submit" class = "button_custom fadelink">購入</button>
			</s:form>






			<%-- <s:form action="BuyProductCompleteAction">


					<s:iterator value="cartList">
					<div class = "main_content">
						<!-- 画像 -->

								<s:url id="url" action="ProDetailAction">
								<s:param name="id" value="productId" /></s:url>
								<s:a href="%{url}">
								<img id = "img" src='<s:property value="imageFilePath"/>' alt="画像なし"/>
								</s:a>

								<s:url id="url" action="ProDetailAction"><s:param name="id" value="productId" /></s:url>
								<s:a href="%{url}"></s:a>

						<!-- ふりがな -->
								<s:property value="productNameKana" /><br>

						<!-- 商品名 -->
								商品名:<s:property value="productName" /><br>

							<!-- 値段 -->
								価格:&yen;<fmt:formatNumber value="${price}" /><br>

						<!-- 個数 -->
								(購入数:  <s:property value="productCount" />点)<br>


						<!-- 発売会社 -->
								発売会社：<s:property value="releaseCompany" /><br>

						<!-- 年月日 -->
								発売日：
								<fmt:parseDate var="date2" value="${ReleaseDate}" pattern="yyyy-MM-dd" /><fmt:formatDate value="${date2}" pattern="yyyy年M月d日" /><br>
					</div>
					</s:iterator>


					<br>
					<div class="totalprice">
						合計金額:&yen;
						<fmt:formatNumber value="${totalPrice}" />
					</div>
					<br>

					<div class="submit_btn_box">
						<input class = "button_custom fadelink" type="submit" value="購入"></input>
					</div>

			</s:form> --%>




		<!-- 宛先情報 -->
<!-- 			<div class="confirm-box"> -->
	<s:iterator value="addressInfoListDTO">


		<div class="confirm-box">
			<div class="destination_title">
				<label>
					<input type="radio" name="id" checked="checked"/>
					お届け先住所
				</label>
			</div>

			<table class="small-table">
									<tr><td>ふりがな</td><td><s:property value="familyNameKana"/>
										<s:property value="firstNameKana"/></td></tr>
									<tr><td>名前</td><td><s:property value="familyName"/>
				<s:property value="firstName"/></td></tr>
									<tr><td>住所</td><td><s:property value="userAddress"/></td></tr>
									<tr><td>電話番号</td><td><s:property value="telNumber"/></td></tr>
									<tr><td>メールアドレス</td><td><s:property value="email"/></td></tr>
			</table>



				<%-- <div class="text">ふりがな:</div>

				<div class="date">
				<s:property value="familyNameKana"/>
				<s:property value="firstNameKana"/>
				</div>

				<div class="text">名前:</div>
				<div class="date">
				<s:property value="familyName"/>
				<s:property value="firstName"/>
				</div>

				<div class="text">住所:</div>
				<div class="date">
				<s:property value="userAddress"/>
				</div>

				<div class="text">電話番号:</div>
				<div class="date">
				<s:property value="telNumber"/>
				</div>

				<div class="text">メールアドレス:</div>
				<div class="Ewmail">
				<s:property value="email"/>
				</div> --%>


		</div>

	</s:iterator>
<!-- 			</div> -->




					<div class="submit_btn_box">
						<input class="button_custom2" type="button" value="宛先情報の新規登録"
						onclick="location.href='<s:url action="GoAddressCreateAction" />'">
					</div>



<!-- ページリンク -->
			<div class= "back">
					<a href='<s:url action="GoCartAction" />'>カートに戻る</a>
			</div>
<!-- ページリンクここまで -->

			</div>
		</div>
<!-- メインここまで -->

<!-- フッター -->
	<jsp:include page="includeFooter.jsp" />
<!-- フッターここまで -->

<script type="text/javascript">
	function AddressDeleteAction() {
		document.getElementById("formAction").action = "AddressDeleteAction";
	}
	/* function goAddressRegiCompleteAction() {
		document.getElementById("form-action").action = "AddressRegiCompleteAction";
	} */
</script>

</body>
</html>
