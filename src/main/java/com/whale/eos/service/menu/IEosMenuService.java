package com.whale.eos.service.menu;

import java.util.List;

import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.menu.EosUsermenu;

public interface IEosMenuService {

	public List<EosMenu> findAll();
    
    public EosMenu getMenu(String id);
    
    public List<EosMenu> findByEno(String eno);
    
    public List<EosMenu> findUserMenuByEno(String eno);
    
    public void batchInsert(List<EosUsermenu> lst);
	
    public void batchDelete(List<EosUsermenu> lst);
    
    public boolean batchUpdateUserMenu(List<EosUsermenu> lst, Integer empId);
    
    public void add(EosMenu eosMenu);
    
    public void update(EosMenu eosMenu) ;
    
    public void delete(String id);
}
