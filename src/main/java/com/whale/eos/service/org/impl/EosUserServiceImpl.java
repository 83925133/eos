package com.whale.eos.service.org.impl;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.whale.eos.entity.org.EosUser;
import com.whale.eos.repository.org.EosUserDAO;
import com.whale.eos.service.org.IEosUserService;
import com.whale.eos.service.org.ShiroDbRealm;

@Component
@Transactional(readOnly = true)
public class EosUserServiceImpl implements IEosUserService {

	private static Logger logger = LoggerFactory.getLogger(EosUserServiceImpl.class);

	@Autowired
	private EosUserDAO eosUserDAO;

	public List<EosUser> findAll() {
		return (List<EosUser>) eosUserDAO.findAll();
	}

	public EosUser getUser(String id) {
		return eosUserDAO.findById(id);
	}

	public EosUser findByEno(String eno) {
		return eosUserDAO.findByEno(eno);
	}
	
	public EosUser findByUno(String uno) {
		return eosUserDAO.findByUno(uno);
	}

	@Transactional(readOnly = false)
	public boolean add(EosUser eosUser) {
		eosUserDAO.save(eosUser);
		
		return true;
	}

	@Transactional(readOnly = false)
	public void update(EosUser eosUser) {
		eosUserDAO.update(eosUser);
	}

	@Transactional(readOnly = false)
	public void delete(String id) {
		eosUserDAO.delete(id);

	}

	/**
	 * 取出Shiro中的当前用户LoginName.
	 */
	public String getCurrentUserName() {
		ShiroDbRealm.ShiroEmp emp = (ShiroDbRealm.ShiroEmp) SecurityUtils
				.getSubject().getPrincipal();
		logger.info("取出Shiro中的当前用户登陆名称-->"+emp.getLoginName());
		return emp.loginName;
	}
}
