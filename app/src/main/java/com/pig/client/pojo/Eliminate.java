package com.pig.client.pojo;

public class Eliminate {
    private Integer id;

    private Integer earlabel;

    private Integer pigstyMessage;

    private String pigType;

    private String eliminateStage;

    private String eliminateType;

    private String eliminateReason;

    private Integer number;

    private Float totalWeight;

    private Long eliminateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPigType() {
        return pigType;
    }

    public void setPigType(String pigType) {
        this.pigType = pigType == null ? null : pigType.trim();
    }

    public String getEliminateStage() {
        return eliminateStage;
    }

    public void setEliminateStage(String eliminateStage) {
        this.eliminateStage = eliminateStage == null ? null : eliminateStage.trim();
    }

    public String getEliminateType() {
        return eliminateType;
    }

    public void setEliminateType(String eliminateType) {
        this.eliminateType = eliminateType == null ? null : eliminateType.trim();
    }

    public String getEliminateReason() {
        return eliminateReason;
    }

    public void setEliminateReason(String eliminateReason) {
        this.eliminateReason = eliminateReason == null ? null : eliminateReason.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Long getEliminateDate() {
        return eliminateDate;
    }

    public void setEliminateDate(Long eliminateDate) {
        this.eliminateDate = eliminateDate;
    }
}