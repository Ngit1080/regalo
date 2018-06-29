<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style2.css">
<link rel="stylesheet" href="./css/form-style.css">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />
<title>新規登録画面</title>
</head>

<script>
function goGoLoginAction(){
	document.getElementById("form").action="GoLoginAction";
}

function goUserCreateConfirmAction(){
	document.getElementById("form").action="UserCreateConfirmAction";
}
</script>

<style type="text/css">

.container{
	position:relative;
	width:auto;
 	height:auto;
/*     height:auto; */
/* 	background:black; */
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

.check {
	font-weight: bold;
	}

.button1 {
  	text-align: center;
/*    	padding-top: 720px; */
  	margin-left:10px;
  	padding-top:30px;
	padding-bottom: 30px;
  /* 	margin-top: 485px; */
/*   	margin-top: 480px; */
/*   	clear:both; */
	/*margin-right:10px;*/
 	}

</style>



<body>
<!-- ヘッダー -->
<jsp:include page="includeHeader.jsp"/>
<!-- メイン -->
<div class="main">

		<div id="title"></div>

		<div class="container">




					<s:form action="UserCreateConfirmAction" theme="simple" id="form">

<div id="title-address">USER</div>
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
					<s:if test="familyNameErrorMessageList.size()>0">
						<s:iterator value="familyNameErrorMessageList">
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
					<s:textfield id="hako" name="familyName"  value="%{#session.familyName}" class="txt" size="20%" placeholder="1文字以上16文字以下" />
				</div>
			</td>
		</tr>

		<!-- 名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="firstNameErrorMessageList.size()>0">
						<s:iterator value="firstNameErrorMessageList">
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
					<s:textfield id="hako" name="firstName"  value="%{#session.firstName}" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>

		<!-- 姓仮名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="familyNameKanaErrorMessageList.size()>0">
						<s:iterator value="familyNameKanaErrorMessageList">
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
					<s:textfield id="hako" name="familyNameKana" value="%{#session.familyNameKana}" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>



		<!-- 名仮名 -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="firstNameKanaErrorMessageList.size()>0">
						<s:iterator value="firstNameKanaErrorMessageList">
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
					<s:textfield id="hako" name="firstNameKana" value="%{#session.firstNameKana}" class="txt" size="20%" placeholder="1文字以上16文字以下"/>
				</div>
			</td>
		</tr>

		<!-- 性別 -->
		<tr>
			<td><span class="member_form_title">性別</span></td>
			<td>
				<div class="check">
					<s:radio name="sex" list="#{'0': '男性　　', '1': '女性'}" value="0" />
				</div>
			</td>
		</tr>

		<!-- UserId -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="userIdErrorMessageList.size()>0">
						<s:iterator value="userIdErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
			</tr>
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="existUserIdErrorMessage!=null">
					<s:property value="existUserIdErrorMessage" />
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">UserId</span></td>
			<td>
				<div class="box">
					<s:textfield id="hako" name="userId" value="%{#session.userId}" class="txt" size="20%" placeholder="1文字以上8文字以下"/>
				</div>
			</td>
		</tr>


		<!-- PassWord -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="passwordErrorMessageList.size()>0">
						<s:iterator value="passwordErrorMessageList">
						<s:property />
						</s:iterator>
					</s:if>
				</div>
			</td>
		</tr>
		<tr>
			<td><span class="member_form_title">パスワード</span></td>
			<td>
				<div class="box">
					<s:password id="hako" name="password" class="txt" size="20%" placeholder="半角英数字"/>
				</div>
			</td>
		</tr>

		<!-- メールアドレス -->
		<tr>
			<td colspan="2">
				<div class="error-message">
					<s:if test="emailErrorMessageList.size()>0">
						<s:iterator value="emailErrorMessageList">
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
					<s:textfield id="hako" name="email" value="%{#session.email}" class="txt" placeholder="半角英数字" />
				</div>
			</td>
		</tr>
		</table>
	</div>


	<!-- 送信ボタン -->
		<div class="button1">
			<span class="button3"><s:submit value="確認" class="button4 fadelink"  onclick="goUserCreateConfirmAction();"/></span>
			<span class="button3"><s:submit value="戻る" class="button4 fadelink" onclick="goGoLoginAction();"/></span>
		</div>
	</s:form>
<!-- 	</div> -->
	</div>
</div>
<!-- </div> -->
	<!-- フッター -->
	<jsp:include page="includeFooter.jsp"/>

</body>
</html>


