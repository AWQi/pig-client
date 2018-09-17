package com.pig.client.pojo;

public class CommercialPig {
    private Integer batchNumber;

    private Integer earlabel;

    private Integer pigstyMessage;

    private String breeder;

    private String pigType;

    private Integer age;

    private Integer number;

    private Long businessDate;

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Integer getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(Integer earlabel) {
        this.earlabel = earlabel;
    }

    public Integer getPigstyMessage() {
        return pigstyMessage;
    }

    public void setPigstyMessage(Integer pigstyMessage) {
        this.pigstyMessage = pigstyMessage;
    }

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder == null ? null : breeder.trim();
    }

    public String getPigType() {
        return pigType;
    }

    public void setPigType(String pigType) {
        this.pigType = pigType == null ? null : pigType.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Long businessDate) {
        this.businessDate = businessDate;
    }
}