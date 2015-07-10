document.write("<div id='mask'><\/div>");
var mask=$("mask");
var xwidth=document.body.clientWidth;
if(document.documentElement.clientHeight >document.body.clientHeight )
{var xheigt=document.documentElement.clientHeight;}else{var xheigt=document.body.clientHeight;}
function maskshow(){
	mask.setStyle({height: xheigt+"px",width: xwidth +"px",display: "block"});
	}

function maskhide(){
	mask.style.display="none";
	}
function showpopup(p){
	maskshow();
	var showid= $(p);
	showid.style.display="block";
	var scrolltop=document.documentElement.scrollTop;
	var l = (xwidth-showid.offsetWidth)/2 +"px";
	var t = (document.documentElement.clientHeight-showid.offsetHeight)/2 + scrolltop +"px";
	showid.setStyle({left:l,top:t});
	}
function popclose(p){
	p=$(p)
	p.style.display="none";
	maskhide();
	}

