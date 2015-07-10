package com.whale.eos.entity.bill;

import java.io.Serializable;

public class EosBillLine implements Serializable {
    /**
     * eos_bill_line.id
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Long id;

    /**
     * eos_bill_line.bno
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String bno;

    /**
     * eos_bill_line.bno_user
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String bnoUser;

    /**
     * eos_bill_line.rbno
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String rbno;

    /**
     * eos_bill_line.item_id
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String itemId;

    /**
     * eos_bill_line.store_id
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double storeId;

    /**
     * eos_bill_line.cost
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double cost;

    /**
     * eos_bill_line.lastpricein
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double lastpricein;

    /**
     * eos_bill_line.price
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double price;

    /**
     * eos_bill_line.price2
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double price2;

    /**
     * eos_bill_line.qty
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double qty;

    /**
     * eos_bill_line.qty2
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double qty2;

    /**
     * eos_bill_line.tot
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double tot;

    /**
     * eos_bill_line.tot2
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double tot2;

    /**
     * eos_bill_line.rtqty
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double rtqty;

    /**
     * eos_bill_line.rttot
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double rttot;

    /**
     * eos_bill_line.lostqty
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double lostqty;

    /**
     * eos_bill_line.losttot
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double losttot;

    /**
     * eos_bill_line.jsdisplay
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String jsdisplay;

    /**
     * eos_bill_line.jsqty
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private Double jsqty;

    /**
     * eos_bill_line.js
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String js;

    /**
     * eos_bill_line.remark
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String remark;

    /**
     * eos_bill_line.updated_datetime
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    private String updatedDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getBnoUser() {
        return bnoUser;
    }

    public void setBnoUser(String bnoUser) {
        this.bnoUser = bnoUser;
    }

    public String getRbno() {
        return rbno;
    }

    public void setRbno(String rbno) {
        this.rbno = rbno;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Double getStoreId() {
        return storeId;
    }

    public void setStoreId(Double storeId) {
        this.storeId = storeId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getLastpricein() {
        return lastpricein;
    }

    public void setLastpricein(Double lastpricein) {
        this.lastpricein = lastpricein;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQty2() {
        return qty2;
    }

    public void setQty2(Double qty2) {
        this.qty2 = qty2;
    }

    public Double getTot() {
        return tot;
    }

    public void setTot(Double tot) {
        this.tot = tot;
    }

    public Double getTot2() {
        return tot2;
    }

    public void setTot2(Double tot2) {
        this.tot2 = tot2;
    }

    public Double getRtqty() {
        return rtqty;
    }

    public void setRtqty(Double rtqty) {
        this.rtqty = rtqty;
    }

    public Double getRttot() {
        return rttot;
    }

    public void setRttot(Double rttot) {
        this.rttot = rttot;
    }

    public Double getLostqty() {
        return lostqty;
    }

    public void setLostqty(Double lostqty) {
        this.lostqty = lostqty;
    }

    public Double getLosttot() {
        return losttot;
    }

    public void setLosttot(Double losttot) {
        this.losttot = losttot;
    }

    public String getJsdisplay() {
        return jsdisplay;
    }

    public void setJsdisplay(String jsdisplay) {
        this.jsdisplay = jsdisplay;
    }

    public Double getJsqty() {
        return jsqty;
    }

    public void setJsqty(Double jsqty) {
        this.jsqty = jsqty;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(String updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }
}