<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="refresh" content="7;URL='StartAction'">

<link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

<script src="./js/fade.js" type="text/javascript"></script>


<title>インデックス</title>

<style>

html {
	width:100%;
	height:100%;
}

body {
	position:relative;
	background:black;
	width:100%;
	height:100%;

	animation-name: anime;
	animation-delay: 5s;
	animation-duration: 2s;
}

@keyframes anime {
0% {background:black;}
100% {background:white;}
}

svg {
	position:absolute;
	top:50%;
	left:50%;

	-webkit-transform: translate(-50%,-50%);
	-moz-transform: translate(-50%,-50%);
	-ms-transform: translate(-50%,-50%);
	-o-transform: translate(-50%,-50%);
	transform: translate(-50%,-50%);

	width:100%;
	height:250px;
}

/*↓Regalo*/

text {
    stroke: white;
    fill: white;
    font-size: 150px;
    stroke-dasharray: 100% 100%;
    stroke-width: 0.5px;
    -webkit-animation: stroke-anim 3s linear;
    animation: stroke-anim 3s linear;
    /* font-family: 'Great Vibes', cursive; */
    font-family: 'Cinzel', serif;
}
/*↑Regalo*/

/*↓下線*/
@keyframes UnderBar {
  0% {
    opacity: 0;
    transform: translateX(-50px);
  }

  50% {
    opacity: 0;
    transform: translateX(-50px);
  }

  100% {
    opacity: 0.7;
    transform: translateX(0);
  }
}

#underBar {
	position:absolute;
	top:60%;
	left:26%;
	content: "";
	display: inline-block;
	width: 700px;
	height: 1px;
	background: white;

	animation-duration: 4s;
	animation-name: UnderBar;
}
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
/*↑塗りつぶし*/

</style>
</head>
<body>



	<svg>

	    <text x="30%" y="68%">REGALO</text>

	</svg>



	<div id="underBar">
	</div>

</body>


</html>