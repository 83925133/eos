package com.whale.eos.basic.util.security.shiro;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.whale.eos.entity.EosEmpInfo;
import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.entity.org.EosUser;
import com.whale.eos.service.menu.IEosMenuService;
import com.whale.eos.service.org.IEosEmpService;
import com.whale.eos.service.org.IEosUserService;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	public static final String DEFAULT_CAPTCHA_PARAM = "captcha_key";
	public static final String SESSION_EMPINFO = "empinfo";
	public static final String SESSION_MENUS = "menus";
	public static final String SESSION_USERMENUS = "usermenus";
	private String captchaParam = DEFAULT_CAPTCHA_PARAM;

	@Autowired
	protected IEosEmpService eosEmpService;
	@Autowired
	protected IEosMenuService eosMenuService;
	@Autowired
	protected IEosUserService eosUserService;
	
	public String getCaptchaParam() {
		return captchaParam;
	}

	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}

	// 创建 Token
	protected CaptchaUsernamePasswordToken createToken(ServletRequest request,
			ServletResponse response) {

		String username = getUsername(request);
		String password = getPassword(request);
		String captcha = getCaptcha(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);

		return new CaptchaUsernamePasswordToken(username,
				password.toCharArray(), rememberMe, host, captcha);
	}

	protected boolean onLoginSuccess(AuthenticationToken token,
			Subject subject, ServletRequest request, ServletResponse response)
			throws Exception {
		HttpServletRequest req = (HttpServletRequest) request;
		//HttpServletResponse res = (HttpServletResponse) response;
		HttpSession ses = req.getSession();
		UsernamePasswordToken tk = (UsernamePasswordToken) token;
		String eno = tk.getUsername();
		try {
			empInfoUpdate(ses, eno);
		} catch (Exception e) {
			e.printStackTrace();
			throw new UnknownAccountException();
		}
		issueSuccessRedirect(request, response);
		return false;
	}
	
	protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e,
            ServletRequest request, ServletResponse response) {
		setFailureAttribute(request, e);
		//login failed, let request continue back to the login page:
		logger.error(e.getMessage());
		return true;
	}
	
	 protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        return super.isAccessAllowed(request, response, mappedValue) ||
                (!isSessionExpired(request, response) && isPermissive(mappedValue));
    }
	 
	 public boolean isSessionExpired(ServletRequest request, ServletResponse response) {
		return false;
	}

	public void empInfoUpdate(HttpSession ses, String eno)
			throws IllegalAccessException, InvocationTargetException {
		EosEmp emp = eosEmpService.findByEno(eno);
		List<EosMenu> menus = eosMenuService.findByEno(eno);
		List<EosMenu> usermenus = eosMenuService.findUserMenuByEno(eno);
		EosUser user = eosUserService.findByUno(emp.getUno());
		EosEmpInfo empinfo = new EosEmpInfo();
		empinfo.setUser(user);
		empinfo.setMenus(menus);
		// mpInfo.setDept(dept);
		BeanUtils.copyProperties(empinfo, emp);
		ses.setAttribute(SESSION_EMPINFO, empinfo);
		ses.setAttribute(SESSION_MENUS, menus);
		ses.setAttribute(SESSION_USERMENUS, usermenus);
	}

	// 验证码校验
	// protected void doCaptchaValidate(HttpServletRequest request
	// , CaptchaUsernamePasswordToken token) {
	//
	// String captcha = (String) request.getSession().getAttribute(
	// com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
	//
	// if (captcha != null &&
	// !captcha.equalsIgnoreCase(token.getCaptcha())) {
	// throw new IncorrectCaptchaException("验证码错误！");
	// }
	// }
	//
	// // 认证
	// protected boolean executeLogin(ServletRequest request,
	// ServletResponse response) throws Exception {
	// CaptchaUsernamePasswordToken token = createToken(request, response);
	//
	// try {
	// doCaptchaValidate((HttpServletRequest) request, token);
	//
	// Subject subject = getSubject(request, response);
	// subject.login(token);
	//
	// return onLoginSuccess(token, subject, request, response);
	// } catch (AuthenticationException e) {
	// return onLoginFailure(token, e, request, response);
	// }
	// }

}
