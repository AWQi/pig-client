package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class EliminateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EliminateExample() {
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

        public Criteria andPigTypeIsNull() {
            addCriterion("pig_type is null");
            return (Criteria) this;
        }

        public Criteria andPigTypeIsNotNull() {
            addCriterion("pig_type is not null");
            return (Criteria) this;
        }

        public Criteria andPigTypeEqualTo(String value) {
            addCriterion("pig_type =", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeNotEqualTo(String value) {
            addCriterion("pig_type <>", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeGreaterThan(String value) {
            addCriterion("pig_type >", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pig_type >=", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeLessThan(String value) {
            addCriterion("pig_type <", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeLessThanOrEqualTo(String value) {
            addCriterion("pig_type <=", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeLike(String value) {
            addCriterion("pig_type like", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeNotLike(String value) {
            addCriterion("pig_type not like", value, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeIn(List<String> values) {
            addCriterion("pig_type in", values, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeNotIn(List<String> values) {
            addCriterion("pig_type not in", values, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeBetween(String value1, String value2) {
            addCriterion("pig_type between", value1, value2, "pigType");
            return (Criteria) this;
        }

        public Criteria andPigTypeNotBetween(String value1, String value2) {
            addCriterion("pig_type not between", value1, value2, "pigType");
            return (Criteria) this;
        }

        public Criteria andEliminateStageIsNull() {
            addCriterion("eliminate_stage is null");
            return (Criteria) this;
        }

        public Criteria andEliminateStageIsNotNull() {
            addCriterion("eliminate_stage is not null");
            return (Criteria) this;
        }

        public Criteria andEliminateStageEqualTo(String value) {
            addCriterion("eliminate_stage =", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageNotEqualTo(String value) {
            addCriterion("eliminate_stage <>", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageGreaterThan(String value) {
            addCriterion("eliminate_stage >", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageGreaterThanOrEqualTo(String value) {
            addCriterion("eliminate_stage >=", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageLessThan(String value) {
            addCriterion("eliminate_stage <", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageLessThanOrEqualTo(String value) {
            addCriterion("eliminate_stage <=", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageLike(String value) {
            addCriterion("eliminate_stage like", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageNotLike(String value) {
            addCriterion("eliminate_stage not like", value, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageIn(List<String> values) {
            addCriterion("eliminate_stage in", values, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageNotIn(List<String> values) {
            addCriterion("eliminate_stage not in", values, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageBetween(String value1, String value2) {
            addCriterion("eliminate_stage between", value1, value2, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateStageNotBetween(String value1, String value2) {
            addCriterion("eliminate_stage not between", value1, value2, "eliminateStage");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeIsNull() {
            addCriterion("eliminate_type is null");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeIsNotNull() {
            addCriterion("eliminate_type is not null");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeEqualTo(String value) {
            addCriterion("eliminate_type =", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeNotEqualTo(String value) {
            addCriterion("eliminate_type <>", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeGreaterThan(String value) {
            addCriterion("eliminate_type >", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("eliminate_type >=", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeLessThan(String value) {
            addCriterion("eliminate_type <", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeLessThanOrEqualTo(String value) {
            addCriterion("eliminate_type <=", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeLike(String value) {
            addCriterion("eliminate_type like", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeNotLike(String value) {
            addCriterion("eliminate_type not like", value, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeIn(List<String> values) {
            addCriterion("eliminate_type in", values, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeNotIn(List<String> values) {
            addCriterion("eliminate_type not in", values, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeBetween(String value1, String value2) {
            addCriterion("eliminate_type between", value1, value2, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateTypeNotBetween(String value1, String value2) {
            addCriterion("eliminate_type not between", value1, value2, "eliminateType");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonIsNull() {
            addCriterion("eliminate_reason is null");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonIsNotNull() {
            addCriterion("eliminate_reason is not null");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonEqualTo(String value) {
            addCriterion("eliminate_reason =", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonNotEqualTo(String value) {
            addCriterion("eliminate_reason <>", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonGreaterThan(String value) {
            addCriterion("eliminate_reason >", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("eliminate_reason >=", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonLessThan(String value) {
            addCriterion("eliminate_reason <", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonLessThanOrEqualTo(String value) {
            addCriterion("eliminate_reason <=", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonLike(String value) {
            addCriterion("eliminate_reason like", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonNotLike(String value) {
            addCriterion("eliminate_reason not like", value, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonIn(List<String> values) {
            addCriterion("eliminate_reason in", values, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonNotIn(List<String> values) {
            addCriterion("eliminate_reason not in", values, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonBetween(String value1, String value2) {
            addCriterion("eliminate_reason between", value1, value2, "eliminateReason");
            return (Criteria) this;
        }

        public Criteria andEliminateReasonNotBetween(String value1, String value2) {
            addCriterion("eliminate_reason not between", value1, value2, "eliminateReason");
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

        public Criteria andEliminateDateIsNull() {
            addCriterion("eliminate_date is null");
            return (Criteria) this;
        }

        public Criteria andEliminateDateIsNotNull() {
            addCriterion("eliminate_date is not null");
            return (Criteria) this;
        }

        public Criteria andEliminateDateEqualTo(Long value) {
            addCriterion("eliminate_date =", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateNotEqualTo(Long value) {
            addCriterion("eliminate_date <>", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateGreaterThan(Long value) {
            addCriterion("eliminate_date >", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateGreaterThanOrEqualTo(Long value) {
            addCriterion("eliminate_date >=", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateLessThan(Long value) {
            addCriterion("eliminate_date <", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateLessThanOrEqualTo(Long value) {
            addCriterion("eliminate_date <=", value, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateIn(List<Long> values) {
            addCriterion("eliminate_date in", values, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateNotIn(List<Long> values) {
            addCriterion("eliminate_date not in", values, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateBetween(Long value1, Long value2) {
            addCriterion("eliminate_date between", value1, value2, "eliminateDate");
            return (Criteria) this;
        }

        public Criteria andEliminateDateNotBetween(Long value1, Long value2) {
            addCriterion("eliminate_date not between", value1, value2, "eliminateDate");
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