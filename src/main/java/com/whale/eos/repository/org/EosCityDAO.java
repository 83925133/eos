package com.whale.eos.repository.org;

import java.util.List;

import com.whale.eos.entity.org.EosCity;

public interface EosCityDAO {

	List<EosCity> getCityByLocationid(String locationid);
	
}