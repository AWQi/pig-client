package com.pig.client.pojo;

public class SwineBreeding {
    private Integer earlabelFemale;

    private Integer earlabelMale;

    private String pigstyMessage;

    private String breeder;

    private String breederWay;

    private String breederDate;

    private String remark;

    public Integer getEarlabelFemale() {
        return earlabelFemale;
    }

    public void setEarlabelFemale(Integer earlabelFemale) {
        this.earlabelFemale = earlabelFemale;
    }

    public Integer getEarlabelMale() {
        return earlabelMale;
    }

    public void setEarlabelMale(Integer earlabelMale) {
        this.earlabelMale = earlabelMale;
    }

    public String getPigstyMessage() {
        return pigstyMessage;
    }

    public void setPigstyMessage(String pigstyMessage) {
        this.pigstyMessage = pigstyMessage == null ? null : pigstyMessage.trim();
    }

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder == null ? null : breeder.trim();
    }

    public String getBreederWay() {
        return breederWay;
    }

    public void setBreederWay(String breederWay) {
        this.breederWay = breederWay == null ? null : breederWay.trim();
    }

    public String getBreederDate() {
        return breederDate;
    }

    public void setBreederDate(String breederDate) {
        this.breederDate = breederDate == null ? null : breederDate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}