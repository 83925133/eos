package com.whale.eos.entity.menu;

import java.io.Serializable;

public class EosUsermenu implements Serializable {

	private static final long serialVersionUID = -8414228199723752678L;

	/**
     * eos_usermenu.id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer id;

    /**
     * eos_usermenu.emp_id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer empId;

    /**
     * eos_usermenu.menu_id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer menuId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}