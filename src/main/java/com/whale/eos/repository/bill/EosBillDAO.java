package com.whale.eos.repository.bill;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.whale.eos.entity.bill.EosBillInfo;

public interface EosBillDAO {

	public int findUncheckedBillCount(EosBillInfo billinfo);
	
	public List<EosBillInfo> findUncheckedBill(EosBillInfo billinfo, PageBounds pageBounds);
	
	public int findCheckedBillCount(EosBillInfo billinfo);
	
	public List<EosBillInfo> findCheckedBill(EosBillInfo billinfo);
    
}