function applyshow(p){
	t= p.getElementsByTagName('tr')[1];

	if(!+[1,]){ 
		t.style.display='block';	
		}else{
    		t.style.display='table-row';
	}

	if(p._registerEvent)
	return;	
	p.observe("mouseout", function(event){
		p._registerEvent=true;
		t.style.display="none";
		});
}
