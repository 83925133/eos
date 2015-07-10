package com.whale.eos.controller.bill;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whale.eos.basic.util.BeanUtils;
import com.whale.eos.basic.util.StringUtil;
import com.whale.eos.basic.util.WebUtils;
import com.whale.eos.entity.EosEmpInfo;
import com.whale.eos.entity.bill.EosBillInfo;
import com.whale.eos.entity.menu.EosUsermenu;
import com.whale.eos.exception.SystemException;
import com.whale.eos.page.Pager;
import com.whale.eos.service.bill.IEosBillService;

/**
 * EosEmpController.
 */
@Controller
@RequestMapping(value = "/bill")
public class EosBillController {

	private static Logger LOG = LoggerFactory
			.getLogger(EosBillController.class);

	@Autowired
	private IEosBillService eosBillService;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "findUncheckedBill")
	public String findUncheckedBill() {
		EosEmpInfo empinfo = (EosEmpInfo) request.getSession().getAttribute("empinfo");
		EosBillInfo billinfo = new EosBillInfo();
		billinfo.setEmpid(String.valueOf(empinfo.getId()));
		String dtype = "订货单据打印格式";

		Map<String, String[]> params = WebUtils.getParameterMap(request, true);
		try {
			BeanUtils.populate(billinfo, params);
		} catch (Exception e) {
			throw new SystemException("transMap2Bean Error");
		} 

		// 获取用户分页列表集合信息
		Pager<EosBillInfo> billInfos = eosBillService.findUncheckedBill(billinfo);
		String prntype = eosBillService.findPrntype(dtype, empinfo.getUno());
		if (StringUtil.isBlank(prntype)) {
			prntype = "小张多联纸";
		}
		request.setAttribute("prntype", prntype);
		request.setAttribute("billInfos", billInfos);
		request.setAttribute("params", params);

		return "bill/checkbill/uncheckedbill";
	}

	@RequestMapping(value = "findCheckedBill")
	public String findCheckedBill() {
		EosEmpInfo empinfo = (EosEmpInfo) request.getSession().getAttribute(
				"empinfo");
		EosBillInfo billinfo = new EosBillInfo();
		billinfo.setEmpid(String.valueOf(empinfo.getId()));
		String dtype = "订货单据打印格式";

		/* 页面获取参数 */
		String billtype = request.getParameter("billtype");
		String qbno = request.getParameter("qbno");
		String date1 = request.getParameter("date1");
		String date2 = request.getParameter("date2");
		String custhost = request.getParameter("custhost");
		/* 页面获取参数 */

		billinfo.setBilltype(billtype);
		billinfo.setQbno(qbno);
		billinfo.setDate1(date1);
		billinfo.setDate2(date2);
		billinfo.setCusthost(custhost);
		billinfo.setHostno(empinfo.getUno());

		List<EosBillInfo> billInfos = eosBillService.findCheckedBill(billinfo);
		String prntype = eosBillService.findPrntype(dtype, empinfo.getUno());
		if (StringUtil.isBlank(prntype)) {
			prntype = "小张多联纸";
		}
		request.setAttribute("prntype", prntype);
		request.setAttribute("billtype", billtype);
		request.setAttribute("qbno", qbno);
		request.setAttribute("date1", date1);
		request.setAttribute("date2", date2);
		request.setAttribute("custhost", custhost);
		request.setAttribute("billInfos", billInfos);

		return "bill/checkbill/checkedbill";
	}

	@RequestMapping(value = "usermenulist", method = RequestMethod.POST)
	public String findUserMenuByEno() {
		return "bill/checkbill/uncheckedbill";
	}

	@RequestMapping(value = "updateUserMenu", method = RequestMethod.POST)
	public String updateUserMenu() {
		EosEmpInfo empinfo = (EosEmpInfo) request.getSession().getAttribute(
				"empinfo");
		List<EosUsermenu> usermenus = new ArrayList<EosUsermenu>();
		String ids = (String) request.getParameter("ids");
		String[] ida = ids.split(",");
		if (StringUtil.isNotBlank(ids)) {
			for (int i = 0; i < ida.length; i++) {
				EosUsermenu usermenu = new EosUsermenu();
				usermenu.setMenuId(Integer.valueOf(ida[i]));
				usermenu.setEmpId(empinfo.getId());
				usermenus.add(usermenu);
			}
		}
		/*
		 * boolean result = eosBillService.batchUpdateUserMenu(usermenus,
		 * empinfo.getId()); List<EosMenu> sesusermenus =
		 * eosBillService.findUserMenuByEno(empinfo.getEno());
		 * request.setAttribute("usermenus", sesusermenus);
		 * request.setAttribute("result", result);
		 * request.getSession().setAttribute("usermenus", sesusermenus);
		 */
		return "emp/index";
	}
}
