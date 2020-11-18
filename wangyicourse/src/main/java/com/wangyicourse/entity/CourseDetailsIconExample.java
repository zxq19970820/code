package com.wangyicourse.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseDetailsIconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseDetailsIconExample() {
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

        public Criteria andCoursedetailsidIsNull() {
            addCriterion("coursedetailsid is null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidIsNotNull() {
            addCriterion("coursedetailsid is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidEqualTo(Integer value) {
            addCriterion("coursedetailsid =", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidNotEqualTo(Integer value) {
            addCriterion("coursedetailsid <>", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidGreaterThan(Integer value) {
            addCriterion("coursedetailsid >", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursedetailsid >=", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidLessThan(Integer value) {
            addCriterion("coursedetailsid <", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("coursedetailsid <=", value, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidIn(List<Integer> values) {
            addCriterion("coursedetailsid in", values, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidNotIn(List<Integer> values) {
            addCriterion("coursedetailsid not in", values, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidBetween(Integer value1, Integer value2) {
            addCriterion("coursedetailsid between", value1, value2, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("coursedetailsid not between", value1, value2, "coursedetailsid");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcIsNull() {
            addCriterion("coursedetailsiconsrc is null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcIsNotNull() {
            addCriterion("coursedetailsiconsrc is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcEqualTo(String value) {
            addCriterion("coursedetailsiconsrc =", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcNotEqualTo(String value) {
            addCriterion("coursedetailsiconsrc <>", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcGreaterThan(String value) {
            addCriterion("coursedetailsiconsrc >", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcGreaterThanOrEqualTo(String value) {
            addCriterion("coursedetailsiconsrc >=", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcLessThan(String value) {
            addCriterion("coursedetailsiconsrc <", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcLessThanOrEqualTo(String value) {
            addCriterion("coursedetailsiconsrc <=", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcLike(String value) {
            addCriterion("coursedetailsiconsrc like", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcNotLike(String value) {
            addCriterion("coursedetailsiconsrc not like", value, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcIn(List<String> values) {
            addCriterion("coursedetailsiconsrc in", values, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcNotIn(List<String> values) {
            addCriterion("coursedetailsiconsrc not in", values, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcBetween(String value1, String value2) {
            addCriterion("coursedetailsiconsrc between", value1, value2, "coursedetailsiconsrc");
            return (Criteria) this;
        }

        public Criteria andCoursedetailsiconsrcNotBetween(String value1, String value2) {
            addCriterion("coursedetailsiconsrc not between", value1, value2, "coursedetailsiconsrc");
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