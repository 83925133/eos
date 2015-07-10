package com.whale.eos.service.org;

import java.util.List;
import java.util.Map;

import com.whale.eos.basic.util.page.Page;
import com.whale.eos.entity.org.EosEmp;

public interface IEosDeptService {

    public static final String HASH_ALGORITHM = "SHA-1";
    public static final int HASH_INTERATIONS = 1024;
    public static final int SALT_SIZE = 8;

    public List<EosEmp> getAllEmps();

    public org.springframework.data.domain.Page<EosEmp> findAll(Page page);
    public org.springframework.data.domain.Page<EosEmp> findAllPage(Map<String, Object> searchParams, Page page);

    public EosEmp getEmp(String id);
    public EosEmp findByEno(String loginName);

    public void registerEmp(EosEmp eosEmp);

    public void updateEmp(EosEmp eosEmp) ;
    public void deleteEmp(String id);

    /**
     * 判断是否超级管理员.
     */
    boolean isSupervisor(String id);

    /**
     * 取出Shiro中的当前用户LoginName.
     */
    String getCurrentEmpName();

    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    public void entryptPassword(EosEmp eosEmp);

    public String entryptPassword(String pwd, String salt);

    /**
     * 查询角色拥有的资源
     * @param roleId
     * @return
     */
    public List<String> getAllRoleAction(String roleId);
}
