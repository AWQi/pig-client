package com.pig.client.pojo;

public class TurngroupBreeding {
    private Integer earlabel;

    private String rollourPigsty;

    private String rollinPigsty;

    private String turngroupDate;

    public Integer getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(Integer earlabel) {
        this.earlabel = earlabel;
    }

    public String getRollourPigsty() {
        return rollourPigsty;
    }

    public void setRollourPigsty(String rollourPigsty) {
        this.rollourPigsty = rollourPigsty == null ? null : rollourPigsty.trim();
    }

    public String getRollinPigsty() {
        return rollinPigsty;
    }

    public void setRollinPigsty(String rollinPigsty) {
        this.rollinPigsty = rollinPigsty == null ? null : rollinPigsty.trim();
    }

    public String getTurngroupDate() {
        return turngroupDate;
    }

    public void setTurngroupDate(String turngroupDate) {
        this.turngroupDate = turngroupDate == null ? null : turngroupDate.trim();
    }
}