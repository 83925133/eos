function firstfocus()
{
  if (document.form1.inum.value!=1)
  {
    
    var x=document.getElementById("itemtb").rows; 
    x[1].style.backgroundColor="#EFEFEF";  
    document.form1.t1.style.backgroundColor="#EFEFEF";
    document.form1.t1.style.borderColor="#EFEFEF";       
    document.form1.t1.focus();
    document.form1.keyline.value=1;      
    document.form1.mouseline.value=1;  
  }  
}

function kdown(linenum)
{
  key=window.event.keyCode;

  //回车  
  if (key==38)
  {

    //?”?-???3?±?a???????1?”?-?°?—?‰???μ?—
    var x=document.getElementById("itemtb").rows; 
    x[document.form1.mouseline.value].style.backgroundColor="#ffffff";  

    tid="t"+document.form1.mouseline.value;
    document.form1[tid].style.backgroundColor="#ffffff";
    document.form1[tid].style.borderColor="#ffffff";     
  
    x[linenum].style.backgroundColor="#ffffff";         


    tid="t"+linenum;  
    document.form1[tid].style.backgroundColor="#ffffff";
    document.form1[tid].style.borderColor="#ffffff"; 
      
    tno=linenum-1;
    

    if (tno==0)
    {

      tno=document.form1.inum.value-1;
    }
    
    tid="t"+tno;
    document.form1[tid].focus();
    document.form1[tid].style.backgroundColor="#EFEFEF";
    document.form1[tid].style.borderColor="#EFEFEF"; 
    
    x[tno].style.backgroundColor="#EFEFEF";    
    
    document.form1.keyline.value=tno;
    document.form1.mouseline.value=tno;
    
  }  
        
  //down????
  if (key==40)
  {
  
   
    //?”?-???3?±?a???????1?”?-?°?—?‰???μ?—
    var x=document.getElementById("itemtb").rows; 
    x[document.form1.mouseline.value].style.backgroundColor="#ffffff";  

    tid="t"+document.form1.mouseline.value;
    document.form1[tid].style.backgroundColor="#ffffff";
    document.form1[tid].style.borderColor="#ffffff";   
  

    x[linenum].style.backgroundColor="#ffffff";      

    tid="t"+linenum;
    document.form1[tid].style.backgroundColor="#ffffff";
    document.form1[tid].style.borderColor="#ffffff"; 

    tno=linenum+1;
  
    if (tno>document.form1.inum.value-1)
    {
      tno="1";
    }

    tid="t"+tno;
    document.form1[tid].focus();
    document.form1[tid].style.backgroundColor="#EFEFEF";
    document.form1[tid].style.borderColor="#EFEFEF";   

    x[tno].style.backgroundColor="#EFEFEF";           
    document.form1.keyline.value=tno;
    document.form1.mouseline.value=tno;
  }
  
  if (key==13)
  {                            
    ins_item(linenum)   
  }  
  
  if (key==27)
  {                            
    window.close(); 
  }  
  
}

function kdown99(linenum)
{
  key=window.event.keyCode;
  if (key==13)
  {                            
    window.close(); 
  }  
  
  if (key==27)
  {                            
    window.close(); 
  }  
  
}
  

function mover(linenum)
{

  //?…‰???
  var x=document.getElementById("itemtb").rows;   
  x[document.form1.keyline.value].style.backgroundColor="#ffffff"; 
  
  tid="t"+document.form1.keyline.value;
  document.form1[tid].style.backgroundColor="#ffffff";
  document.form1[tid].style.borderColor="#ffffff"; 
 

  //???????3?±?a?????–?????’?‰???μ?—
  tid="t"+linenum;
  document.form1[tid].style.backgroundColor="#EFEFEF";
  document.form1[tid].style.borderColor="#EFEFEF"; 
 // document.form1[tid].focus();   

  x[linenum].style.backgroundColor="#EFEFEF";   
  
  document.form1.mouseline.value=linenum;
  document.form1.keyline.value=linenum;  
}

function mout(linenum)
{
  var x=document.getElementById("itemtb").rows;  
  x[linenum].style.backgroundColor="#ffffff";  
  
  tid="t"+linenum;
  document.form1[tid].style.backgroundColor="#ffffff";
  document.form1[tid].style.borderColor="#ffffff";     
}


function dosubmit(myvar)
{ 
  if(myvar=="selectitype") 
  {
    form1.submit();    
  } 
  
  
  if(myvar=="firstpage") 
  {

    document.form1.page.value=document.form1.firstpage.value;
    form1.submit();        
  }    

  if(myvar=="nextpage") 
  {
 
    document.form1.page.value=document.form1.nextpage.value;
    form1.submit();        
  } 

  if(myvar=="priorpage") 
  {
  
    document.form1.page.value=document.form1.priorpage.value;
    form1.submit();        
  } 

  if(myvar=="lastpage") 
  {

    document.form1.page.value=document.form1.lastpage.value;
    form1.submit();        
  }  
}
 
function ins_item(linenum)
{  

 

  if (document.form1["price"+linenum].value=="")
  {
     alert("该商品未设置价格，请与供货方联系");
     return false;
  }
     
  if (parent.document.form1.onlynew.checked)
  {  
    if (parent.document.all.billtb.rows.length>2) 
    {  
      parent.document.all.billtb.rows[parent.document.all.billtb.rows.length-2].style.display="none";  
    }
  } 
  t=parent.document.getElementById("billtb");
  
  //插入记录

  r=t.insertRow(parent.document.all.billtb.rows.length);      
  ino=eval(parent.document.all.billtb.rows.length-1);    

    //填入列

    //序号
    xz=r.insertCell();
    xz.innerHTML=ino;

    //商品标题字段
    for (i=0;i<parent.document.form1.itemcolnum.value;i++) 
    {
      if (document.form1["itemcolname"+i+"_"+linenum].value!=document.form1.itemtypecol.value)
      {
      
        if (document.form1["itemcolname"+i+"_"+linenum].value!=document.form1.itemsecondtypecol.value)
        {      
          xz=r.insertCell();
          xz.innerHTML=document.form1["itemcol"+i+"_"+linenum].value; 
        } 
      }              
    }

  


      xz=r.insertCell();
      xz.innerHTML="<input type='hidden' id='price' value='"+document.form1["price"+linenum].value+"'><input type='text' id='qty' value='1'  onFocus='this.select()' onchange='priceqtychanged(this.parentNode.parentNode.rowIndex)'  onkeydown='qtykeydown(this.parentNode.parentNode.rowIndex)' style='border:1px solid #ADC0C9; padding-left:3px; padding-right:1px; padding-top:0px padding-bottom:3px' size='4'><input type='hidden' id='oldqty'  value='1'>";      

      xz=r.insertCell();
      xz.innerHTML="<input type='text' id='tot' value='"+document.form1["price"+linenum].value+"' style='text-align:left;border:1px solid #ffffff; padding-left:3px; padding-right:1px; padding-top:0px padding-bottom:3px' size='9'>";      

      parent.document.form1.itemamount1.value=Math.round((eval(parent.document.form1.itemamount1.value)+eval(document.form1["price"+linenum].value))*100)/100;
      parent.document.form1.showamount.value="合计金额(元)  "+parent.document.form1.itemamount1.value;  

  

    //商品id
    itemid=document.form1["id"+linenum].value;

    //包装数
    js=document.form1["jsqty"+linenum].value;

    xz=r.insertCell();
    xz.innerHTML="<input type='text' id='remark' style='text-align:left;border:1px solid #ADC0C9; padding-left:3px; padding-right:1px; padding-top:0px padding-bottom:3px' size='7'> <input id='item_id' type='hidden'  value='"+itemid+"'><input type='hidden' id='js' value='"+js+"'>";      

    //操作 
    xz=r.insertCell();
    xz.innerHTML="<a onclick='delrow(this.parentNode.parentNode.rowIndex)'>删除</a>";   


    //添加新商品数据结束，后续处理

    parent.document.all("remark",eval(parent.document.all.billtb.rows.length-2)).focus();   
    parent.document.form1.bot.focus();         

    parent.document.all("qty",eval(parent.document.all.billtb.rows.length-2)).focus(); 
    parent.document.all("qty",eval(parent.document.all.billtb.rows.length-2)).select(); 
    
    parent.document.getElementById("tb_save").style.display="block";
    parent.document.getElementById("box2").style.display="none";  
 
}

function itemtypemover(row,col)
{
    alert(123);
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#EFEFEF"; 
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#000000"; 
     
    if (document.form1.itemtyperownum.value!="")
    {
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#498CD0"; 
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#ffffff";  
    } 
}

function itemtypemout(row,col)
{
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#ffffff"; 
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#316AC5";     

    if (document.form1.itemtyperownum.value!="")
    {
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#498CD0"; 
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#ffffff";   
    }  

}

function itemtypeselected(row,col)
{

  document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#ffffff"; 
  document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#316AC5"; 

  document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#498CD0"; 
  document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#ffffff"; 
    
  document.form1.itemtyperownum.value=row;
  document.form1.itemtypecolnum.value=col;  
  
  form1.submit();    
      
}


