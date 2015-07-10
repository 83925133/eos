var sliderImgIteams = $('#index_banner .banner .b'), sliderImgIteams_len = sliderImgIteams.length, slider = $('#index_banner .banner .slider')[0];
$(document).ready(function() {
	sliderImgIteams.each(function(i) {
						$(this).css("width", 100 / sliderImgIteams_len + "%");
					})
			$(slider).css("width", sliderImgIteams_len + "00%");
			var SlideTriggers = document.createElement("ul");
			SlideTriggers.className = "SlideTriggers";
			for (var i = 0; i < sliderImgIteams_len; i++) {
				var SlideTriggers_a = document.createElement("a");
				SlideTriggers.appendChild(SlideTriggers_a)
			}
			SlideTriggers.style.width = sliderImgIteams_len * 20 + "px";
			$('#index_content .point')[0].appendChild(SlideTriggers);
			sliderLiIteams = $('#index_content .SlideTriggers a');
			sliderLiIteams.each(function(i) {
						$(sliderLiIteams[i]).click(function() {
									p_rotate(i);
								});
					});
			$('#index_banner .banner .slider')[0].onmouseover = function() {
				Slider_isgo = false;
			};
			$('#index_banner .banner .slider')[0].onmouseout = function() {
				Slider_isgo = true;
			};
			p_rotate();
			var timer = setInterval("p_rotate()", 5000)
		});

var rotate_n = 0, Slider_isgo = true;
var curr_n = null;
function slider_className_null() {
	for (var i = 0; i < sliderImgIteams_len; i++) {
		sliderLiIteams[i].className = "";
	}
}
function p_rotate(n) {
	if (Slider_isgo == false)
		return;
	if (n != null && curr_n == n)
		return;
	if (curr_n != null) {
		$(slider).animate({
					left : "-" + curr_n + "00%"
				});
	} else {
		$(slider).css("left", 0);
		curr_n = 0;
	}
	if (n != null) {
		slider_className_null();
		sliderLiIteams[n].className = "current";
		$(slider).animate({
					left : "-" + n + "00%"
				});
		rotate_n = n + 1;
		curr_n = n;
	} else {
		$(slider).animate({
					left : "-" + rotate_n + "00%"
				});
		slider_className_null();
		sliderLiIteams[rotate_n].className = "current";
		curr_n = rotate_n;
		rotate_n++;
	}
	if (rotate_n > sliderImgIteams_len - 1) {
		rotate_n = 0;
	}
}

function p_rotate(n) {
		if (Slider_isgo == false)
			return;
		if (n != null && curr_n == n)
			return;

		if (curr_n != null) {
			$(slider).animate({
				left : "-" + curr_n + "00%"
			});
		} else {
			$(slider).css("left", 0);
			curr_n = 0;
		}

		if (n != null) {
			slider_className_null();
			sliderLiIteams[n].className = "current";
			$(slider).animate({
				left : "-" + n + "00%"
			});
			rotate_n = n + 1;
			curr_n = n;
		} else {
			$(slider).animate({
				left : "-" + rotate_n + "00%"
			});
			slider_className_null();
			sliderLiIteams[rotate_n].className = "current";
			curr_n = rotate_n;
			rotate_n++;
		}
		if (rotate_n > sliderImgIteams_len - 1) {
			rotate_n = 0;
		}
	}

	function checktip(p) {
		var input = $(p).find("input")[0];
		var txt = $(p.parentNode).find(".txt")[0];
		input.focus();
		checktip_f(input);

	}
	function checktip_f(p) {
		var input = p;
		var txt = $(p.parentNode).find(".txt")[0];
		txt.style.display = "none";
		input.onblur = function() {
			if (input.value != "") {
				txt.style.display = "none";
			} else {
				txt.style.display = "block";
			}
		}
	}

	function dosubmit() {
		if ($("#username").val() == "") {
			alert("请输入登录名");
			$("#username").focus();
			return false;
		}
		if ($("#password").val() == "") {
			alert("请输入密码");
			$("#password").focus();
			return false;
		}
		loginForm.submit();
	}

	function usernamekeydown() {
		jQuery(".msg").eq(0).hide();
		key = window.event.keyCode;
		if (key == 13) {
			$("#username").focus();
		}
		if (key == 37) {
			$("#password").focus();
		}
	}

	function passwordkeydown() {
		jQuery(".msg").eq(0).hide();
		key = window.event.keyCode;
		if (key == 13) {
			loginForm.action = "${ctx}/login";
			loginForm.submit();
		}
		if (key == 37) {
			loginForm.action = "${ctx}/login";
			loginForm.submit();
		}
	}