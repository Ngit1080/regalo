<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<link rel="stylesheet" type="text/css" href="./css/includeHeader.css">
<link href="https://fonts.googleapis.com/css?family=Cinzel" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>

<link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

<script>
//サイドメニュー
$(function(){
  $('.side-menu-btn').click(function(){
    $('.side-menu').toggleClass('open');}
  );
})
</script>

<script>
//サイドメニュー
$(function () {
  var $body = $('body');
  $('#js__sideMenuBtn').on('click', function () {
    $body.toggleClass('side-open');
    $('#js__overlay').on('click', function () {
      $body.removeClass('side-open');
      $('.side-menu').removeClass('open');
      $('.btn_menu').removeClass('active');
      $("#m").removeClass("after");
      $("#e").removeClass("after");
      $("#n").removeClass("after");
      $("#u").removeClass("after");
    });
  });
});
</script>

<script>
//ボタンのアニメーション
$(function(){
  $('.btn_menu').click(function(){
    $(this).toggleClass('active');
  });
})
</script>

<script>
//MENU文字のアニメーション
$(function(){
    $('.btn_menu').click(function(){
        $("#m").toggleClass("after");
        $("#e").toggleClass("after");
        $("#n").toggleClass("after");
        $("#u").toggleClass("after");
    });
});

</script>

<style>

#m,#e,#n,#u {
	display: inline-block;
	font-size:12px;
	letter-spacing:0px;

	opacity:1;

    -webkit-transition: all 0.5s;
    -moz-transition: all 0.5s;
    -ms-transition: all 0.5s;
    -o-transition: all 0.5s;
    transition: all 0.5s;
}

#m.after{

    -webkit-transform: translate(0,20px) rotate(180deg);
    transform: translate(0,20px) rotate(180deg);

    opacity:0;
}

#e.after{

	transition-delay:0.1s;

    -webkit-transform: translate(0,20px) rotate(180deg);
    transform: translate(0,20px) rotate(180deg);

    /* -webkit-transform: translate(-80px,0);
    transform: translate(-80px,0);

    color:grey;

    font-size:40px; */

    opacity:0;
}

#n.after{

	transition-delay:0.2s;

    -webkit-transform: translate(0,20px) rotate(180deg);
    transform: translate(0,20px) rotate(180deg);

    opacity:0;
}

#u.after{

	transition-delay:0.3s;

    -webkit-transform: translate(0,20px) rotate(180deg);
    transform: translate(0,20px) rotate(180deg);

    opacity:0;
}

</style>


</head>
<body>

  <!-- サイドオープン時メインコンテンツを覆う -->
  <div class="overlay" id="js__overlay"></div>

  <!-- 開閉用ボタン -->
	  <button type="button" class="btn_menu side-menu-btn" id="js__sideMenuBtn">

			<span id="m">
			M
			</span>
			<span id="e">
			E
			</span>
			<span id="n">
			N
			</span>
			<span id="u">
			U
			</span>

	  <span class="bar bar1"></span>
	  <span class="bar bar2"></span>
	  <span class="bar bar3"></span>

	</button>

  <!-- サイドメニュー -->
  <nav class="side-menu">


	<div class="title">Menu</div>

	<%-- <div class="headerLogo">
		<a class="headerA fadelink" href='<s:url action="GoHomeAction"/>'>Regalo</a>
	</div> --%>


		<div class="right-list">
		<ul>
		<li>
		<s:form action="GoHomeAction">
		<button class="button1 fadelink" type="submit">TOP</button>
	</s:form>

</li><br>


<!-- 				マイページ -->
				<s:if test = "#session.loginFlg == true">
					<li>
						<div id="headerMypage">
							<s:form action="GoMyPageAction">
								<button class="button1 fadelink" type="submit">MY PAGE</button>
							</s:form>
						</div>
					</li><br>
				</s:if>

<!-- 				商品一覧 -->
                <s:if test="#session.masterId == null">
                 <li>
                 <div id ="headerProductList">
                 <s:form action="GoProductListAction">
					<button class="button1 fadelink" type="submit">GIFT</button>
				</s:form>
				</div><br>
				</li>
</s:if>
<!-- 				vip商品一覧 -->
				<s:if test="#session.rank == 1">
					<li>
						<div id="headerVipProductList">
							<s:form action="GoVipProductListAction">
								<button class="button1 fadelink" type="submit">VIP</button>
							</s:form>
						</div><br>
					</li>
				</s:if>
<!-- 				カート -->
               <s:if test="#session.masterId == null">
				<li>
					<div id="headerCart">
						<s:form action="GoCartAction">
							<button class="button1 fadelink" type="submit">CART</button>
						</s:form>
					</div><br>
				</li>
				</s:if>

<!-- 				ゲストユーザーのとき -->
				<s:if test="#session.loginFlg == false || #session.loginFlg == null">

					<li>
						<div id="headerLogin">
							<s:form action="GoLoginAction">
								<button class="button1 fadelink" type="submit">LOGIN</button>
							</s:form>
						</div><br>

					</li>

				</s:if>

<!-- 				ログインユーザーのとき -->
				<s:if test="#session.loginFlg == true && session.masterFlg != true">

				<li>
					<div id="headerLogout">
						<s:form action="LogoutAction">
							<button class="button1 fadelink" type="submit">LOGOUT</button>
						</s:form>
					</div><br>
				</li>

				</s:if>

<!-- 				masterのとき -->
				<s:if test="#session.masterId != null">

				<li>
					<div id="headerMaster">
						<s:form action="GoMasterAction">
							<button class="button1 fadelink" type="submit">MASTER</button>
						</s:form>
					</div>
				</li>

				</s:if>



			</ul>
		</div>
<s:if test="#session.masterId == null">
		<div id="headerSearch">
			<s:form action="ProductSearchAction" theme="simple">

					<s:select name="categoryId" list="#session.categoryList" listValue="categoryName" listKey="categoryId" class="category" id="categoryId"/>
					<br>
					<s:textfield name="searchWord" class="search"/>
					<button  class="button1 fadelink searchButton" type="submit">SEARCH</button>

			</s:form>
		</div>
</s:if>

  </nav>



<%-- 	<div id="menu">
		<div class="headerLogo">
			<a class="headerA" href='<s:url action="GoHomeAction"/>'>Regalo</a></div>


		<div class="right-list">
		<ul>
		<li>
		<div class="title">menu</div>
</li>





<!-- 				マイページ -->
				<s:if test = "#session.loginFlg == true">
					<li>
						<div id="headerMypage">
							<s:form action="GoMyPageAction">
								<button class="button1" type="submit">MY PAGE</button>
							</s:form>
						</div>
					</li><br>
				</s:if>

<!-- 				商品一覧 -->
                 <li>
                 <div id ="headerProductList">
                 <s:form action="GoProductListAction">
		<button class="button1" type="submit">GIFT ITEM</button>
	</s:form>
	</div><br>
	</li>
<!-- 				カート -->
				<li>
					<div id="headerCart">
						<s:form action="GoCartAction">
							<button class="button1" type="submit">CART</button>
						</s:form>
					</div><br>
				</li>

<!-- 				ゲストユーザーのとき -->
				<s:if test="#session.loginFlg == false || #session.loginFlg == null">

					<li>
						<div id="headerLogin">
							<s:form action="GoLoginAction">
								<button class="button1" type="submit">LOGIN</button>
							</s:form>
						</div>

					</li>

				</s:if>

<!-- 				ログインユーザーのとき -->
				<s:if test="#session.loginFlg == true && session.masterFlg != true">

				<li>
					<div id="headerLogout">
						<s:form action="LogoutAction">
							<button class="button1" type="submit">LOGOUT</button>
						</s:form>
					</div>
				</li>

				</s:if>


			</ul>
		</div>

		<div id="headerSearch">
			<s:form action="ProductSearchAction" theme="simple">

					<s:select name="categoryId" list="#session.categoryList" listValue="categoryName" listKey="categoryId" class="category" id="categoryId"/>
					<br>
					<s:textfield name="searchWord"/>
					<button  class="button1" type="submit">SEARCH</button>

			</s:form>
		</div>


		</div> --%>
</body>
</html>