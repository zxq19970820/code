package com.wangyicourse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCoursepriceIsNull() {
            addCriterion("courseprice is null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNotNull() {
            addCriterion("courseprice is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceEqualTo(BigDecimal value) {
            addCriterion("courseprice =", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotEqualTo(BigDecimal value) {
            addCriterion("courseprice <>", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThan(BigDecimal value) {
            addCriterion("courseprice >", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("courseprice >=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThan(BigDecimal value) {
            addCriterion("courseprice <", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("courseprice <=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIn(List<BigDecimal> values) {
            addCriterion("courseprice in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotIn(List<BigDecimal> values) {
            addCriterion("courseprice not in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("courseprice between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("courseprice not between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andSubscribenumIsNull() {
            addCriterion("subscribenum is null");
            return (Criteria) this;
        }

        public Criteria andSubscribenumIsNotNull() {
            addCriterion("subscribenum is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribenumEqualTo(Integer value) {
            addCriterion("subscribenum =", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumNotEqualTo(Integer value) {
            addCriterion("subscribenum <>", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumGreaterThan(Integer value) {
            addCriterion("subscribenum >", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscribenum >=", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumLessThan(Integer value) {
            addCriterion("subscribenum <", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumLessThanOrEqualTo(Integer value) {
            addCriterion("subscribenum <=", value, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumIn(List<Integer> values) {
            addCriterion("subscribenum in", values, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumNotIn(List<Integer> values) {
            addCriterion("subscribenum not in", values, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumBetween(Integer value1, Integer value2) {
            addCriterion("subscribenum between", value1, value2, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andSubscribenumNotBetween(Integer value1, Integer value2) {
            addCriterion("subscribenum not between", value1, value2, "subscribenum");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNull() {
            addCriterion("coursehour is null");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNotNull() {
            addCriterion("coursehour is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehourEqualTo(Integer value) {
            addCriterion("coursehour =", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotEqualTo(Integer value) {
            addCriterion("coursehour <>", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThan(Integer value) {
            addCriterion("coursehour >", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursehour >=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThan(Integer value) {
            addCriterion("coursehour <", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThanOrEqualTo(Integer value) {
            addCriterion("coursehour <=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourIn(List<Integer> values) {
            addCriterion("coursehour in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotIn(List<Integer> values) {
            addCriterion("coursehour not in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourBetween(Integer value1, Integer value2) {
            addCriterion("coursehour between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotBetween(Integer value1, Integer value2) {
            addCriterion("coursehour not between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCategory3idIsNull() {
            addCriterion("category3id is null");
            return (Criteria) this;
        }

        public Criteria andCategory3idIsNotNull() {
            addCriterion("category3id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3idEqualTo(Integer value) {
            addCriterion("category3id =", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotEqualTo(Integer value) {
            addCriterion("category3id <>", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idGreaterThan(Integer value) {
            addCriterion("category3id >", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category3id >=", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idLessThan(Integer value) {
            addCriterion("category3id <", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idLessThanOrEqualTo(Integer value) {
            addCriterion("category3id <=", value, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idIn(List<Integer> values) {
            addCriterion("category3id in", values, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotIn(List<Integer> values) {
            addCriterion("category3id not in", values, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idBetween(Integer value1, Integer value2) {
            addCriterion("category3id between", value1, value2, "category3id");
            return (Criteria) this;
        }

        public Criteria andCategory3idNotBetween(Integer value1, Integer value2) {
            addCriterion("category3id not between", value1, value2, "category3id");
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

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("publish like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("publish not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andValidtimeIsNull() {
            addCriterion("validtime is null");
            return (Criteria) this;
        }

        public Criteria andValidtimeIsNotNull() {
            addCriterion("validtime is not null");
            return (Criteria) this;
        }

        public Criteria andValidtimeEqualTo(String value) {
            addCriterion("validtime =", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotEqualTo(String value) {
            addCriterion("validtime <>", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeGreaterThan(String value) {
            addCriterion("validtime >", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeGreaterThanOrEqualTo(String value) {
            addCriterion("validtime >=", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeLessThan(String value) {
            addCriterion("validtime <", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeLessThanOrEqualTo(String value) {
            addCriterion("validtime <=", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeLike(String value) {
            addCriterion("validtime like", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotLike(String value) {
            addCriterion("validtime not like", value, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeIn(List<String> values) {
            addCriterion("validtime in", values, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotIn(List<String> values) {
            addCriterion("validtime not in", values, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeBetween(String value1, String value2) {
            addCriterion("validtime between", value1, value2, "validtime");
            return (Criteria) this;
        }

        public Criteria andValidtimeNotBetween(String value1, String value2) {
            addCriterion("validtime not between", value1, value2, "validtime");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIsNull() {
            addCriterion("institutionid is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIsNotNull() {
            addCriterion("institutionid is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidEqualTo(Integer value) {
            addCriterion("institutionid =", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotEqualTo(Integer value) {
            addCriterion("institutionid <>", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThan(Integer value) {
            addCriterion("institutionid >", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("institutionid >=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThan(Integer value) {
            addCriterion("institutionid <", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThanOrEqualTo(Integer value) {
            addCriterion("institutionid <=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIn(List<Integer> values) {
            addCriterion("institutionid in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotIn(List<Integer> values) {
            addCriterion("institutionid not in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidBetween(Integer value1, Integer value2) {
            addCriterion("institutionid between", value1, value2, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotBetween(Integer value1, Integer value2) {
            addCriterion("institutionid not between", value1, value2, "institutionid");
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