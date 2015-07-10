package com.whale.eos.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.whale.eos.basic.util.ResourceUtils;
import com.whale.eos.entity.org.EosDept;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.entity.org.EosUser;
import com.whale.eos.service.org.IEosOrgService;

/**
 * Created with IntelliJ IDEA. User: 李建东 Date: 13-4-12 Time: 下午6:30
 * LoginController负责打开登录页面(GET请求)和登录出错页面(POST请求)，
 * 
 * 真正登录的POST请求由Filter完成,
 *
 */
@Controller
@RequestMapping(value = "/reg")
public class RegisterController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpServletResponse response;
	
	@Autowired
	private IEosOrgService eosOrgService;

	@RequestMapping(value = "init",method = RequestMethod.GET)
	public String init() {
		//初始化注册页面
		return "reg/register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Valid EosEmp eosEmp,@Valid EosUser eosUser,@Valid EosDept eosDept,
			RedirectAttributes redirectAttributes) {
		
		/*eosUserService.add(eosUser);
		eosEmpService.registerEmp(eosEmp);*/
		redirectAttributes.addFlashAttribute(
				"message",
				ResourceUtils.getString("msg.operator.add.success",
						eosEmp.getEname()));
		return "redirect:/emp/list";
	}
	
	@RequestMapping("/register")  
    public void getProviceInfo(){  
        PrintWriter out = null;  
        try {  
            // 设置输出格式  
            response.setContentType("text/html");  
              
            // 页面输出对象  
            out = response.getWriter();  
            out.write(eosOrgService.getProviceInfoByJson());  
            out.flush();  
            out.close();  
              
        } catch (Exception e) {  
            //logger.error("", e);  
            if (null != out)   
                out.write("[]");  
                out.flush();  
                out.close();  
            }  
        }  
      
    /** 
     * <获取所有基站名称和基站标识返回josn串> 
     * <功能详细描述> 
     * @param request 
     * @return 
     * @see [类、类#方法、类#成员] 
     */  
    @RequestMapping("/getCityInfoByLocationid")  
    public void getCityInfoByLocationid(){  
        PrintWriter out = null;  
        try {  
            String locationid = request.getParameter("locationid");  
              
            // 设置输出格式  
            response.setContentType("text/html");  
              
            // 页面输出对象  
            out = response.getWriter();  
            out.write(eosOrgService.getCityInfoByLocationid(locationid));  
            out.flush();  
            out.close();  
              
        } catch (Exception e) {  
            //logger.error("", e);  
            if (null != out) {  
                out.write("[]");  
                out.flush();  
                out.close();  
            }  
        }  
    }  
}
