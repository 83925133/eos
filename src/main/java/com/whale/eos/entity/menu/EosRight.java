package com.whale.eos.entity.menu;

import java.io.Serializable;

public class EosRight implements Serializable {

	private static final long serialVersionUID = -3185264266836888388L;

	/**
     * eos_right.id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer id;

    /**
     * eos_right.emp_id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer empId;

    /**
     * eos_right.menu_id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer menuId;

    /**
     * eos_right.mark
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String mark;

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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}