package com.whale.eos.repository.menu;

import java.util.List;

import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.menu.EosUsermenu;

public interface EosMenuDAO {

	List<EosMenu> findByEno(String eno);
	
	List<EosMenu> findUserMenuByEno(String eno);

	List<EosMenu> findAll();

	EosMenu findOne(String id);

	void save(EosMenu eosMenu);
	
	void batchInsert(List<EosUsermenu> lst);
	
	void batchDelete(List<EosUsermenu> lst);

	void deleteAllUserMenuByEmpId(Integer empId);
	
	void delete(String id);
}