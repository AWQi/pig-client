package com.pig.client.pojo;

public class SwineBreeding {
    private Integer id;

    private  int pigId;
    private String earlabelFemale;

    private String earlabelMale;

    private int pigstyMessage;

    private int breeder;

    private String breederWay;

    private Long breederDate;

    private String remark;
    private  int gender;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPigId(int pigId) {
        this.pigId = pigId;
    }

    public void setEarlabelFemale(String earlabelFemale) {
        this.earlabelFemale = earlabelFemale;
    }

    public void setEarlabelMale(String earlabelMale) {
        this.earlabelMale = earlabelMale;
    }

    public int getPigId() {
        return pigId;
    }

    public String getEarlabelFemale() {
        return earlabelFemale;
    }

    public String getEarlabelMale() {
        return earlabelMale;
    }

    public int getPigstyMessage() {
        return pigstyMessage;
    }

    public void setPigstyMessage(int pigstyMessage) {
        this.pigstyMessage = pigstyMessage;
    }

    public int getBreeder() {
        return breeder;
    }

    public void setBreeder(int breeder) {
        this.breeder = breeder;
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