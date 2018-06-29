<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style2.css">
<link rel="stylesheet" type="text/css" href="./css/cart.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>
<title>カート</title>
<style type="text/css">

 #contents {
 position:relative;
 width:700px;
 margin:0 auto;

 }




.submit_btn {
/* /* 文字サイズを1.emに指定 */ */
/*     font-size: 1em; */
/*     /* 文字の太さをboldに指定 */ */
/*     /*font-weight: bold; */ */
/*     /* 縦方向に10px、 */
/*      * 横方向に30pxの余白を指定 */ */
/*     padding: 5px 30px; */
/*     /* 文字色を白色に指定 */ */
/*     color: white; */
/*     /* ボーダーをなくす */ */
/*     border-style: none; */
/*     /* ボタンの影の指定 */
/*      * 影の横幅を2px */
/*      * 縦長を2px */
/*      * ぼかしを3px */
/*      * 広がりを1px */
/*      * 色を#666（グレー）に指定 */ */
/*      box-shadow: 2px 2px 3px 1px #ffffff; */
/*      -moz-box-shadow: 2px 2px 3px 1px #ffffff; */
/*     -webkit-box-shadow: 2px 2px 3px 1px #ffffff; */
/*     /* テキストの影の指定 */
/*      * 影の横幅を1px */
/*      * 縦長を1px */
/*      * ぼかしを2px */
/*      * 色を#000（黒）に指定 */ */
/*     text-shadow: 1px 1px 2px #000; */
/*      background-color: #000000; */
/*    /* グラデーションの指定 */ */
/*      background: -moz-linear-gradient(bottom, #36d, #000000 50%, #36d); */
/* /*      background: -webkit-gradient(linear, left bottom, left top, from(#000), color-stop(0.5, #ffffff), to(#000)); */ */
/*      font-family: 'Cinzel', serif; */
/* 	text-align: center; */

	position: relative;
	display: block;
	width: 100px;
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

.submit_btn:hover{
	text-shadow: -6px 0px 15px rgba(255, 255, 240, 0.83), 6px 0px 15px rgba(255, 255, 240, 0.83);
	transition: .4s;
}

  #title{
 	width: 100%;
      height: 100px;
/*       background: black;  */
      font-size: 80px;
      line-height: 100px;
      margin-bottom: 100px;
      color: black;
      font-family: 'Cinzell',serif;
  	}

h2 {
	text-align: center;
/* 	font-family:'Cinzell',serif; */
	font-weight:bold;
	}

.btn1 {
	text-align: center;
	padding-bottom: 20px;
}
</style>
</head>

<body>
<!-- ヘッダー -->
 	<jsp:include page="includeHeader.jsp"/>

<div id="main">

	<div id=title></div>


	<div class="container">

<div id="title-address">CART</div>
	<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
</div>
</div>




		<s:if test="#session.checkListErrorMessageList!=null">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.checkListErrorMessageList">
						<s:property />
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="CartDtoList.size() > 0">
			<s:form id="form">
				<table class="horizontal-list-table">
					<s:iterator value="CartDtoList">
						<tr>
							<td class="check_hover">削除<s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
							<td><img src='<s:property value="imageFilePath"/>' width="200px" height="200px" /></td>
							<td>
								<table>
									<tr><td>商品名</td><td><s:property value="productName"/></td></tr>
									<tr><td>ふりがな</td><td><s:property value="productNameKana"/></td></tr>
									<tr><td>値段</td><td><s:property value="price"/></td></tr>
									<tr><td>発売会社名</td><td><s:property value="releaseCompany"/></td></tr>
									<tr><td>発売年月</td><td><s:property value="releaseDate"/></td></tr>
									<tr><td>個数</td><td><s:property value="productCount"/></td></tr>
									<tr><td>小計</td><td><s:property value="subtotal"/>円</td></tr>

								</table>
							<%-- <ul>
								<li>商品名　<s:property value="productName"/></li>
								<li>ふりがな　<s:property value="productNameKana"/></li>
								<li>値段　<s:property value="price"/>円</li>
								<li>発売会社名　<s:property value="releaseCompany"/></li>
								<li>発売年月　<s:property value="releaseDate"/></li>
								<li>個数　<s:property value="productCount"/></li>
								<li>小計　<s:property value="subtotal"/>円</li>
							</ul> --%>
							</td>


						</tr>


					</s:iterator>
				</table>

				<div class="price_and_btns">

					<h2><s:label value="カート合計金額 :" class="money"/><s:property value="totalPrice"/>円</h2><br>


						<div class="btn1">
							<s:submit value="商品一覧" class="submit_btn fadelink" onclick="this.form.action='GoProductListAction';"/>
						</div>

						<s:if test="#session.rank == 1">
						<div class="btn1">
							<s:submit value="VIP商品一覧" class="submit_btn fadelink" onclick="this.form.action='GoVipProductListAction';"/>
						</div>
						</s:if>


					<div class="submit_btn_box">

						<div class="contents-btn-set">
							<s:submit value="決済" class="submit_btn fadelink" onclick="this.form.action='BuyProductConfirmAction';"/>
						</div>

						<div class="contents-btn-set">
							<s:submit value="削除" class="submit_btn fadelink" onclick="this.form.action='CartDeleteAction';"/>
						</div>
					</div>



				</div>
			</s:form>
		</s:if>
		<s:else>
			<div class="info">
			カート情報はありません。
			</div>
		</s:else>
	</div>
</div>
<footer>
	<s:include value="includeFooter.jsp"/>
</footer>
</body>
</html>