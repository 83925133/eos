package com.whale.eos.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA. User: 李建东 Date: 13-4-12 Time: 下午6:30
 * LoginController负责打开登录页面(GET请求)和登录出错页面(POST请求)，
 * 
 * 真正登录的POST请求由Filter完成,
 *
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "emp/login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
		model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
		Object obj = request.getAttribute(org.apache.shiro.web.filter.authc.FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		boolean flag = false;
		String msg = "";
		if (obj != null) {
			if ("org.apache.shiro.authc.UnknownAccountException".equals(obj))
				msg = "登录帐号不存在！";
			else if ("org.apache.shiro.authc.IncorrectCredentialsException".equals(obj))
				msg = "登录密码错误！";
			else if ("com.whale.eos.basic.util.security.shiro.IncorrectCaptchaException".equals(obj))
				msg = "验证码错误！";
			else if ("org.apache.shiro.authc.AuthenticationException".equals(obj))
				msg = "认证失败！";
			flag = !"".equals(msg);
			request.setAttribute("msg", msg);
			request.setAttribute("flag", flag);
		}
		return "emp/login";
	}
}
