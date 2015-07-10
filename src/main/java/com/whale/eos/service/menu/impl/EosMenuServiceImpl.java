package com.whale.eos.service.menu.impl;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.menu.EosUsermenu;
import com.whale.eos.repository.menu.EosMenuDAO;
import com.whale.eos.service.menu.IEosMenuService;

@Component
@Transactional(readOnly = true)
public class EosMenuServiceImpl implements IEosMenuService {

	private static Logger logger = LoggerFactory.getLogger(EosMenuServiceImpl.class);

	@Autowired
	private EosMenuDAO eosMenuDAO;

	public List<EosMenu> findAll() {
		return (List<EosMenu>) eosMenuDAO.findAll();
	}

	public EosMenu getMenu(String id) {
		return eosMenuDAO.findOne(id);
	}

	public List<EosMenu> findByEno(String Eno) {
		return (List<EosMenu>) eosMenuDAO.findByEno(Eno);
	}
	
	public List<EosMenu> findUserMenuByEno(String Eno) {
		return (List<EosMenu>) eosMenuDAO.findUserMenuByEno(Eno);
	}
	@Transactional(readOnly = false)
	public void batchInsert(List<EosUsermenu> lst){
		eosMenuDAO.batchInsert(lst);
	}
	@Transactional(readOnly = false)
	public void batchDelete(List<EosUsermenu> lst){
		eosMenuDAO.batchDelete(lst);
	}
	@Transactional(readOnly = false)
	public boolean batchUpdateUserMenu(List<EosUsermenu> lst, Integer empId){
		eosMenuDAO.deleteAllUserMenuByEmpId(empId);
		if (lst.size()>0) {
			eosMenuDAO.batchInsert(lst);
		}
		return true;
	}
	@Transactional(readOnly = false)
	public void add(EosMenu eosMenu) {
		eosMenuDAO.save(eosMenu);
	}

	@Transactional(readOnly = false)
	public void update(EosMenu eosMenu) {
		eosMenuDAO.save(eosMenu);
	}

	@Transactional(readOnly = false)
	public void delete(String id) {
		if (isTopMenu(id)) {
			logger.error("EosMenu {} try to delete a TopMenu");
			throw new ServiceException("顶级菜单不能删除!");
		}
		eosMenuDAO.delete(id);
	}

	/**
	 * 判断是否顶级菜单.
	 */
	public boolean isTopMenu(String id) {
		return id.equals("1");
	}
}
