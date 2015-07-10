package com.whale.eos.entity.org;

import java.util.ArrayList;
import java.util.List;

public class EosUserExample {
    /**
     * 主键字段
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    protected String pk_name;

    /**
     * 排序字段
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    protected String orderByClause;

    /**
     * 去重复
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    protected boolean distinct;

    /**
     * 条件集
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    protected List<Criteria> oredCriteria;

    public EosUserExample() {
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
     * @ibatorgenerated 2015-06-13 22:49:55
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置去重复
     * @ibatorgenerated 2015-06-13 22:49:55
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
     * @ibatorgenerated 2015-06-13 22:49:55
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
     * @ibatorgenerated 2015-06-13 22:49:55
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

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(String value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(String value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(String value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(String value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(String value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(String value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Like(String value) {
            addCriterion("type1 like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotLike(String value) {
            addCriterion("type1 not like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<String> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<String> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(String value1, String value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(String value1, String value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(String value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(String value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(String value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(String value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(String value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(String value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Like(String value) {
            addCriterion("type2 like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotLike(String value) {
            addCriterion("type2 not like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<String> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<String> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(String value1, String value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(String value1, String value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andUnoIsNull() {
            addCriterion("uno is null");
            return (Criteria) this;
        }

        public Criteria andUnoIsNotNull() {
            addCriterion("uno is not null");
            return (Criteria) this;
        }

        public Criteria andUnoEqualTo(String value) {
            addCriterion("uno =", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotEqualTo(String value) {
            addCriterion("uno <>", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThan(String value) {
            addCriterion("uno >", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThanOrEqualTo(String value) {
            addCriterion("uno >=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThan(String value) {
            addCriterion("uno <", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThanOrEqualTo(String value) {
            addCriterion("uno <=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLike(String value) {
            addCriterion("uno like", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotLike(String value) {
            addCriterion("uno not like", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoIn(List<String> values) {
            addCriterion("uno in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotIn(List<String> values) {
            addCriterion("uno not in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoBetween(String value1, String value2) {
            addCriterion("uno between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotBetween(String value1, String value2) {
            addCriterion("uno not between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(String value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(String value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(String value) {
            addCriterion("provinceid >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(String value) {
            addCriterion("provinceid <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(String value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLike(String value) {
            addCriterion("provinceid like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotLike(String value) {
            addCriterion("provinceid not like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<String> values) {
            addCriterion("provinceid in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<String> values) {
            addCriterion("provinceid not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(String value1, String value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(String value1, String value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityid like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityid not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNull() {
            addCriterion("districtid is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("districtid is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(String value) {
            addCriterion("districtid =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(String value) {
            addCriterion("districtid <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(String value) {
            addCriterion("districtid >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(String value) {
            addCriterion("districtid >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(String value) {
            addCriterion("districtid <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(String value) {
            addCriterion("districtid <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLike(String value) {
            addCriterion("districtid like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotLike(String value) {
            addCriterion("districtid not like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<String> values) {
            addCriterion("districtid in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<String> values) {
            addCriterion("districtid not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(String value1, String value2) {
            addCriterion("districtid between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(String value1, String value2) {
            addCriterion("districtid not between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobIsNull() {
            addCriterion("mob is null");
            return (Criteria) this;
        }

        public Criteria andMobIsNotNull() {
            addCriterion("mob is not null");
            return (Criteria) this;
        }

        public Criteria andMobEqualTo(String value) {
            addCriterion("mob =", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotEqualTo(String value) {
            addCriterion("mob <>", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobGreaterThan(String value) {
            addCriterion("mob >", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobGreaterThanOrEqualTo(String value) {
            addCriterion("mob >=", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLessThan(String value) {
            addCriterion("mob <", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLessThanOrEqualTo(String value) {
            addCriterion("mob <=", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobLike(String value) {
            addCriterion("mob like", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotLike(String value) {
            addCriterion("mob not like", value, "mob");
            return (Criteria) this;
        }

        public Criteria andMobIn(List<String> values) {
            addCriterion("mob in", values, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotIn(List<String> values) {
            addCriterion("mob not in", values, "mob");
            return (Criteria) this;
        }

        public Criteria andMobBetween(String value1, String value2) {
            addCriterion("mob between", value1, value2, "mob");
            return (Criteria) this;
        }

        public Criteria andMobNotBetween(String value1, String value2) {
            addCriterion("mob not between", value1, value2, "mob");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andManIsNull() {
            addCriterion("man is null");
            return (Criteria) this;
        }

        public Criteria andManIsNotNull() {
            addCriterion("man is not null");
            return (Criteria) this;
        }

        public Criteria andManEqualTo(String value) {
            addCriterion("man =", value, "man");
            return (Criteria) this;
        }

        public Criteria andManNotEqualTo(String value) {
            addCriterion("man <>", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThan(String value) {
            addCriterion("man >", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThanOrEqualTo(String value) {
            addCriterion("man >=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThan(String value) {
            addCriterion("man <", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThanOrEqualTo(String value) {
            addCriterion("man <=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLike(String value) {
            addCriterion("man like", value, "man");
            return (Criteria) this;
        }

        public Criteria andManNotLike(String value) {
            addCriterion("man not like", value, "man");
            return (Criteria) this;
        }

        public Criteria andManIn(List<String> values) {
            addCriterion("man in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManNotIn(List<String> values) {
            addCriterion("man not in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManBetween(String value1, String value2) {
            addCriterion("man between", value1, value2, "man");
            return (Criteria) this;
        }

        public Criteria andManNotBetween(String value1, String value2) {
            addCriterion("man not between", value1, value2, "man");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andItempricecolIsNull() {
            addCriterion("itempricecol is null");
            return (Criteria) this;
        }

        public Criteria andItempricecolIsNotNull() {
            addCriterion("itempricecol is not null");
            return (Criteria) this;
        }

        public Criteria andItempricecolEqualTo(String value) {
            addCriterion("itempricecol =", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolNotEqualTo(String value) {
            addCriterion("itempricecol <>", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolGreaterThan(String value) {
            addCriterion("itempricecol >", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolGreaterThanOrEqualTo(String value) {
            addCriterion("itempricecol >=", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolLessThan(String value) {
            addCriterion("itempricecol <", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolLessThanOrEqualTo(String value) {
            addCriterion("itempricecol <=", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolLike(String value) {
            addCriterion("itempricecol like", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolNotLike(String value) {
            addCriterion("itempricecol not like", value, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolIn(List<String> values) {
            addCriterion("itempricecol in", values, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolNotIn(List<String> values) {
            addCriterion("itempricecol not in", values, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolBetween(String value1, String value2) {
            addCriterion("itempricecol between", value1, value2, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andItempricecolNotBetween(String value1, String value2) {
            addCriterion("itempricecol not between", value1, value2, "itempricecol");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andChelpIsNull() {
            addCriterion("chelp is null");
            return (Criteria) this;
        }

        public Criteria andChelpIsNotNull() {
            addCriterion("chelp is not null");
            return (Criteria) this;
        }

        public Criteria andChelpEqualTo(String value) {
            addCriterion("chelp =", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpNotEqualTo(String value) {
            addCriterion("chelp <>", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpGreaterThan(String value) {
            addCriterion("chelp >", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpGreaterThanOrEqualTo(String value) {
            addCriterion("chelp >=", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpLessThan(String value) {
            addCriterion("chelp <", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpLessThanOrEqualTo(String value) {
            addCriterion("chelp <=", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpLike(String value) {
            addCriterion("chelp like", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpNotLike(String value) {
            addCriterion("chelp not like", value, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpIn(List<String> values) {
            addCriterion("chelp in", values, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpNotIn(List<String> values) {
            addCriterion("chelp not in", values, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpBetween(String value1, String value2) {
            addCriterion("chelp between", value1, value2, "chelp");
            return (Criteria) this;
        }

        public Criteria andChelpNotBetween(String value1, String value2) {
            addCriterion("chelp not between", value1, value2, "chelp");
            return (Criteria) this;
        }

        public Criteria andOrgmarkIsNull() {
            addCriterion("orgmark is null");
            return (Criteria) this;
        }

        public Criteria andOrgmarkIsNotNull() {
            addCriterion("orgmark is not null");
            return (Criteria) this;
        }

        public Criteria andOrgmarkEqualTo(String value) {
            addCriterion("orgmark =", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkNotEqualTo(String value) {
            addCriterion("orgmark <>", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkGreaterThan(String value) {
            addCriterion("orgmark >", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkGreaterThanOrEqualTo(String value) {
            addCriterion("orgmark >=", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkLessThan(String value) {
            addCriterion("orgmark <", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkLessThanOrEqualTo(String value) {
            addCriterion("orgmark <=", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkLike(String value) {
            addCriterion("orgmark like", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkNotLike(String value) {
            addCriterion("orgmark not like", value, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkIn(List<String> values) {
            addCriterion("orgmark in", values, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkNotIn(List<String> values) {
            addCriterion("orgmark not in", values, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkBetween(String value1, String value2) {
            addCriterion("orgmark between", value1, value2, "orgmark");
            return (Criteria) this;
        }

        public Criteria andOrgmarkNotBetween(String value1, String value2) {
            addCriterion("orgmark not between", value1, value2, "orgmark");
            return (Criteria) this;
        }

        public Criteria andPordersizeIsNull() {
            addCriterion("pordersize is null");
            return (Criteria) this;
        }

        public Criteria andPordersizeIsNotNull() {
            addCriterion("pordersize is not null");
            return (Criteria) this;
        }

        public Criteria andPordersizeEqualTo(Double value) {
            addCriterion("pordersize =", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeNotEqualTo(Double value) {
            addCriterion("pordersize <>", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeGreaterThan(Double value) {
            addCriterion("pordersize >", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeGreaterThanOrEqualTo(Double value) {
            addCriterion("pordersize >=", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeLessThan(Double value) {
            addCriterion("pordersize <", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeLessThanOrEqualTo(Double value) {
            addCriterion("pordersize <=", value, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeIn(List<Double> values) {
            addCriterion("pordersize in", values, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeNotIn(List<Double> values) {
            addCriterion("pordersize not in", values, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeBetween(Double value1, Double value2) {
            addCriterion("pordersize between", value1, value2, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPordersizeNotBetween(Double value1, Double value2) {
            addCriterion("pordersize not between", value1, value2, "pordersize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeIsNull() {
            addCriterion("psalesize is null");
            return (Criteria) this;
        }

        public Criteria andPsalesizeIsNotNull() {
            addCriterion("psalesize is not null");
            return (Criteria) this;
        }

        public Criteria andPsalesizeEqualTo(Double value) {
            addCriterion("psalesize =", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeNotEqualTo(Double value) {
            addCriterion("psalesize <>", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeGreaterThan(Double value) {
            addCriterion("psalesize >", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("psalesize >=", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeLessThan(Double value) {
            addCriterion("psalesize <", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeLessThanOrEqualTo(Double value) {
            addCriterion("psalesize <=", value, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeIn(List<Double> values) {
            addCriterion("psalesize in", values, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeNotIn(List<Double> values) {
            addCriterion("psalesize not in", values, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeBetween(Double value1, Double value2) {
            addCriterion("psalesize between", value1, value2, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPsalesizeNotBetween(Double value1, Double value2) {
            addCriterion("psalesize not between", value1, value2, "psalesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeIsNull() {
            addCriterion("ppurchasesize is null");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeIsNotNull() {
            addCriterion("ppurchasesize is not null");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeEqualTo(Double value) {
            addCriterion("ppurchasesize =", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeNotEqualTo(Double value) {
            addCriterion("ppurchasesize <>", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeGreaterThan(Double value) {
            addCriterion("ppurchasesize >", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("ppurchasesize >=", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeLessThan(Double value) {
            addCriterion("ppurchasesize <", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeLessThanOrEqualTo(Double value) {
            addCriterion("ppurchasesize <=", value, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeIn(List<Double> values) {
            addCriterion("ppurchasesize in", values, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeNotIn(List<Double> values) {
            addCriterion("ppurchasesize not in", values, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeBetween(Double value1, Double value2) {
            addCriterion("ppurchasesize between", value1, value2, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPpurchasesizeNotBetween(Double value1, Double value2) {
            addCriterion("ppurchasesize not between", value1, value2, "ppurchasesize");
            return (Criteria) this;
        }

        public Criteria andPaytypeokIsNull() {
            addCriterion("paytypeok is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeokIsNotNull() {
            addCriterion("paytypeok is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeokEqualTo(String value) {
            addCriterion("paytypeok =", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokNotEqualTo(String value) {
            addCriterion("paytypeok <>", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokGreaterThan(String value) {
            addCriterion("paytypeok >", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokGreaterThanOrEqualTo(String value) {
            addCriterion("paytypeok >=", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokLessThan(String value) {
            addCriterion("paytypeok <", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokLessThanOrEqualTo(String value) {
            addCriterion("paytypeok <=", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokLike(String value) {
            addCriterion("paytypeok like", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokNotLike(String value) {
            addCriterion("paytypeok not like", value, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokIn(List<String> values) {
            addCriterion("paytypeok in", values, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokNotIn(List<String> values) {
            addCriterion("paytypeok not in", values, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokBetween(String value1, String value2) {
            addCriterion("paytypeok between", value1, value2, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andPaytypeokNotBetween(String value1, String value2) {
            addCriterion("paytypeok not between", value1, value2, "paytypeok");
            return (Criteria) this;
        }

        public Criteria andItemokIsNull() {
            addCriterion("itemok is null");
            return (Criteria) this;
        }

        public Criteria andItemokIsNotNull() {
            addCriterion("itemok is not null");
            return (Criteria) this;
        }

        public Criteria andItemokEqualTo(String value) {
            addCriterion("itemok =", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokNotEqualTo(String value) {
            addCriterion("itemok <>", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokGreaterThan(String value) {
            addCriterion("itemok >", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokGreaterThanOrEqualTo(String value) {
            addCriterion("itemok >=", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokLessThan(String value) {
            addCriterion("itemok <", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokLessThanOrEqualTo(String value) {
            addCriterion("itemok <=", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokLike(String value) {
            addCriterion("itemok like", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokNotLike(String value) {
            addCriterion("itemok not like", value, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokIn(List<String> values) {
            addCriterion("itemok in", values, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokNotIn(List<String> values) {
            addCriterion("itemok not in", values, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokBetween(String value1, String value2) {
            addCriterion("itemok between", value1, value2, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemokNotBetween(String value1, String value2) {
            addCriterion("itemok not between", value1, value2, "itemok");
            return (Criteria) this;
        }

        public Criteria andItemdescokIsNull() {
            addCriterion("itemdescok is null");
            return (Criteria) this;
        }

        public Criteria andItemdescokIsNotNull() {
            addCriterion("itemdescok is not null");
            return (Criteria) this;
        }

        public Criteria andItemdescokEqualTo(String value) {
            addCriterion("itemdescok =", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokNotEqualTo(String value) {
            addCriterion("itemdescok <>", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokGreaterThan(String value) {
            addCriterion("itemdescok >", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokGreaterThanOrEqualTo(String value) {
            addCriterion("itemdescok >=", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokLessThan(String value) {
            addCriterion("itemdescok <", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokLessThanOrEqualTo(String value) {
            addCriterion("itemdescok <=", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokLike(String value) {
            addCriterion("itemdescok like", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokNotLike(String value) {
            addCriterion("itemdescok not like", value, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokIn(List<String> values) {
            addCriterion("itemdescok in", values, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokNotIn(List<String> values) {
            addCriterion("itemdescok not in", values, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokBetween(String value1, String value2) {
            addCriterion("itemdescok between", value1, value2, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andItemdescokNotBetween(String value1, String value2) {
            addCriterion("itemdescok not between", value1, value2, "itemdescok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokIsNull() {
            addCriterion("saleprocok is null");
            return (Criteria) this;
        }

        public Criteria andSaleprocokIsNotNull() {
            addCriterion("saleprocok is not null");
            return (Criteria) this;
        }

        public Criteria andSaleprocokEqualTo(String value) {
            addCriterion("saleprocok =", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokNotEqualTo(String value) {
            addCriterion("saleprocok <>", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokGreaterThan(String value) {
            addCriterion("saleprocok >", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokGreaterThanOrEqualTo(String value) {
            addCriterion("saleprocok >=", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokLessThan(String value) {
            addCriterion("saleprocok <", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokLessThanOrEqualTo(String value) {
            addCriterion("saleprocok <=", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokLike(String value) {
            addCriterion("saleprocok like", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokNotLike(String value) {
            addCriterion("saleprocok not like", value, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokIn(List<String> values) {
            addCriterion("saleprocok in", values, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokNotIn(List<String> values) {
            addCriterion("saleprocok not in", values, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokBetween(String value1, String value2) {
            addCriterion("saleprocok between", value1, value2, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSaleprocokNotBetween(String value1, String value2) {
            addCriterion("saleprocok not between", value1, value2, "saleprocok");
            return (Criteria) this;
        }

        public Criteria andSmokIsNull() {
            addCriterion("smok is null");
            return (Criteria) this;
        }

        public Criteria andSmokIsNotNull() {
            addCriterion("smok is not null");
            return (Criteria) this;
        }

        public Criteria andSmokEqualTo(String value) {
            addCriterion("smok =", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokNotEqualTo(String value) {
            addCriterion("smok <>", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokGreaterThan(String value) {
            addCriterion("smok >", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokGreaterThanOrEqualTo(String value) {
            addCriterion("smok >=", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokLessThan(String value) {
            addCriterion("smok <", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokLessThanOrEqualTo(String value) {
            addCriterion("smok <=", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokLike(String value) {
            addCriterion("smok like", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokNotLike(String value) {
            addCriterion("smok not like", value, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokIn(List<String> values) {
            addCriterion("smok in", values, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokNotIn(List<String> values) {
            addCriterion("smok not in", values, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokBetween(String value1, String value2) {
            addCriterion("smok between", value1, value2, "smok");
            return (Criteria) this;
        }

        public Criteria andSmokNotBetween(String value1, String value2) {
            addCriterion("smok not between", value1, value2, "smok");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeIsNull() {
            addCriterion("eip_databasetype is null");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeIsNotNull() {
            addCriterion("eip_databasetype is not null");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeEqualTo(String value) {
            addCriterion("eip_databasetype =", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeNotEqualTo(String value) {
            addCriterion("eip_databasetype <>", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeGreaterThan(String value) {
            addCriterion("eip_databasetype >", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("eip_databasetype >=", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeLessThan(String value) {
            addCriterion("eip_databasetype <", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeLessThanOrEqualTo(String value) {
            addCriterion("eip_databasetype <=", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeLike(String value) {
            addCriterion("eip_databasetype like", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeNotLike(String value) {
            addCriterion("eip_databasetype not like", value, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeIn(List<String> values) {
            addCriterion("eip_databasetype in", values, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeNotIn(List<String> values) {
            addCriterion("eip_databasetype not in", values, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeBetween(String value1, String value2) {
            addCriterion("eip_databasetype between", value1, value2, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipDatabasetypeNotBetween(String value1, String value2) {
            addCriterion("eip_databasetype not between", value1, value2, "eipDatabasetype");
            return (Criteria) this;
        }

        public Criteria andEipServer1IsNull() {
            addCriterion("eip_server1 is null");
            return (Criteria) this;
        }

        public Criteria andEipServer1IsNotNull() {
            addCriterion("eip_server1 is not null");
            return (Criteria) this;
        }

        public Criteria andEipServer1EqualTo(String value) {
            addCriterion("eip_server1 =", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1NotEqualTo(String value) {
            addCriterion("eip_server1 <>", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1GreaterThan(String value) {
            addCriterion("eip_server1 >", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1GreaterThanOrEqualTo(String value) {
            addCriterion("eip_server1 >=", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1LessThan(String value) {
            addCriterion("eip_server1 <", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1LessThanOrEqualTo(String value) {
            addCriterion("eip_server1 <=", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1Like(String value) {
            addCriterion("eip_server1 like", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1NotLike(String value) {
            addCriterion("eip_server1 not like", value, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1In(List<String> values) {
            addCriterion("eip_server1 in", values, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1NotIn(List<String> values) {
            addCriterion("eip_server1 not in", values, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1Between(String value1, String value2) {
            addCriterion("eip_server1 between", value1, value2, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipServer1NotBetween(String value1, String value2) {
            addCriterion("eip_server1 not between", value1, value2, "eipServer1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1IsNull() {
            addCriterion("eip_username1 is null");
            return (Criteria) this;
        }

        public Criteria andEipUsername1IsNotNull() {
            addCriterion("eip_username1 is not null");
            return (Criteria) this;
        }

        public Criteria andEipUsername1EqualTo(String value) {
            addCriterion("eip_username1 =", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1NotEqualTo(String value) {
            addCriterion("eip_username1 <>", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1GreaterThan(String value) {
            addCriterion("eip_username1 >", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1GreaterThanOrEqualTo(String value) {
            addCriterion("eip_username1 >=", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1LessThan(String value) {
            addCriterion("eip_username1 <", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1LessThanOrEqualTo(String value) {
            addCriterion("eip_username1 <=", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1Like(String value) {
            addCriterion("eip_username1 like", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1NotLike(String value) {
            addCriterion("eip_username1 not like", value, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1In(List<String> values) {
            addCriterion("eip_username1 in", values, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1NotIn(List<String> values) {
            addCriterion("eip_username1 not in", values, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1Between(String value1, String value2) {
            addCriterion("eip_username1 between", value1, value2, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipUsername1NotBetween(String value1, String value2) {
            addCriterion("eip_username1 not between", value1, value2, "eipUsername1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1IsNull() {
            addCriterion("eip_pwd1 is null");
            return (Criteria) this;
        }

        public Criteria andEipPwd1IsNotNull() {
            addCriterion("eip_pwd1 is not null");
            return (Criteria) this;
        }

        public Criteria andEipPwd1EqualTo(String value) {
            addCriterion("eip_pwd1 =", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1NotEqualTo(String value) {
            addCriterion("eip_pwd1 <>", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1GreaterThan(String value) {
            addCriterion("eip_pwd1 >", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1GreaterThanOrEqualTo(String value) {
            addCriterion("eip_pwd1 >=", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1LessThan(String value) {
            addCriterion("eip_pwd1 <", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1LessThanOrEqualTo(String value) {
            addCriterion("eip_pwd1 <=", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1Like(String value) {
            addCriterion("eip_pwd1 like", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1NotLike(String value) {
            addCriterion("eip_pwd1 not like", value, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1In(List<String> values) {
            addCriterion("eip_pwd1 in", values, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1NotIn(List<String> values) {
            addCriterion("eip_pwd1 not in", values, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1Between(String value1, String value2) {
            addCriterion("eip_pwd1 between", value1, value2, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipPwd1NotBetween(String value1, String value2) {
            addCriterion("eip_pwd1 not between", value1, value2, "eipPwd1");
            return (Criteria) this;
        }

        public Criteria andEipMastcolIsNull() {
            addCriterion("eip_mastcol is null");
            return (Criteria) this;
        }

        public Criteria andEipMastcolIsNotNull() {
            addCriterion("eip_mastcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipMastcolEqualTo(String value) {
            addCriterion("eip_mastcol =", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolNotEqualTo(String value) {
            addCriterion("eip_mastcol <>", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolGreaterThan(String value) {
            addCriterion("eip_mastcol >", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_mastcol >=", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolLessThan(String value) {
            addCriterion("eip_mastcol <", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolLessThanOrEqualTo(String value) {
            addCriterion("eip_mastcol <=", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolLike(String value) {
            addCriterion("eip_mastcol like", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolNotLike(String value) {
            addCriterion("eip_mastcol not like", value, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolIn(List<String> values) {
            addCriterion("eip_mastcol in", values, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolNotIn(List<String> values) {
            addCriterion("eip_mastcol not in", values, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolBetween(String value1, String value2) {
            addCriterion("eip_mastcol between", value1, value2, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipMastcolNotBetween(String value1, String value2) {
            addCriterion("eip_mastcol not between", value1, value2, "eipMastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolIsNull() {
            addCriterion("eip_lastcol is null");
            return (Criteria) this;
        }

        public Criteria andEipLastcolIsNotNull() {
            addCriterion("eip_lastcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipLastcolEqualTo(String value) {
            addCriterion("eip_lastcol =", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolNotEqualTo(String value) {
            addCriterion("eip_lastcol <>", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolGreaterThan(String value) {
            addCriterion("eip_lastcol >", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_lastcol >=", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolLessThan(String value) {
            addCriterion("eip_lastcol <", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolLessThanOrEqualTo(String value) {
            addCriterion("eip_lastcol <=", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolLike(String value) {
            addCriterion("eip_lastcol like", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolNotLike(String value) {
            addCriterion("eip_lastcol not like", value, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolIn(List<String> values) {
            addCriterion("eip_lastcol in", values, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolNotIn(List<String> values) {
            addCriterion("eip_lastcol not in", values, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolBetween(String value1, String value2) {
            addCriterion("eip_lastcol between", value1, value2, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipLastcolNotBetween(String value1, String value2) {
            addCriterion("eip_lastcol not between", value1, value2, "eipLastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolIsNull() {
            addCriterion("eip_itemidcol is null");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolIsNotNull() {
            addCriterion("eip_itemidcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolEqualTo(String value) {
            addCriterion("eip_itemidcol =", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolNotEqualTo(String value) {
            addCriterion("eip_itemidcol <>", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolGreaterThan(String value) {
            addCriterion("eip_itemidcol >", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_itemidcol >=", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolLessThan(String value) {
            addCriterion("eip_itemidcol <", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolLessThanOrEqualTo(String value) {
            addCriterion("eip_itemidcol <=", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolLike(String value) {
            addCriterion("eip_itemidcol like", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolNotLike(String value) {
            addCriterion("eip_itemidcol not like", value, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolIn(List<String> values) {
            addCriterion("eip_itemidcol in", values, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolNotIn(List<String> values) {
            addCriterion("eip_itemidcol not in", values, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolBetween(String value1, String value2) {
            addCriterion("eip_itemidcol between", value1, value2, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemidcolNotBetween(String value1, String value2) {
            addCriterion("eip_itemidcol not between", value1, value2, "eipItemidcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolIsNull() {
            addCriterion("eip_itemlastcol is null");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolIsNotNull() {
            addCriterion("eip_itemlastcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolEqualTo(String value) {
            addCriterion("eip_itemlastcol =", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolNotEqualTo(String value) {
            addCriterion("eip_itemlastcol <>", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolGreaterThan(String value) {
            addCriterion("eip_itemlastcol >", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_itemlastcol >=", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolLessThan(String value) {
            addCriterion("eip_itemlastcol <", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolLessThanOrEqualTo(String value) {
            addCriterion("eip_itemlastcol <=", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolLike(String value) {
            addCriterion("eip_itemlastcol like", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolNotLike(String value) {
            addCriterion("eip_itemlastcol not like", value, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolIn(List<String> values) {
            addCriterion("eip_itemlastcol in", values, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolNotIn(List<String> values) {
            addCriterion("eip_itemlastcol not in", values, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolBetween(String value1, String value2) {
            addCriterion("eip_itemlastcol between", value1, value2, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastcolNotBetween(String value1, String value2) {
            addCriterion("eip_itemlastcol not between", value1, value2, "eipItemlastcol");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueIsNull() {
            addCriterion("eip_itemlastvalue is null");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueIsNotNull() {
            addCriterion("eip_itemlastvalue is not null");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueEqualTo(String value) {
            addCriterion("eip_itemlastvalue =", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueNotEqualTo(String value) {
            addCriterion("eip_itemlastvalue <>", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueGreaterThan(String value) {
            addCriterion("eip_itemlastvalue >", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueGreaterThanOrEqualTo(String value) {
            addCriterion("eip_itemlastvalue >=", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueLessThan(String value) {
            addCriterion("eip_itemlastvalue <", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueLessThanOrEqualTo(String value) {
            addCriterion("eip_itemlastvalue <=", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueLike(String value) {
            addCriterion("eip_itemlastvalue like", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueNotLike(String value) {
            addCriterion("eip_itemlastvalue not like", value, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueIn(List<String> values) {
            addCriterion("eip_itemlastvalue in", values, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueNotIn(List<String> values) {
            addCriterion("eip_itemlastvalue not in", values, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueBetween(String value1, String value2) {
            addCriterion("eip_itemlastvalue between", value1, value2, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipItemlastvalueNotBetween(String value1, String value2) {
            addCriterion("eip_itemlastvalue not between", value1, value2, "eipItemlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolIsNull() {
            addCriterion("eip_stockidcol is null");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolIsNotNull() {
            addCriterion("eip_stockidcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolEqualTo(String value) {
            addCriterion("eip_stockidcol =", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolNotEqualTo(String value) {
            addCriterion("eip_stockidcol <>", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolGreaterThan(String value) {
            addCriterion("eip_stockidcol >", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_stockidcol >=", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolLessThan(String value) {
            addCriterion("eip_stockidcol <", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolLessThanOrEqualTo(String value) {
            addCriterion("eip_stockidcol <=", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolLike(String value) {
            addCriterion("eip_stockidcol like", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolNotLike(String value) {
            addCriterion("eip_stockidcol not like", value, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolIn(List<String> values) {
            addCriterion("eip_stockidcol in", values, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolNotIn(List<String> values) {
            addCriterion("eip_stockidcol not in", values, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolBetween(String value1, String value2) {
            addCriterion("eip_stockidcol between", value1, value2, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipStockidcolNotBetween(String value1, String value2) {
            addCriterion("eip_stockidcol not between", value1, value2, "eipStockidcol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolIsNull() {
            addCriterion("eip_vendornamecol is null");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolIsNotNull() {
            addCriterion("eip_vendornamecol is not null");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolEqualTo(String value) {
            addCriterion("eip_vendornamecol =", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolNotEqualTo(String value) {
            addCriterion("eip_vendornamecol <>", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolGreaterThan(String value) {
            addCriterion("eip_vendornamecol >", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_vendornamecol >=", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolLessThan(String value) {
            addCriterion("eip_vendornamecol <", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolLessThanOrEqualTo(String value) {
            addCriterion("eip_vendornamecol <=", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolLike(String value) {
            addCriterion("eip_vendornamecol like", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolNotLike(String value) {
            addCriterion("eip_vendornamecol not like", value, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolIn(List<String> values) {
            addCriterion("eip_vendornamecol in", values, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolNotIn(List<String> values) {
            addCriterion("eip_vendornamecol not in", values, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolBetween(String value1, String value2) {
            addCriterion("eip_vendornamecol between", value1, value2, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipVendornamecolNotBetween(String value1, String value2) {
            addCriterion("eip_vendornamecol not between", value1, value2, "eipVendornamecol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolIsNull() {
            addCriterion("eip_billidcol is null");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolIsNotNull() {
            addCriterion("eip_billidcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolEqualTo(String value) {
            addCriterion("eip_billidcol =", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolNotEqualTo(String value) {
            addCriterion("eip_billidcol <>", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolGreaterThan(String value) {
            addCriterion("eip_billidcol >", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_billidcol >=", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolLessThan(String value) {
            addCriterion("eip_billidcol <", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolLessThanOrEqualTo(String value) {
            addCriterion("eip_billidcol <=", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolLike(String value) {
            addCriterion("eip_billidcol like", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolNotLike(String value) {
            addCriterion("eip_billidcol not like", value, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolIn(List<String> values) {
            addCriterion("eip_billidcol in", values, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolNotIn(List<String> values) {
            addCriterion("eip_billidcol not in", values, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolBetween(String value1, String value2) {
            addCriterion("eip_billidcol between", value1, value2, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillidcolNotBetween(String value1, String value2) {
            addCriterion("eip_billidcol not between", value1, value2, "eipBillidcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolIsNull() {
            addCriterion("eip_billmastcol is null");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolIsNotNull() {
            addCriterion("eip_billmastcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolEqualTo(String value) {
            addCriterion("eip_billmastcol =", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolNotEqualTo(String value) {
            addCriterion("eip_billmastcol <>", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolGreaterThan(String value) {
            addCriterion("eip_billmastcol >", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_billmastcol >=", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolLessThan(String value) {
            addCriterion("eip_billmastcol <", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolLessThanOrEqualTo(String value) {
            addCriterion("eip_billmastcol <=", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolLike(String value) {
            addCriterion("eip_billmastcol like", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolNotLike(String value) {
            addCriterion("eip_billmastcol not like", value, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolIn(List<String> values) {
            addCriterion("eip_billmastcol in", values, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolNotIn(List<String> values) {
            addCriterion("eip_billmastcol not in", values, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolBetween(String value1, String value2) {
            addCriterion("eip_billmastcol between", value1, value2, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipBillmastcolNotBetween(String value1, String value2) {
            addCriterion("eip_billmastcol not between", value1, value2, "eipBillmastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolIsNull() {
            addCriterion("eip_custidcol is null");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolIsNotNull() {
            addCriterion("eip_custidcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolEqualTo(String value) {
            addCriterion("eip_custidcol =", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolNotEqualTo(String value) {
            addCriterion("eip_custidcol <>", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolGreaterThan(String value) {
            addCriterion("eip_custidcol >", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_custidcol >=", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolLessThan(String value) {
            addCriterion("eip_custidcol <", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolLessThanOrEqualTo(String value) {
            addCriterion("eip_custidcol <=", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolLike(String value) {
            addCriterion("eip_custidcol like", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolNotLike(String value) {
            addCriterion("eip_custidcol not like", value, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolIn(List<String> values) {
            addCriterion("eip_custidcol in", values, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolNotIn(List<String> values) {
            addCriterion("eip_custidcol not in", values, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolBetween(String value1, String value2) {
            addCriterion("eip_custidcol between", value1, value2, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustidcolNotBetween(String value1, String value2) {
            addCriterion("eip_custidcol not between", value1, value2, "eipCustidcol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolIsNull() {
            addCriterion("eip_custnamecol is null");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolIsNotNull() {
            addCriterion("eip_custnamecol is not null");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolEqualTo(String value) {
            addCriterion("eip_custnamecol =", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolNotEqualTo(String value) {
            addCriterion("eip_custnamecol <>", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolGreaterThan(String value) {
            addCriterion("eip_custnamecol >", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_custnamecol >=", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolLessThan(String value) {
            addCriterion("eip_custnamecol <", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolLessThanOrEqualTo(String value) {
            addCriterion("eip_custnamecol <=", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolLike(String value) {
            addCriterion("eip_custnamecol like", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolNotLike(String value) {
            addCriterion("eip_custnamecol not like", value, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolIn(List<String> values) {
            addCriterion("eip_custnamecol in", values, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolNotIn(List<String> values) {
            addCriterion("eip_custnamecol not in", values, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolBetween(String value1, String value2) {
            addCriterion("eip_custnamecol between", value1, value2, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustnamecolNotBetween(String value1, String value2) {
            addCriterion("eip_custnamecol not between", value1, value2, "eipCustnamecol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolIsNull() {
            addCriterion("eip_custdeptcol is null");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolIsNotNull() {
            addCriterion("eip_custdeptcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolEqualTo(String value) {
            addCriterion("eip_custdeptcol =", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolNotEqualTo(String value) {
            addCriterion("eip_custdeptcol <>", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolGreaterThan(String value) {
            addCriterion("eip_custdeptcol >", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_custdeptcol >=", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolLessThan(String value) {
            addCriterion("eip_custdeptcol <", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolLessThanOrEqualTo(String value) {
            addCriterion("eip_custdeptcol <=", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolLike(String value) {
            addCriterion("eip_custdeptcol like", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolNotLike(String value) {
            addCriterion("eip_custdeptcol not like", value, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolIn(List<String> values) {
            addCriterion("eip_custdeptcol in", values, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolNotIn(List<String> values) {
            addCriterion("eip_custdeptcol not in", values, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolBetween(String value1, String value2) {
            addCriterion("eip_custdeptcol between", value1, value2, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustdeptcolNotBetween(String value1, String value2) {
            addCriterion("eip_custdeptcol not between", value1, value2, "eipCustdeptcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolIsNull() {
            addCriterion("eip_custlastcol is null");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolIsNotNull() {
            addCriterion("eip_custlastcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolEqualTo(String value) {
            addCriterion("eip_custlastcol =", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolNotEqualTo(String value) {
            addCriterion("eip_custlastcol <>", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolGreaterThan(String value) {
            addCriterion("eip_custlastcol >", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_custlastcol >=", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolLessThan(String value) {
            addCriterion("eip_custlastcol <", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolLessThanOrEqualTo(String value) {
            addCriterion("eip_custlastcol <=", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolLike(String value) {
            addCriterion("eip_custlastcol like", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolNotLike(String value) {
            addCriterion("eip_custlastcol not like", value, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolIn(List<String> values) {
            addCriterion("eip_custlastcol in", values, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolNotIn(List<String> values) {
            addCriterion("eip_custlastcol not in", values, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolBetween(String value1, String value2) {
            addCriterion("eip_custlastcol between", value1, value2, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastcolNotBetween(String value1, String value2) {
            addCriterion("eip_custlastcol not between", value1, value2, "eipCustlastcol");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueIsNull() {
            addCriterion("eip_custlastvalue is null");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueIsNotNull() {
            addCriterion("eip_custlastvalue is not null");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueEqualTo(String value) {
            addCriterion("eip_custlastvalue =", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueNotEqualTo(String value) {
            addCriterion("eip_custlastvalue <>", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueGreaterThan(String value) {
            addCriterion("eip_custlastvalue >", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueGreaterThanOrEqualTo(String value) {
            addCriterion("eip_custlastvalue >=", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueLessThan(String value) {
            addCriterion("eip_custlastvalue <", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueLessThanOrEqualTo(String value) {
            addCriterion("eip_custlastvalue <=", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueLike(String value) {
            addCriterion("eip_custlastvalue like", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueNotLike(String value) {
            addCriterion("eip_custlastvalue not like", value, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueIn(List<String> values) {
            addCriterion("eip_custlastvalue in", values, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueNotIn(List<String> values) {
            addCriterion("eip_custlastvalue not in", values, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueBetween(String value1, String value2) {
            addCriterion("eip_custlastvalue between", value1, value2, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipCustlastvalueNotBetween(String value1, String value2) {
            addCriterion("eip_custlastvalue not between", value1, value2, "eipCustlastvalue");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolIsNull() {
            addCriterion("eip_vendoridcol is null");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolIsNotNull() {
            addCriterion("eip_vendoridcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolEqualTo(String value) {
            addCriterion("eip_vendoridcol =", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolNotEqualTo(String value) {
            addCriterion("eip_vendoridcol <>", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolGreaterThan(String value) {
            addCriterion("eip_vendoridcol >", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_vendoridcol >=", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolLessThan(String value) {
            addCriterion("eip_vendoridcol <", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolLessThanOrEqualTo(String value) {
            addCriterion("eip_vendoridcol <=", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolLike(String value) {
            addCriterion("eip_vendoridcol like", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolNotLike(String value) {
            addCriterion("eip_vendoridcol not like", value, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolIn(List<String> values) {
            addCriterion("eip_vendoridcol in", values, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolNotIn(List<String> values) {
            addCriterion("eip_vendoridcol not in", values, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolBetween(String value1, String value2) {
            addCriterion("eip_vendoridcol between", value1, value2, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipVendoridcolNotBetween(String value1, String value2) {
            addCriterion("eip_vendoridcol not between", value1, value2, "eipVendoridcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolIsNull() {
            addCriterion("eip_billvendorcol is null");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolIsNotNull() {
            addCriterion("eip_billvendorcol is not null");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolEqualTo(String value) {
            addCriterion("eip_billvendorcol =", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolNotEqualTo(String value) {
            addCriterion("eip_billvendorcol <>", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolGreaterThan(String value) {
            addCriterion("eip_billvendorcol >", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolGreaterThanOrEqualTo(String value) {
            addCriterion("eip_billvendorcol >=", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolLessThan(String value) {
            addCriterion("eip_billvendorcol <", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolLessThanOrEqualTo(String value) {
            addCriterion("eip_billvendorcol <=", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolLike(String value) {
            addCriterion("eip_billvendorcol like", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolNotLike(String value) {
            addCriterion("eip_billvendorcol not like", value, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolIn(List<String> values) {
            addCriterion("eip_billvendorcol in", values, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolNotIn(List<String> values) {
            addCriterion("eip_billvendorcol not in", values, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolBetween(String value1, String value2) {
            addCriterion("eip_billvendorcol between", value1, value2, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipBillvendorcolNotBetween(String value1, String value2) {
            addCriterion("eip_billvendorcol not between", value1, value2, "eipBillvendorcol");
            return (Criteria) this;
        }

        public Criteria andEipLastsendIsNull() {
            addCriterion("eip_lastsend is null");
            return (Criteria) this;
        }

        public Criteria andEipLastsendIsNotNull() {
            addCriterion("eip_lastsend is not null");
            return (Criteria) this;
        }

        public Criteria andEipLastsendEqualTo(String value) {
            addCriterion("eip_lastsend =", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendNotEqualTo(String value) {
            addCriterion("eip_lastsend <>", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendGreaterThan(String value) {
            addCriterion("eip_lastsend >", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendGreaterThanOrEqualTo(String value) {
            addCriterion("eip_lastsend >=", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendLessThan(String value) {
            addCriterion("eip_lastsend <", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendLessThanOrEqualTo(String value) {
            addCriterion("eip_lastsend <=", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendLike(String value) {
            addCriterion("eip_lastsend like", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendNotLike(String value) {
            addCriterion("eip_lastsend not like", value, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendIn(List<String> values) {
            addCriterion("eip_lastsend in", values, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendNotIn(List<String> values) {
            addCriterion("eip_lastsend not in", values, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendBetween(String value1, String value2) {
            addCriterion("eip_lastsend between", value1, value2, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastsendNotBetween(String value1, String value2) {
            addCriterion("eip_lastsend not between", value1, value2, "eipLastsend");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillIsNull() {
            addCriterion("eip_lastgetbill is null");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillIsNotNull() {
            addCriterion("eip_lastgetbill is not null");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillEqualTo(String value) {
            addCriterion("eip_lastgetbill =", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillNotEqualTo(String value) {
            addCriterion("eip_lastgetbill <>", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillGreaterThan(String value) {
            addCriterion("eip_lastgetbill >", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillGreaterThanOrEqualTo(String value) {
            addCriterion("eip_lastgetbill >=", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillLessThan(String value) {
            addCriterion("eip_lastgetbill <", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillLessThanOrEqualTo(String value) {
            addCriterion("eip_lastgetbill <=", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillLike(String value) {
            addCriterion("eip_lastgetbill like", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillNotLike(String value) {
            addCriterion("eip_lastgetbill not like", value, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillIn(List<String> values) {
            addCriterion("eip_lastgetbill in", values, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillNotIn(List<String> values) {
            addCriterion("eip_lastgetbill not in", values, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillBetween(String value1, String value2) {
            addCriterion("eip_lastgetbill between", value1, value2, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipLastgetbillNotBetween(String value1, String value2) {
            addCriterion("eip_lastgetbill not between", value1, value2, "eipLastgetbill");
            return (Criteria) this;
        }

        public Criteria andEipBillname1IsNull() {
            addCriterion("eip_billname1 is null");
            return (Criteria) this;
        }

        public Criteria andEipBillname1IsNotNull() {
            addCriterion("eip_billname1 is not null");
            return (Criteria) this;
        }

        public Criteria andEipBillname1EqualTo(String value) {
            addCriterion("eip_billname1 =", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1NotEqualTo(String value) {
            addCriterion("eip_billname1 <>", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1GreaterThan(String value) {
            addCriterion("eip_billname1 >", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1GreaterThanOrEqualTo(String value) {
            addCriterion("eip_billname1 >=", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1LessThan(String value) {
            addCriterion("eip_billname1 <", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1LessThanOrEqualTo(String value) {
            addCriterion("eip_billname1 <=", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1Like(String value) {
            addCriterion("eip_billname1 like", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1NotLike(String value) {
            addCriterion("eip_billname1 not like", value, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1In(List<String> values) {
            addCriterion("eip_billname1 in", values, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1NotIn(List<String> values) {
            addCriterion("eip_billname1 not in", values, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1Between(String value1, String value2) {
            addCriterion("eip_billname1 between", value1, value2, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname1NotBetween(String value1, String value2) {
            addCriterion("eip_billname1 not between", value1, value2, "eipBillname1");
            return (Criteria) this;
        }

        public Criteria andEipBillname2IsNull() {
            addCriterion("eip_billname2 is null");
            return (Criteria) this;
        }

        public Criteria andEipBillname2IsNotNull() {
            addCriterion("eip_billname2 is not null");
            return (Criteria) this;
        }

        public Criteria andEipBillname2EqualTo(String value) {
            addCriterion("eip_billname2 =", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2NotEqualTo(String value) {
            addCriterion("eip_billname2 <>", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2GreaterThan(String value) {
            addCriterion("eip_billname2 >", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2GreaterThanOrEqualTo(String value) {
            addCriterion("eip_billname2 >=", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2LessThan(String value) {
            addCriterion("eip_billname2 <", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2LessThanOrEqualTo(String value) {
            addCriterion("eip_billname2 <=", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2Like(String value) {
            addCriterion("eip_billname2 like", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2NotLike(String value) {
            addCriterion("eip_billname2 not like", value, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2In(List<String> values) {
            addCriterion("eip_billname2 in", values, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2NotIn(List<String> values) {
            addCriterion("eip_billname2 not in", values, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2Between(String value1, String value2) {
            addCriterion("eip_billname2 between", value1, value2, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andEipBillname2NotBetween(String value1, String value2) {
            addCriterion("eip_billname2 not between", value1, value2, "eipBillname2");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkIsNull() {
            addCriterion("custpricemark is null");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkIsNotNull() {
            addCriterion("custpricemark is not null");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkEqualTo(String value) {
            addCriterion("custpricemark =", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkNotEqualTo(String value) {
            addCriterion("custpricemark <>", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkGreaterThan(String value) {
            addCriterion("custpricemark >", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkGreaterThanOrEqualTo(String value) {
            addCriterion("custpricemark >=", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkLessThan(String value) {
            addCriterion("custpricemark <", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkLessThanOrEqualTo(String value) {
            addCriterion("custpricemark <=", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkLike(String value) {
            addCriterion("custpricemark like", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkNotLike(String value) {
            addCriterion("custpricemark not like", value, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkIn(List<String> values) {
            addCriterion("custpricemark in", values, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkNotIn(List<String> values) {
            addCriterion("custpricemark not in", values, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkBetween(String value1, String value2) {
            addCriterion("custpricemark between", value1, value2, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andCustpricemarkNotBetween(String value1, String value2) {
            addCriterion("custpricemark not between", value1, value2, "custpricemark");
            return (Criteria) this;
        }

        public Criteria andHbmarkIsNull() {
            addCriterion("hbmark is null");
            return (Criteria) this;
        }

        public Criteria andHbmarkIsNotNull() {
            addCriterion("hbmark is not null");
            return (Criteria) this;
        }

        public Criteria andHbmarkEqualTo(String value) {
            addCriterion("hbmark =", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkNotEqualTo(String value) {
            addCriterion("hbmark <>", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkGreaterThan(String value) {
            addCriterion("hbmark >", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkGreaterThanOrEqualTo(String value) {
            addCriterion("hbmark >=", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkLessThan(String value) {
            addCriterion("hbmark <", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkLessThanOrEqualTo(String value) {
            addCriterion("hbmark <=", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkLike(String value) {
            addCriterion("hbmark like", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkNotLike(String value) {
            addCriterion("hbmark not like", value, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkIn(List<String> values) {
            addCriterion("hbmark in", values, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkNotIn(List<String> values) {
            addCriterion("hbmark not in", values, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkBetween(String value1, String value2) {
            addCriterion("hbmark between", value1, value2, "hbmark");
            return (Criteria) this;
        }

        public Criteria andHbmarkNotBetween(String value1, String value2) {
            addCriterion("hbmark not between", value1, value2, "hbmark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkIsNull() {
            addCriterion("custtypemark is null");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkIsNotNull() {
            addCriterion("custtypemark is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkEqualTo(String value) {
            addCriterion("custtypemark =", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkNotEqualTo(String value) {
            addCriterion("custtypemark <>", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkGreaterThan(String value) {
            addCriterion("custtypemark >", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkGreaterThanOrEqualTo(String value) {
            addCriterion("custtypemark >=", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkLessThan(String value) {
            addCriterion("custtypemark <", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkLessThanOrEqualTo(String value) {
            addCriterion("custtypemark <=", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkLike(String value) {
            addCriterion("custtypemark like", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkNotLike(String value) {
            addCriterion("custtypemark not like", value, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkIn(List<String> values) {
            addCriterion("custtypemark in", values, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkNotIn(List<String> values) {
            addCriterion("custtypemark not in", values, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkBetween(String value1, String value2) {
            addCriterion("custtypemark between", value1, value2, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andCusttypemarkNotBetween(String value1, String value2) {
            addCriterion("custtypemark not between", value1, value2, "custtypemark");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(String value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(String value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(String value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(String value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(String value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(String value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLike(String value) {
            addCriterion("created_date like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotLike(String value) {
            addCriterion("created_date not like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<String> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<String> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(String value1, String value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(String value1, String value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(String value) {
            addCriterion("updated_date =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(String value) {
            addCriterion("updated_date <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(String value) {
            addCriterion("updated_date >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(String value) {
            addCriterion("updated_date >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(String value) {
            addCriterion("updated_date <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(String value) {
            addCriterion("updated_date <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLike(String value) {
            addCriterion("updated_date like", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotLike(String value) {
            addCriterion("updated_date not like", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<String> values) {
            addCriterion("updated_date in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<String> values) {
            addCriterion("updated_date not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(String value1, String value2) {
            addCriterion("updated_date between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(String value1, String value2) {
            addCriterion("updated_date not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(String value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(String value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(String value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(String value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLike(String value) {
            addCriterion("created_time like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotLike(String value) {
            addCriterion("created_time not like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<String> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<String> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(String value1, String value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(String value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(String value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(String value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(String value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(String value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLike(String value) {
            addCriterion("updated_time like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotLike(String value) {
            addCriterion("updated_time not like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<String> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<String> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(String value1, String value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(String value1, String value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    /**
     * eos_user
     * @ibatorgenerated do_not_delete_during_merge 2015-06-13 22:49:55
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 内类部，系统内部调用1
     * @ibatorgenerated 2015-06-13 22:49:55
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