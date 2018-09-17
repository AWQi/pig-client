package com.pig.client.pojo;

public class ChangePigstyCommercial {
    private Integer id;

    private String turngroupType;

    private Integer batchNumber;

    private Integer outPigsty;

    private Integer number;

    private Integer inPigsty;

    private Float totalWeight;

    private Long date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurngroupType() {
        return turngroupType;
    }

    public void setTurngroupType(String turngroupType) {
        this.turngroupType = turngroupType == null ? null : turngroupType.trim();
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Integer getOutPigsty() {
        return outPigsty;
    }

    public void setOutPigsty(Integer outPigsty) {
        this.outPigsty = outPigsty;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getInPigsty() {
        return inPigsty;
    }

    public void setInPigsty(Integer inPigsty) {
        this.inPigsty = inPigsty;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}