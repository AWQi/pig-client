package com.pig.client.pojo;

public class TurngroupCommercialPigs {
    private String turngroupType;

    private Integer rolloutEarlabelBatchNumber;

    private String rolloutPigsty;

    private Integer rolloutNumber;

    private Integer rollinEarlabelBatchNumber;

    private String rollinPigsty;

    private Integer rollinNumber;

    private Integer turngroupNumber;

    private Float totalWeight;

    private String turngroupData;

    public String getTurngroupType() {
        return turngroupType;
    }

    public void setTurngroupType(String turngroupType) {
        this.turngroupType = turngroupType == null ? null : turngroupType.trim();
    }

    public Integer getRolloutEarlabelBatchNumber() {
        return rolloutEarlabelBatchNumber;
    }

    public void setRolloutEarlabelBatchNumber(Integer rolloutEarlabelBatchNumber) {
        this.rolloutEarlabelBatchNumber = rolloutEarlabelBatchNumber;
    }

    public String getRolloutPigsty() {
        return rolloutPigsty;
    }

    public void setRolloutPigsty(String rolloutPigsty) {
        this.rolloutPigsty = rolloutPigsty == null ? null : rolloutPigsty.trim();
    }

    public Integer getRolloutNumber() {
        return rolloutNumber;
    }

    public void setRolloutNumber(Integer rolloutNumber) {
        this.rolloutNumber = rolloutNumber;
    }

    public Integer getRollinEarlabelBatchNumber() {
        return rollinEarlabelBatchNumber;
    }

    public void setRollinEarlabelBatchNumber(Integer rollinEarlabelBatchNumber) {
        this.rollinEarlabelBatchNumber = rollinEarlabelBatchNumber;
    }

    public String getRollinPigsty() {
        return rollinPigsty;
    }

    public void setRollinPigsty(String rollinPigsty) {
        this.rollinPigsty = rollinPigsty == null ? null : rollinPigsty.trim();
    }

    public Integer getRollinNumber() {
        return rollinNumber;
    }

    public void setRollinNumber(Integer rollinNumber) {
        this.rollinNumber = rollinNumber;
    }

    public Integer getTurngroupNumber() {
        return turngroupNumber;
    }

    public void setTurngroupNumber(Integer turngroupNumber) {
        this.turngroupNumber = turngroupNumber;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getTurngroupData() {
        return turngroupData;
    }

    public void setTurngroupData(String turngroupData) {
        this.turngroupData = turngroupData == null ? null : turngroupData.trim();
    }
}