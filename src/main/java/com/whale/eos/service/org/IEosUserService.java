package com.whale.eos.service.org;

import java.util.List;

import com.whale.eos.entity.org.EosUser;

public interface IEosUserService {

    public List<EosUser> findAll();

    public EosUser getUser(String id);
    
    public EosUser findByEno(String eno);
    
    public EosUser findByUno(String uno);
    
    public boolean add(EosUser eosUser);
    
    public void update(EosUser eosUser) ;
    
    public void delete(String id);
    
    String getCurrentUserName();
}
