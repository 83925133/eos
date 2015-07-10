package com.whale.eos.entity.menu;

import java.io.Serializable;

/**
 * 角色.
 *
 * @author calvin
 */
public class EosRole implements Serializable {

	private static final long serialVersionUID = -9108359121683773677L;

	private Integer id;
	
    private String roleName;

    private String roleDesc;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
