package com.whale.eos.service.bill;

import java.util.List;

import com.whale.eos.entity.bill.EosBillHead;
import com.whale.eos.entity.bill.EosBillInfo;
import com.whale.eos.entity.bill.EosBillLine;
import com.whale.eos.entity.bill.EosBillProc;
import com.whale.eos.page.Pager;

public interface IEosBillService {

	public List<EosBillHead> findBillHeadAll();

	public List<EosBillLine> findBillLineAll();

	public List<EosBillProc> findBillProcAll();

	public Pager<EosBillInfo> findUncheckedBill(EosBillInfo billinfo);
	
	public List<EosBillInfo> findCheckedBill(EosBillInfo billinfo);

	public String findPrntype(String dtype, String uno);

}
