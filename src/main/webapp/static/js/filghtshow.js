function toggleshow(p){
	t= p.parentNode.parentNode.parentNode;
	l= $(t).nextSiblings().length;
	if($(t).next('tr').style.display=="table-row" || $(t).next('tr').style.display=="block"){
			p.className="show_fold";
		for(i=0;i<l-1;i++){
			$(t).next('tr',i).style.display='none';
			}
		}else{
			p.className="show_unfold";
			for(i=0;i<l-1;i++){ 
			
			
			if(window.XMLHttpRequest){ 
			$(t).next('tr',i).style.display='table-row';

}else {
    $(t).next('tr',i).style.display='block';
}
			
			 }
			}
	}
	
function showlist(p){
	if(p._registerEvent)
	return;	
	p._registerEvent = true;
	var ul = p.getElementsByTagName('ul')[0];
	$(p).observe("mouseover", function(event) {
		ul.style.display='block';
		ul.style.width=this.getWidth()-2+'px';
	});

	var liArr = ul.getElementsByTagName('li');
	for(var i=0; i < liArr.length; i++){
		$(liArr[i]).observe("click", function(event){
			var selectedText = this.getElementsByTagName('a')[0].innerHTML;
			var titleSpan = this.parentNode.parentNode.getElementsByTagName('span')[0];
			titleSpan.innerHTML = selectedText;
			this.parentNode.style.display="none";
		});
	}
	
	$(p).observe("mouseout", function(event) {
		ul.style.display='none';
	});
}
	



