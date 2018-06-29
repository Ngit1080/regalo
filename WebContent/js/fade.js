/**
 *フェードイン、アウト
 */

//フェードイン
$('head').append(
		'<style>body{display:none;}'
		);
		$(window).on("load", function() {
		$('body').delay(200).fadeIn("slow");
		});

//フェードアウト
$(function(){

	$('head').append('<style type="text/css">body{display:none;}</style>');
	function windowFade(){
		$('body').fadeIn(200);
		$('a').click(function(){
			var url = $(this).attr("href");
			$('body').animate({"opacity":0},200,function(){
				location.href = url;
			});
			return false;
		});

		$('.fadelink').click(function(){
			var form = $(this).parents('form');
            form.attr('action', $(this).data('action'));
			$('body').animate({"opacity":0},200,function(){
			        form.submit();
			});
			return false;
		});
	};

	window.onload = function() {
		windowFade();
	};

	window.onunload = function() {
		windowFade();
	};
	});