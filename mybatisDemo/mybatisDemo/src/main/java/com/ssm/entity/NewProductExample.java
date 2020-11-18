package com.ssm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NewProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPinventoryIsNull() {
            addCriterion("pinventory is null");
            return (Criteria) this;
        }

        public Criteria andPinventoryIsNotNull() {
            addCriterion("pinventory is not null");
            return (Criteria) this;
        }

        public Criteria andPinventoryEqualTo(Integer value) {
            addCriterion("pinventory =", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryNotEqualTo(Integer value) {
            addCriterion("pinventory <>", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryGreaterThan(Integer value) {
            addCriterion("pinventory >", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinventory >=", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryLessThan(Integer value) {
            addCriterion("pinventory <", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryLessThanOrEqualTo(Integer value) {
            addCriterion("pinventory <=", value, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryIn(List<Integer> values) {
            addCriterion("pinventory in", values, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryNotIn(List<Integer> values) {
            addCriterion("pinventory not in", values, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryBetween(Integer value1, Integer value2) {
            addCriterion("pinventory between", value1, value2, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPinventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("pinventory not between", value1, value2, "pinventory");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNull() {
            addCriterion("pprice is null");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNotNull() {
            addCriterion("pprice is not null");
            return (Criteria) this;
        }

        public Criteria andPpriceEqualTo(BigDecimal value) {
            addCriterion("pprice =", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotEqualTo(BigDecimal value) {
            addCriterion("pprice <>", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThan(BigDecimal value) {
            addCriterion("pprice >", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pprice >=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThan(BigDecimal value) {
            addCriterion("pprice <", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pprice <=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceIn(List<BigDecimal> values) {
            addCriterion("pprice in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotIn(List<BigDecimal> values) {
            addCriterion("pprice not in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pprice between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pprice not between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPiconIsNull() {
            addCriterion("picon is null");
            return (Criteria) this;
        }

        public Criteria andPiconIsNotNull() {
            addCriterion("picon is not null");
            return (Criteria) this;
        }

        public Criteria andPiconEqualTo(String value) {
            addCriterion("picon =", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconNotEqualTo(String value) {
            addCriterion("picon <>", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconGreaterThan(String value) {
            addCriterion("picon >", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconGreaterThanOrEqualTo(String value) {
            addCriterion("picon >=", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconLessThan(String value) {
            addCriterion("picon <", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconLessThanOrEqualTo(String value) {
            addCriterion("picon <=", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconLike(String value) {
            addCriterion("picon like", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconNotLike(String value) {
            addCriterion("picon not like", value, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconIn(List<String> values) {
            addCriterion("picon in", values, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconNotIn(List<String> values) {
            addCriterion("picon not in", values, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconBetween(String value1, String value2) {
            addCriterion("picon between", value1, value2, "picon");
            return (Criteria) this;
        }

        public Criteria andPiconNotBetween(String value1, String value2) {
            addCriterion("picon not between", value1, value2, "picon");
            return (Criteria) this;
        }

        public Criteria andPlocationIsNull() {
            addCriterion("plocation is null");
            return (Criteria) this;
        }

        public Criteria andPlocationIsNotNull() {
            addCriterion("plocation is not null");
            return (Criteria) this;
        }

        public Criteria andPlocationEqualTo(String value) {
            addCriterion("plocation =", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotEqualTo(String value) {
            addCriterion("plocation <>", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationGreaterThan(String value) {
            addCriterion("plocation >", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationGreaterThanOrEqualTo(String value) {
            addCriterion("plocation >=", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLessThan(String value) {
            addCriterion("plocation <", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLessThanOrEqualTo(String value) {
            addCriterion("plocation <=", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLike(String value) {
            addCriterion("plocation like", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotLike(String value) {
            addCriterion("plocation not like", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationIn(List<String> values) {
            addCriterion("plocation in", values, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotIn(List<String> values) {
            addCriterion("plocation not in", values, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationBetween(String value1, String value2) {
            addCriterion("plocation between", value1, value2, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotBetween(String value1, String value2) {
            addCriterion("plocation not between", value1, value2, "plocation");
            return (Criteria) this;
        }

        public Criteria andPviewsIsNull() {
            addCriterion("pviews is null");
            return (Criteria) this;
        }

        public Criteria andPviewsIsNotNull() {
            addCriterion("pviews is not null");
            return (Criteria) this;
        }

        public Criteria andPviewsEqualTo(Integer value) {
            addCriterion("pviews =", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsNotEqualTo(Integer value) {
            addCriterion("pviews <>", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsGreaterThan(Integer value) {
            addCriterion("pviews >", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pviews >=", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsLessThan(Integer value) {
            addCriterion("pviews <", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsLessThanOrEqualTo(Integer value) {
            addCriterion("pviews <=", value, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsIn(List<Integer> values) {
            addCriterion("pviews in", values, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsNotIn(List<Integer> values) {
            addCriterion("pviews not in", values, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsBetween(Integer value1, Integer value2) {
            addCriterion("pviews between", value1, value2, "pviews");
            return (Criteria) this;
        }

        public Criteria andPviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("pviews not between", value1, value2, "pviews");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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