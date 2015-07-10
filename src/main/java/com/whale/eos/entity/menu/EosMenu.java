package com.whale.eos.entity.menu;

import java.io.Serializable;

public class EosMenu implements Serializable {

	private static final long serialVersionUID = 2976358941999157693L;

	/**
     * eos_menu.id
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer id;

    /**
     * eos_menu.menuno
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer menugno; 
    
    /**
     * eos_menu.menuno
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private Integer menuno;

    /**
     * eos_menu.menutype
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String menutype;

    /**
     * eos_menu.menuname
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String menuname;

    /**
     * eos_menu.menunote
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String menunote;

    /**
     * eos_menu.menucode
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String menucode;

    /**
     * eos_menu.url
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String url;

    /**
     * eos_menu.state
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getMenugno() {
		return menugno;
	}

	public void setMenugno(Integer menugno) {
		this.menugno = menugno;
	}

	public Integer getMenuno() {
        return menuno;
    }

    public void setMenuno(Integer menuno) {
        this.menuno = menuno;
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenunote() {
        return menunote;
    }

    public void setMenunote(String menunote) {
        this.menunote = menunote;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}