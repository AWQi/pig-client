package com.pig.client.pojo;

public class PigImmune {
    private String immuneName;

    private Integer earlabel;

    private String immuneDate;

    private String vaccine;

    private Float unitDose;

    private Float totalDose;

    private String prickle;

    private String immuneType;

    private String operator;

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

    public String getImmuneDate() {
        return immuneDate;
    }

    public void setImmuneDate(String immuneDate) {
        this.immuneDate = immuneDate == null ? null : immuneDate.trim();
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