package com.whale.eos.repository.org;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.whale.eos.entity.org.EosEmp;

public interface EosEmpDAO extends PagingAndSortingRepository<EosEmp, String>,
		JpaSpecificationExecutor<EosEmp> {

	/** 名称约定 findBy+EosEmp中 登录属性名（首字母大写）*/
	EosEmp findByEno(String eno);
}