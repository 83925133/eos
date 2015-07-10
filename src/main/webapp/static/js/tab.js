document.observe("dom:loaded", function(){
	$$(".tab-section").each(function(node) {
		node = $(node);
		var len = node.select('.tab-btn')[0].select('li').length;
		for(i=0;i<len;i++){
				node.select('.tab-btn')[0].select('li')[i].onmouseover=function(){
					for(t=0;t<len;t++){
						node.select('.tab-btn')[0].select('li')[t].className="";
						node.select('.tabcontent')[0].select('.tabc')[t].style.display='none';
					}
					this.className="curr";
					x=this.previousSiblings().length;		
					node.select('.tabcontent')[0].select('.tabc')[x].style.display='block';
					}
		}

		
	});	
});
