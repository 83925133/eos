package com.whale.eos.entity.org;

import java.io.Serializable;

public class EosArea implements Serializable {
    /**
     * eos_area.ID
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private Integer id;

    /**
     * eos_area.villageid
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private String villageid;

    /**
     * eos_area.villagename
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private String villagename;

    /**
     * eos_area.districtid
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    private String districtid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVillageid() {
        return villageid;
    }

    public void setVillageid(String villageid) {
        this.villageid = villageid;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }
}