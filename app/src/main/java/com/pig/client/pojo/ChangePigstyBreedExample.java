package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChangePigstyBreedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangePigstyBreedExample() {
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

        public Criteria andEarlabelIsNull() {
            addCriterion("earlabel is null");
            return (Criteria) this;
        }

        public Criteria andEarlabelIsNotNull() {
            addCriterion("earlabel is not null");
            return (Criteria) this;
        }

        public Criteria andEarlabelEqualTo(Integer value) {
            addCriterion("earlabel =", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelNotEqualTo(Integer value) {
            addCriterion("earlabel <>", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelGreaterThan(Integer value) {
            addCriterion("earlabel >", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelGreaterThanOrEqualTo(Integer value) {
            addCriterion("earlabel >=", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelLessThan(Integer value) {
            addCriterion("earlabel <", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelLessThanOrEqualTo(Integer value) {
            addCriterion("earlabel <=", value, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelIn(List<Integer> values) {
            addCriterion("earlabel in", values, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelNotIn(List<Integer> values) {
            addCriterion("earlabel not in", values, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelBetween(Integer value1, Integer value2) {
            addCriterion("earlabel between", value1, value2, "earlabel");
            return (Criteria) this;
        }

        public Criteria andEarlabelNotBetween(Integer value1, Integer value2) {
            addCriterion("earlabel not between", value1, value2, "earlabel");
            return (Criteria) this;
        }

        public Criteria andOutPigstyIsNull() {
            addCriterion("out_pigsty is null");
            return (Criteria) this;
        }

        public Criteria andOutPigstyIsNotNull() {
            addCriterion("out_pigsty is not null");
            return (Criteria) this;
        }

        public Criteria andOutPigstyEqualTo(Integer value) {
            addCriterion("out_pigsty =", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyNotEqualTo(Integer value) {
            addCriterion("out_pigsty <>", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyGreaterThan(Integer value) {
            addCriterion("out_pigsty >", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_pigsty >=", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyLessThan(Integer value) {
            addCriterion("out_pigsty <", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyLessThanOrEqualTo(Integer value) {
            addCriterion("out_pigsty <=", value, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyIn(List<Integer> values) {
            addCriterion("out_pigsty in", values, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyNotIn(List<Integer> values) {
            addCriterion("out_pigsty not in", values, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyBetween(Integer value1, Integer value2) {
            addCriterion("out_pigsty between", value1, value2, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andOutPigstyNotBetween(Integer value1, Integer value2) {
            addCriterion("out_pigsty not between", value1, value2, "outPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyIsNull() {
            addCriterion("in_pigsty is null");
            return (Criteria) this;
        }

        public Criteria andInPigstyIsNotNull() {
            addCriterion("in_pigsty is not null");
            return (Criteria) this;
        }

        public Criteria andInPigstyEqualTo(Integer value) {
            addCriterion("in_pigsty =", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyNotEqualTo(Integer value) {
            addCriterion("in_pigsty <>", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyGreaterThan(Integer value) {
            addCriterion("in_pigsty >", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_pigsty >=", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyLessThan(Integer value) {
            addCriterion("in_pigsty <", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyLessThanOrEqualTo(Integer value) {
            addCriterion("in_pigsty <=", value, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyIn(List<Integer> values) {
            addCriterion("in_pigsty in", values, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyNotIn(List<Integer> values) {
            addCriterion("in_pigsty not in", values, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyBetween(Integer value1, Integer value2) {
            addCriterion("in_pigsty between", value1, value2, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andInPigstyNotBetween(Integer value1, Integer value2) {
            addCriterion("in_pigsty not between", value1, value2, "inPigsty");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateIsNull() {
            addCriterion("turngroup_date is null");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateIsNotNull() {
            addCriterion("turngroup_date is not null");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateEqualTo(Long value) {
            addCriterion("turngroup_date =", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateNotEqualTo(Long value) {
            addCriterion("turngroup_date <>", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateGreaterThan(Long value) {
            addCriterion("turngroup_date >", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateGreaterThanOrEqualTo(Long value) {
            addCriterion("turngroup_date >=", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateLessThan(Long value) {
            addCriterion("turngroup_date <", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateLessThanOrEqualTo(Long value) {
            addCriterion("turngroup_date <=", value, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateIn(List<Long> values) {
            addCriterion("turngroup_date in", values, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateNotIn(List<Long> values) {
            addCriterion("turngroup_date not in", values, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateBetween(Long value1, Long value2) {
            addCriterion("turngroup_date between", value1, value2, "turngroupDate");
            return (Criteria) this;
        }

        public Criteria andTurngroupDateNotBetween(Long value1, Long value2) {
            addCriterion("turngroup_date not between", value1, value2, "turngroupDate");
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