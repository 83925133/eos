package com.whale.eos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import com.whale.eos.entity.menu.EosMenu;
import com.whale.eos.entity.menu.EosUsermenu;
import com.whale.eos.entity.org.EosDept;
import com.whale.eos.entity.org.EosUser;

public class EosEmpInfo {
	private List<EosMenu> menus;
	private List<EosUsermenu> usermenus;
	private EosDept dept;
	private EosUser user;
	
	/**
     * eos_emp.id
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private Integer id;
    
    /**
     * eos_emp.uno
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String uno;

    /**
     * eos_emp.deptcode
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String deptcode;

    /**
     * eos_emp.deptname
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String deptname;

    /**
     * eos_emp.orgcode
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String orgcode;

    /**
     * eos_emp.eno
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String eno;

    /**
     * eos_emp.ename
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String ename;

    /**
     * eos_emp.pwd
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String pwd;

    /**
     * eos_emp.role
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String role;

    /**
     * eos_emp.tel
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String tel;

    /**
     * eos_emp.fax
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String fax;

    /**
     * eos_emp.mob
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String mob;

    /**
     * eos_emp.email
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String email;

    /**
     * eos_emp.qq
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String qq;

    /**
     * eos_emp.state
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String state;

    /**
     * eos_emp.chelp
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String chelp;

    /**
     * eos_emp.firstmark
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String firstmark;

    /**
     * eos_emp.created_date
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String createdDate;

    /**
     * eos_emp.updated_date
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String updatedDate;

    /**
     * eos_emp.created_by
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String createdBy;

    /**
     * eos_emp.updated_by
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String updatedBy;

    /**
     * eos_emp.created_time
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String createdTime;

    /**
     * eos_emp.updated_time
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    private String updatedTime;
    
    @Id
    @Column(name = "id")
    public Integer getId() {
    	return id;
    }
    
    public void setId(Integer id) {
    	this.id = id;
    }
    
    @Column(name = "uno")
	public String getUno() {
        return uno;
    }
	public void setUno(String uno) {
        this.uno = uno;
    }
    @Column(name = "deptcode")
    public String getDeptcode() {
        return deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }
    @Column(name = "deptname")
    public String getDeptname() {
        return deptname;
    }
    
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
    @Column(name = "orgcode")
    public String getOrgcode() {
        return orgcode;
    }
    
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }
    
    @Column(name = "eno", updatable = false)
    @NotBlank
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }
    @Column(name = "ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    @Column(name = "mob")
    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Column(name = "chelp")
    public String getChelp() {
        return chelp;
    }

    public void setChelp(String chelp) {
        this.chelp = chelp;
    }
    @Column(name = "firstmark")
    public String getFirstmark() {
        return firstmark;
    }

    public void setFirstmark(String firstmark) {
        this.firstmark = firstmark;
    }
    @Column(name = "created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    @Column(name = "updated_date")
    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Column(name = "updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    @Column(name = "created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
    @Column(name = "updated_time")
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

	public List<EosMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<EosMenu> menus) {
		this.menus = menus;
	}

	public List<EosUsermenu> getUsermenus() {
		return usermenus;
	}

	public void setUsermenus(List<EosUsermenu> usermenus) {
		this.usermenus = usermenus;
	}

	public EosDept getDept() {
		return dept;
	}

	public void setDept(EosDept dept) {
		this.dept = dept;
	}

	public EosUser getUser() {
		return user;
	}

	public void setUser(EosUser user) {
		this.user = user;
	}
}
