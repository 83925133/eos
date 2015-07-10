package com.whale.eos.entity.bill;

import java.util.ArrayList;
import java.util.List;

public class EosBillProcInfo {
    /**
     * 主键字段
     * @ibatorgenerated 2015-06-22 19:08:41
     */
    protected String pk_name;

    /**
     * 排序字段
     * @ibatorgenerated 2015-06-22 19:08:41
     */
    protected String orderByClause;

    /**
     * 去重复
     * @ibatorgenerated 2015-06-22 19:08:41
     */
    protected boolean distinct;

    /**
     * 条件集
     * @ibatorgenerated 2015-06-22 19:08:41
     */
    protected List<Criteria> oredCriteria;

    public EosBillProcInfo() {
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
     * @ibatorgenerated 2015-06-22 19:08:41
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置去重复
     * @ibatorgenerated 2015-06-22 19:08:41
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
     * @ibatorgenerated 2015-06-22 19:08:41
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
     * @ibatorgenerated 2015-06-22 19:08:41
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

        public Criteria andWftypeIsNull() {
            addCriterion("wftype is null");
            return (Criteria) this;
        }

        public Criteria andWftypeIsNotNull() {
            addCriterion("wftype is not null");
            return (Criteria) this;
        }

        public Criteria andWftypeEqualTo(String value) {
            addCriterion("wftype =", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeNotEqualTo(String value) {
            addCriterion("wftype <>", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeGreaterThan(String value) {
            addCriterion("wftype >", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeGreaterThanOrEqualTo(String value) {
            addCriterion("wftype >=", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeLessThan(String value) {
            addCriterion("wftype <", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeLessThanOrEqualTo(String value) {
            addCriterion("wftype <=", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeLike(String value) {
            addCriterion("wftype like", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeNotLike(String value) {
            addCriterion("wftype not like", value, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeIn(List<String> values) {
            addCriterion("wftype in", values, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeNotIn(List<String> values) {
            addCriterion("wftype not in", values, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeBetween(String value1, String value2) {
            addCriterion("wftype between", value1, value2, "wftype");
            return (Criteria) this;
        }

        public Criteria andWftypeNotBetween(String value1, String value2) {
            addCriterion("wftype not between", value1, value2, "wftype");
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

        public Criteria andStateIdIsNull() {
            addCriterion("state_id is null");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNotNull() {
            addCriterion("state_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateIdEqualTo(Double value) {
            addCriterion("state_id =", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotEqualTo(Double value) {
            addCriterion("state_id <>", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThan(Double value) {
            addCriterion("state_id >", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThanOrEqualTo(Double value) {
            addCriterion("state_id >=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThan(Double value) {
            addCriterion("state_id <", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThanOrEqualTo(Double value) {
            addCriterion("state_id <=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdIn(List<Double> values) {
            addCriterion("state_id in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotIn(List<Double> values) {
            addCriterion("state_id not in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdBetween(Double value1, Double value2) {
            addCriterion("state_id between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotBetween(Double value1, Double value2) {
            addCriterion("state_id not between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPkindIsNull() {
            addCriterion("pkind is null");
            return (Criteria) this;
        }

        public Criteria andPkindIsNotNull() {
            addCriterion("pkind is not null");
            return (Criteria) this;
        }

        public Criteria andPkindEqualTo(String value) {
            addCriterion("pkind =", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotEqualTo(String value) {
            addCriterion("pkind <>", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindGreaterThan(String value) {
            addCriterion("pkind >", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindGreaterThanOrEqualTo(String value) {
            addCriterion("pkind >=", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLessThan(String value) {
            addCriterion("pkind <", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLessThanOrEqualTo(String value) {
            addCriterion("pkind <=", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLike(String value) {
            addCriterion("pkind like", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotLike(String value) {
            addCriterion("pkind not like", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindIn(List<String> values) {
            addCriterion("pkind in", values, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotIn(List<String> values) {
            addCriterion("pkind not in", values, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindBetween(String value1, String value2) {
            addCriterion("pkind between", value1, value2, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotBetween(String value1, String value2) {
            addCriterion("pkind not between", value1, value2, "pkind");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(Double value) {
            addCriterion("pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(Double value) {
            addCriterion("pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(Double value) {
            addCriterion("pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(Double value) {
            addCriterion("pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(Double value) {
            addCriterion("pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(Double value) {
            addCriterion("pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<Double> values) {
            addCriterion("pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<Double> values) {
            addCriterion("pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(Double value1, Double value2) {
            addCriterion("pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(Double value1, Double value2) {
            addCriterion("pno not between", value1, value2, "pno");
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

        public Criteria andTminIsNull() {
            addCriterion("tmin is null");
            return (Criteria) this;
        }

        public Criteria andTminIsNotNull() {
            addCriterion("tmin is not null");
            return (Criteria) this;
        }

        public Criteria andTminEqualTo(Double value) {
            addCriterion("tmin =", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminNotEqualTo(Double value) {
            addCriterion("tmin <>", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminGreaterThan(Double value) {
            addCriterion("tmin >", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminGreaterThanOrEqualTo(Double value) {
            addCriterion("tmin >=", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminLessThan(Double value) {
            addCriterion("tmin <", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminLessThanOrEqualTo(Double value) {
            addCriterion("tmin <=", value, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminIn(List<Double> values) {
            addCriterion("tmin in", values, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminNotIn(List<Double> values) {
            addCriterion("tmin not in", values, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminBetween(Double value1, Double value2) {
            addCriterion("tmin between", value1, value2, "tmin");
            return (Criteria) this;
        }

        public Criteria andTminNotBetween(Double value1, Double value2) {
            addCriterion("tmin not between", value1, value2, "tmin");
            return (Criteria) this;
        }

        public Criteria andTmaxIsNull() {
            addCriterion("tmax is null");
            return (Criteria) this;
        }

        public Criteria andTmaxIsNotNull() {
            addCriterion("tmax is not null");
            return (Criteria) this;
        }

        public Criteria andTmaxEqualTo(Double value) {
            addCriterion("tmax =", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxNotEqualTo(Double value) {
            addCriterion("tmax <>", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxGreaterThan(Double value) {
            addCriterion("tmax >", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxGreaterThanOrEqualTo(Double value) {
            addCriterion("tmax >=", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxLessThan(Double value) {
            addCriterion("tmax <", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxLessThanOrEqualTo(Double value) {
            addCriterion("tmax <=", value, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxIn(List<Double> values) {
            addCriterion("tmax in", values, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxNotIn(List<Double> values) {
            addCriterion("tmax not in", values, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxBetween(Double value1, Double value2) {
            addCriterion("tmax between", value1, value2, "tmax");
            return (Criteria) this;
        }

        public Criteria andTmaxNotBetween(Double value1, Double value2) {
            addCriterion("tmax not between", value1, value2, "tmax");
            return (Criteria) this;
        }

        public Criteria andYnqtyIsNull() {
            addCriterion("ynqty is null");
            return (Criteria) this;
        }

        public Criteria andYnqtyIsNotNull() {
            addCriterion("ynqty is not null");
            return (Criteria) this;
        }

        public Criteria andYnqtyEqualTo(String value) {
            addCriterion("ynqty =", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyNotEqualTo(String value) {
            addCriterion("ynqty <>", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyGreaterThan(String value) {
            addCriterion("ynqty >", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyGreaterThanOrEqualTo(String value) {
            addCriterion("ynqty >=", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyLessThan(String value) {
            addCriterion("ynqty <", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyLessThanOrEqualTo(String value) {
            addCriterion("ynqty <=", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyLike(String value) {
            addCriterion("ynqty like", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyNotLike(String value) {
            addCriterion("ynqty not like", value, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyIn(List<String> values) {
            addCriterion("ynqty in", values, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyNotIn(List<String> values) {
            addCriterion("ynqty not in", values, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyBetween(String value1, String value2) {
            addCriterion("ynqty between", value1, value2, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnqtyNotBetween(String value1, String value2) {
            addCriterion("ynqty not between", value1, value2, "ynqty");
            return (Criteria) this;
        }

        public Criteria andYnpriceIsNull() {
            addCriterion("ynprice is null");
            return (Criteria) this;
        }

        public Criteria andYnpriceIsNotNull() {
            addCriterion("ynprice is not null");
            return (Criteria) this;
        }

        public Criteria andYnpriceEqualTo(String value) {
            addCriterion("ynprice =", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceNotEqualTo(String value) {
            addCriterion("ynprice <>", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceGreaterThan(String value) {
            addCriterion("ynprice >", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceGreaterThanOrEqualTo(String value) {
            addCriterion("ynprice >=", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceLessThan(String value) {
            addCriterion("ynprice <", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceLessThanOrEqualTo(String value) {
            addCriterion("ynprice <=", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceLike(String value) {
            addCriterion("ynprice like", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceNotLike(String value) {
            addCriterion("ynprice not like", value, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceIn(List<String> values) {
            addCriterion("ynprice in", values, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceNotIn(List<String> values) {
            addCriterion("ynprice not in", values, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceBetween(String value1, String value2) {
            addCriterion("ynprice between", value1, value2, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnpriceNotBetween(String value1, String value2) {
            addCriterion("ynprice not between", value1, value2, "ynprice");
            return (Criteria) this;
        }

        public Criteria andYnyfIsNull() {
            addCriterion("ynyf is null");
            return (Criteria) this;
        }

        public Criteria andYnyfIsNotNull() {
            addCriterion("ynyf is not null");
            return (Criteria) this;
        }

        public Criteria andYnyfEqualTo(String value) {
            addCriterion("ynyf =", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfNotEqualTo(String value) {
            addCriterion("ynyf <>", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfGreaterThan(String value) {
            addCriterion("ynyf >", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfGreaterThanOrEqualTo(String value) {
            addCriterion("ynyf >=", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfLessThan(String value) {
            addCriterion("ynyf <", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfLessThanOrEqualTo(String value) {
            addCriterion("ynyf <=", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfLike(String value) {
            addCriterion("ynyf like", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfNotLike(String value) {
            addCriterion("ynyf not like", value, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfIn(List<String> values) {
            addCriterion("ynyf in", values, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfNotIn(List<String> values) {
            addCriterion("ynyf not in", values, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfBetween(String value1, String value2) {
            addCriterion("ynyf between", value1, value2, "ynyf");
            return (Criteria) this;
        }

        public Criteria andYnyfNotBetween(String value1, String value2) {
            addCriterion("ynyf not between", value1, value2, "ynyf");
            return (Criteria) this;
        }

        public Criteria andTot3IsNull() {
            addCriterion("tot3 is null");
            return (Criteria) this;
        }

        public Criteria andTot3IsNotNull() {
            addCriterion("tot3 is not null");
            return (Criteria) this;
        }

        public Criteria andTot3EqualTo(Double value) {
            addCriterion("tot3 =", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3NotEqualTo(Double value) {
            addCriterion("tot3 <>", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3GreaterThan(Double value) {
            addCriterion("tot3 >", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3GreaterThanOrEqualTo(Double value) {
            addCriterion("tot3 >=", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3LessThan(Double value) {
            addCriterion("tot3 <", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3LessThanOrEqualTo(Double value) {
            addCriterion("tot3 <=", value, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3In(List<Double> values) {
            addCriterion("tot3 in", values, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3NotIn(List<Double> values) {
            addCriterion("tot3 not in", values, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3Between(Double value1, Double value2) {
            addCriterion("tot3 between", value1, value2, "tot3");
            return (Criteria) this;
        }

        public Criteria andTot3NotBetween(Double value1, Double value2) {
            addCriterion("tot3 not between", value1, value2, "tot3");
            return (Criteria) this;
        }

        public Criteria andPnoteIsNull() {
            addCriterion("pnote is null");
            return (Criteria) this;
        }

        public Criteria andPnoteIsNotNull() {
            addCriterion("pnote is not null");
            return (Criteria) this;
        }

        public Criteria andPnoteEqualTo(String value) {
            addCriterion("pnote =", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteNotEqualTo(String value) {
            addCriterion("pnote <>", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteGreaterThan(String value) {
            addCriterion("pnote >", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteGreaterThanOrEqualTo(String value) {
            addCriterion("pnote >=", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteLessThan(String value) {
            addCriterion("pnote <", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteLessThanOrEqualTo(String value) {
            addCriterion("pnote <=", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteLike(String value) {
            addCriterion("pnote like", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteNotLike(String value) {
            addCriterion("pnote not like", value, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteIn(List<String> values) {
            addCriterion("pnote in", values, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteNotIn(List<String> values) {
            addCriterion("pnote not in", values, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteBetween(String value1, String value2) {
            addCriterion("pnote between", value1, value2, "pnote");
            return (Criteria) this;
        }

        public Criteria andPnoteNotBetween(String value1, String value2) {
            addCriterion("pnote not between", value1, value2, "pnote");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Double value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Double value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Double value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Double value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Double value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Double value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Double> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Double> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Double value1, Double value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Double value1, Double value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameokIsNull() {
            addCriterion("enameok is null");
            return (Criteria) this;
        }

        public Criteria andEnameokIsNotNull() {
            addCriterion("enameok is not null");
            return (Criteria) this;
        }

        public Criteria andEnameokEqualTo(String value) {
            addCriterion("enameok =", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokNotEqualTo(String value) {
            addCriterion("enameok <>", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokGreaterThan(String value) {
            addCriterion("enameok >", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokGreaterThanOrEqualTo(String value) {
            addCriterion("enameok >=", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokLessThan(String value) {
            addCriterion("enameok <", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokLessThanOrEqualTo(String value) {
            addCriterion("enameok <=", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokLike(String value) {
            addCriterion("enameok like", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokNotLike(String value) {
            addCriterion("enameok not like", value, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokIn(List<String> values) {
            addCriterion("enameok in", values, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokNotIn(List<String> values) {
            addCriterion("enameok not in", values, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokBetween(String value1, String value2) {
            addCriterion("enameok between", value1, value2, "enameok");
            return (Criteria) this;
        }

        public Criteria andEnameokNotBetween(String value1, String value2) {
            addCriterion("enameok not between", value1, value2, "enameok");
            return (Criteria) this;
        }

        public Criteria andReadmarkIsNull() {
            addCriterion("readmark is null");
            return (Criteria) this;
        }

        public Criteria andReadmarkIsNotNull() {
            addCriterion("readmark is not null");
            return (Criteria) this;
        }

        public Criteria andReadmarkEqualTo(String value) {
            addCriterion("readmark =", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkNotEqualTo(String value) {
            addCriterion("readmark <>", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkGreaterThan(String value) {
            addCriterion("readmark >", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkGreaterThanOrEqualTo(String value) {
            addCriterion("readmark >=", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkLessThan(String value) {
            addCriterion("readmark <", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkLessThanOrEqualTo(String value) {
            addCriterion("readmark <=", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkLike(String value) {
            addCriterion("readmark like", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkNotLike(String value) {
            addCriterion("readmark not like", value, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkIn(List<String> values) {
            addCriterion("readmark in", values, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkNotIn(List<String> values) {
            addCriterion("readmark not in", values, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkBetween(String value1, String value2) {
            addCriterion("readmark between", value1, value2, "readmark");
            return (Criteria) this;
        }

        public Criteria andReadmarkNotBetween(String value1, String value2) {
            addCriterion("readmark not between", value1, value2, "readmark");
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
     * eos_bill_proc
     * @ibatorgenerated do_not_delete_during_merge 2015-06-22 19:08:41
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 内类部，系统内部调用1
     * @ibatorgenerated 2015-06-22 19:08:41
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