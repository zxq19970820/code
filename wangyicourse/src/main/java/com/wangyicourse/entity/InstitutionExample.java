package com.wangyicourse.entity;

import java.util.ArrayList;
import java.util.List;

public class InstitutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionExample() {
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

        public Criteria andInnameIsNull() {
            addCriterion("inname is null");
            return (Criteria) this;
        }

        public Criteria andInnameIsNotNull() {
            addCriterion("inname is not null");
            return (Criteria) this;
        }

        public Criteria andInnameEqualTo(String value) {
            addCriterion("inname =", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameNotEqualTo(String value) {
            addCriterion("inname <>", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameGreaterThan(String value) {
            addCriterion("inname >", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameGreaterThanOrEqualTo(String value) {
            addCriterion("inname >=", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameLessThan(String value) {
            addCriterion("inname <", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameLessThanOrEqualTo(String value) {
            addCriterion("inname <=", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameLike(String value) {
            addCriterion("inname like", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameNotLike(String value) {
            addCriterion("inname not like", value, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameIn(List<String> values) {
            addCriterion("inname in", values, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameNotIn(List<String> values) {
            addCriterion("inname not in", values, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameBetween(String value1, String value2) {
            addCriterion("inname between", value1, value2, "inname");
            return (Criteria) this;
        }

        public Criteria andInnameNotBetween(String value1, String value2) {
            addCriterion("inname not between", value1, value2, "inname");
            return (Criteria) this;
        }

        public Criteria andInpasswordIsNull() {
            addCriterion("inpassword is null");
            return (Criteria) this;
        }

        public Criteria andInpasswordIsNotNull() {
            addCriterion("inpassword is not null");
            return (Criteria) this;
        }

        public Criteria andInpasswordEqualTo(String value) {
            addCriterion("inpassword =", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordNotEqualTo(String value) {
            addCriterion("inpassword <>", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordGreaterThan(String value) {
            addCriterion("inpassword >", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("inpassword >=", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordLessThan(String value) {
            addCriterion("inpassword <", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordLessThanOrEqualTo(String value) {
            addCriterion("inpassword <=", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordLike(String value) {
            addCriterion("inpassword like", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordNotLike(String value) {
            addCriterion("inpassword not like", value, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordIn(List<String> values) {
            addCriterion("inpassword in", values, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordNotIn(List<String> values) {
            addCriterion("inpassword not in", values, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordBetween(String value1, String value2) {
            addCriterion("inpassword between", value1, value2, "inpassword");
            return (Criteria) this;
        }

        public Criteria andInpasswordNotBetween(String value1, String value2) {
            addCriterion("inpassword not between", value1, value2, "inpassword");
            return (Criteria) this;
        }

        public Criteria andDescribeeIsNull() {
            addCriterion("describee is null");
            return (Criteria) this;
        }

        public Criteria andDescribeeIsNotNull() {
            addCriterion("describee is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeeEqualTo(String value) {
            addCriterion("describee =", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotEqualTo(String value) {
            addCriterion("describee <>", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeGreaterThan(String value) {
            addCriterion("describee >", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeGreaterThanOrEqualTo(String value) {
            addCriterion("describee >=", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLessThan(String value) {
            addCriterion("describee <", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLessThanOrEqualTo(String value) {
            addCriterion("describee <=", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLike(String value) {
            addCriterion("describee like", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotLike(String value) {
            addCriterion("describee not like", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeIn(List<String> values) {
            addCriterion("describee in", values, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotIn(List<String> values) {
            addCriterion("describee not in", values, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeBetween(String value1, String value2) {
            addCriterion("describee between", value1, value2, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotBetween(String value1, String value2) {
            addCriterion("describee not between", value1, value2, "describee");
            return (Criteria) this;
        }

        public Criteria andIconsrcIsNull() {
            addCriterion("iconsrc is null");
            return (Criteria) this;
        }

        public Criteria andIconsrcIsNotNull() {
            addCriterion("iconsrc is not null");
            return (Criteria) this;
        }

        public Criteria andIconsrcEqualTo(String value) {
            addCriterion("iconsrc =", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcNotEqualTo(String value) {
            addCriterion("iconsrc <>", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcGreaterThan(String value) {
            addCriterion("iconsrc >", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcGreaterThanOrEqualTo(String value) {
            addCriterion("iconsrc >=", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcLessThan(String value) {
            addCriterion("iconsrc <", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcLessThanOrEqualTo(String value) {
            addCriterion("iconsrc <=", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcLike(String value) {
            addCriterion("iconsrc like", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcNotLike(String value) {
            addCriterion("iconsrc not like", value, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcIn(List<String> values) {
            addCriterion("iconsrc in", values, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcNotIn(List<String> values) {
            addCriterion("iconsrc not in", values, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcBetween(String value1, String value2) {
            addCriterion("iconsrc between", value1, value2, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andIconsrcNotBetween(String value1, String value2) {
            addCriterion("iconsrc not between", value1, value2, "iconsrc");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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