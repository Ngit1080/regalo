<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" href="./css/form-style.css">
<link rel="stylesheet" href="./css/addressCreate.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<title>宛先情報入力画面</title>
</head>

<script>
function goBuyProductConfirmAction(){
	document.getElementById("form").action="BuyProductConfirmAction";
}

function goAddressCreateConfirmAction(){
	document.getElementById("form").action="AddressCreateConfirmAction";
}
</script>

<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>

<div class="main">

	<div id="title"></div>
	<div id="container">

	<s:form action="AddressCreateConfirmAction" theme="simple" id="form">

 	<div id="containar-title">ADDRESS</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  	</div>
</div>

<div class="form_text">

		<table>

		<!-- 姓 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
						<s:iterator value="#session.familyNameErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">姓</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="familyName" class="txt" size="20%" placeholder="1文字以上16文字以下" />
				</div>
			</td>
		</tr>

		<!-- 名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
						<s:iterator value="#session.firstNameErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<span class="member_form_title">名</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="firstName" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>

		<!-- 姓仮名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
						<s:iterator value="#session.familyNameKanaErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">姓仮名</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="familyNameKana" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>


		<!-- 名仮名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
						<s:iterator value="#session.firstNameKanaErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">名仮名</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="firstNameKana" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>

		<!-- 性別 -->
		<tr>
			<td><span class="form_title">性別</span></td>
			<td>
				<div class="radio_button">
					<s:radio name="sex" list="#{'0': '男性　　', '1': '女性'}" value="0" />
				</div>
			</td>
		</tr>

		<!-- 住所 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.userAddressErrorMessageList.isEmpty()">
						<s:iterator value="#session.userAddressErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">住所</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="userAddress" class="txt" size="20%" placeholder="15文字以上50文字以下"/>
				</div>
			</td>
		</tr>


		<!-- 電話番号 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.telNumberErrorMessageList.isEmpty()">
						<s:iterator value="#session.telNumberErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">電話番号</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="telNumber" class="txt" size="20%" placeholder="10文字以上13文字以下"/>
				</div>
			</td>
		</tr>

		<!-- メールアドレス -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="!#session.emailErrorMessageList.isEmpty()">
						<s:iterator value="#session.emailErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">メールアドレス</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="email" class="txt" placeholder="半角英数字" />
				</div>
			</td>
		</tr>
		</table>
	</div>


	<!-- 送信ボタン -->
		<div class="button">
			<span class="button3"><s:submit value="確認" class="button4 fadelink"  onclick="goAddressCreateConfirmAction();"/></span>

			<span class="button3"><s:submit value="戻る" class="button4 fadelink" onclick="goBuyProductConfirmAction();"/></span>
		</div>

	</s:form>

	</div>
</div>

<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>

</body>
</html>

