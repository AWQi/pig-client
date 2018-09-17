package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class SwineBreedingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwineBreedingExample() {
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

        public Criteria andEarlabelFemaleIsNull() {
            addCriterion("earlabel_female is null");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleIsNotNull() {
            addCriterion("earlabel_female is not null");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleEqualTo(Integer value) {
            addCriterion("earlabel_female =", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleNotEqualTo(Integer value) {
            addCriterion("earlabel_female <>", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleGreaterThan(Integer value) {
            addCriterion("earlabel_female >", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("earlabel_female >=", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleLessThan(Integer value) {
            addCriterion("earlabel_female <", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleLessThanOrEqualTo(Integer value) {
            addCriterion("earlabel_female <=", value, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleIn(List<Integer> values) {
            addCriterion("earlabel_female in", values, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleNotIn(List<Integer> values) {
            addCriterion("earlabel_female not in", values, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleBetween(Integer value1, Integer value2) {
            addCriterion("earlabel_female between", value1, value2, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelFemaleNotBetween(Integer value1, Integer value2) {
            addCriterion("earlabel_female not between", value1, value2, "earlabelFemale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleIsNull() {
            addCriterion("earlabel_male is null");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleIsNotNull() {
            addCriterion("earlabel_male is not null");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleEqualTo(Integer value) {
            addCriterion("earlabel_male =", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleNotEqualTo(Integer value) {
            addCriterion("earlabel_male <>", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleGreaterThan(Integer value) {
            addCriterion("earlabel_male >", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("earlabel_male >=", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleLessThan(Integer value) {
            addCriterion("earlabel_male <", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleLessThanOrEqualTo(Integer value) {
            addCriterion("earlabel_male <=", value, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleIn(List<Integer> values) {
            addCriterion("earlabel_male in", values, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleNotIn(List<Integer> values) {
            addCriterion("earlabel_male not in", values, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleBetween(Integer value1, Integer value2) {
            addCriterion("earlabel_male between", value1, value2, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andEarlabelMaleNotBetween(Integer value1, Integer value2) {
            addCriterion("earlabel_male not between", value1, value2, "earlabelMale");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageIsNull() {
            addCriterion("pigsty_message is null");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageIsNotNull() {
            addCriterion("pigsty_message is not null");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageEqualTo(String value) {
            addCriterion("pigsty_message =", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotEqualTo(String value) {
            addCriterion("pigsty_message <>", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageGreaterThan(String value) {
            addCriterion("pigsty_message >", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("pigsty_message >=", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageLessThan(String value) {
            addCriterion("pigsty_message <", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageLessThanOrEqualTo(String value) {
            addCriterion("pigsty_message <=", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageLike(String value) {
            addCriterion("pigsty_message like", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotLike(String value) {
            addCriterion("pigsty_message not like", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageIn(List<String> values) {
            addCriterion("pigsty_message in", values, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotIn(List<String> values) {
            addCriterion("pigsty_message not in", values, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageBetween(String value1, String value2) {
            addCriterion("pigsty_message between", value1, value2, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotBetween(String value1, String value2) {
            addCriterion("pigsty_message not between", value1, value2, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andBreederIsNull() {
            addCriterion("breeder is null");
            return (Criteria) this;
        }

        public Criteria andBreederIsNotNull() {
            addCriterion("breeder is not null");
            return (Criteria) this;
        }

        public Criteria andBreederEqualTo(String value) {
            addCriterion("breeder =", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederNotEqualTo(String value) {
            addCriterion("breeder <>", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederGreaterThan(String value) {
            addCriterion("breeder >", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederGreaterThanOrEqualTo(String value) {
            addCriterion("breeder >=", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederLessThan(String value) {
            addCriterion("breeder <", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederLessThanOrEqualTo(String value) {
            addCriterion("breeder <=", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederLike(String value) {
            addCriterion("breeder like", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederNotLike(String value) {
            addCriterion("breeder not like", value, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederIn(List<String> values) {
            addCriterion("breeder in", values, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederNotIn(List<String> values) {
            addCriterion("breeder not in", values, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederBetween(String value1, String value2) {
            addCriterion("breeder between", value1, value2, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederNotBetween(String value1, String value2) {
            addCriterion("breeder not between", value1, value2, "breeder");
            return (Criteria) this;
        }

        public Criteria andBreederWayIsNull() {
            addCriterion("breeder_way is null");
            return (Criteria) this;
        }

        public Criteria andBreederWayIsNotNull() {
            addCriterion("breeder_way is not null");
            return (Criteria) this;
        }

        public Criteria andBreederWayEqualTo(String value) {
            addCriterion("breeder_way =", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayNotEqualTo(String value) {
            addCriterion("breeder_way <>", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayGreaterThan(String value) {
            addCriterion("breeder_way >", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayGreaterThanOrEqualTo(String value) {
            addCriterion("breeder_way >=", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayLessThan(String value) {
            addCriterion("breeder_way <", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayLessThanOrEqualTo(String value) {
            addCriterion("breeder_way <=", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayLike(String value) {
            addCriterion("breeder_way like", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayNotLike(String value) {
            addCriterion("breeder_way not like", value, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayIn(List<String> values) {
            addCriterion("breeder_way in", values, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayNotIn(List<String> values) {
            addCriterion("breeder_way not in", values, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayBetween(String value1, String value2) {
            addCriterion("breeder_way between", value1, value2, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederWayNotBetween(String value1, String value2) {
            addCriterion("breeder_way not between", value1, value2, "breederWay");
            return (Criteria) this;
        }

        public Criteria andBreederDateIsNull() {
            addCriterion("breeder_date is null");
            return (Criteria) this;
        }

        public Criteria andBreederDateIsNotNull() {
            addCriterion("breeder_date is not null");
            return (Criteria) this;
        }

        public Criteria andBreederDateEqualTo(Long value) {
            addCriterion("breeder_date =", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateNotEqualTo(Long value) {
            addCriterion("breeder_date <>", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateGreaterThan(Long value) {
            addCriterion("breeder_date >", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateGreaterThanOrEqualTo(Long value) {
            addCriterion("breeder_date >=", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateLessThan(Long value) {
            addCriterion("breeder_date <", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateLessThanOrEqualTo(Long value) {
            addCriterion("breeder_date <=", value, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateIn(List<Long> values) {
            addCriterion("breeder_date in", values, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateNotIn(List<Long> values) {
            addCriterion("breeder_date not in", values, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateBetween(Long value1, Long value2) {
            addCriterion("breeder_date between", value1, value2, "breederDate");
            return (Criteria) this;
        }

        public Criteria andBreederDateNotBetween(Long value1, Long value2) {
            addCriterion("breeder_date not between", value1, value2, "breederDate");
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