package com.pig.client.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImmuneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImmuneExample() {
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

        public Criteria andImmuneNameIsNull() {
            addCriterion("immune_name is null");
            return (Criteria) this;
        }

        public Criteria andImmuneNameIsNotNull() {
            addCriterion("immune_name is not null");
            return (Criteria) this;
        }

        public Criteria andImmuneNameEqualTo(String value) {
            addCriterion("immune_name =", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameNotEqualTo(String value) {
            addCriterion("immune_name <>", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameGreaterThan(String value) {
            addCriterion("immune_name >", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameGreaterThanOrEqualTo(String value) {
            addCriterion("immune_name >=", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameLessThan(String value) {
            addCriterion("immune_name <", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameLessThanOrEqualTo(String value) {
            addCriterion("immune_name <=", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameLike(String value) {
            addCriterion("immune_name like", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameNotLike(String value) {
            addCriterion("immune_name not like", value, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameIn(List<String> values) {
            addCriterion("immune_name in", values, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameNotIn(List<String> values) {
            addCriterion("immune_name not in", values, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameBetween(String value1, String value2) {
            addCriterion("immune_name between", value1, value2, "immuneName");
            return (Criteria) this;
        }

        public Criteria andImmuneNameNotBetween(String value1, String value2) {
            addCriterion("immune_name not between", value1, value2, "immuneName");
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

        public Criteria andImmuneDateIsNull() {
            addCriterion("immune_date is null");
            return (Criteria) this;
        }

        public Criteria andImmuneDateIsNotNull() {
            addCriterion("immune_date is not null");
            return (Criteria) this;
        }

        public Criteria andImmuneDateEqualTo(Long value) {
            addCriterion("immune_date =", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateNotEqualTo(Long value) {
            addCriterion("immune_date <>", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateGreaterThan(Long value) {
            addCriterion("immune_date >", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateGreaterThanOrEqualTo(Long value) {
            addCriterion("immune_date >=", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateLessThan(Long value) {
            addCriterion("immune_date <", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateLessThanOrEqualTo(Long value) {
            addCriterion("immune_date <=", value, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateIn(List<Long> values) {
            addCriterion("immune_date in", values, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateNotIn(List<Long> values) {
            addCriterion("immune_date not in", values, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateBetween(Long value1, Long value2) {
            addCriterion("immune_date between", value1, value2, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andImmuneDateNotBetween(Long value1, Long value2) {
            addCriterion("immune_date not between", value1, value2, "immuneDate");
            return (Criteria) this;
        }

        public Criteria andVaccineIsNull() {
            addCriterion("vaccine is null");
            return (Criteria) this;
        }

        public Criteria andVaccineIsNotNull() {
            addCriterion("vaccine is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineEqualTo(String value) {
            addCriterion("vaccine =", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotEqualTo(String value) {
            addCriterion("vaccine <>", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineGreaterThan(String value) {
            addCriterion("vaccine >", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine >=", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLessThan(String value) {
            addCriterion("vaccine <", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLessThanOrEqualTo(String value) {
            addCriterion("vaccine <=", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLike(String value) {
            addCriterion("vaccine like", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotLike(String value) {
            addCriterion("vaccine not like", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineIn(List<String> values) {
            addCriterion("vaccine in", values, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotIn(List<String> values) {
            addCriterion("vaccine not in", values, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineBetween(String value1, String value2) {
            addCriterion("vaccine between", value1, value2, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotBetween(String value1, String value2) {
            addCriterion("vaccine not between", value1, value2, "vaccine");
            return (Criteria) this;
        }

        public Criteria andUnitDoseIsNull() {
            addCriterion("unit_dose is null");
            return (Criteria) this;
        }

        public Criteria andUnitDoseIsNotNull() {
            addCriterion("unit_dose is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDoseEqualTo(Float value) {
            addCriterion("unit_dose =", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseNotEqualTo(Float value) {
            addCriterion("unit_dose <>", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseGreaterThan(Float value) {
            addCriterion("unit_dose >", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_dose >=", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseLessThan(Float value) {
            addCriterion("unit_dose <", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseLessThanOrEqualTo(Float value) {
            addCriterion("unit_dose <=", value, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseIn(List<Float> values) {
            addCriterion("unit_dose in", values, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseNotIn(List<Float> values) {
            addCriterion("unit_dose not in", values, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseBetween(Float value1, Float value2) {
            addCriterion("unit_dose between", value1, value2, "unitDose");
            return (Criteria) this;
        }

        public Criteria andUnitDoseNotBetween(Float value1, Float value2) {
            addCriterion("unit_dose not between", value1, value2, "unitDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseIsNull() {
            addCriterion("total_dose is null");
            return (Criteria) this;
        }

        public Criteria andTotalDoseIsNotNull() {
            addCriterion("total_dose is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDoseEqualTo(Float value) {
            addCriterion("total_dose =", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseNotEqualTo(Float value) {
            addCriterion("total_dose <>", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseGreaterThan(Float value) {
            addCriterion("total_dose >", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseGreaterThanOrEqualTo(Float value) {
            addCriterion("total_dose >=", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseLessThan(Float value) {
            addCriterion("total_dose <", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseLessThanOrEqualTo(Float value) {
            addCriterion("total_dose <=", value, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseIn(List<Float> values) {
            addCriterion("total_dose in", values, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseNotIn(List<Float> values) {
            addCriterion("total_dose not in", values, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseBetween(Float value1, Float value2) {
            addCriterion("total_dose between", value1, value2, "totalDose");
            return (Criteria) this;
        }

        public Criteria andTotalDoseNotBetween(Float value1, Float value2) {
            addCriterion("total_dose not between", value1, value2, "totalDose");
            return (Criteria) this;
        }

        public Criteria andPrickleIsNull() {
            addCriterion("prickle is null");
            return (Criteria) this;
        }

        public Criteria andPrickleIsNotNull() {
            addCriterion("prickle is not null");
            return (Criteria) this;
        }

        public Criteria andPrickleEqualTo(String value) {
            addCriterion("prickle =", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleNotEqualTo(String value) {
            addCriterion("prickle <>", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleGreaterThan(String value) {
            addCriterion("prickle >", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleGreaterThanOrEqualTo(String value) {
            addCriterion("prickle >=", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleLessThan(String value) {
            addCriterion("prickle <", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleLessThanOrEqualTo(String value) {
            addCriterion("prickle <=", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleLike(String value) {
            addCriterion("prickle like", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleNotLike(String value) {
            addCriterion("prickle not like", value, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleIn(List<String> values) {
            addCriterion("prickle in", values, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleNotIn(List<String> values) {
            addCriterion("prickle not in", values, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleBetween(String value1, String value2) {
            addCriterion("prickle between", value1, value2, "prickle");
            return (Criteria) this;
        }

        public Criteria andPrickleNotBetween(String value1, String value2) {
            addCriterion("prickle not between", value1, value2, "prickle");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeIsNull() {
            addCriterion("immune_type is null");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeIsNotNull() {
            addCriterion("immune_type is not null");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeEqualTo(String value) {
            addCriterion("immune_type =", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeNotEqualTo(String value) {
            addCriterion("immune_type <>", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeGreaterThan(String value) {
            addCriterion("immune_type >", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("immune_type >=", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeLessThan(String value) {
            addCriterion("immune_type <", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeLessThanOrEqualTo(String value) {
            addCriterion("immune_type <=", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeLike(String value) {
            addCriterion("immune_type like", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeNotLike(String value) {
            addCriterion("immune_type not like", value, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeIn(List<String> values) {
            addCriterion("immune_type in", values, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeNotIn(List<String> values) {
            addCriterion("immune_type not in", values, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeBetween(String value1, String value2) {
            addCriterion("immune_type between", value1, value2, "immuneType");
            return (Criteria) this;
        }

        public Criteria andImmuneTypeNotBetween(String value1, String value2) {
            addCriterion("immune_type not between", value1, value2, "immuneType");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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