package com.whale.eos.entity.org;

import java.io.Serializable;

public class EosProvince implements Serializable {
    /**
     * eos_province.id
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private Integer id;

    /**
     * eos_province.locationid
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private Integer locationid;

    /**
     * eos_province.locationname
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private String locationname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }
}