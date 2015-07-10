package com.whale.eos.controller.org;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.whale.eos.basic.util.ResourceUtils;
import com.whale.eos.basic.util.ServletUtil;
import com.whale.eos.basic.util.page.Page;
import com.whale.eos.entity.org.EosDept;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.entity.org.EosUser;
import com.whale.eos.service.org.IEosEmpService;
import com.whale.eos.service.org.IEosUserService;

/**
 * EosEmpController.
 */
@Controller
@RequestMapping(value = "/emp")
public class EosEmpController {
	@Autowired
	private IEosEmpService eosEmpService;
	
	@Autowired
	private IEosUserService eosUserService;

	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String showNote() {
		return "emp/welcome";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Model model) {
		/*
		 * Iterable<AgentInfo> dataList = agentInfoService.findAll();
		 * model.addAttribute("dataList", dataList);
		 */
		
		
		return "emp/register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Valid EosEmp eosEmp,@Valid EosUser eosUser,@Valid EosDept eosDept,
			RedirectAttributes redirectAttributes) {
		
		eosUserService.add(eosUser);
		eosEmpService.registerEmp(eosEmp);
		redirectAttributes.addFlashAttribute(
				"message",
				ResourceUtils.getString("msg.operator.add.success",
						eosEmp.getEname()));
		return "redirect:/emp/list";
	}

	@RequestMapping(value = "list")
	public String list(ServletRequest request, Page page, Model model) {
		Map<String, Object> searchParams = ServletUtil
				.getParametersStartingWith(request, "search_");
		org.springframework.data.domain.Page<EosEmp> dataList = eosEmpService
				.findAllPage(searchParams, page);
		model.addAttribute("searchParams", ServletUtil
				.encodeParameterStringWithPrefix(searchParams, "search_"));
		model.addAttribute("emps", dataList);
		model.addAttribute("page", page);

		return "emp/list";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") String id, Model model) {
		/*
		 * Iterable<AgentInfo> dataList = agentInfoService.findAll();
		 * model.addAttribute("dataList", dataList);
		 */
		model.addAttribute("emp", eosEmpService.getEmp(id));
		return "emp/operatorform";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("preloadUser") EosEmp EosEmp,
			RedirectAttributes redirectAttributes) {
		/*
		 * if (StringUtils.equals(EosEmp.getRoleId(), "3") &&
		 * (StringUtils.isEmpty(EosEmp.getAgentId()) ||
		 * StringUtils.equals(EosEmp.getAgentId(), "0"))) {
		 * redirectAttributes.addFlashAttribute("message",
		 * ResourceUtils.getString("msg.operator.update.agent.null",
		 * EosEmp.getLoginName())); return "redirect:/emp/list"; }
		 */
		/*
		 * if (StringUtils.isNotBlank(operator.getAgentId())) { AgentInfo
		 * agentInfo = agentInfoService.getObject(operator.getAgentId()); if
		 * (null != agentInfo) operator.setAgentNo(agentInfo.getAgentNo()); }
		 */
		eosEmpService.updateEmp(EosEmp);

		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("EosEmp", EosEmp);

		redirectAttributes.addFlashAttribute(
				"message",
				ResourceUtils.getString("msg.operator.update.success",
						EosEmp.getEname()));
		return "redirect:/emp/list";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") String id,
			RedirectAttributes redirectAttributes) {
		EosEmp EosEmp = eosEmpService.getEmp(id);
		try {
			if (null == EosEmp) {
				redirectAttributes.addFlashAttribute("message", ResourceUtils
						.getString("msg.operator.login.name.not.exist"));
			} else {
				eosEmpService.deleteEmp(id);
				redirectAttributes.addFlashAttribute("message", ResourceUtils
						.getString("msg.operator.delete.success",
								EosEmp.getEname()));
			}
		} catch (ServiceException e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/emp/list";
	}

	/**
	 * 使用@ModelAttribute, 实现Struts2
	 * Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form<spring:message
	 * code="msg.button.submit"/>的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此本方法在该方法中执行.
	 */
	@ModelAttribute("preloadEmp")
	public EosEmp getEmp(
			@RequestParam(value = "id", required = false) String id) {
		if (id != null) {
			return eosEmpService.getEmp(id);
		}
		return null;
	}


	/**
	 * Ajax请求校验loginName是否唯一。
	 */
	@RequestMapping(value = "checkLoginName")
	@ResponseBody
	public String checkLoginName(@RequestParam("loginName") String loginName) {
		if (eosEmpService.findByEno(loginName) == null) {
			return "true";
		} else {
			return "false";
		}
	}

	@RequestMapping(value = "update/pwd", method = RequestMethod.GET)
	public String updatePwd() {
		return "emp/updatepwd";
	}

	@RequestMapping(value = "update/pwd", method = RequestMethod.POST)
	public String updatePwd(@RequestParam("oldPwd") String oldPwd,
			@RequestParam("newPwd") String newPwd,
			RedirectAttributes redirectAttributes) {

		Session session = SecurityUtils.getSubject().getSession();
		EosEmp sessionEosEmp = (EosEmp) session.getAttribute("EosEmp");
		if (null == sessionEosEmp) {
			redirectAttributes.addFlashAttribute("message",
					ResourceUtils.getString("msg.operator.session.null"));
			return "redirect:logout";
		}

		EosEmp EosEmp = eosEmpService.getEmp(String.valueOf(sessionEosEmp
				.getId()));
		String salt = "com.whale.eos.580";
		String encodeMd5Pwd = eosEmpService.entryptPassword(oldPwd, salt);
		if (!StringUtils.equals(EosEmp.getPwd(), encodeMd5Pwd)) {
			redirectAttributes.addFlashAttribute("message",
					ResourceUtils.getString("msg.operator.oldpwd.not.equals"));
			return "redirect:/emp/update/pwd";
		}

		// EosEmp.setPlainPassword(newPwd);
		eosEmpService.entryptPassword(EosEmp);
		eosEmpService.updateEmp(EosEmp);

		redirectAttributes.addFlashAttribute("message",
				ResourceUtils.getString("msg.operator.update.pwd.success"));

		return "redirect:/emp/update/pwd";
	}
}
