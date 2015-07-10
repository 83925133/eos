package com.whale.eos.controller.menu;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whale.eos.basic.util.StringUtil;
import com.whale.eos.entity.EosEmpInfo;
import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.menu.EosUsermenu;
import com.whale.eos.service.menu.IEosMenuService;

/**
 * EosEmpController.
 */
@Controller
@RequestMapping(value = "/menu")
public class EosMenuController {
	@Autowired
	private IEosMenuService eosMenuService;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "menulist")
	public String findByEno() {
		EosEmpInfo empinfo = (EosEmpInfo) request.getSession().getAttribute(
				"empinfo");
		List<EosMenu> menus = eosMenuService.findByEno(empinfo.getEno());
		List<EosMenu> usermenus = eosMenuService.findUserMenuByEno(empinfo
				.getEno());
		request.setAttribute("menus", menus);
		request.setAttribute("usermenus", usermenus);
		return "menu/menulist";
	}

	@RequestMapping(value = "usermenulist", method = RequestMethod.POST)
	public String findUserMenuByEno() {
		return "menu/usermenulist";
	}

	@RequestMapping(value = "updateUserMenu", method = RequestMethod.POST)
	public String updateUserMenu() {
		EosEmpInfo empinfo = (EosEmpInfo) request.getSession().getAttribute(
				"empinfo");
		List<EosUsermenu> usermenus = new  ArrayList<EosUsermenu>();
		String ids = (String)request.getParameter("ids");
		String[] ida =  ids.split(",");
		if (StringUtil.isNotBlank(ids)) {
			for (int i = 0 ; i < ida.length ;i++ ) {
				EosUsermenu usermenu = new EosUsermenu();
				usermenu.setMenuId(Integer.valueOf(ida[i]));
				usermenu.setEmpId(empinfo.getId());
				usermenus.add(usermenu);
			}
		}
		boolean result = eosMenuService.batchUpdateUserMenu(usermenus, empinfo.getId());
		List<EosMenu> sesusermenus = eosMenuService.findUserMenuByEno(empinfo.getEno());
		request.setAttribute("usermenus", sesusermenus);
		request.setAttribute("result", result);
		request.getSession().setAttribute("usermenus", sesusermenus);
		return "emp/index";
	}
	/*
	 * @RequestMapping(value = "list") public String list(ServletRequest
	 * request, Page page, Model model) { Map<String, Object> searchParams =
	 * ServletUtil .getParametersStartingWith(request, "search_");
	 * org.springframework.data.domain.Page<EosEmp> dataList = eosEmpService
	 * .findAllPage(searchParams, page); model.addAttribute("searchParams",
	 * ServletUtil .encodeParameterStringWithPrefix(searchParams, "search_"));
	 * model.addAttribute("emps", dataList); model.addAttribute("page", page);
	 * 
	 * return "emp/list"; }
	 * 
	 * @RequestMapping(value = "update/{id}", method = RequestMethod.GET) public
	 * String updateForm(@PathVariable("id") String id, Model model) {
	 * 
	 * Iterable<AgentInfo> dataList = agentInfoService.findAll();
	 * model.addAttribute("dataList", dataList);
	 * 
	 * model.addAttribute("emp", eosEmpService.getEmp(id)); return
	 * "emp/operatorform"; }
	 * 
	 * @RequestMapping(value = "update", method = RequestMethod.POST) public
	 * String update(@Valid @ModelAttribute("preloadUser") EosEmp EosEmp,
	 * RedirectAttributes redirectAttributes) {
	 * 
	 * if (StringUtils.equals(EosEmp.getRoleId(), "3") &&
	 * (StringUtils.isEmpty(EosEmp.getAgentId()) ||
	 * StringUtils.equals(EosEmp.getAgentId(), "0"))) {
	 * redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils.getString("msg.operator.update.agent.null",
	 * EosEmp.getLoginName())); return "redirect:/emp/list"; }
	 * 
	 * 
	 * if (StringUtils.isNotBlank(operator.getAgentId())) { AgentInfo agentInfo
	 * = agentInfoService.getObject(operator.getAgentId()); if (null !=
	 * agentInfo) operator.setAgentNo(agentInfo.getAgentNo()); }
	 * 
	 * eosEmpService.updateEmp(EosEmp);
	 * 
	 * Session session = SecurityUtils.getSubject().getSession();
	 * session.setAttribute("EosEmp", EosEmp);
	 * 
	 * redirectAttributes.addFlashAttribute( "message",
	 * ResourceUtils.getString("msg.operator.update.success",
	 * EosEmp.getEname())); return "redirect:/emp/list"; }
	 * 
	 * @RequestMapping(value = "delete/{id}") public String
	 * delete(@PathVariable("id") String id, RedirectAttributes
	 * redirectAttributes) { EosEmp EosEmp = eosEmpService.getEmp(id); try { if
	 * (null == EosEmp) { redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils .getString("msg.operator.login.name.not.exist")); } else {
	 * eosEmpService.deleteEmp(id);
	 * redirectAttributes.addFlashAttribute("message", ResourceUtils
	 * .getString("msg.operator.delete.success", EosEmp.getEname())); } } catch
	 * (ServiceException e) { redirectAttributes.addFlashAttribute("message",
	 * e.getMessage()); } return "redirect:/emp/list"; }
	 */

	/**
	 * 使用@ModelAttribute, 实现Struts2
	 * Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form<spring:message
	 * code="msg.button.submit"/>的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此本方法在该方法中执行.
	 */
	/*
	 * @ModelAttribute("preloadEmp") public EosEmp getEmp(
	 * 
	 * @RequestParam(value = "id", required = false) String id) { if (id !=
	 * null) { return eosEmpService.getEmp(id); } return null; }
	 * 
	 * @RequestMapping(value = "add", method = RequestMethod.GET) public String
	 * registerForm(Model model) {
	 * 
	 * Iterable<AgentInfo> dataList = agentInfoService.findAll();
	 * model.addAttribute("dataList", dataList);
	 * 
	 * return "emp/register"; }
	 * 
	 * @RequestMapping(value = "add", method = RequestMethod.POST) public String
	 * register(@Valid EosEmp EosEmp, RedirectAttributes redirectAttributes) {
	 * 
	 * if (StringUtils.equals(EosEmp.getRoleId(), "3") &&
	 * (StringUtils.isEmpty(EosEmp.getAgentId()) ||
	 * StringUtils.equals(EosEmp.getAgentId(), "0"))) {
	 * redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils.getString("msg.operator.add.agent.null",
	 * EosEmp.getLoginName())); return "redirect:/emp/add"; }
	 * 
	 * 
	 * 
	 * if (StringUtils.isNotBlank(operator.getAgentId())) { AgentInfo agentInfo
	 * = agentInfoService.getObject(operator.getAgentId()); if (null !=
	 * agentInfo) operator.setAgentNo(agentInfo.getAgentNo()); }
	 * 
	 * 
	 * eosEmpService.registerEmp(EosEmp); redirectAttributes.addFlashAttribute(
	 * "message", ResourceUtils.getString("msg.operator.add.success",
	 * EosEmp.getEname())); return "redirect:/emp/list"; }
	 */

	/**
	 * Ajax请求校验loginName是否唯一。
	 */
	/*
	 * @RequestMapping(value = "checkLoginName")
	 * 
	 * @ResponseBody public String checkLoginName(@RequestParam("loginName")
	 * String loginName) { if (eosEmpService.findByEno(loginName) == null) {
	 * return "true"; } else { return "false"; } }
	 * 
	 * @RequestMapping(value = "update/pwd", method = RequestMethod.GET) public
	 * String updatePwd() { return "emp/update_pwd"; }
	 * 
	 * @RequestMapping(value = "update/pwd", method = RequestMethod.POST) public
	 * String updatePwd(@RequestParam("oldPwd") String oldPwd,
	 * 
	 * @RequestParam("newPwd") String newPwd, RedirectAttributes
	 * redirectAttributes) {
	 * 
	 * Session session = SecurityUtils.getSubject().getSession(); EosEmp
	 * sessionEosEmp = (EosEmp) session.getAttribute("EosEmp"); if (null ==
	 * sessionEosEmp) { redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils.getString("msg.operator.session.null")); return
	 * "redirect:logout"; }
	 * 
	 * EosEmp EosEmp = eosEmpService.getEmp(String.valueOf(sessionEosEmp
	 * .getId())); String salt = "com.whale.eos.580"; String encodeMd5Pwd =
	 * eosEmpService.entryptPassword(oldPwd, salt); if
	 * (!StringUtils.equals(EosEmp.getPwd(), encodeMd5Pwd)) {
	 * redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils.getString("msg.operator.oldpwd.not.equals")); return
	 * "redirect:/emp/update/pwd"; }
	 * 
	 * // EosEmp.setPlainPassword(newPwd);
	 * eosEmpService.entryptPassword(EosEmp); eosEmpService.updateEmp(EosEmp);
	 * 
	 * redirectAttributes.addFlashAttribute("message",
	 * ResourceUtils.getString("msg.operator.update.pwd.success"));
	 * 
	 * return "redirect:/emp/update/pwd"; }
	 */
}
