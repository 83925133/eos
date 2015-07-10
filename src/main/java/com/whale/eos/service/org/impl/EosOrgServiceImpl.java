package com.whale.eos.service.org.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.whale.eos.entity.org.EosCity;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.entity.org.EosProvince;
import com.whale.eos.repository.org.EosCityDAO;
import com.whale.eos.repository.org.EosEmpDAO;
import com.whale.eos.repository.org.EosProvinceDAO;
import com.whale.eos.service.org.IEosOrgService;

@Component
@Transactional(readOnly = true)
public class EosOrgServiceImpl implements IEosOrgService {

	private static Logger logger = LoggerFactory.getLogger(EosOrgServiceImpl.class);

	@Autowired
	private EosEmpDAO eosEmpDAO;

	@Autowired
	private EosProvinceDAO eosProvinceDAO;

	@Autowired
	private EosCityDAO eosCityDAO;

	public List<EosEmp> getAllEmps() {
		return (List<EosEmp>) eosEmpDAO.findAll();
	}

	@Override
	public String getProviceInfoByJson() {
		List<EosProvince> provinces = eosProvinceDAO.getProviceInfo();
		if (null != provinces) {
			StringBuffer sb = new StringBuffer();
			sb.append("[");
			// 得到集合的长度
			int size = provinces.size();
			int i = 0;
			for (EosProvince province : provinces) {
				i++;
				String locationid = String.valueOf(province.getLocationid());
				// String hnbIdentifier = province.getHnbIdentifier();
				String locationname = province.getLocationname();
				sb.append("{\"loactionid\":\"");
				sb.append(locationid);
				// sb.append("\",\"hnbIdentifier\":\"");
				// sb.append(hnbIdentifier);
				sb.append("\",\"loactionname\":\"");
				sb.append(locationname);
				sb.append("\"}");
				// 如果i小于size字符串sb中加","
				if (i < size) {
					sb.append(",");
				}
			}
			sb.append("]");

			// 拼好的字符串赋值给变量
			return sb.toString();
		} else {
			return "[]";
		}
	}

	@Override
	public String getCityInfoByLocationid(String locationid) {

		List<EosCity> citis = eosCityDAO.getCityByLocationid(locationid);
		if (null != citis && citis.size() != 0) {
			StringBuffer sb = new StringBuffer();
			sb.append("[");
			// 得到集合的长度
			int size = citis.size();
			int i = 0;
			for (EosCity city : citis) {
				i++;
				String districtid = String.valueOf(city.getDistrictid());
				// String hnbIdentifier = city.getHnbIdentifier();
				String districtname = city.getDistrictname();
				sb.append("{\"districtid\":\"");
				sb.append(districtid);
				// sb.append("\",\"hnbIdentifier\":\"");
				// sb.append(hnbIdentifier);
				sb.append("\",\"districtname\":\"");
				sb.append(districtname);
				sb.append("\"}");
				// 如果i小于size字符串sb中加","
				if (i < size) {
					sb.append(",");
				}
			}
			sb.append("]");
			// 拼好的字符串赋值给变量
			return sb.toString();
		} else {
			return "[]";
		}
	}
}
