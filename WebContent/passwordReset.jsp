<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" href="./css/form-style.css">
<link rel="stylesheet" href="./css/passwordReset.css">
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />

<title>パスワード再設定画面</title>

<script>
function goLoginAction(){
	document.getElementById("form").action="LoginAction";
}

function goPasswordResetConfirmAction(){
	document.getElementById("form").action="PasswordResetConfirmAction";
}
</script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<!-- 半角英数字入力のアラートを出す -->
<script type="text/javascript">
	function checkForm($this) {
		var str = $this.value;
		if (str.match(/[^A-Z^a-z0-9]+/)) {
			alert('半角英数で入力してください');
			$this.value = "";
		}
	}
</script>

</head>
<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>

<div class="main">
	<div id="title"></div>
	<div id="container">

	<s:form action="PasswordResetConfirmAction" theme="simple" id="form" method="post">

	<div id="title1">PASSWORD</div>
	<div id="title2">RESET</div>
		<div class="ribbon_box3">
  		<div class="ribbon_area">
    	<span class="ribbon14">Regalo</span>
  </div>
</div>

		<table class="form_password">

		<!-- ユーザーID -->
		<tr>
			<td colspan="2" class="error">
				<div class="error-message" >
					<s:if test="!(errorId.equals(''))">
						<s:property value="errorId"/>
					</s:if>
					<s:elseif test="!errorMessageId.isEmpty()">
						<s:property value="errorMessageId"/>
					</s:elseif>
 				</div>
 				<div class="error-message">
					<s:if test="ErrorUserIdList.length > 0">
						<s:iterator value="ErrorUserIdList">
						<s:property /><br>
						</s:iterator>
					</s:if>
 				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">ユーザーID</span></td>
			<td>
 				<div class="box">
					<s:textfield name="userId"  id="hako" placeholder="半角英数字" theme="simple"/>
 				</div>
			</td>
		</tr>

		<!-- 現在のパスワード -->
		<tr>
			<td colspan="2" class="error">
 				<div class="error-message">
					<s:if test="!(errorPassword.equals(''))">
						<s:property value="errorPassword"/>
					</s:if>
 				</div>
 				<div class="error-message">
					<s:if test="ErrorPasswordList.length > 0">
						<s:iterator value="ErrorPasswordList">
						<s:property />
						</s:iterator>
					</s:if>
 				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">現在のパスワード</span></td>
				<td>
 					<div class="box">
						<s:password name="password" id="hako" size="20%"  placeholder="半角英数字" />
 					</div>
			</td>
		</tr>

		<!-- 新しいパスワード -->
		<tr>
			<td colspan="2" class="error">
 				<div class="error-message">
					<s:if test="!ErrorPasswordList1.isEmpty()">
						<s:iterator value="ErrorPasswordList1">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
				<div class="error-message">
					<s:if test="ErrorPasswordList2.size()>0">
						<s:iterator value="ErrorPasswordList2">
						<s:property/>
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">新しいパスワード</span></td>
			<td>
				<div class="box">
					<s:password name="password1"  id="hako" size="20%" placeholder="半角英数字" theme="simple"/>
				</div>
			</td>
		</tr>

		<!-- 確認パスワード -->
		<tr>
			<td colspan="2" class="error">
 				<div class="error-message">
					<s:if test="!(password1.equals(password2))">
					<s:property value="errorMessagePassword"/>
					</s:if>
 				</div>
 				<div class="error-message">
					<s:if test="ErrorReconfirmPassList.size()>0">
						<s:iterator value="ErrorReconfirmPassList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">確認パスワード</span></td>
				<td>
					<div class="box">
						<s:password name="password2"  id="hako" size="20%" placeholder="半角英数字" theme="simple"/>
					</div>
				</td>
		</tr>
		</table>

		<!-- 送信ボタン -->
		<div class="button1">
			<span class="button3"><s:submit value="確認" class="button4 fadelink"  onclick="goPasswordResetConfirmAction();"/></span>
			<span class="button3"><s:submit value="戻る" class="button4 fadelink" onclick="goLoginAction();"/></span>

		</div>

	</s:form>
</div>
</div>

<!-- フッター -->
<jsp:include page="includeFooter.jsp"/>

</body>
</html>

