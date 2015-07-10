function showfaq(p){
	p.getElementsByTagName('p')[0].style.display="block";
	p.style.backgroundColor="#f2f2f2";
	if(p._registerEvent)
	return;	
	p.observe("mouseout", function(event){
		p._registerEvent=true;
		p.getElementsByTagName('p')[0].style.display="none";
		p.style.backgroundColor="#fff";
		});
	
	}