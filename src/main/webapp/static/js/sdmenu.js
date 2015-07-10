document.observe("dom:loaded", function() { 
	$$("#my_menu div span").each(function(node) {
	node = $(node);
	
	node.observe("click", function(event) {
		var currentHeight=node.parentNode.getHeight();
		var h=node.parentNode.childElements().length;
		var speed = h*4;
		var fullHeight=h*28;
		if(currentHeight>27){
			var newHeight = currentHeight;
			node.parentNode.addClassName('collapsed');
			var intId = setInterval(function() {
			newHeight = newHeight - speed;
			node.parentNode.style.height = newHeight + "px";
			var cHeight=node.parentNode.getHeight();
		if (cHeight <= 27){
			clearInterval(intId);
			node.parentNode.style.height = 27 + "px";
		}
	}, 30);
		}else{
			var newHeight = currentHeight;
			node.parentNode.removeClassName('collapsed');
			var intId = setInterval(function() {
			newHeight = newHeight + speed;
			node.parentNode.style.height = newHeight + "px";
			var cHeight=node.parentNode.getHeight();
		if (cHeight >= fullHeight){
			clearInterval(intId);
			node.parentNode.style.height = fullHeight + "px";
		}
	}, 30);
			}
		});
});

if($("DIV1").getHeight()<$("DIV2").getHeight()){
	$("DIV1").style.height= $("DIV2").getHeight() + "px";
	}

if($("feedbackline")){
if(document.documentElement.clientHeight >document.body.clientHeight){
	$("feedbackline").style.height = document.documentElement.clientHeight + "px";
	}else{
		$("feedbackline").style.height=document.body.clientHeight + "px"}
}
}); 



