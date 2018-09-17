package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChangePigstyCommercialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangePigstyCommercialExample() {
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

        public Criteria andTurngroupTypeIsNull() {
            addCriterion("turngroup_type is null");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeIsNotNull() {
            addCriterion("turngroup_type is not null");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeEqualTo(String value) {
            addCriterion("turngroup_type =", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeNotEqualTo(String value) {
            addCriterion("turngroup_type <>", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeGreaterThan(String value) {
            addCriterion("turngroup_type >", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("turngroup_type >=", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeLessThan(String value) {
            addCriterion("turngroup_type <", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeLessThanOrEqualTo(String value) {
            addCriterion("turngroup_type <=", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeLike(String value) {
            addCriterion("turngroup_type like", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeNotLike(String value) {
            addCriterion("turngroup_type not like", value, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeIn(List<String> values) {
            addCriterion("turngroup_type in", values, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeNotIn(List<String> values) {
            addCriterion("turngroup_type not in", values, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeBetween(String value1, String value2) {
            addCriterion("turngroup_type between", value1, value2, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andTurngroupTypeNotBetween(String value1, String value2) {
            addCriterion("turngroup_type not between", value1, value2, "turngroupType");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNull() {
            addCriterion("batch_number is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(Integer value) {
            addCriterion("batch_number =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(Integer value) {
            addCriterion("batch_number <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(Integer value) {
            addCriterion("batch_number >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_number >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(Integer value) {
            addCriterion("batch_number <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("batch_number <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<Integer> values) {
            addCriterion("batch_number in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<Integer> values) {
            addCriterion("batch_number not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(Integer value1, Integer value2) {
            addCriterion("batch_number between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_number not between", value1, value2, "batchNumber");
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andTotalWeightIsNull() {
            addCriterion("total_weight is null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNotNull() {
            addCriterion("total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightEqualTo(Float value) {
            addCriterion("total_weight =", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotEqualTo(Float value) {
            addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThan(Float value) {
            addCriterion("total_weight >", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThan(Float value) {
            addCriterion("total_weight <", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThanOrEqualTo(Float value) {
            addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIn(List<Float> values) {
            addCriterion("total_weight in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotIn(List<Float> values) {
            addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightBetween(Float value1, Float value2) {
            addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotBetween(Float value1, Float value2) {
            addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Long value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Long value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Long value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Long value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Long value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Long value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Long> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Long> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Long value1, Long value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Long value1, Long value2) {
            addCriterion("date not between", value1, value2, "date");
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