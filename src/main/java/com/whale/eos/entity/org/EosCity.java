package com.whale.eos.entity.org;

import java.io.Serializable;

public class EosCity implements Serializable {
    /**
     * eos_city.ID
     * @ibatorgenerated 2015-06-21 10:44:02
     */
    private Integer id;

    /**
     * eos_city.districtid
     * @ibatorgenerated 2015-06-21 10:44:02
     */
    private Integer districtid;

    /**
     * eos_city.districtname
     * @ibatorgenerated 2015-06-21 10:44:02
     */
    private String districtname;

    /**
     * eos_city.locationid
     * @ibatorgenerated 2015-06-21 10:44:02
     */
    private Integer locationid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }
}