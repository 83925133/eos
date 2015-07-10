function advancesearch(p,t){
	p=$(p);
	if(p.style.display=="block"){
		p.style.display="none";
		t.className="search_up"
		t.innerHTML="高级查询"
		
		}else{
		p.style.display="block";
		t.className="search_down"
		t.innerHTML="简单查询"
			}
	
	}
