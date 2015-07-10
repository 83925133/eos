function delrow(linenum)
{  
 
  t=document.getElementById("billtb");
  r=t.deleteRow(linenum);    

  tot=0

  for (i=0; i<document.all.billtb.rows.length-1; i++) 
  { 
    tot=Math.round(tot*100)/100+Math.round(document.all("tot",i).value*100)/100;
    document.all.billtb.rows(eval(i)+1).cells(0).innerHTML =i+1;     
  } 
  
  document.form1.itemamount1.value=tot;
  document.form1.showamount.value="合计金额(元)："+document.form1.itemamount1.value;  
    
}

//响应销售数量录入框键盘输入值
function qtykeydown(linenum)
{

  key=window.event.keyCode;
  
  if (key==37)
  {
    document.all("price",linenum-1).focus();
  }  
  
  //上键
  if (key==38)
  {  

    if (linenum>1)
    {
      linenum=linenum-1;
    }

    document.all("qty",linenum-1).focus();
    return false;
  }  
        
  //下键
  if (key==40)
  {

    if (linenum<document.all.billtb.rows.length-1)
    {
      linenum=linenum+1;
    }

    document.all("qty",linenum-1).focus();
    return false;  

  }  

  
  if (key==13)
  {


    if (isNaN(document.all("qty",linenum-1).value))
    {
      alert("只能输入数字");
      document.all("qty",linenum-1).focus();
      document.all("qty",linenum-1).select();
      return false;
    }    

    document.form1.keystr.focus();
    document.form1.keystr.select();    
  }   

} 


//价格、数量变更
function priceqtychanged(linenum)
{

  if (isNaN(document.all("qty",linenum-1).value))
  {
    alert("只能输入数字");
    document.all("qty",linenum-1).focus();
    document.all("qty",linenum-1).select();
    return false;
  } 
 
  
  document.all("tot",linenum-1).value=Math.round(document.all("price",linenum-1).value*document.all("qty",linenum-1).value*100)/100;
  
  //计算合计金额(元)
 
  document.form1.itemamount1.value=Math.round((eval(document.form1.itemamount1.value)+eval(document.all("price",linenum-1).value*document.all("qty",linenum-1).value-eval(document.all("price",linenum-1).value*document.all("oldqty",linenum-1).value)))*100)/100;  
  document.form1.showamount.value="合计金额(元)："+document.form1.itemamount1.value;
  document.all("oldqty",linenum-1).value=Math.round(document.all("qty",linenum-1).value*100)/100;   
 

  tmpch="";
  if (document.all("js",linenum-1).value!="")
  {
    if (Math.floor(eval(document.all("qty",linenum-1).value)/eval(document.all("js",linenum-1).value))>0)
    {
      tmpch=Math.floor(eval(document.all("qty",linenum-1).value)/eval(document.all("js",linenum-1).value))+"件";   
      if (eval(document.all("qty",linenum-1).value)%eval(document.all("js",linenum-1).value)>0)
      {
        tmpch=tmpch+"+"+eval(document.all("qty",linenum-1).value)%eval(document.all("js",linenum-1).value);
      }  
     }
   }
   document.all("remark",linenum-1).value=tmpch; 
}
  
function strkeydown()
{   
  key=event.keyCode;
  if (key==13)
  {   
    window.result.location.href="../../customer/getitem/?hostno="+document.form1.hostno.value+"&itemtypecol="+document.form1.itemtypecol.value+"&itemtype="+document.form1.itemtype.value+"&itemsecondtypecol="+document.form1.itemsecondtypecol.value+"&itemcolnum="+document.form1.itemcolnum.value+"&itemcolname="+document.form1.itemcolname.value+"&itemcoldesc="+document.form1.itemcoldesc.value+"&itempricecol="+document.form1.itempricecol.value+"&keystr="+document.form1.keystr.value;        
  }
}  

function dosubmit(myvar)
{ 
  if(myvar=="selectitype") 
  {
    window.result.location.href="../../customer/getitem/?hostno="+document.form1.hostno.value+"&itemtypecol="+document.form1.itemtypecol.value+"&itemtype="+document.form1.itemtype.value+"&itemsecondtypecol="+document.form1.itemsecondtypecol.value+"&itemcolnum="+document.form1.itemcolnum.value+"&itemcolname="+document.form1.itemcolname.value+"&itemcoldesc="+document.form1.itemcoldesc.value+"&itempricecol="+document.form1.itempricecol.value;        

  } 
   
    
  if(myvar=="selectkey") 
  {
    document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#ffffff"; 
    document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#316AC5";     
    window.result.location.href="../../customer/getitem/?hostno="+document.form1.hostno.value+"&itemtypecol="+document.form1.itemtypecol.value+"&itemsecondtypecol="+document.form1.itemsecondtypecol.value+"&itemcolnum="+document.form1.itemcolnum.value+"&itemcolname="+document.form1.itemcolname.value+"&itemcoldesc="+document.form1.itemcoldesc.value+"&itempricecol="+document.form1.itempricecol.value+"&keystr="+document.form1.keystr.value;        
  }  
  

  if(myvar=="yes") 
  {
  
    parent.document.getElementById("tb_addrtop").style.display="block"; 
    parent.document.getElementById("tb_addr").style.display="block"; 
    parent.document.getElementById("tb_addrbottom").style.display="block"; 
    parent.document.getElementById("tb_paytype").style.display="block"; 
    parent.document.getElementById("tb_paytypebottom").style.display="block"; 
    
    parent.document.getElementById("td_yes").style.display="none";     
    parent.document.getElementById("td_save").style.display="block";     
    parent.document.getElementById("td_submit").style.display="block"; 
    parent.document.getElementById("td_selectitem").style.display="block";     
    
    parent.document.getElementById("itemtypetb").style.display="none";     
    parent.document.getElementById("tb_search").style.display="none";      
    parent.document.getElementById("result").style.display="none";  
  } 
    
  if(myvar=="selectitem") 
  {

    parent.document.getElementById("tb_addrtop").style.display="none";
    parent.document.getElementById("tb_addr").style.display="none"; 
    parent.document.getElementById("tb_addrbottom").style.display="none";  
    parent.document.getElementById("tb_paytype").style.display="none"; 
    parent.document.getElementById("tb_paytypebottom").style.display="none";      
       
    parent.document.getElementById("td_yes").style.display="block";     
    parent.document.getElementById("td_save").style.display="block";     
    parent.document.getElementById("td_submit").style.display="none"; 
    parent.document.getElementById("td_selectitem").style.display="none";            
         
    parent.document.getElementById("itemtypetb").style.display="block";     
    parent.document.getElementById("tb_search").style.display="block";      
    parent.document.getElementById("result").style.display="block";  
  } 

}

function onlynewchanged()
{
  if (parent.document.form1.onlynew.checked)
  {  
    if (parent.document.all.billtb.rows.length>2) 
    {  
      for (i=1; i<document.all.billtb.rows.length-2; i++) 
      {      
        parent.document.all.billtb.rows[i].style.display="none";  
      } 
    }
  } 
  else
  {
  
    for (i=0; i<document.all.billtb.rows.length-1; i++) 
    {  
      parent.document.all.billtb.rows[i].style.display="block";  
    }   

  }

}

function itemtypemover(row,col)
{
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#E9F1F4"; 
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#316AC5"; 
     
     
    if (document.form1.itemtyperownum.value!="")
    {
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#498CD0"; 
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#ffffff";  
    } 
}

function itemtypemout(row,col)
{
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#ffffff"; 
    document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#000000";     
    if (document.form1.itemtyperownum.value!="")
    {
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#498CD0"; 
      document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#ffffff";     
    } 
}

function itemtypeselected(row,col)
{

  document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.backgroundColor="#ffffff"; 
  document.all.itemtypetb.rows(eval(document.form1.itemtyperownum.value)).cells(eval(document.form1.itemtypecolnum.value)).style.color="#000000"; 

  document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.backgroundColor="#498CD0"; 
  document.all.itemtypetb.rows(eval(row)).cells(eval(col)).style.color="#ffffff"; 
    
  document.form1.itemtyperownum.value=eval(row);
  document.form1.itemtypecolnum.value=eval(col);  
  
  window.result.location.href="../../customer/getitem/?hostno="+document.form1.hostno.value+"&itemtypecol="+document.form1.itemtypecol.value+"&itemtype="+document.form1.itemtype.value+"&itemsecondtypecol="+document.form1.itemsecondtypecol.value+"&itemcolnum="+document.form1.itemcolnum.value+"&itemcolname="+document.form1.itemcolname.value+"&itemcoldesc="+document.form1.itemcoldesc.value+"&itempricecol="+document.form1.itempricecol.value+"&itemjscol="+document.form1.itemjscol.value;        

}

function addrclick(row)
{
  for (i=0; i<document.all.tb_addr.rows.length; i++) 
  {
    document.all.tb_addr.rows(eval(i)).style.backgroundColor="#ffffff"; 
    document.all.tb_addr.rows(eval(i)).style.color="#000000";
  }
   
  document.all.tb_addr.rows(eval(row)).style.backgroundColor="#E9F1F4"; 
  document.all.tb_addr.rows(eval(row)).style.color="#316AC5"; 
}

function tr_addrclick(row)
{
  for (i=0; i<document.all.tb_addr.rows.length; i++) 
  {
    document.all.tb_addr.rows(eval(i)).style.backgroundColor="#ffffff"; 
    document.all.tb_addr.rows(eval(i)).style.color="#000000";
  }
   
  document.all.tb_addr.rows(eval(row)).style.backgroundColor="#E9F1F4"; 
  document.all.tb_addr.rows(eval(row)).style.color="#316AC5";
  
  var obj2=document.getElementsByName("addrid");  
  obj2[row-1].checked=true;  
}


//保存草稿
function savebill()
{  

  document.form1.inum.value=document.all.billtb.rows.length-1;  
  for (i=0; i<document.all.billtb.rows.length-1; i++) 
  {
    document.all("item_id",i).name="item_id"+eval(i+1);  
    document.all("price",i).name="price"+eval(i+1);
    document.all("js",i).name="js"+eval(i+1);
    document.all("qty",i).name="qty"+eval(i+1);
    document.all("tot",i).name="tot"+eval(i+1);   
    document.all("remark",i).name="remark"+eval(i+1);
  }
  
  document.form1.action="../../customer/savebill/";
  document.form1.method="post";
  document.form1.submit();
}  


//提交单据
function submitbill()
{  
  document.form1.inum.value=document.all.billtb.rows.length-1;  


  var obj2=document.getElementsByName("addrid");
  mark="no"
  for (i=0; i<document.all.tb_addr.rows.length-1; i++) 
  {
    if(obj2[i].checked==true)
    {
      mark="yes";
    }
  }  
  
  if (mark=="no") 
  {
    alert("请选择收货地点！");
    return false;    
  }    
  
  var Obj_paytype = document.getElementById("paytype");
  if (Obj_paytype.options[Obj_paytype.selectedIndex].text=="=======请选择=======")
  {
    alert( "请选择付款方式    ");
    document.form1.paytype.focus();
    return false;
  }      
  
  if (document.all.billtb.rows.length==1)
  {
    alert( "您尚未录入商品，不能提交订单");
    return false;
  }    


  //重要代码，用于处理行记录顺序，可以优化上下键、删除行记录时代码效率
  for (i=0; i<document.all.billtb.rows.length-1; i++) 
  {
    if (document.all("qty",i).value=="")
    {
      alert("请录入商品数量！");
      document.all("qty",i).focus();
      return false;
    }
    else
    {
      if (isNaN(document.all("qty",i).value))
      {
        alert("商品数量只能输入数字");
        document.all("qty",i).focus();
        document.all("qty",i).select();
        return false;
      }  
      
      if (document.all("qty",i).value==0)
      {
        alert("商品数量不能为零");
        document.all("qty",i).focus();
        document.all("qty",i).select();
        return false;
      }        
      else
      {
        if (document.all("qty",i).value<0)
        {
          alert("商品数量不能为负数！");
          document.all("qty",i).focus();
          return false;          
        }
      }
    }  
    document.all("item_id",i).name="item_id"+eval(i+1);  
    document.all("price",i).name="price"+eval(i+1);
    document.all("js",i).name="js"+eval(i+1);
    document.all("qty",i).name="qty"+eval(i+1);
    document.all("tot",i).name="tot"+eval(i+1);   
    document.all("remark",i).name="remark"+eval(i+1);
  }

  document.form1.action="../../customer/submitbill/";
  document.form1.method="post";
  document.form1.submit();

}  

