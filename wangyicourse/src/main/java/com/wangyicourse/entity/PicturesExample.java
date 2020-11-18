package com.wangyicourse.entity;

import java.util.ArrayList;
import java.util.List;

public class PicturesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicturesExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNull() {
            addCriterion("pictureid is null");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNotNull() {
            addCriterion("pictureid is not null");
            return (Criteria) this;
        }

        public Criteria andPictureidEqualTo(Integer value) {
            addCriterion("pictureid =", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotEqualTo(Integer value) {
            addCriterion("pictureid <>", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThan(Integer value) {
            addCriterion("pictureid >", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureid >=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThan(Integer value) {
            addCriterion("pictureid <", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureid <=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidIn(List<Integer> values) {
            addCriterion("pictureid in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotIn(List<Integer> values) {
            addCriterion("pictureid not in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidBetween(Integer value1, Integer value2) {
            addCriterion("pictureid between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureid not between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("page like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("page not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andDes1IsNull() {
            addCriterion("des1 is null");
            return (Criteria) this;
        }

        public Criteria andDes1IsNotNull() {
            addCriterion("des1 is not null");
            return (Criteria) this;
        }

        public Criteria andDes1EqualTo(String value) {
            addCriterion("des1 =", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotEqualTo(String value) {
            addCriterion("des1 <>", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1GreaterThan(String value) {
            addCriterion("des1 >", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1GreaterThanOrEqualTo(String value) {
            addCriterion("des1 >=", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1LessThan(String value) {
            addCriterion("des1 <", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1LessThanOrEqualTo(String value) {
            addCriterion("des1 <=", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1Like(String value) {
            addCriterion("des1 like", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotLike(String value) {
            addCriterion("des1 not like", value, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1In(List<String> values) {
            addCriterion("des1 in", values, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotIn(List<String> values) {
            addCriterion("des1 not in", values, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1Between(String value1, String value2) {
            addCriterion("des1 between", value1, value2, "des1");
            return (Criteria) this;
        }

        public Criteria andDes1NotBetween(String value1, String value2) {
            addCriterion("des1 not between", value1, value2, "des1");
            return (Criteria) this;
        }

        public Criteria andDes2IsNull() {
            addCriterion("des2 is null");
            return (Criteria) this;
        }

        public Criteria andDes2IsNotNull() {
            addCriterion("des2 is not null");
            return (Criteria) this;
        }

        public Criteria andDes2EqualTo(String value) {
            addCriterion("des2 =", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotEqualTo(String value) {
            addCriterion("des2 <>", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2GreaterThan(String value) {
            addCriterion("des2 >", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2GreaterThanOrEqualTo(String value) {
            addCriterion("des2 >=", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2LessThan(String value) {
            addCriterion("des2 <", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2LessThanOrEqualTo(String value) {
            addCriterion("des2 <=", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2Like(String value) {
            addCriterion("des2 like", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotLike(String value) {
            addCriterion("des2 not like", value, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2In(List<String> values) {
            addCriterion("des2 in", values, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotIn(List<String> values) {
            addCriterion("des2 not in", values, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2Between(String value1, String value2) {
            addCriterion("des2 between", value1, value2, "des2");
            return (Criteria) this;
        }

        public Criteria andDes2NotBetween(String value1, String value2) {
            addCriterion("des2 not between", value1, value2, "des2");
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