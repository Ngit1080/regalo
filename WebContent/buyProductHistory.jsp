<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<link rel="stylesheet" type="text/css" href="">
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>

<link rel="stylesheet" href="./css/style.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">

<title>購入履歴</title>


  <style type="text/css">

  #container {
/* 	color:white; */

	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
}


  	.textnasi{
  		text-align: center;
  		color: black;
		width: 85%;
      	height: 65%;
      	padding-top: 10%;
      	padding-left: 8%;
      	padding-bottom: 13%;
  	}

  	.textnasi2{
  		text-align: center;
  		color: black;
		width: 85%;
      	height: 60%;
      	padding-top: 10%;
      	padding-left: 8%;
      	padding-bottom: 13%;
  	}


     .clear{
     		clear: both;
     }

	.text{
			padding-top: px;
	}


/* ボタン編集 */

button.del{
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

	margin:0 auto;
}
button.del:hover{
	text-shadow: -6px 0px 15px rgba(255, 255, 240, 0.83), 6px 0px 15px rgba(255, 255, 240, 0.83);
	transition: .4s;
}


/**/

a {
	color:white;
}

#container {
	padding-bottom:50px;

	border-radius:50px;
	background-color:rgba(255,255,255,0.4);
	border:solid 1px gray;
}

#wrapper {
	position:relative;

	width:21.25%;
	height:auto;

	margin-top:5%;
	margin-bottom:5%;
	margin-left:8.5%;

	/* border:1px solid white; */

	float:left;

	color:white;
}

/*ボーダーの比率*/
.ratio-1_1:before {
	content: "";
	display: block;
	padding-top: 100%; /* ratio */
}

/*商品*/
#products {
	position:absolute;
	top:0;
	left:0;
	width:100%;
	height:100%;
}

/*画像を囲う*/
#imageContainer {
	display:block;
	width:100%;
	height:100%;
}

/*モノクロフィルタ*/
#products img {
	webkit-filter: grayscale(100%);
	filter: grayscale(100%);
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
	border-radius: 5px;
}

#products:hover img {
	-webkit-filter: grayscale(0);
	filter: grayscale(0);
}

#products:hover{
	transform: scale(1.02);
	-webkit-transition:	all 0.6s ease;
	transition:		all 0.6s ease;
}

/*商品詳細*/
#products #productDetail {

  transition: 0.5s;
  position: absolute;
  left: 16px;
  bottom: 16px;
  transform: translateX(-10%);
  display: inline-block;
  padding: 4px 12px;
  border-radius: 12px;
  color: #fff;
  font-size: 14px;
  background: rgba(0, 0, 0, 0.5);
  opacity: 0;
}
#products:hover #productDetail {
	opacity: 0.9;
  transform: translateX(0);
}
/*画像*/
#image {
	position: absolute;

	top:50%;
	left:50%;

	-webkit-transform: translate(-50%,-50%);
	-moz-transform: translate(-50%,-50%);
	-ms-transform: translate(-50%,-50%);
	-o-transform: translate(-50%,-50%);
	transform: translate(-50%,-50%);

	max-width:100%;
	max-height:100%;

}

.url {
	position:absolute;
	top:80;
	left:50;
	width:100%;

	-webkit-transform: translate(-50%,-50%);
	-moz-transform: translate(-50%,-50%);
	-ms-transform: translate(-50%,-50%);
	-o-transform: translate(-50%,-50%);
	transform: translate(-50%,-50%);
}

/*商品名かな*/
.productNameKana {
	font-size:12px;
}

/*価格*/
#price {
	color:white;
}

/* for modern brouser */
		.clearfix:after {
		  content: ".";
		  display: block;
		  clear: both;
		  height: 0;
		  visibility: hidden;
		}
		/* IE7,MacIE5 */
		.clearfix {
		  display: inline-block;
		}
		/* WinIE6 below, Exclude MacIE5 \*/
		* html .clearfix {
		  height: 1%;
		}
		.clearfix {
		  display: block;
		}
/* for modern brouser */

#title-address {
	width:100%;
	height:150px;
	font-size:80px;
	line-height:200px;
	color:black;
	font-family:'Cinzell',serif;
	text-align:center;
	text-shadow: 1px 2px 3px white;
	}

 </style>
</head>
<body>

		<jsp:include page="includeHeader.jsp"/>



			<div id="main">

						<%-- <div id ="title">
								<span>HISTORY</span>
						</div> --%>


				<div id="container" class="clearfix">

				<div id="title-address">History</div>

				<div class="ribbon_box3">
	  			<div class="ribbon_area">
	    			<span class="ribbon14">Regalo</span>
	    		</div>
				</div>


					<!--購入がない場合 -->
						<s:if test = "historyList.size() == 0">
								<div class = "textnasi">
										<h2>購入情報はありません</h2>
								</div>
						</s:if>



					<!-- 購入履歴がある場合 -->

						<s:elseif test = "historyList !=null && historyList.size() !=0">

									<s:form action="GoBuyProductHistoryAction"></s:form>

									<s:iterator value = "historyList">
									<div id="wrapper" class="ratio-1_1">
					<div id="products">

						<!-- 商品画像 -->
						<div id="imageContainer" href="%{url}" >
							<img id="image" src='<s:property value="imageFilePath"/>' alt='<s:property value="imageFileName"/>'/>
						</div>

						<br>
						<div id="productDetail">

							<div class="datailHover">

									<!-- 商品名かな -->
									<span class="productNameKana">
										<s:property value="productNameKana"/>
									</span>

									<br>
									<!-- 商品名 -->
									<s:property value="productName"/>


								<br>
								<!-- 価格 -->
								<div id="price">
									<span>&yen;</span>
									<fmt:formatNumber value="${price}"/>
								</div>

								発売会社名：<s:property value="releaseCompany" /><br>
									      発売年月日：
										  <fmt:parseDate var="date" value="${releaseDate}" pattern="yyyy-MM-dd HH:mm:ss.SS" />
										  <fmt:formatDate value="${date}" pattern="yyyy年M月d日"/>
							</div>

						</div>
					</div>
				</div>

									</s:iterator>

						</s:elseif>

					<!-- 購入履歴削除後 -->
						<s:else>
							<div class = "textnasi2">
									<h2>購入情報はありません</h2>
							</div>
						</s:else>




<div class = "clear"></div>


					<!-- 全件削除ボタン -->
						<s:if test = "historyList.size() !=0">
							<s:form action="GoBuyProductHistoryAction" onSubmit="return allDel()">
								<input type="hidden" name="deleteFlg" value="1">
								<button class = "del" type="submit">履歴全削除</button>
							</s:form>
						</s:if>

<br>
<!-- 			</div> -->

			</div>

			</div>



<jsp:include page="includeFooter.jsp"/>



<script>
//全件削除確認
function allDel(){



	if(window.confirm('全件削除しますか？')){

		return true;

	} else {

		return false;

	}
}
</script>
</body>
</html>