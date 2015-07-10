package com.whale.eos.service.bill.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.whale.eos.basic.util.SqlUtil;
import com.whale.eos.entity.bill.EosBillHead;
import com.whale.eos.entity.bill.EosBillInfo;
import com.whale.eos.entity.bill.EosBillLine;
import com.whale.eos.entity.bill.EosBillProc;
import com.whale.eos.page.PageBoundsUtil;
import com.whale.eos.page.Pager;
import com.whale.eos.repository.bill.EosBillDAO;
import com.whale.eos.repository.bill.EosBillHeadDAO;
import com.whale.eos.repository.bill.EosBillLineDAO;
import com.whale.eos.repository.bill.EosBillProcDAO;
import com.whale.eos.service.bill.IEosBillService;

@Component
@Transactional(readOnly = true)
public class EosBillServiceImpl implements IEosBillService {

	private static Logger LOG = LoggerFactory.getLogger(EosBillServiceImpl.class);

	@Autowired
	private EosBillHeadDAO eosBillHeadDAO;

	@Autowired
	private EosBillLineDAO eosBillLineDAO;

	@Autowired
	private EosBillProcDAO eosBillProcDAO;

	@Autowired
	private EosBillDAO eosBillDAO;

	@Override
	public List<EosBillHead> findBillHeadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EosBillLine> findBillLineAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EosBillProc> findBillProcAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pager<EosBillInfo> findUncheckedBill(EosBillInfo billinfo) {

		// 获取总数
		int count = eosBillDAO.findUncheckedBillCount(billinfo);
		// 封装PageBounds对象
		PageBounds pageBounds = PageBoundsUtil.PageBoundsExtend();
		// 获取用户分页列表集合信息
		List<EosBillInfo> list = eosBillDAO.findUncheckedBill(billinfo,	pageBounds);
		// 封装分页的Pager对象
		Pager<EosBillInfo> pages = new Pager<EosBillInfo>(count, list);
		return pages;
	}

	@Override
	public List<EosBillInfo> findCheckedBill(EosBillInfo billinfo) {
		return eosBillDAO.findCheckedBill(billinfo);
	}

	@Override
	public String findPrntype(String dtype, String uno) {
		String sql = "select c1 from eos_pdat_line where dtype=? and uno=?";
		String[] args = { dtype, uno };
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			result = SqlUtil.queryList(sql, args, 1);
			LOG.debug(sql);
		} catch (Exception e) {
			throw new RuntimeException("sql 查询出错", e);
		}
		if (result.size() > 0) {
			return (String) (result.get(0)[0]);
		} else {
			return null;
		}
	}

}
