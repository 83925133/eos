package com.whale.eos.repository.org;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.whale.eos.entity.org.EosUser;

public interface EosUserDAO  {
	
	EosUser findByEno(String eno);
	
	EosUser findByUno(String uno);

	List<EosUser> findAll();

	EosUser findById(String id);

	void save(EosUser eosUser);

	void update(EosUser eosUser);

	void delete(String id);

}