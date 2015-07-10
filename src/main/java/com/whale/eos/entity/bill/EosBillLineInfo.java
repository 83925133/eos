package com.whale.eos.entity.bill;

import java.util.ArrayList;
import java.util.List;

public class EosBillLineInfo {
    /**
     * 主键字段
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    protected String pk_name;

    /**
     * 排序字段
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    protected String orderByClause;

    /**
     * 去重复
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    protected boolean distinct;

    /**
     * 条件集
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    protected List<Criteria> oredCriteria;

    public EosBillLineInfo() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setPk_name(String pk_name) {
        this.pk_name = pk_name;
    }

    public String getPk_name() {
        return pk_name;
    }

    /**
     * 排序字段
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置去重复
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 条件查询要先创建Criteria
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * 内类部，系统内部调用1
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBnoIsNull() {
            addCriterion("bno is null");
            return (Criteria) this;
        }

        public Criteria andBnoIsNotNull() {
            addCriterion("bno is not null");
            return (Criteria) this;
        }

        public Criteria andBnoEqualTo(String value) {
            addCriterion("bno =", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotEqualTo(String value) {
            addCriterion("bno <>", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThan(String value) {
            addCriterion("bno >", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThanOrEqualTo(String value) {
            addCriterion("bno >=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThan(String value) {
            addCriterion("bno <", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThanOrEqualTo(String value) {
            addCriterion("bno <=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLike(String value) {
            addCriterion("bno like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotLike(String value) {
            addCriterion("bno not like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoIn(List<String> values) {
            addCriterion("bno in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotIn(List<String> values) {
            addCriterion("bno not in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoBetween(String value1, String value2) {
            addCriterion("bno between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotBetween(String value1, String value2) {
            addCriterion("bno not between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoUserIsNull() {
            addCriterion("bno_user is null");
            return (Criteria) this;
        }

        public Criteria andBnoUserIsNotNull() {
            addCriterion("bno_user is not null");
            return (Criteria) this;
        }

        public Criteria andBnoUserEqualTo(String value) {
            addCriterion("bno_user =", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserNotEqualTo(String value) {
            addCriterion("bno_user <>", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserGreaterThan(String value) {
            addCriterion("bno_user >", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserGreaterThanOrEqualTo(String value) {
            addCriterion("bno_user >=", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserLessThan(String value) {
            addCriterion("bno_user <", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserLessThanOrEqualTo(String value) {
            addCriterion("bno_user <=", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserLike(String value) {
            addCriterion("bno_user like", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserNotLike(String value) {
            addCriterion("bno_user not like", value, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserIn(List<String> values) {
            addCriterion("bno_user in", values, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserNotIn(List<String> values) {
            addCriterion("bno_user not in", values, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserBetween(String value1, String value2) {
            addCriterion("bno_user between", value1, value2, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andBnoUserNotBetween(String value1, String value2) {
            addCriterion("bno_user not between", value1, value2, "bnoUser");
            return (Criteria) this;
        }

        public Criteria andRbnoIsNull() {
            addCriterion("rbno is null");
            return (Criteria) this;
        }

        public Criteria andRbnoIsNotNull() {
            addCriterion("rbno is not null");
            return (Criteria) this;
        }

        public Criteria andRbnoEqualTo(String value) {
            addCriterion("rbno =", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoNotEqualTo(String value) {
            addCriterion("rbno <>", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoGreaterThan(String value) {
            addCriterion("rbno >", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoGreaterThanOrEqualTo(String value) {
            addCriterion("rbno >=", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoLessThan(String value) {
            addCriterion("rbno <", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoLessThanOrEqualTo(String value) {
            addCriterion("rbno <=", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoLike(String value) {
            addCriterion("rbno like", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoNotLike(String value) {
            addCriterion("rbno not like", value, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoIn(List<String> values) {
            addCriterion("rbno in", values, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoNotIn(List<String> values) {
            addCriterion("rbno not in", values, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoBetween(String value1, String value2) {
            addCriterion("rbno between", value1, value2, "rbno");
            return (Criteria) this;
        }

        public Criteria andRbnoNotBetween(String value1, String value2) {
            addCriterion("rbno not between", value1, value2, "rbno");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Double value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Double value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Double value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Double value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Double value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Double value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Double> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Double> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Double value1, Double value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Double value1, Double value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andLastpriceinIsNull() {
            addCriterion("lastpricein is null");
            return (Criteria) this;
        }

        public Criteria andLastpriceinIsNotNull() {
            addCriterion("lastpricein is not null");
            return (Criteria) this;
        }

        public Criteria andLastpriceinEqualTo(Double value) {
            addCriterion("lastpricein =", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinNotEqualTo(Double value) {
            addCriterion("lastpricein <>", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinGreaterThan(Double value) {
            addCriterion("lastpricein >", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinGreaterThanOrEqualTo(Double value) {
            addCriterion("lastpricein >=", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinLessThan(Double value) {
            addCriterion("lastpricein <", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinLessThanOrEqualTo(Double value) {
            addCriterion("lastpricein <=", value, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinIn(List<Double> values) {
            addCriterion("lastpricein in", values, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinNotIn(List<Double> values) {
            addCriterion("lastpricein not in", values, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinBetween(Double value1, Double value2) {
            addCriterion("lastpricein between", value1, value2, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andLastpriceinNotBetween(Double value1, Double value2) {
            addCriterion("lastpricein not between", value1, value2, "lastpricein");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("price2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(Double value) {
            addCriterion("price2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(Double value) {
            addCriterion("price2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(Double value) {
            addCriterion("price2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(Double value) {
            addCriterion("price2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(Double value) {
            addCriterion("price2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(Double value) {
            addCriterion("price2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<Double> values) {
            addCriterion("price2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<Double> values) {
            addCriterion("price2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(Double value1, Double value2) {
            addCriterion("price2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(Double value1, Double value2) {
            addCriterion("price2 not between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Double value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Double value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Double value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Double value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Double value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Double value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Double> values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Double> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Double value1, Double value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Double value1, Double value2) {
            addCriterion("qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQty2IsNull() {
            addCriterion("qty2 is null");
            return (Criteria) this;
        }

        public Criteria andQty2IsNotNull() {
            addCriterion("qty2 is not null");
            return (Criteria) this;
        }

        public Criteria andQty2EqualTo(Double value) {
            addCriterion("qty2 =", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2NotEqualTo(Double value) {
            addCriterion("qty2 <>", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2GreaterThan(Double value) {
            addCriterion("qty2 >", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2GreaterThanOrEqualTo(Double value) {
            addCriterion("qty2 >=", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2LessThan(Double value) {
            addCriterion("qty2 <", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2LessThanOrEqualTo(Double value) {
            addCriterion("qty2 <=", value, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2In(List<Double> values) {
            addCriterion("qty2 in", values, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2NotIn(List<Double> values) {
            addCriterion("qty2 not in", values, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2Between(Double value1, Double value2) {
            addCriterion("qty2 between", value1, value2, "qty2");
            return (Criteria) this;
        }

        public Criteria andQty2NotBetween(Double value1, Double value2) {
            addCriterion("qty2 not between", value1, value2, "qty2");
            return (Criteria) this;
        }

        public Criteria andTotIsNull() {
            addCriterion("tot is null");
            return (Criteria) this;
        }

        public Criteria andTotIsNotNull() {
            addCriterion("tot is not null");
            return (Criteria) this;
        }

        public Criteria andTotEqualTo(Double value) {
            addCriterion("tot =", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotEqualTo(Double value) {
            addCriterion("tot <>", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotGreaterThan(Double value) {
            addCriterion("tot >", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotGreaterThanOrEqualTo(Double value) {
            addCriterion("tot >=", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotLessThan(Double value) {
            addCriterion("tot <", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotLessThanOrEqualTo(Double value) {
            addCriterion("tot <=", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotIn(List<Double> values) {
            addCriterion("tot in", values, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotIn(List<Double> values) {
            addCriterion("tot not in", values, "tot");
            return (Criteria) this;
        }

        public Criteria andTotBetween(Double value1, Double value2) {
            addCriterion("tot between", value1, value2, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotBetween(Double value1, Double value2) {
            addCriterion("tot not between", value1, value2, "tot");
            return (Criteria) this;
        }

        public Criteria andTot2IsNull() {
            addCriterion("tot2 is null");
            return (Criteria) this;
        }

        public Criteria andTot2IsNotNull() {
            addCriterion("tot2 is not null");
            return (Criteria) this;
        }

        public Criteria andTot2EqualTo(Double value) {
            addCriterion("tot2 =", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2NotEqualTo(Double value) {
            addCriterion("tot2 <>", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2GreaterThan(Double value) {
            addCriterion("tot2 >", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2GreaterThanOrEqualTo(Double value) {
            addCriterion("tot2 >=", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2LessThan(Double value) {
            addCriterion("tot2 <", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2LessThanOrEqualTo(Double value) {
            addCriterion("tot2 <=", value, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2In(List<Double> values) {
            addCriterion("tot2 in", values, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2NotIn(List<Double> values) {
            addCriterion("tot2 not in", values, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2Between(Double value1, Double value2) {
            addCriterion("tot2 between", value1, value2, "tot2");
            return (Criteria) this;
        }

        public Criteria andTot2NotBetween(Double value1, Double value2) {
            addCriterion("tot2 not between", value1, value2, "tot2");
            return (Criteria) this;
        }

        public Criteria andRtqtyIsNull() {
            addCriterion("rtqty is null");
            return (Criteria) this;
        }

        public Criteria andRtqtyIsNotNull() {
            addCriterion("rtqty is not null");
            return (Criteria) this;
        }

        public Criteria andRtqtyEqualTo(Double value) {
            addCriterion("rtqty =", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyNotEqualTo(Double value) {
            addCriterion("rtqty <>", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyGreaterThan(Double value) {
            addCriterion("rtqty >", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyGreaterThanOrEqualTo(Double value) {
            addCriterion("rtqty >=", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyLessThan(Double value) {
            addCriterion("rtqty <", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyLessThanOrEqualTo(Double value) {
            addCriterion("rtqty <=", value, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyIn(List<Double> values) {
            addCriterion("rtqty in", values, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyNotIn(List<Double> values) {
            addCriterion("rtqty not in", values, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyBetween(Double value1, Double value2) {
            addCriterion("rtqty between", value1, value2, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRtqtyNotBetween(Double value1, Double value2) {
            addCriterion("rtqty not between", value1, value2, "rtqty");
            return (Criteria) this;
        }

        public Criteria andRttotIsNull() {
            addCriterion("rttot is null");
            return (Criteria) this;
        }

        public Criteria andRttotIsNotNull() {
            addCriterion("rttot is not null");
            return (Criteria) this;
        }

        public Criteria andRttotEqualTo(Double value) {
            addCriterion("rttot =", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotNotEqualTo(Double value) {
            addCriterion("rttot <>", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotGreaterThan(Double value) {
            addCriterion("rttot >", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotGreaterThanOrEqualTo(Double value) {
            addCriterion("rttot >=", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotLessThan(Double value) {
            addCriterion("rttot <", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotLessThanOrEqualTo(Double value) {
            addCriterion("rttot <=", value, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotIn(List<Double> values) {
            addCriterion("rttot in", values, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotNotIn(List<Double> values) {
            addCriterion("rttot not in", values, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotBetween(Double value1, Double value2) {
            addCriterion("rttot between", value1, value2, "rttot");
            return (Criteria) this;
        }

        public Criteria andRttotNotBetween(Double value1, Double value2) {
            addCriterion("rttot not between", value1, value2, "rttot");
            return (Criteria) this;
        }

        public Criteria andLostqtyIsNull() {
            addCriterion("lostqty is null");
            return (Criteria) this;
        }

        public Criteria andLostqtyIsNotNull() {
            addCriterion("lostqty is not null");
            return (Criteria) this;
        }

        public Criteria andLostqtyEqualTo(Double value) {
            addCriterion("lostqty =", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyNotEqualTo(Double value) {
            addCriterion("lostqty <>", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyGreaterThan(Double value) {
            addCriterion("lostqty >", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyGreaterThanOrEqualTo(Double value) {
            addCriterion("lostqty >=", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyLessThan(Double value) {
            addCriterion("lostqty <", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyLessThanOrEqualTo(Double value) {
            addCriterion("lostqty <=", value, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyIn(List<Double> values) {
            addCriterion("lostqty in", values, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyNotIn(List<Double> values) {
            addCriterion("lostqty not in", values, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyBetween(Double value1, Double value2) {
            addCriterion("lostqty between", value1, value2, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLostqtyNotBetween(Double value1, Double value2) {
            addCriterion("lostqty not between", value1, value2, "lostqty");
            return (Criteria) this;
        }

        public Criteria andLosttotIsNull() {
            addCriterion("losttot is null");
            return (Criteria) this;
        }

        public Criteria andLosttotIsNotNull() {
            addCriterion("losttot is not null");
            return (Criteria) this;
        }

        public Criteria andLosttotEqualTo(Double value) {
            addCriterion("losttot =", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotNotEqualTo(Double value) {
            addCriterion("losttot <>", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotGreaterThan(Double value) {
            addCriterion("losttot >", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotGreaterThanOrEqualTo(Double value) {
            addCriterion("losttot >=", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotLessThan(Double value) {
            addCriterion("losttot <", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotLessThanOrEqualTo(Double value) {
            addCriterion("losttot <=", value, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotIn(List<Double> values) {
            addCriterion("losttot in", values, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotNotIn(List<Double> values) {
            addCriterion("losttot not in", values, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotBetween(Double value1, Double value2) {
            addCriterion("losttot between", value1, value2, "losttot");
            return (Criteria) this;
        }

        public Criteria andLosttotNotBetween(Double value1, Double value2) {
            addCriterion("losttot not between", value1, value2, "losttot");
            return (Criteria) this;
        }

        public Criteria andJsdisplayIsNull() {
            addCriterion("jsdisplay is null");
            return (Criteria) this;
        }

        public Criteria andJsdisplayIsNotNull() {
            addCriterion("jsdisplay is not null");
            return (Criteria) this;
        }

        public Criteria andJsdisplayEqualTo(String value) {
            addCriterion("jsdisplay =", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayNotEqualTo(String value) {
            addCriterion("jsdisplay <>", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayGreaterThan(String value) {
            addCriterion("jsdisplay >", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayGreaterThanOrEqualTo(String value) {
            addCriterion("jsdisplay >=", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayLessThan(String value) {
            addCriterion("jsdisplay <", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayLessThanOrEqualTo(String value) {
            addCriterion("jsdisplay <=", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayLike(String value) {
            addCriterion("jsdisplay like", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayNotLike(String value) {
            addCriterion("jsdisplay not like", value, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayIn(List<String> values) {
            addCriterion("jsdisplay in", values, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayNotIn(List<String> values) {
            addCriterion("jsdisplay not in", values, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayBetween(String value1, String value2) {
            addCriterion("jsdisplay between", value1, value2, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsdisplayNotBetween(String value1, String value2) {
            addCriterion("jsdisplay not between", value1, value2, "jsdisplay");
            return (Criteria) this;
        }

        public Criteria andJsqtyIsNull() {
            addCriterion("jsqty is null");
            return (Criteria) this;
        }

        public Criteria andJsqtyIsNotNull() {
            addCriterion("jsqty is not null");
            return (Criteria) this;
        }

        public Criteria andJsqtyEqualTo(Double value) {
            addCriterion("jsqty =", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyNotEqualTo(Double value) {
            addCriterion("jsqty <>", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyGreaterThan(Double value) {
            addCriterion("jsqty >", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyGreaterThanOrEqualTo(Double value) {
            addCriterion("jsqty >=", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyLessThan(Double value) {
            addCriterion("jsqty <", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyLessThanOrEqualTo(Double value) {
            addCriterion("jsqty <=", value, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyIn(List<Double> values) {
            addCriterion("jsqty in", values, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyNotIn(List<Double> values) {
            addCriterion("jsqty not in", values, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyBetween(Double value1, Double value2) {
            addCriterion("jsqty between", value1, value2, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsqtyNotBetween(Double value1, Double value2) {
            addCriterion("jsqty not between", value1, value2, "jsqty");
            return (Criteria) this;
        }

        public Criteria andJsIsNull() {
            addCriterion("js is null");
            return (Criteria) this;
        }

        public Criteria andJsIsNotNull() {
            addCriterion("js is not null");
            return (Criteria) this;
        }

        public Criteria andJsEqualTo(String value) {
            addCriterion("js =", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotEqualTo(String value) {
            addCriterion("js <>", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThan(String value) {
            addCriterion("js >", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThanOrEqualTo(String value) {
            addCriterion("js >=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThan(String value) {
            addCriterion("js <", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThanOrEqualTo(String value) {
            addCriterion("js <=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLike(String value) {
            addCriterion("js like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotLike(String value) {
            addCriterion("js not like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsIn(List<String> values) {
            addCriterion("js in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotIn(List<String> values) {
            addCriterion("js not in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsBetween(String value1, String value2) {
            addCriterion("js between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotBetween(String value1, String value2) {
            addCriterion("js not between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeIsNull() {
            addCriterion("updated_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeIsNotNull() {
            addCriterion("updated_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeEqualTo(String value) {
            addCriterion("updated_datetime =", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotEqualTo(String value) {
            addCriterion("updated_datetime <>", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeGreaterThan(String value) {
            addCriterion("updated_datetime >", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updated_datetime >=", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeLessThan(String value) {
            addCriterion("updated_datetime <", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeLessThanOrEqualTo(String value) {
            addCriterion("updated_datetime <=", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeLike(String value) {
            addCriterion("updated_datetime like", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotLike(String value) {
            addCriterion("updated_datetime not like", value, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeIn(List<String> values) {
            addCriterion("updated_datetime in", values, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotIn(List<String> values) {
            addCriterion("updated_datetime not in", values, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeBetween(String value1, String value2) {
            addCriterion("updated_datetime between", value1, value2, "updatedDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedDatetimeNotBetween(String value1, String value2) {
            addCriterion("updated_datetime not between", value1, value2, "updatedDatetime");
            return (Criteria) this;
        }
    }

    /**
     * eos_bill_line
     * @ibatorgenerated do_not_delete_during_merge 2015-06-22 19:08:42
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 内类部，系统内部调用1
     * @ibatorgenerated 2015-06-22 19:08:42
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}