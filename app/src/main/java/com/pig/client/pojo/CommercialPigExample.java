package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommercialPigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommercialPigExample() {
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

        public Criteria andPigstyMessageEqualTo(Integer value) {
            addCriterion("pigsty_message =", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotEqualTo(Integer value) {
            addCriterion("pigsty_message <>", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageGreaterThan(Integer value) {
            addCriterion("pigsty_message >", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageGreaterThanOrEqualTo(Integer value) {
            addCriterion("pigsty_message >=", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageLessThan(Integer value) {
            addCriterion("pigsty_message <", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageLessThanOrEqualTo(Integer value) {
            addCriterion("pigsty_message <=", value, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageIn(List<Integer> values) {
            addCriterion("pigsty_message in", values, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotIn(List<Integer> values) {
            addCriterion("pigsty_message not in", values, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageBetween(Integer value1, Integer value2) {
            addCriterion("pigsty_message between", value1, value2, "pigstyMessage");
            return (Criteria) this;
        }

        public Criteria andPigstyMessageNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andBusinessDateIsNull() {
            addCriterion("Business_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNotNull() {
            addCriterion("Business_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateEqualTo(Long value) {
            addCriterion("Business_date =", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotEqualTo(Long value) {
            addCriterion("Business_date <>", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThan(Long value) {
            addCriterion("Business_date >", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThanOrEqualTo(Long value) {
            addCriterion("Business_date >=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThan(Long value) {
            addCriterion("Business_date <", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThanOrEqualTo(Long value) {
            addCriterion("Business_date <=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIn(List<Long> values) {
            addCriterion("Business_date in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotIn(List<Long> values) {
            addCriterion("Business_date not in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateBetween(Long value1, Long value2) {
            addCriterion("Business_date between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotBetween(Long value1, Long value2) {
            addCriterion("Business_date not between", value1, value2, "businessDate");
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