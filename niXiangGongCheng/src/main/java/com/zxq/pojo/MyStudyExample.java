package com.zxq.pojo;

import java.util.ArrayList;
import java.util.List;

public class MyStudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyStudyExample() {
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

        public Criteria andCoursestudyidIsNull() {
            addCriterion("courseStudyId is null");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidIsNotNull() {
            addCriterion("courseStudyId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidEqualTo(Integer value) {
            addCriterion("courseStudyId =", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidNotEqualTo(Integer value) {
            addCriterion("courseStudyId <>", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidGreaterThan(Integer value) {
            addCriterion("courseStudyId >", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseStudyId >=", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidLessThan(Integer value) {
            addCriterion("courseStudyId <", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidLessThanOrEqualTo(Integer value) {
            addCriterion("courseStudyId <=", value, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidIn(List<Integer> values) {
            addCriterion("courseStudyId in", values, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidNotIn(List<Integer> values) {
            addCriterion("courseStudyId not in", values, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidBetween(Integer value1, Integer value2) {
            addCriterion("courseStudyId between", value1, value2, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andCoursestudyidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseStudyId not between", value1, value2, "coursestudyid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andViewsrcIsNull() {
            addCriterion("viewsrc is null");
            return (Criteria) this;
        }

        public Criteria andViewsrcIsNotNull() {
            addCriterion("viewsrc is not null");
            return (Criteria) this;
        }

        public Criteria andViewsrcEqualTo(String value) {
            addCriterion("viewsrc =", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcNotEqualTo(String value) {
            addCriterion("viewsrc <>", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcGreaterThan(String value) {
            addCriterion("viewsrc >", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcGreaterThanOrEqualTo(String value) {
            addCriterion("viewsrc >=", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcLessThan(String value) {
            addCriterion("viewsrc <", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcLessThanOrEqualTo(String value) {
            addCriterion("viewsrc <=", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcLike(String value) {
            addCriterion("viewsrc like", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcNotLike(String value) {
            addCriterion("viewsrc not like", value, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcIn(List<String> values) {
            addCriterion("viewsrc in", values, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcNotIn(List<String> values) {
            addCriterion("viewsrc not in", values, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcBetween(String value1, String value2) {
            addCriterion("viewsrc between", value1, value2, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andViewsrcNotBetween(String value1, String value2) {
            addCriterion("viewsrc not between", value1, value2, "viewsrc");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
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