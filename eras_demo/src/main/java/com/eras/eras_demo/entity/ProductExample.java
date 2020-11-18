package com.eras.eras_demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPpriceIsNull() {
            addCriterion("pprice is null");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNotNull() {
            addCriterion("pprice is not null");
            return (Criteria) this;
        }

        public Criteria andPpriceEqualTo(Double value) {
            addCriterion("pprice =", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotEqualTo(Double value) {
            addCriterion("pprice <>", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThan(Double value) {
            addCriterion("pprice >", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pprice >=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThan(Double value) {
            addCriterion("pprice <", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThanOrEqualTo(Double value) {
            addCriterion("pprice <=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceIn(List<Double> values) {
            addCriterion("pprice in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotIn(List<Double> values) {
            addCriterion("pprice not in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceBetween(Double value1, Double value2) {
            addCriterion("pprice between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotBetween(Double value1, Double value2) {
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

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andPstateIsNull() {
            addCriterion("pstate is null");
            return (Criteria) this;
        }

        public Criteria andPstateIsNotNull() {
            addCriterion("pstate is not null");
            return (Criteria) this;
        }

        public Criteria andPstateEqualTo(String value) {
            addCriterion("pstate =", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotEqualTo(String value) {
            addCriterion("pstate <>", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThan(String value) {
            addCriterion("pstate >", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThanOrEqualTo(String value) {
            addCriterion("pstate >=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThan(String value) {
            addCriterion("pstate <", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThanOrEqualTo(String value) {
            addCriterion("pstate <=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLike(String value) {
            addCriterion("pstate like", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotLike(String value) {
            addCriterion("pstate not like", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateIn(List<String> values) {
            addCriterion("pstate in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotIn(List<String> values) {
            addCriterion("pstate not in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateBetween(String value1, String value2) {
            addCriterion("pstate between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotBetween(String value1, String value2) {
            addCriterion("pstate not between", value1, value2, "pstate");
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