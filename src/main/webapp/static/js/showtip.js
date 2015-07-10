function showtip(p,t){
	p=$(p);
	len=$$('div.tip').length;
	for(i=0;i<len;i++){$$('div.tip')[i].style.display="none"}
	eleft=positiongetLeft(t);
	etop=positiongetTop(t);
	p.style.display="block";
	p.getElementsByTagName('p')[0].style.width = p.getElementsByTagName('div')[0].offsetWidth -2 + "px";
	p.getElementsByTagName('p')[0].style.height = p.getElementsByTagName('div')[0].offsetHeight -1 + "px";
	p.getElementsByTagName('b')[0].style.left = p.getElementsByTagName('div')[0].offsetWidth -12 + "px";
	
	p.style.left = eleft + "px";
	p.style.top = etop + 20 + "px";
}
	
//获取元素的纵坐标
function positiongetTop(e){
var offset=e.offsetTop;
if(e.offsetParent!=null) offset+=positiongetTop(e.offsetParent);
return offset;
}
//获取元素的横坐标
function positiongetLeft(e){
var offset=e.offsetLeft;
if(e.offsetParent!=null) offset+=positiongetLeft(e.offsetParent);
return offset;
}
