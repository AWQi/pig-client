package com.pig.client.pojo;

public class SwineBreeding {
    private Integer id;

    private Integer earlabelFemale;

    private Integer earlabelMale;

    private String pigstyMessage;

    private String breeder;

    private String breederWay;

    private Long breederDate;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Long getBreederDate() {
        return breederDate;
    }

    public void setBreederDate(Long breederDate) {
        this.breederDate = breederDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}