<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css"/>
<link rel="stylesheet" type="text/css" href="">
<link rel="stylesheet" type="text/css" href="./css/includeHeader.css">
<!-- <link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel" rel="stylesheet"> -->
<link href="https://fonts.googleapis.com/css?family=Arizonia|Cinzel|Cormorant+Garamond" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.1/TweenMax.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

<script src="./js/fade.js" type="text/javascript"></script>

<script type="text/javascript">
  $(function(){
    $('.bgslideshow img:gt(0)').hide();
    setInterval(function() {
      $('.bgslideshow :first-child').fadeOut(5000)
        .next('img').fadeIn(5000)
      .end().appendTo('.bgslideshow');
    }, 4000);
  });

</script>


<title>ホーム画面</title>

<style type="text/css">

html {
	width:100%;
	height:100%;
}


/* #box { */
/* 	margin:0 auto; */
/* 	background:white; */
/* } */

svg {
    position:relative;
    top:350px;
    right:280px;
 	width:100%;
 	height:120%;
 }

#text {
	position:absolute;
	top:50%;
	left:50%;
	-webkit-transform: translate(-50%,-50%);
	-moz-transform: translate(-50%,-50%);
	-ms-transform: translate(-50%,-50%);
	-o-transform: translate(-50%,-50%);
	transform: translate(-50%,-50%);

	color:white;

    font-size: 150px;

    font-family: 'Cinzel', serif;
}

@-webkit-keyframes stroke-anim {
  0% {
    /* 100%だと最後まで表示されないので多めに設定する */
    stroke-dashoffset: 100%;
    fill:transparent;
  }
  50% {
    fill:transparent;
  }
  100% {
    stroke-dashoffset: 0%;
    fill:white;
  }
}

@keyframes stroke-anim {
  0% {
    /* 100%だと最後まで表示されないので多めに設定する */
    stroke-dashoffset: 100%;
    fill:transparent;
  }
  50% {
    fill:transparent;
  }
  100% {
    stroke-dashoffset: 0%;
    fill:white;
  }
}







   .bgslideshow { position: fixed; left:0; top:0; z-index: -1; height: 100%; width: 100%; }
   .bgslideshow img { position: absolute; min-height: 90%; min-width: 100%; width: 100%; height: 100%;left:0; top:0; }


</style>
</head>
<body>
<div id="main">
	<!-- ヘッダー -->
 	<jsp:include page="includeHeader.jsp"/>

 	<span id="text">REGALO</span>
 	<%-- <svg>

    <text x="45%" y="80%">REGALO</text>



</svg> --%>
<div class="bgslideshow">
<img  src="./images/haikei10.jpg">
<img  src="./images/haikei12.jpg" >
<img  src="./images/haikei16.jpg" >
</div>
</div>
<!-- 	フッター -->
<%-- 	<jsp:include page="includeFooter.jsp"/> --%>

</body>
</html>