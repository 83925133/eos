package com.whale.eos.service.org.impl;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.whale.eos.basic.util.Encodes;
import com.whale.eos.basic.util.page.Page;
import com.whale.eos.basic.util.page.PageUtils;
import com.whale.eos.basic.util.persistance.DynamicSpecifications;
import com.whale.eos.basic.util.persistance.SearchFilter;
import com.whale.eos.basic.util.security.utils.Digests;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.repository.org.EosEmpDAO;
import com.whale.eos.service.org.IEosEmpService;
import com.whale.eos.service.org.ShiroDbRealm;

@Component
@Transactional(readOnly = true)
public class EosEmpServiceImpl implements IEosEmpService {

	private static Logger logger = LoggerFactory.getLogger(EosEmpServiceImpl.class);

	@Autowired
	private EosEmpDAO eosEmpDAO;

	public List<EosEmp> getAllEmps() {
		return (List<EosEmp>) eosEmpDAO.findAll();
	}

	public org.springframework.data.domain.Page<EosEmp> findAll(Page page) {
		page.setOrderField("createTime");
		page.setOrderDirection(Page.ORDER_DIRECTION_DESC);
		org.springframework.data.domain.Page<EosEmp> springDataPage = eosEmpDAO
				.findAll(PageUtils.createPageable(page));
		PageUtils.injectPageProperties(page, springDataPage);
		return springDataPage;
	}

	public org.springframework.data.domain.Page<EosEmp> findAllPage(
			Map<String, Object> searchParams, Page page) {
		page.setOrderField("createTime");
		page.setOrderDirection(Page.ORDER_DIRECTION_DESC);
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
		Specification<EosEmp> spec = DynamicSpecifications.bySearchFilter(
				filters.values(), EosEmp.class);
		org.springframework.data.domain.Page<EosEmp> springDataPage = eosEmpDAO
				.findAll(spec, PageUtils.createPageable(page));
		PageUtils.injectPageProperties(page, springDataPage);

		return springDataPage;
	}

	public EosEmp getEmp(String id) {
		return eosEmpDAO.findOne(id);
	}

	public EosEmp findByEno(String eno) {
		return eosEmpDAO.findByEno(eno);
	}

	@Transactional(readOnly = false)
	public void registerEmp(EosEmp eosEmp) {
		entryptPassword(eosEmp);
		// operator.setRoleId("admin");
		// operator.setOperatorStatus("enable");
		// operator.setCreateTime(new Date());
		eosEmpDAO.save(eosEmp);
	}

	@Transactional(readOnly = false)
	public void updateEmp(EosEmp eosEmp) {
		// TODO:------
		/*
		 * if (StringUtils.isNotBlank(operator.getPlainPassword())) {
		 * entryptPassword(operator); } operator.setUpdateTime(new Date());
		 */

		eosEmpDAO.save(eosEmp);
	}

	@Transactional(readOnly = false)
	public void deleteEmp(String id) {
		if (isSupervisor(id)) {
			logger.error("EosEmp {} try to delete a Super Administrator",
					getCurrentEmpName());
			throw new ServiceException("超级管理员不能删除!");
		}
		eosEmpDAO.delete(id);

	}

	/**
	 * 判断是否超级管理员.
	 */
	public boolean isSupervisor(String id) {
		return id.equals("1");
	}

	/**
	 * 取出Shiro中的当前用户LoginName.
	 */
	public String getCurrentEmpName() {
		ShiroDbRealm.ShiroEmp emp = (ShiroDbRealm.ShiroEmp) SecurityUtils
				.getSubject().getPrincipal();
		return emp.loginName;
	}

	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	public void entryptPassword(EosEmp eosEmp) {
		/*
		 * byte[] salt = Digests.generateSalt(SALT_SIZE);
		 * operator.setPwdSalt(Encodes.encodeHex(salt));
		 * 
		 * byte[] hashPassword =
		 * Digests.sha1(operator.getPlainPassword().getBytes(), salt,
		 * HASH_INTERATIONS);
		 * operator.setLoginPwd(Encodes.encodeHex(hashPassword));
		 */
	}

	public String entryptPassword(String pwd, String salt) {
		byte[] hashPassword = Digests.sha1(pwd.getBytes(),
				Encodes.decodeHex(salt), HASH_INTERATIONS);
		return Encodes.encodeHex(hashPassword);
	}

	@Override
	public List<String> getAllRoleAction(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
