
function firstfocus()

{  

    if (document.form1.inum2.value!=0)
    {
      pricecol="price"+document.form1.inum2.value;
      document.form1[pricecol].focus();
    }   
}

function changepricerow(myvar)
{
  key=window.event.keyCode;
  
  if (key==39)
  {
    tid="qty"+myvar;
    document.form1[tid].focus();
  }  
  

  if (key==38)
  {
    tno=myvar-1;
    if (tno==0)
    {
      tno=document.form1.inum2.value;
    }
    tid="price"+tno;
    document.form1[tid].focus();

  }  
        
  if (key==40)
  {
    tno=myvar+1;
    if (tno>document.form1.inum2.value)
    {
      tno="1";
    }
    tid="price"+tno;
    document.form1[tid].focus();

  }  
}  

function changeqtyrow(myvar)
{
  key=window.event.keyCode;

  if (key==37)
  {
    tid="price"+myvar;
    document.form1[tid].focus();
  }  


  if (key==38)
  {
    tno=myvar-1;
    if (tno==0)
    {
      tno=document.form1.inum2.value;
    }
    tid="qty"+tno;
    document.form1[tid].focus();

  }  
        
  if (key==40)
  {
    tno=myvar+1;
    if (tno>document.form1.inum2.value)
    {
      tno="1";
    }
    tid="qty"+tno;
    document.form1[tid].focus();

  }  
} 

function getvalue(myvar)
{  
  if(myvar=="custman") 
  {
  
    var result = window.showModalDialog("getnewordercustman.asp?uno="+document.form1.uno.value,"a","dialogWidth=730px;dialogHeight=300px;scrollbars:yes");     
    if(result != null)    
     { 
      var name = result[0]; 
      document.getElementById("empid2").value=name.substring(0,name.indexOf("@1@")); 
      document.getElementById("custman").value=name.substring(name.indexOf("@1@")+3,name.indexOf("@2@"));   
      document.getElementById("custtel").value=name.substring(name.indexOf("@2@")+3,name.indexOf("@3@")); 
      document.getElementById("custmob").value=name.substring(name.indexOf("@3@")+3,name.indexOf("@4@")); 
      document.getElementById("custqq").value=name.substring(name.indexOf("@4@")+3,name.indexOf("@5@"));      
      document.getElementById("custtelshow").value=document.getElementById("custtel").value+"  "+document.getElementById("custmob").value             
     }  
   }
   


  if(myvar=="itemtype") 
  {

     var obj = document.form1.keystr.value;   
     var result = window.showModalDialog("getnewordertype.asp?uno="+document.form1.uno.value+"&bno="+document.form1.bno.value+"&pricetype="+document.form1.pricetype.value,obj,"dialogWidth=800px;dialogHeight=500px;scrollbars:yes;center:yes");  
  
    
        if (result=="ok")
        {
          document.form1.action="neworder.asp?maxpage=yes"; 
          form1.submit();   
        }
  } 
  
  
  if(myvar=="item") 
  {
    
    key=window.event.keyCode;
    
    alert('bbb');
    
    if (key==13)
    {
      if (document.form1.keystr.value=="")
      {
        var obj = document.form1.keystr.value;   
        var result = window.showModalDialog("getnewordertype.asp?uno="+document.form1.uno.value+"&bno="+document.form1.bno.value+"&pricetype="+document.form1.pricetype.value,obj,"dialogWidth=800px;dialogHeight=500px;scrollbars:yes;center:yes");  
        if (result=="ok")
        {
          document.form1.action="neworder.asp?maxpage=yes"; 
          form1.submit();   
        }

      }
    
      if (document.form1.keystr.value!="")
      {
        var obj = document.form1.keystr2.value;  
        var result = window.showModalDialog("getneworderitem.asp?keystr="+document.form1.keystr.value+"&bno="+document.form1.bno.value+"&uno="+document.form1.uno.value+"&pricetype="+document.form1.pricetype.value,obj,"dialogWidth=800px;dialogHeight=500px;scrollbars:yes;center:yes"); 

        if (result=="ok")
        {
          document.form1.action="neworder.asp?maxpage=yes"; 
          form1.submit();   
        }
      }  
    }     
  } 
   
  
  
  if(myvar=="host") 
  {
  
    var result = window.showModalDialog("getneworderhost.asp?uno="+document.form1.uno.value,"a","dialogWidth=850px;dialogHeight=300px;scrollbars:yes");     
    if(result != null)    
     { 
      var name = result[0]; 
      document.getElementById("hostno").value=name.substring(0,name.indexOf("@1@")); 
      document.getElementById("hostname").value=name.substring(name.indexOf("@1@")+3,name.indexOf("@2@"));        
      document.getElementById("hostman").value=name.substring(name.indexOf("@2@")+3,name.indexOf("@3@"));   
      document.getElementById("hosttel").value=name.substring(name.indexOf("@3@")+3,name.indexOf("@4@"));
      document.getElementById("hostmob").value=name.substring(name.indexOf("@4@")+3,name.indexOf("@5@"));         
      document.getElementById("hostqq").value=name.substring(name.indexOf("@5@")+3,name.indexOf("@6@")); 
      document.getElementById("hosttelshow").value=document.getElementById("hosttel").value+"  "+document.getElementById("hostmob").value;            
      document.form1.action="neworder.asp";     

      form1.submit();           
     }  
   }
   
  
  if(myvar=="addrman") 
  {
    var result = window.showModalDialog("getneworderaddrman.asp?uno="+document.form1.uno.value,"a","dialogWidth=850px;dialogHeight=300px;scrollbars:yes");     
    if(result != null)    
     { 
      var name = result[0]; 
      document.getElementById("addrid").value=name.substring(0,name.indexOf("@1@")); 
      document.getElementById("addrprovince").value=name.substring(name.indexOf("@1@")+3,name.indexOf("@2@"));   
      document.getElementById("addrcity").value=name.substring(name.indexOf("@2@")+3,name.indexOf("@3@"));  
      document.getElementById("addrdistrict").value=name.substring(name.indexOf("@3@")+3,name.indexOf("@4@")); 
      document.getElementById("addr").value=name.substring(name.indexOf("@4@")+3,name.indexOf("@5@"));   
      document.getElementById("addrtel").value=name.substring(name.indexOf("@5@")+3,name.indexOf("@6@"));   
      document.getElementById("addrmob").value=name.substring(name.indexOf("@6@")+3,name.indexOf("@7@"));   
      document.getElementById("addrqq").value=name.substring(name.indexOf("@7@")+3,name.indexOf("@8@")); 
      document.getElementById("addrman").value=name.substring(name.indexOf("@8@")+3,name.indexOf("@9@"));       
      document.getElementById("addrshow").value=document.getElementById("addrprovince").value+document.getElementById("addrcity").value+document.getElementById("addrdistrict").value+document.getElementById("addr").value;                             
      document.getElementById("addrtelshow").value=document.getElementById("addrtel").value+"  "+document.getElementById("addrmob").value;
      
     }  
   }   
     
}   

function dosubmit(myvar)

{       
                 
  if(myvar=="submit") 
  {
  
    if (document.form1.custman.value=="")
    {
      alert( "请选择订货人");
      document.form1.ename2.focus();
      return false;
    }
    
    if (document.form1.addrshow.value=="")
    {
      alert("请选择收获地址");
      document.form1.addrshow.focus();
      return false;
    }  
  
    if (document.form1.hostname.value=="")
    {
      alert("请选择供货方");
      document.form1.hostname.focus();
      return false;
    }

    if (document.form1.paytype.selectedIndex==0)
    {
      alert("请选择付款方式");
      document.form1.paytype.focus();
      return false;
    }      
    
    if (document.form1.recnum.value=="")
    {
      alert("您尚未录入商品，不能提交订货单");
      document.form1.keystr.focus();
      return false;
    } 
    

    document.form1.action="neworderok.asp";
  }  
  
  if(myvar=="templet") 
  {
    document.form1.action="savedraft.asp";                             
  }  
  if(myvar=="model") 
  {
    if (document.form1.recnum.value=="")
    {
      alert("您尚未录入商品，不能保存模版");
      document.form1.keystr.focus();
      return false;
    } 
    var result = window.showModalDialog("templettopic.asp?bno="+document.form1.bno.value,"a","dialogWidth=500px;dialogHeight=300px;scrollbars:yes"); 
    if(result != null)    
     { 
      var name = result[0]; 
      document.getElementById("mbname").value=name.substring(0,name.indexOf("@1@")); 
      document.getElementById("mbnote").value=name.substring(name.indexOf("@1@")+3,name.indexOf("@2@")); 
      document.getElementById("mbmark").value="是";       
      document.form1.action="savetemplet.asp";        
            
     }    
  

  
  }  
  
  if(myvar=="firstpage") 
  {
    document.form1.action="neworder.asp";  
    document.form1.page.value=document.form1.firstpage.value;
  }    

  if(myvar=="nextpage") 
  {
    document.form1.action="neworder.asp";  
    document.form1.page.value=document.form1.nextpage.value;
  } 

  if(myvar=="priorpage") 
  {
    document.form1.action="neworder.asp";  
    document.form1.page.value=document.form1.priorpage.value;
  } 

  if(myvar=="lastpage") 
  {
    document.form1.action="neworder.asp";  
    document.form1.page.value=document.form1.lastpage.value;
  } 
  
  if(myvar=="del") 
  {
    if (confirm('确定要删除当前商品吗？')==true)
    {
        document.form1.delmark.value="yes";     
        document.form1.action="neworder.asp";     
     }   
   }   
   
  if(myvar=="draft") 
  {
  

        document.form1.draftmark.value="yes";     
        document.form1.action="neworder.asp";     
  
  }     
   
  
  
  form1.submit();
  
  
 }








