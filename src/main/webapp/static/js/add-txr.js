function addtxr(aid,p){
	aid=$(aid);
	aid.style.display="block";
	t=p.parentNode.parentNode
	$(t).next().style.display="block";
	aid.observe("click", function(event) {
		Event.stop(event); 
	});
	p.observe("click", function(event) {
		Event.stop(event); 
	});
	document.body.observe("click", function(event) {aid.style.display="none"; $(t).next().style.display="none";});
}
	
