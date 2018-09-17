package com.pig.client.pojo;

public class Immune {
    private Integer id;

    private String immuneName;

    private Integer earlabel;

    private Long immuneDate;

    private String vaccine;

    private Float unitDose;

    private Float totalDose;

    private String prickle;

    private String immuneType;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImmuneName() {
        return immuneName;
    }

    public void setImmuneName(String immuneName) {
        this.immuneName = immuneName == null ? null : immuneName.trim();
    }

    public Integer getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(Integer earlabel) {
        this.earlabel = earlabel;
    }

    public Long getImmuneDate() {
        return immuneDate;
    }

    public void setImmuneDate(Long immuneDate) {
        this.immuneDate = immuneDate;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine == null ? null : vaccine.trim();
    }

    public Float getUnitDose() {
        return unitDose;
    }

    public void setUnitDose(Float unitDose) {
        this.unitDose = unitDose;
    }

    public Float getTotalDose() {
        return totalDose;
    }

    public void setTotalDose(Float totalDose) {
        this.totalDose = totalDose;
    }

    public String getPrickle() {
        return prickle;
    }

    public void setPrickle(String prickle) {
        this.prickle = prickle == null ? null : prickle.trim();
    }

    public String getImmuneType() {
        return immuneType;
    }

    public void setImmuneType(String immuneType) {
        this.immuneType = immuneType == null ? null : immuneType.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}