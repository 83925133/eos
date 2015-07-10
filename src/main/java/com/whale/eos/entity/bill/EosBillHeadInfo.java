package com.whale.eos.entity.bill;

import java.util.ArrayList;
import java.util.List;

public class EosBillHeadInfo {
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

    public EosBillHeadInfo() {
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

        public Criteria andOrgcodeIsNull() {
            addCriterion("orgcode is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("orgcode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("orgcode =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("orgcode <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("orgcode >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgcode >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("orgcode <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("orgcode <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("orgcode like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("orgcode not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("orgcode in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("orgcode not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("orgcode between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("orgcode not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNull() {
            addCriterion("billtype is null");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNotNull() {
            addCriterion("billtype is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypeEqualTo(String value) {
            addCriterion("billtype =", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotEqualTo(String value) {
            addCriterion("billtype <>", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThan(String value) {
            addCriterion("billtype >", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("billtype >=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThan(String value) {
            addCriterion("billtype <", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThanOrEqualTo(String value) {
            addCriterion("billtype <=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLike(String value) {
            addCriterion("billtype like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotLike(String value) {
            addCriterion("billtype not like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIn(List<String> values) {
            addCriterion("billtype in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotIn(List<String> values) {
            addCriterion("billtype not in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeBetween(String value1, String value2) {
            addCriterion("billtype between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotBetween(String value1, String value2) {
            addCriterion("billtype not between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeIsNull() {
            addCriterion("rbilltype is null");
            return (Criteria) this;
        }

        public Criteria andRbilltypeIsNotNull() {
            addCriterion("rbilltype is not null");
            return (Criteria) this;
        }

        public Criteria andRbilltypeEqualTo(String value) {
            addCriterion("rbilltype =", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeNotEqualTo(String value) {
            addCriterion("rbilltype <>", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeGreaterThan(String value) {
            addCriterion("rbilltype >", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("rbilltype >=", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeLessThan(String value) {
            addCriterion("rbilltype <", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeLessThanOrEqualTo(String value) {
            addCriterion("rbilltype <=", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeLike(String value) {
            addCriterion("rbilltype like", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeNotLike(String value) {
            addCriterion("rbilltype not like", value, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeIn(List<String> values) {
            addCriterion("rbilltype in", values, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeNotIn(List<String> values) {
            addCriterion("rbilltype not in", values, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeBetween(String value1, String value2) {
            addCriterion("rbilltype between", value1, value2, "rbilltype");
            return (Criteria) this;
        }

        public Criteria andRbilltypeNotBetween(String value1, String value2) {
            addCriterion("rbilltype not between", value1, value2, "rbilltype");
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

        public Criteria andItemtypeIsNull() {
            addCriterion("itemtype is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNotNull() {
            addCriterion("itemtype is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeEqualTo(String value) {
            addCriterion("itemtype =", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotEqualTo(String value) {
            addCriterion("itemtype <>", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThan(String value) {
            addCriterion("itemtype >", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("itemtype >=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThan(String value) {
            addCriterion("itemtype <", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThanOrEqualTo(String value) {
            addCriterion("itemtype <=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLike(String value) {
            addCriterion("itemtype like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotLike(String value) {
            addCriterion("itemtype not like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeIn(List<String> values) {
            addCriterion("itemtype in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotIn(List<String> values) {
            addCriterion("itemtype not in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeBetween(String value1, String value2) {
            addCriterion("itemtype between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotBetween(String value1, String value2) {
            addCriterion("itemtype not between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItypeIsNull() {
            addCriterion("itype is null");
            return (Criteria) this;
        }

        public Criteria andItypeIsNotNull() {
            addCriterion("itype is not null");
            return (Criteria) this;
        }

        public Criteria andItypeEqualTo(String value) {
            addCriterion("itype =", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotEqualTo(String value) {
            addCriterion("itype <>", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThan(String value) {
            addCriterion("itype >", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThanOrEqualTo(String value) {
            addCriterion("itype >=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThan(String value) {
            addCriterion("itype <", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThanOrEqualTo(String value) {
            addCriterion("itype <=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLike(String value) {
            addCriterion("itype like", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotLike(String value) {
            addCriterion("itype not like", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeIn(List<String> values) {
            addCriterion("itype in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotIn(List<String> values) {
            addCriterion("itype not in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeBetween(String value1, String value2) {
            addCriterion("itype between", value1, value2, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotBetween(String value1, String value2) {
            addCriterion("itype not between", value1, value2, "itype");
            return (Criteria) this;
        }

        public Criteria andArrivedateIsNull() {
            addCriterion("arrivedate is null");
            return (Criteria) this;
        }

        public Criteria andArrivedateIsNotNull() {
            addCriterion("arrivedate is not null");
            return (Criteria) this;
        }

        public Criteria andArrivedateEqualTo(String value) {
            addCriterion("arrivedate =", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotEqualTo(String value) {
            addCriterion("arrivedate <>", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateGreaterThan(String value) {
            addCriterion("arrivedate >", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateGreaterThanOrEqualTo(String value) {
            addCriterion("arrivedate >=", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLessThan(String value) {
            addCriterion("arrivedate <", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLessThanOrEqualTo(String value) {
            addCriterion("arrivedate <=", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLike(String value) {
            addCriterion("arrivedate like", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotLike(String value) {
            addCriterion("arrivedate not like", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateIn(List<String> values) {
            addCriterion("arrivedate in", values, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotIn(List<String> values) {
            addCriterion("arrivedate not in", values, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateBetween(String value1, String value2) {
            addCriterion("arrivedate between", value1, value2, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotBetween(String value1, String value2) {
            addCriterion("arrivedate not between", value1, value2, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arrivetime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arrivetime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(String value) {
            addCriterion("arrivetime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(String value) {
            addCriterion("arrivetime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(String value) {
            addCriterion("arrivetime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrivetime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(String value) {
            addCriterion("arrivetime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(String value) {
            addCriterion("arrivetime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLike(String value) {
            addCriterion("arrivetime like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotLike(String value) {
            addCriterion("arrivetime not like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<String> values) {
            addCriterion("arrivetime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<String> values) {
            addCriterion("arrivetime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(String value1, String value2) {
            addCriterion("arrivetime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(String value1, String value2) {
            addCriterion("arrivetime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andCustnoIsNull() {
            addCriterion("custno is null");
            return (Criteria) this;
        }

        public Criteria andCustnoIsNotNull() {
            addCriterion("custno is not null");
            return (Criteria) this;
        }

        public Criteria andCustnoEqualTo(String value) {
            addCriterion("custno =", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotEqualTo(String value) {
            addCriterion("custno <>", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThan(String value) {
            addCriterion("custno >", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThanOrEqualTo(String value) {
            addCriterion("custno >=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThan(String value) {
            addCriterion("custno <", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThanOrEqualTo(String value) {
            addCriterion("custno <=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLike(String value) {
            addCriterion("custno like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotLike(String value) {
            addCriterion("custno not like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoIn(List<String> values) {
            addCriterion("custno in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotIn(List<String> values) {
            addCriterion("custno not in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoBetween(String value1, String value2) {
            addCriterion("custno between", value1, value2, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotBetween(String value1, String value2) {
            addCriterion("custno not between", value1, value2, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("custname is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("custname is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("custname =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("custname <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("custname >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("custname >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("custname <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("custname <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("custname like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("custname not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("custname in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("custname not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("custname between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("custname not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameIsNull() {
            addCriterion("custshortname is null");
            return (Criteria) this;
        }

        public Criteria andCustshortnameIsNotNull() {
            addCriterion("custshortname is not null");
            return (Criteria) this;
        }

        public Criteria andCustshortnameEqualTo(String value) {
            addCriterion("custshortname =", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameNotEqualTo(String value) {
            addCriterion("custshortname <>", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameGreaterThan(String value) {
            addCriterion("custshortname >", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("custshortname >=", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameLessThan(String value) {
            addCriterion("custshortname <", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameLessThanOrEqualTo(String value) {
            addCriterion("custshortname <=", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameLike(String value) {
            addCriterion("custshortname like", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameNotLike(String value) {
            addCriterion("custshortname not like", value, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameIn(List<String> values) {
            addCriterion("custshortname in", values, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameNotIn(List<String> values) {
            addCriterion("custshortname not in", values, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameBetween(String value1, String value2) {
            addCriterion("custshortname between", value1, value2, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustshortnameNotBetween(String value1, String value2) {
            addCriterion("custshortname not between", value1, value2, "custshortname");
            return (Criteria) this;
        }

        public Criteria andCustmanIsNull() {
            addCriterion("custman is null");
            return (Criteria) this;
        }

        public Criteria andCustmanIsNotNull() {
            addCriterion("custman is not null");
            return (Criteria) this;
        }

        public Criteria andCustmanEqualTo(String value) {
            addCriterion("custman =", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanNotEqualTo(String value) {
            addCriterion("custman <>", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanGreaterThan(String value) {
            addCriterion("custman >", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanGreaterThanOrEqualTo(String value) {
            addCriterion("custman >=", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanLessThan(String value) {
            addCriterion("custman <", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanLessThanOrEqualTo(String value) {
            addCriterion("custman <=", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanLike(String value) {
            addCriterion("custman like", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanNotLike(String value) {
            addCriterion("custman not like", value, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanIn(List<String> values) {
            addCriterion("custman in", values, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanNotIn(List<String> values) {
            addCriterion("custman not in", values, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanBetween(String value1, String value2) {
            addCriterion("custman between", value1, value2, "custman");
            return (Criteria) this;
        }

        public Criteria andCustmanNotBetween(String value1, String value2) {
            addCriterion("custman not between", value1, value2, "custman");
            return (Criteria) this;
        }

        public Criteria andCusttelIsNull() {
            addCriterion("custtel is null");
            return (Criteria) this;
        }

        public Criteria andCusttelIsNotNull() {
            addCriterion("custtel is not null");
            return (Criteria) this;
        }

        public Criteria andCusttelEqualTo(String value) {
            addCriterion("custtel =", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelNotEqualTo(String value) {
            addCriterion("custtel <>", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelGreaterThan(String value) {
            addCriterion("custtel >", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelGreaterThanOrEqualTo(String value) {
            addCriterion("custtel >=", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelLessThan(String value) {
            addCriterion("custtel <", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelLessThanOrEqualTo(String value) {
            addCriterion("custtel <=", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelLike(String value) {
            addCriterion("custtel like", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelNotLike(String value) {
            addCriterion("custtel not like", value, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelIn(List<String> values) {
            addCriterion("custtel in", values, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelNotIn(List<String> values) {
            addCriterion("custtel not in", values, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelBetween(String value1, String value2) {
            addCriterion("custtel between", value1, value2, "custtel");
            return (Criteria) this;
        }

        public Criteria andCusttelNotBetween(String value1, String value2) {
            addCriterion("custtel not between", value1, value2, "custtel");
            return (Criteria) this;
        }

        public Criteria andCustqqIsNull() {
            addCriterion("custqq is null");
            return (Criteria) this;
        }

        public Criteria andCustqqIsNotNull() {
            addCriterion("custqq is not null");
            return (Criteria) this;
        }

        public Criteria andCustqqEqualTo(String value) {
            addCriterion("custqq =", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqNotEqualTo(String value) {
            addCriterion("custqq <>", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqGreaterThan(String value) {
            addCriterion("custqq >", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqGreaterThanOrEqualTo(String value) {
            addCriterion("custqq >=", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqLessThan(String value) {
            addCriterion("custqq <", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqLessThanOrEqualTo(String value) {
            addCriterion("custqq <=", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqLike(String value) {
            addCriterion("custqq like", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqNotLike(String value) {
            addCriterion("custqq not like", value, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqIn(List<String> values) {
            addCriterion("custqq in", values, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqNotIn(List<String> values) {
            addCriterion("custqq not in", values, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqBetween(String value1, String value2) {
            addCriterion("custqq between", value1, value2, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustqqNotBetween(String value1, String value2) {
            addCriterion("custqq not between", value1, value2, "custqq");
            return (Criteria) this;
        }

        public Criteria andCustmobIsNull() {
            addCriterion("custmob is null");
            return (Criteria) this;
        }

        public Criteria andCustmobIsNotNull() {
            addCriterion("custmob is not null");
            return (Criteria) this;
        }

        public Criteria andCustmobEqualTo(String value) {
            addCriterion("custmob =", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobNotEqualTo(String value) {
            addCriterion("custmob <>", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobGreaterThan(String value) {
            addCriterion("custmob >", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobGreaterThanOrEqualTo(String value) {
            addCriterion("custmob >=", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobLessThan(String value) {
            addCriterion("custmob <", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobLessThanOrEqualTo(String value) {
            addCriterion("custmob <=", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobLike(String value) {
            addCriterion("custmob like", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobNotLike(String value) {
            addCriterion("custmob not like", value, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobIn(List<String> values) {
            addCriterion("custmob in", values, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobNotIn(List<String> values) {
            addCriterion("custmob not in", values, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobBetween(String value1, String value2) {
            addCriterion("custmob between", value1, value2, "custmob");
            return (Criteria) this;
        }

        public Criteria andCustmobNotBetween(String value1, String value2) {
            addCriterion("custmob not between", value1, value2, "custmob");
            return (Criteria) this;
        }

        public Criteria andHostnoIsNull() {
            addCriterion("hostno is null");
            return (Criteria) this;
        }

        public Criteria andHostnoIsNotNull() {
            addCriterion("hostno is not null");
            return (Criteria) this;
        }

        public Criteria andHostnoEqualTo(String value) {
            addCriterion("hostno =", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoNotEqualTo(String value) {
            addCriterion("hostno <>", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoGreaterThan(String value) {
            addCriterion("hostno >", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoGreaterThanOrEqualTo(String value) {
            addCriterion("hostno >=", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoLessThan(String value) {
            addCriterion("hostno <", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoLessThanOrEqualTo(String value) {
            addCriterion("hostno <=", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoLike(String value) {
            addCriterion("hostno like", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoNotLike(String value) {
            addCriterion("hostno not like", value, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoIn(List<String> values) {
            addCriterion("hostno in", values, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoNotIn(List<String> values) {
            addCriterion("hostno not in", values, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoBetween(String value1, String value2) {
            addCriterion("hostno between", value1, value2, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnoNotBetween(String value1, String value2) {
            addCriterion("hostno not between", value1, value2, "hostno");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostmanIsNull() {
            addCriterion("hostman is null");
            return (Criteria) this;
        }

        public Criteria andHostmanIsNotNull() {
            addCriterion("hostman is not null");
            return (Criteria) this;
        }

        public Criteria andHostmanEqualTo(String value) {
            addCriterion("hostman =", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanNotEqualTo(String value) {
            addCriterion("hostman <>", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanGreaterThan(String value) {
            addCriterion("hostman >", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanGreaterThanOrEqualTo(String value) {
            addCriterion("hostman >=", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanLessThan(String value) {
            addCriterion("hostman <", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanLessThanOrEqualTo(String value) {
            addCriterion("hostman <=", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanLike(String value) {
            addCriterion("hostman like", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanNotLike(String value) {
            addCriterion("hostman not like", value, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanIn(List<String> values) {
            addCriterion("hostman in", values, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanNotIn(List<String> values) {
            addCriterion("hostman not in", values, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanBetween(String value1, String value2) {
            addCriterion("hostman between", value1, value2, "hostman");
            return (Criteria) this;
        }

        public Criteria andHostmanNotBetween(String value1, String value2) {
            addCriterion("hostman not between", value1, value2, "hostman");
            return (Criteria) this;
        }

        public Criteria andHosttelIsNull() {
            addCriterion("hosttel is null");
            return (Criteria) this;
        }

        public Criteria andHosttelIsNotNull() {
            addCriterion("hosttel is not null");
            return (Criteria) this;
        }

        public Criteria andHosttelEqualTo(String value) {
            addCriterion("hosttel =", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelNotEqualTo(String value) {
            addCriterion("hosttel <>", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelGreaterThan(String value) {
            addCriterion("hosttel >", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelGreaterThanOrEqualTo(String value) {
            addCriterion("hosttel >=", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelLessThan(String value) {
            addCriterion("hosttel <", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelLessThanOrEqualTo(String value) {
            addCriterion("hosttel <=", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelLike(String value) {
            addCriterion("hosttel like", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelNotLike(String value) {
            addCriterion("hosttel not like", value, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelIn(List<String> values) {
            addCriterion("hosttel in", values, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelNotIn(List<String> values) {
            addCriterion("hosttel not in", values, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelBetween(String value1, String value2) {
            addCriterion("hosttel between", value1, value2, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHosttelNotBetween(String value1, String value2) {
            addCriterion("hosttel not between", value1, value2, "hosttel");
            return (Criteria) this;
        }

        public Criteria andHostqqIsNull() {
            addCriterion("hostqq is null");
            return (Criteria) this;
        }

        public Criteria andHostqqIsNotNull() {
            addCriterion("hostqq is not null");
            return (Criteria) this;
        }

        public Criteria andHostqqEqualTo(String value) {
            addCriterion("hostqq =", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqNotEqualTo(String value) {
            addCriterion("hostqq <>", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqGreaterThan(String value) {
            addCriterion("hostqq >", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqGreaterThanOrEqualTo(String value) {
            addCriterion("hostqq >=", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqLessThan(String value) {
            addCriterion("hostqq <", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqLessThanOrEqualTo(String value) {
            addCriterion("hostqq <=", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqLike(String value) {
            addCriterion("hostqq like", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqNotLike(String value) {
            addCriterion("hostqq not like", value, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqIn(List<String> values) {
            addCriterion("hostqq in", values, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqNotIn(List<String> values) {
            addCriterion("hostqq not in", values, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqBetween(String value1, String value2) {
            addCriterion("hostqq between", value1, value2, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostqqNotBetween(String value1, String value2) {
            addCriterion("hostqq not between", value1, value2, "hostqq");
            return (Criteria) this;
        }

        public Criteria andHostmobIsNull() {
            addCriterion("hostmob is null");
            return (Criteria) this;
        }

        public Criteria andHostmobIsNotNull() {
            addCriterion("hostmob is not null");
            return (Criteria) this;
        }

        public Criteria andHostmobEqualTo(String value) {
            addCriterion("hostmob =", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobNotEqualTo(String value) {
            addCriterion("hostmob <>", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobGreaterThan(String value) {
            addCriterion("hostmob >", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobGreaterThanOrEqualTo(String value) {
            addCriterion("hostmob >=", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobLessThan(String value) {
            addCriterion("hostmob <", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobLessThanOrEqualTo(String value) {
            addCriterion("hostmob <=", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobLike(String value) {
            addCriterion("hostmob like", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobNotLike(String value) {
            addCriterion("hostmob not like", value, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobIn(List<String> values) {
            addCriterion("hostmob in", values, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobNotIn(List<String> values) {
            addCriterion("hostmob not in", values, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobBetween(String value1, String value2) {
            addCriterion("hostmob between", value1, value2, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostmobNotBetween(String value1, String value2) {
            addCriterion("hostmob not between", value1, value2, "hostmob");
            return (Criteria) this;
        }

        public Criteria andHostprovinceIsNull() {
            addCriterion("hostprovince is null");
            return (Criteria) this;
        }

        public Criteria andHostprovinceIsNotNull() {
            addCriterion("hostprovince is not null");
            return (Criteria) this;
        }

        public Criteria andHostprovinceEqualTo(String value) {
            addCriterion("hostprovince =", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceNotEqualTo(String value) {
            addCriterion("hostprovince <>", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceGreaterThan(String value) {
            addCriterion("hostprovince >", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("hostprovince >=", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceLessThan(String value) {
            addCriterion("hostprovince <", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceLessThanOrEqualTo(String value) {
            addCriterion("hostprovince <=", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceLike(String value) {
            addCriterion("hostprovince like", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceNotLike(String value) {
            addCriterion("hostprovince not like", value, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceIn(List<String> values) {
            addCriterion("hostprovince in", values, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceNotIn(List<String> values) {
            addCriterion("hostprovince not in", values, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceBetween(String value1, String value2) {
            addCriterion("hostprovince between", value1, value2, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostprovinceNotBetween(String value1, String value2) {
            addCriterion("hostprovince not between", value1, value2, "hostprovince");
            return (Criteria) this;
        }

        public Criteria andHostcityIsNull() {
            addCriterion("hostcity is null");
            return (Criteria) this;
        }

        public Criteria andHostcityIsNotNull() {
            addCriterion("hostcity is not null");
            return (Criteria) this;
        }

        public Criteria andHostcityEqualTo(String value) {
            addCriterion("hostcity =", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityNotEqualTo(String value) {
            addCriterion("hostcity <>", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityGreaterThan(String value) {
            addCriterion("hostcity >", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityGreaterThanOrEqualTo(String value) {
            addCriterion("hostcity >=", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityLessThan(String value) {
            addCriterion("hostcity <", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityLessThanOrEqualTo(String value) {
            addCriterion("hostcity <=", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityLike(String value) {
            addCriterion("hostcity like", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityNotLike(String value) {
            addCriterion("hostcity not like", value, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityIn(List<String> values) {
            addCriterion("hostcity in", values, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityNotIn(List<String> values) {
            addCriterion("hostcity not in", values, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityBetween(String value1, String value2) {
            addCriterion("hostcity between", value1, value2, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostcityNotBetween(String value1, String value2) {
            addCriterion("hostcity not between", value1, value2, "hostcity");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNull() {
            addCriterion("hostaddr is null");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNotNull() {
            addCriterion("hostaddr is not null");
            return (Criteria) this;
        }

        public Criteria andHostaddrEqualTo(String value) {
            addCriterion("hostaddr =", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotEqualTo(String value) {
            addCriterion("hostaddr <>", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThan(String value) {
            addCriterion("hostaddr >", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hostaddr >=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThan(String value) {
            addCriterion("hostaddr <", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThanOrEqualTo(String value) {
            addCriterion("hostaddr <=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLike(String value) {
            addCriterion("hostaddr like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotLike(String value) {
            addCriterion("hostaddr not like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrIn(List<String> values) {
            addCriterion("hostaddr in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotIn(List<String> values) {
            addCriterion("hostaddr not in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrBetween(String value1, String value2) {
            addCriterion("hostaddr between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotBetween(String value1, String value2) {
            addCriterion("hostaddr not between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHosttopicIsNull() {
            addCriterion("hosttopic is null");
            return (Criteria) this;
        }

        public Criteria andHosttopicIsNotNull() {
            addCriterion("hosttopic is not null");
            return (Criteria) this;
        }

        public Criteria andHosttopicEqualTo(String value) {
            addCriterion("hosttopic =", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicNotEqualTo(String value) {
            addCriterion("hosttopic <>", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicGreaterThan(String value) {
            addCriterion("hosttopic >", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicGreaterThanOrEqualTo(String value) {
            addCriterion("hosttopic >=", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicLessThan(String value) {
            addCriterion("hosttopic <", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicLessThanOrEqualTo(String value) {
            addCriterion("hosttopic <=", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicLike(String value) {
            addCriterion("hosttopic like", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicNotLike(String value) {
            addCriterion("hosttopic not like", value, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicIn(List<String> values) {
            addCriterion("hosttopic in", values, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicNotIn(List<String> values) {
            addCriterion("hosttopic not in", values, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicBetween(String value1, String value2) {
            addCriterion("hosttopic between", value1, value2, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andHosttopicNotBetween(String value1, String value2) {
            addCriterion("hosttopic not between", value1, value2, "hosttopic");
            return (Criteria) this;
        }

        public Criteria andAddridIsNull() {
            addCriterion("addrid is null");
            return (Criteria) this;
        }

        public Criteria andAddridIsNotNull() {
            addCriterion("addrid is not null");
            return (Criteria) this;
        }

        public Criteria andAddridEqualTo(Double value) {
            addCriterion("addrid =", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridNotEqualTo(Double value) {
            addCriterion("addrid <>", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridGreaterThan(Double value) {
            addCriterion("addrid >", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridGreaterThanOrEqualTo(Double value) {
            addCriterion("addrid >=", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridLessThan(Double value) {
            addCriterion("addrid <", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridLessThanOrEqualTo(Double value) {
            addCriterion("addrid <=", value, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridIn(List<Double> values) {
            addCriterion("addrid in", values, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridNotIn(List<Double> values) {
            addCriterion("addrid not in", values, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridBetween(Double value1, Double value2) {
            addCriterion("addrid between", value1, value2, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddridNotBetween(Double value1, Double value2) {
            addCriterion("addrid not between", value1, value2, "addrid");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceIsNull() {
            addCriterion("addrprovince is null");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceIsNotNull() {
            addCriterion("addrprovince is not null");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceEqualTo(String value) {
            addCriterion("addrprovince =", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceNotEqualTo(String value) {
            addCriterion("addrprovince <>", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceGreaterThan(String value) {
            addCriterion("addrprovince >", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("addrprovince >=", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceLessThan(String value) {
            addCriterion("addrprovince <", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceLessThanOrEqualTo(String value) {
            addCriterion("addrprovince <=", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceLike(String value) {
            addCriterion("addrprovince like", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceNotLike(String value) {
            addCriterion("addrprovince not like", value, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceIn(List<String> values) {
            addCriterion("addrprovince in", values, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceNotIn(List<String> values) {
            addCriterion("addrprovince not in", values, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceBetween(String value1, String value2) {
            addCriterion("addrprovince between", value1, value2, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrprovinceNotBetween(String value1, String value2) {
            addCriterion("addrprovince not between", value1, value2, "addrprovince");
            return (Criteria) this;
        }

        public Criteria andAddrcityIsNull() {
            addCriterion("addrcity is null");
            return (Criteria) this;
        }

        public Criteria andAddrcityIsNotNull() {
            addCriterion("addrcity is not null");
            return (Criteria) this;
        }

        public Criteria andAddrcityEqualTo(String value) {
            addCriterion("addrcity =", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityNotEqualTo(String value) {
            addCriterion("addrcity <>", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityGreaterThan(String value) {
            addCriterion("addrcity >", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityGreaterThanOrEqualTo(String value) {
            addCriterion("addrcity >=", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityLessThan(String value) {
            addCriterion("addrcity <", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityLessThanOrEqualTo(String value) {
            addCriterion("addrcity <=", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityLike(String value) {
            addCriterion("addrcity like", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityNotLike(String value) {
            addCriterion("addrcity not like", value, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityIn(List<String> values) {
            addCriterion("addrcity in", values, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityNotIn(List<String> values) {
            addCriterion("addrcity not in", values, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityBetween(String value1, String value2) {
            addCriterion("addrcity between", value1, value2, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrcityNotBetween(String value1, String value2) {
            addCriterion("addrcity not between", value1, value2, "addrcity");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictIsNull() {
            addCriterion("addrdistrict is null");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictIsNotNull() {
            addCriterion("addrdistrict is not null");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictEqualTo(String value) {
            addCriterion("addrdistrict =", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictNotEqualTo(String value) {
            addCriterion("addrdistrict <>", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictGreaterThan(String value) {
            addCriterion("addrdistrict >", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("addrdistrict >=", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictLessThan(String value) {
            addCriterion("addrdistrict <", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictLessThanOrEqualTo(String value) {
            addCriterion("addrdistrict <=", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictLike(String value) {
            addCriterion("addrdistrict like", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictNotLike(String value) {
            addCriterion("addrdistrict not like", value, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictIn(List<String> values) {
            addCriterion("addrdistrict in", values, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictNotIn(List<String> values) {
            addCriterion("addrdistrict not in", values, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictBetween(String value1, String value2) {
            addCriterion("addrdistrict between", value1, value2, "addrdistrict");
            return (Criteria) this;
        }

        public Criteria andAddrdistrictNotBetween(String value1, String value2) {
            addCriterion("addrdistrict not between", value1, value2, "addrdistrict");
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

        public Criteria andAddrmanIsNull() {
            addCriterion("addrman is null");
            return (Criteria) this;
        }

        public Criteria andAddrmanIsNotNull() {
            addCriterion("addrman is not null");
            return (Criteria) this;
        }

        public Criteria andAddrmanEqualTo(String value) {
            addCriterion("addrman =", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanNotEqualTo(String value) {
            addCriterion("addrman <>", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanGreaterThan(String value) {
            addCriterion("addrman >", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanGreaterThanOrEqualTo(String value) {
            addCriterion("addrman >=", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanLessThan(String value) {
            addCriterion("addrman <", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanLessThanOrEqualTo(String value) {
            addCriterion("addrman <=", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanLike(String value) {
            addCriterion("addrman like", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanNotLike(String value) {
            addCriterion("addrman not like", value, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanIn(List<String> values) {
            addCriterion("addrman in", values, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanNotIn(List<String> values) {
            addCriterion("addrman not in", values, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanBetween(String value1, String value2) {
            addCriterion("addrman between", value1, value2, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrmanNotBetween(String value1, String value2) {
            addCriterion("addrman not between", value1, value2, "addrman");
            return (Criteria) this;
        }

        public Criteria andAddrtelIsNull() {
            addCriterion("addrtel is null");
            return (Criteria) this;
        }

        public Criteria andAddrtelIsNotNull() {
            addCriterion("addrtel is not null");
            return (Criteria) this;
        }

        public Criteria andAddrtelEqualTo(String value) {
            addCriterion("addrtel =", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelNotEqualTo(String value) {
            addCriterion("addrtel <>", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelGreaterThan(String value) {
            addCriterion("addrtel >", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelGreaterThanOrEqualTo(String value) {
            addCriterion("addrtel >=", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelLessThan(String value) {
            addCriterion("addrtel <", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelLessThanOrEqualTo(String value) {
            addCriterion("addrtel <=", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelLike(String value) {
            addCriterion("addrtel like", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelNotLike(String value) {
            addCriterion("addrtel not like", value, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelIn(List<String> values) {
            addCriterion("addrtel in", values, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelNotIn(List<String> values) {
            addCriterion("addrtel not in", values, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelBetween(String value1, String value2) {
            addCriterion("addrtel between", value1, value2, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrtelNotBetween(String value1, String value2) {
            addCriterion("addrtel not between", value1, value2, "addrtel");
            return (Criteria) this;
        }

        public Criteria andAddrqqIsNull() {
            addCriterion("addrqq is null");
            return (Criteria) this;
        }

        public Criteria andAddrqqIsNotNull() {
            addCriterion("addrqq is not null");
            return (Criteria) this;
        }

        public Criteria andAddrqqEqualTo(String value) {
            addCriterion("addrqq =", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqNotEqualTo(String value) {
            addCriterion("addrqq <>", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqGreaterThan(String value) {
            addCriterion("addrqq >", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqGreaterThanOrEqualTo(String value) {
            addCriterion("addrqq >=", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqLessThan(String value) {
            addCriterion("addrqq <", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqLessThanOrEqualTo(String value) {
            addCriterion("addrqq <=", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqLike(String value) {
            addCriterion("addrqq like", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqNotLike(String value) {
            addCriterion("addrqq not like", value, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqIn(List<String> values) {
            addCriterion("addrqq in", values, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqNotIn(List<String> values) {
            addCriterion("addrqq not in", values, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqBetween(String value1, String value2) {
            addCriterion("addrqq between", value1, value2, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrqqNotBetween(String value1, String value2) {
            addCriterion("addrqq not between", value1, value2, "addrqq");
            return (Criteria) this;
        }

        public Criteria andAddrmobIsNull() {
            addCriterion("addrmob is null");
            return (Criteria) this;
        }

        public Criteria andAddrmobIsNotNull() {
            addCriterion("addrmob is not null");
            return (Criteria) this;
        }

        public Criteria andAddrmobEqualTo(String value) {
            addCriterion("addrmob =", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobNotEqualTo(String value) {
            addCriterion("addrmob <>", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobGreaterThan(String value) {
            addCriterion("addrmob >", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobGreaterThanOrEqualTo(String value) {
            addCriterion("addrmob >=", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobLessThan(String value) {
            addCriterion("addrmob <", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobLessThanOrEqualTo(String value) {
            addCriterion("addrmob <=", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobLike(String value) {
            addCriterion("addrmob like", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobNotLike(String value) {
            addCriterion("addrmob not like", value, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobIn(List<String> values) {
            addCriterion("addrmob in", values, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobNotIn(List<String> values) {
            addCriterion("addrmob not in", values, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobBetween(String value1, String value2) {
            addCriterion("addrmob between", value1, value2, "addrmob");
            return (Criteria) this;
        }

        public Criteria andAddrmobNotBetween(String value1, String value2) {
            addCriterion("addrmob not between", value1, value2, "addrmob");
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

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymenttype is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymenttype is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymenttype =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymenttype <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymenttype >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymenttype >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymenttype <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymenttype <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymenttype like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymenttype not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymenttype in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymenttype not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymenttype between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymenttype not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("paystate is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("paystate is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(String value) {
            addCriterion("paystate =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(String value) {
            addCriterion("paystate <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(String value) {
            addCriterion("paystate >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(String value) {
            addCriterion("paystate >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(String value) {
            addCriterion("paystate <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(String value) {
            addCriterion("paystate <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLike(String value) {
            addCriterion("paystate like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotLike(String value) {
            addCriterion("paystate not like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<String> values) {
            addCriterion("paystate in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<String> values) {
            addCriterion("paystate not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(String value1, String value2) {
            addCriterion("paystate between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(String value1, String value2) {
            addCriterion("paystate not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andFreighttypeIsNull() {
            addCriterion("freighttype is null");
            return (Criteria) this;
        }

        public Criteria andFreighttypeIsNotNull() {
            addCriterion("freighttype is not null");
            return (Criteria) this;
        }

        public Criteria andFreighttypeEqualTo(String value) {
            addCriterion("freighttype =", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeNotEqualTo(String value) {
            addCriterion("freighttype <>", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeGreaterThan(String value) {
            addCriterion("freighttype >", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeGreaterThanOrEqualTo(String value) {
            addCriterion("freighttype >=", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeLessThan(String value) {
            addCriterion("freighttype <", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeLessThanOrEqualTo(String value) {
            addCriterion("freighttype <=", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeLike(String value) {
            addCriterion("freighttype like", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeNotLike(String value) {
            addCriterion("freighttype not like", value, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeIn(List<String> values) {
            addCriterion("freighttype in", values, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeNotIn(List<String> values) {
            addCriterion("freighttype not in", values, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeBetween(String value1, String value2) {
            addCriterion("freighttype between", value1, value2, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreighttypeNotBetween(String value1, String value2) {
            addCriterion("freighttype not between", value1, value2, "freighttype");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
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

        public Criteria andWebstateIsNull() {
            addCriterion("webstate is null");
            return (Criteria) this;
        }

        public Criteria andWebstateIsNotNull() {
            addCriterion("webstate is not null");
            return (Criteria) this;
        }

        public Criteria andWebstateEqualTo(String value) {
            addCriterion("webstate =", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateNotEqualTo(String value) {
            addCriterion("webstate <>", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateGreaterThan(String value) {
            addCriterion("webstate >", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateGreaterThanOrEqualTo(String value) {
            addCriterion("webstate >=", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateLessThan(String value) {
            addCriterion("webstate <", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateLessThanOrEqualTo(String value) {
            addCriterion("webstate <=", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateLike(String value) {
            addCriterion("webstate like", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateNotLike(String value) {
            addCriterion("webstate not like", value, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateIn(List<String> values) {
            addCriterion("webstate in", values, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateNotIn(List<String> values) {
            addCriterion("webstate not in", values, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateBetween(String value1, String value2) {
            addCriterion("webstate between", value1, value2, "webstate");
            return (Criteria) this;
        }

        public Criteria andWebstateNotBetween(String value1, String value2) {
            addCriterion("webstate not between", value1, value2, "webstate");
            return (Criteria) this;
        }

        public Criteria andItemamount1IsNull() {
            addCriterion("itemamount1 is null");
            return (Criteria) this;
        }

        public Criteria andItemamount1IsNotNull() {
            addCriterion("itemamount1 is not null");
            return (Criteria) this;
        }

        public Criteria andItemamount1EqualTo(Double value) {
            addCriterion("itemamount1 =", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1NotEqualTo(Double value) {
            addCriterion("itemamount1 <>", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1GreaterThan(Double value) {
            addCriterion("itemamount1 >", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1GreaterThanOrEqualTo(Double value) {
            addCriterion("itemamount1 >=", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1LessThan(Double value) {
            addCriterion("itemamount1 <", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1LessThanOrEqualTo(Double value) {
            addCriterion("itemamount1 <=", value, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1In(List<Double> values) {
            addCriterion("itemamount1 in", values, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1NotIn(List<Double> values) {
            addCriterion("itemamount1 not in", values, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1Between(Double value1, Double value2) {
            addCriterion("itemamount1 between", value1, value2, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andItemamount1NotBetween(Double value1, Double value2) {
            addCriterion("itemamount1 not between", value1, value2, "itemamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1IsNull() {
            addCriterion("freightamount1 is null");
            return (Criteria) this;
        }

        public Criteria andFreightamount1IsNotNull() {
            addCriterion("freightamount1 is not null");
            return (Criteria) this;
        }

        public Criteria andFreightamount1EqualTo(Double value) {
            addCriterion("freightamount1 =", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1NotEqualTo(Double value) {
            addCriterion("freightamount1 <>", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1GreaterThan(Double value) {
            addCriterion("freightamount1 >", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1GreaterThanOrEqualTo(Double value) {
            addCriterion("freightamount1 >=", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1LessThan(Double value) {
            addCriterion("freightamount1 <", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1LessThanOrEqualTo(Double value) {
            addCriterion("freightamount1 <=", value, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1In(List<Double> values) {
            addCriterion("freightamount1 in", values, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1NotIn(List<Double> values) {
            addCriterion("freightamount1 not in", values, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1Between(Double value1, Double value2) {
            addCriterion("freightamount1 between", value1, value2, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andFreightamount1NotBetween(Double value1, Double value2) {
            addCriterion("freightamount1 not between", value1, value2, "freightamount1");
            return (Criteria) this;
        }

        public Criteria andTotal1IsNull() {
            addCriterion("total1 is null");
            return (Criteria) this;
        }

        public Criteria andTotal1IsNotNull() {
            addCriterion("total1 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal1EqualTo(Double value) {
            addCriterion("total1 =", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1NotEqualTo(Double value) {
            addCriterion("total1 <>", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1GreaterThan(Double value) {
            addCriterion("total1 >", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1GreaterThanOrEqualTo(Double value) {
            addCriterion("total1 >=", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1LessThan(Double value) {
            addCriterion("total1 <", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1LessThanOrEqualTo(Double value) {
            addCriterion("total1 <=", value, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1In(List<Double> values) {
            addCriterion("total1 in", values, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1NotIn(List<Double> values) {
            addCriterion("total1 not in", values, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1Between(Double value1, Double value2) {
            addCriterion("total1 between", value1, value2, "total1");
            return (Criteria) this;
        }

        public Criteria andTotal1NotBetween(Double value1, Double value2) {
            addCriterion("total1 not between", value1, value2, "total1");
            return (Criteria) this;
        }

        public Criteria andItemamount2IsNull() {
            addCriterion("itemamount2 is null");
            return (Criteria) this;
        }

        public Criteria andItemamount2IsNotNull() {
            addCriterion("itemamount2 is not null");
            return (Criteria) this;
        }

        public Criteria andItemamount2EqualTo(Double value) {
            addCriterion("itemamount2 =", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2NotEqualTo(Double value) {
            addCriterion("itemamount2 <>", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2GreaterThan(Double value) {
            addCriterion("itemamount2 >", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2GreaterThanOrEqualTo(Double value) {
            addCriterion("itemamount2 >=", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2LessThan(Double value) {
            addCriterion("itemamount2 <", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2LessThanOrEqualTo(Double value) {
            addCriterion("itemamount2 <=", value, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2In(List<Double> values) {
            addCriterion("itemamount2 in", values, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2NotIn(List<Double> values) {
            addCriterion("itemamount2 not in", values, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2Between(Double value1, Double value2) {
            addCriterion("itemamount2 between", value1, value2, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andItemamount2NotBetween(Double value1, Double value2) {
            addCriterion("itemamount2 not between", value1, value2, "itemamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2IsNull() {
            addCriterion("freightamount2 is null");
            return (Criteria) this;
        }

        public Criteria andFreightamount2IsNotNull() {
            addCriterion("freightamount2 is not null");
            return (Criteria) this;
        }

        public Criteria andFreightamount2EqualTo(Double value) {
            addCriterion("freightamount2 =", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2NotEqualTo(Double value) {
            addCriterion("freightamount2 <>", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2GreaterThan(Double value) {
            addCriterion("freightamount2 >", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2GreaterThanOrEqualTo(Double value) {
            addCriterion("freightamount2 >=", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2LessThan(Double value) {
            addCriterion("freightamount2 <", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2LessThanOrEqualTo(Double value) {
            addCriterion("freightamount2 <=", value, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2In(List<Double> values) {
            addCriterion("freightamount2 in", values, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2NotIn(List<Double> values) {
            addCriterion("freightamount2 not in", values, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2Between(Double value1, Double value2) {
            addCriterion("freightamount2 between", value1, value2, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andFreightamount2NotBetween(Double value1, Double value2) {
            addCriterion("freightamount2 not between", value1, value2, "freightamount2");
            return (Criteria) this;
        }

        public Criteria andTotal2IsNull() {
            addCriterion("total2 is null");
            return (Criteria) this;
        }

        public Criteria andTotal2IsNotNull() {
            addCriterion("total2 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal2EqualTo(Double value) {
            addCriterion("total2 =", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2NotEqualTo(Double value) {
            addCriterion("total2 <>", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2GreaterThan(Double value) {
            addCriterion("total2 >", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2GreaterThanOrEqualTo(Double value) {
            addCriterion("total2 >=", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2LessThan(Double value) {
            addCriterion("total2 <", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2LessThanOrEqualTo(Double value) {
            addCriterion("total2 <=", value, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2In(List<Double> values) {
            addCriterion("total2 in", values, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2NotIn(List<Double> values) {
            addCriterion("total2 not in", values, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2Between(Double value1, Double value2) {
            addCriterion("total2 between", value1, value2, "total2");
            return (Criteria) this;
        }

        public Criteria andTotal2NotBetween(Double value1, Double value2) {
            addCriterion("total2 not between", value1, value2, "total2");
            return (Criteria) this;
        }

        public Criteria andRettotIsNull() {
            addCriterion("rettot is null");
            return (Criteria) this;
        }

        public Criteria andRettotIsNotNull() {
            addCriterion("rettot is not null");
            return (Criteria) this;
        }

        public Criteria andRettotEqualTo(Double value) {
            addCriterion("rettot =", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotNotEqualTo(Double value) {
            addCriterion("rettot <>", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotGreaterThan(Double value) {
            addCriterion("rettot >", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotGreaterThanOrEqualTo(Double value) {
            addCriterion("rettot >=", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotLessThan(Double value) {
            addCriterion("rettot <", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotLessThanOrEqualTo(Double value) {
            addCriterion("rettot <=", value, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotIn(List<Double> values) {
            addCriterion("rettot in", values, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotNotIn(List<Double> values) {
            addCriterion("rettot not in", values, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotBetween(Double value1, Double value2) {
            addCriterion("rettot between", value1, value2, "rettot");
            return (Criteria) this;
        }

        public Criteria andRettotNotBetween(Double value1, Double value2) {
            addCriterion("rettot not between", value1, value2, "rettot");
            return (Criteria) this;
        }

        public Criteria andPaytotIsNull() {
            addCriterion("paytot is null");
            return (Criteria) this;
        }

        public Criteria andPaytotIsNotNull() {
            addCriterion("paytot is not null");
            return (Criteria) this;
        }

        public Criteria andPaytotEqualTo(Double value) {
            addCriterion("paytot =", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotNotEqualTo(Double value) {
            addCriterion("paytot <>", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotGreaterThan(Double value) {
            addCriterion("paytot >", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotGreaterThanOrEqualTo(Double value) {
            addCriterion("paytot >=", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotLessThan(Double value) {
            addCriterion("paytot <", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotLessThanOrEqualTo(Double value) {
            addCriterion("paytot <=", value, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotIn(List<Double> values) {
            addCriterion("paytot in", values, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotNotIn(List<Double> values) {
            addCriterion("paytot not in", values, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotBetween(Double value1, Double value2) {
            addCriterion("paytot between", value1, value2, "paytot");
            return (Criteria) this;
        }

        public Criteria andPaytotNotBetween(Double value1, Double value2) {
            addCriterion("paytot not between", value1, value2, "paytot");
            return (Criteria) this;
        }

        public Criteria andRecnumIsNull() {
            addCriterion("recnum is null");
            return (Criteria) this;
        }

        public Criteria andRecnumIsNotNull() {
            addCriterion("recnum is not null");
            return (Criteria) this;
        }

        public Criteria andRecnumEqualTo(Double value) {
            addCriterion("recnum =", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotEqualTo(Double value) {
            addCriterion("recnum <>", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumGreaterThan(Double value) {
            addCriterion("recnum >", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumGreaterThanOrEqualTo(Double value) {
            addCriterion("recnum >=", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumLessThan(Double value) {
            addCriterion("recnum <", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumLessThanOrEqualTo(Double value) {
            addCriterion("recnum <=", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumIn(List<Double> values) {
            addCriterion("recnum in", values, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotIn(List<Double> values) {
            addCriterion("recnum not in", values, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumBetween(Double value1, Double value2) {
            addCriterion("recnum between", value1, value2, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotBetween(Double value1, Double value2) {
            addCriterion("recnum not between", value1, value2, "recnum");
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

        public Criteria andInputoridIsNull() {
            addCriterion("inputorid is null");
            return (Criteria) this;
        }

        public Criteria andInputoridIsNotNull() {
            addCriterion("inputorid is not null");
            return (Criteria) this;
        }

        public Criteria andInputoridEqualTo(Double value) {
            addCriterion("inputorid =", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotEqualTo(Double value) {
            addCriterion("inputorid <>", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThan(Double value) {
            addCriterion("inputorid >", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridGreaterThanOrEqualTo(Double value) {
            addCriterion("inputorid >=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThan(Double value) {
            addCriterion("inputorid <", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridLessThanOrEqualTo(Double value) {
            addCriterion("inputorid <=", value, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridIn(List<Double> values) {
            addCriterion("inputorid in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotIn(List<Double> values) {
            addCriterion("inputorid not in", values, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridBetween(Double value1, Double value2) {
            addCriterion("inputorid between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputoridNotBetween(Double value1, Double value2) {
            addCriterion("inputorid not between", value1, value2, "inputorid");
            return (Criteria) this;
        }

        public Criteria andInputorIsNull() {
            addCriterion("inputor is null");
            return (Criteria) this;
        }

        public Criteria andInputorIsNotNull() {
            addCriterion("inputor is not null");
            return (Criteria) this;
        }

        public Criteria andInputorEqualTo(String value) {
            addCriterion("inputor =", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorNotEqualTo(String value) {
            addCriterion("inputor <>", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorGreaterThan(String value) {
            addCriterion("inputor >", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorGreaterThanOrEqualTo(String value) {
            addCriterion("inputor >=", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorLessThan(String value) {
            addCriterion("inputor <", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorLessThanOrEqualTo(String value) {
            addCriterion("inputor <=", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorLike(String value) {
            addCriterion("inputor like", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorNotLike(String value) {
            addCriterion("inputor not like", value, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorIn(List<String> values) {
            addCriterion("inputor in", values, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorNotIn(List<String> values) {
            addCriterion("inputor not in", values, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorBetween(String value1, String value2) {
            addCriterion("inputor between", value1, value2, "inputor");
            return (Criteria) this;
        }

        public Criteria andInputorNotBetween(String value1, String value2) {
            addCriterion("inputor not between", value1, value2, "inputor");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerid is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerid is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Double value) {
            addCriterion("managerid =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Double value) {
            addCriterion("managerid <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Double value) {
            addCriterion("managerid >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Double value) {
            addCriterion("managerid >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Double value) {
            addCriterion("managerid <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Double value) {
            addCriterion("managerid <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Double> values) {
            addCriterion("managerid in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Double> values) {
            addCriterion("managerid not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Double value1, Double value2) {
            addCriterion("managerid between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Double value1, Double value2) {
            addCriterion("managerid not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andPricecolIsNull() {
            addCriterion("pricecol is null");
            return (Criteria) this;
        }

        public Criteria andPricecolIsNotNull() {
            addCriterion("pricecol is not null");
            return (Criteria) this;
        }

        public Criteria andPricecolEqualTo(String value) {
            addCriterion("pricecol =", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolNotEqualTo(String value) {
            addCriterion("pricecol <>", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolGreaterThan(String value) {
            addCriterion("pricecol >", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolGreaterThanOrEqualTo(String value) {
            addCriterion("pricecol >=", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolLessThan(String value) {
            addCriterion("pricecol <", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolLessThanOrEqualTo(String value) {
            addCriterion("pricecol <=", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolLike(String value) {
            addCriterion("pricecol like", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolNotLike(String value) {
            addCriterion("pricecol not like", value, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolIn(List<String> values) {
            addCriterion("pricecol in", values, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolNotIn(List<String> values) {
            addCriterion("pricecol not in", values, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolBetween(String value1, String value2) {
            addCriterion("pricecol between", value1, value2, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricecolNotBetween(String value1, String value2) {
            addCriterion("pricecol not between", value1, value2, "pricecol");
            return (Criteria) this;
        }

        public Criteria andPricedescIsNull() {
            addCriterion("pricedesc is null");
            return (Criteria) this;
        }

        public Criteria andPricedescIsNotNull() {
            addCriterion("pricedesc is not null");
            return (Criteria) this;
        }

        public Criteria andPricedescEqualTo(String value) {
            addCriterion("pricedesc =", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescNotEqualTo(String value) {
            addCriterion("pricedesc <>", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescGreaterThan(String value) {
            addCriterion("pricedesc >", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescGreaterThanOrEqualTo(String value) {
            addCriterion("pricedesc >=", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescLessThan(String value) {
            addCriterion("pricedesc <", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescLessThanOrEqualTo(String value) {
            addCriterion("pricedesc <=", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescLike(String value) {
            addCriterion("pricedesc like", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescNotLike(String value) {
            addCriterion("pricedesc not like", value, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescIn(List<String> values) {
            addCriterion("pricedesc in", values, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescNotIn(List<String> values) {
            addCriterion("pricedesc not in", values, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescBetween(String value1, String value2) {
            addCriterion("pricedesc between", value1, value2, "pricedesc");
            return (Criteria) this;
        }

        public Criteria andPricedescNotBetween(String value1, String value2) {
            addCriterion("pricedesc not between", value1, value2, "pricedesc");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorenoteIsNull() {
            addCriterion("storenote is null");
            return (Criteria) this;
        }

        public Criteria andStorenoteIsNotNull() {
            addCriterion("storenote is not null");
            return (Criteria) this;
        }

        public Criteria andStorenoteEqualTo(String value) {
            addCriterion("storenote =", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteNotEqualTo(String value) {
            addCriterion("storenote <>", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteGreaterThan(String value) {
            addCriterion("storenote >", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteGreaterThanOrEqualTo(String value) {
            addCriterion("storenote >=", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteLessThan(String value) {
            addCriterion("storenote <", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteLessThanOrEqualTo(String value) {
            addCriterion("storenote <=", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteLike(String value) {
            addCriterion("storenote like", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteNotLike(String value) {
            addCriterion("storenote not like", value, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteIn(List<String> values) {
            addCriterion("storenote in", values, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteNotIn(List<String> values) {
            addCriterion("storenote not in", values, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteBetween(String value1, String value2) {
            addCriterion("storenote between", value1, value2, "storenote");
            return (Criteria) this;
        }

        public Criteria andStorenoteNotBetween(String value1, String value2) {
            addCriterion("storenote not between", value1, value2, "storenote");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNull() {
            addCriterion("custtype is null");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNotNull() {
            addCriterion("custtype is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypeEqualTo(String value) {
            addCriterion("custtype =", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotEqualTo(String value) {
            addCriterion("custtype <>", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThan(String value) {
            addCriterion("custtype >", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("custtype >=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThan(String value) {
            addCriterion("custtype <", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThanOrEqualTo(String value) {
            addCriterion("custtype <=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLike(String value) {
            addCriterion("custtype like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotLike(String value) {
            addCriterion("custtype not like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIn(List<String> values) {
            addCriterion("custtype in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotIn(List<String> values) {
            addCriterion("custtype not in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeBetween(String value1, String value2) {
            addCriterion("custtype between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotBetween(String value1, String value2) {
            addCriterion("custtype not between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andBillProcIsNull() {
            addCriterion("bill_proc is null");
            return (Criteria) this;
        }

        public Criteria andBillProcIsNotNull() {
            addCriterion("bill_proc is not null");
            return (Criteria) this;
        }

        public Criteria andBillProcEqualTo(String value) {
            addCriterion("bill_proc =", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcNotEqualTo(String value) {
            addCriterion("bill_proc <>", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcGreaterThan(String value) {
            addCriterion("bill_proc >", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcGreaterThanOrEqualTo(String value) {
            addCriterion("bill_proc >=", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcLessThan(String value) {
            addCriterion("bill_proc <", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcLessThanOrEqualTo(String value) {
            addCriterion("bill_proc <=", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcLike(String value) {
            addCriterion("bill_proc like", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcNotLike(String value) {
            addCriterion("bill_proc not like", value, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcIn(List<String> values) {
            addCriterion("bill_proc in", values, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcNotIn(List<String> values) {
            addCriterion("bill_proc not in", values, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcBetween(String value1, String value2) {
            addCriterion("bill_proc between", value1, value2, "billProc");
            return (Criteria) this;
        }

        public Criteria andBillProcNotBetween(String value1, String value2) {
            addCriterion("bill_proc not between", value1, value2, "billProc");
            return (Criteria) this;
        }

        public Criteria andProcManIsNull() {
            addCriterion("proc_man is null");
            return (Criteria) this;
        }

        public Criteria andProcManIsNotNull() {
            addCriterion("proc_man is not null");
            return (Criteria) this;
        }

        public Criteria andProcManEqualTo(String value) {
            addCriterion("proc_man =", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManNotEqualTo(String value) {
            addCriterion("proc_man <>", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManGreaterThan(String value) {
            addCriterion("proc_man >", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManGreaterThanOrEqualTo(String value) {
            addCriterion("proc_man >=", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManLessThan(String value) {
            addCriterion("proc_man <", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManLessThanOrEqualTo(String value) {
            addCriterion("proc_man <=", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManLike(String value) {
            addCriterion("proc_man like", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManNotLike(String value) {
            addCriterion("proc_man not like", value, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManIn(List<String> values) {
            addCriterion("proc_man in", values, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManNotIn(List<String> values) {
            addCriterion("proc_man not in", values, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManBetween(String value1, String value2) {
            addCriterion("proc_man between", value1, value2, "procMan");
            return (Criteria) this;
        }

        public Criteria andProcManNotBetween(String value1, String value2) {
            addCriterion("proc_man not between", value1, value2, "procMan");
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
     * eos_bill_head
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