<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="./js/fade.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.1/TweenMax.min.js"></script>
<meta http-equiv="refresh" content="5;URL='GoVipProductListAction'">

<link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="./js/jquery.drawsvg.js"></script>

<script type="text/javascript">
  var $svg = $('svg').drawsvg({
        duration: 400,
        easing: 'linear'
      });
  $svg.drawsvg('animate');
</script>


<title>ウェルカムランクアップ</title>

<style>

html {
	width:100%;
	height:100%;
 	background-image:url("./images/vipframe.jpeg");
 	/* 	background:black; */
/* background-size: contain; */
/*   background-size: cover;  */

	background-size: 100% 100%;


}

body {
    position:absolute;
/*     background:black; */
	width:100%;
}
svg {
    position:absolute;
    top:100%;
    left:50%;

    -webkit-transform: translate(-50%,-50%);
	-moz-transform: translate(-50%,-50%);
	-ms-transform: translate(-50%,-50%);
	-o-transform: translate(-50%,-50%);
	transform: translate(-50%,-50%);


	width:100%;
	height:250px;

}

text {
    /* 色はお好みで */
      stroke:#f7de05;
    /* 色はお好みで */
    fill: #f7de05;
    /* 文字が大きい方がアニメーションが綺麗なので50pxを指定 */
    font-size: 150px;
    /* 100%だと最後まで表示されないので多めに設定する */
    stroke-dasharray: 100% 100%;
    /* 線が細いほうがアニメーションが綺麗なので0.5pxを指定 */
    stroke-width: 0.3px;
    -webkit-animation: stroke-anim 5s linear;
    animation: stroke-anim 6s linear;
 	font-family: 'Great Vibes', cursive;
}

/*↓下線*/
/* @keyframes UnderBar { */
/*   0% { */
/*     opacity: 0; */
/*     transform: translateX(-50px); */
/*   } */

/*   50% { */
/*     opacity: 0; */
/*     transform: translateX(-50px); */
/*   } */

/*   100% { */
/*     opacity: 0.7; */
/*     transform: translateX(0); */
/*   } */


/* #underBar { */
/* 	position:absolute; */
/* 	top:65%; */
/* 	left:34.3%; */
/* 	content: ""; */
/* 	display: inline-block; */
/* 	width: 450px; */
/* 	height: 1px; */
/* 	background: #990000; */

/* 	animation-duration: 3s; */
/* 	animation-name: UnderBar; */
/* } */
/*↑下線*/

/*↓塗りつぶし*/
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
    fill:#f7de05;
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
    fill:#f7de05;
}
}

.vipicon{
    left:650px;

}
#container {
    width:85%;
/* 	height:800px; */
	text-align:center;
/* 	background-image:url("./images/vipframe.jpeg"); */
/* 	background:black; */
background-size: contain;
/*   background-size: cover;  */

	background-size: 100% 100%;
	margin-left:7.5%;
	margin-right:7.5%;
}
#main {
	width:100%;
/* 	background:#990000; */

/*  background-image:url("./images/viphaikei5.jpeg"); */
/*背景素材に差し替え*/
}


</style>
</head>
<body>
<div id="main">
<div id="container"  class="clearfix">
<div class="vipicon"><img  src="./images/viphaikei4.jpg" width="300" height="300"></div>
 <svg>
    <text x="20%" y="80%">welcome special class</text>
</svg>
<!-- <div id="underBar"> -->
	</div></div>
</body>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="./js/jquery.drawsvg.js"></script>

<script type="text/javascript">

  var $svg = $('svg').drawsvg({
        duration: 800,
      });
  $svg.drawsvg('animate');
</script>
</html>