package com.pig.client.pojo;

import java.util.Date;

public class AddBreeding {
    private Integer earlabel;

    private String pigstyMessage;

    private String pigVariety;

    private String pigType;

    private Date birthdate;

    private Date entergroupDate;

    private String pigState;

    public Integer getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(Integer earlabel) {
        this.earlabel = earlabel;
    }

    public String getPigstyMessage() {
        return pigstyMessage;
    }

    public void setPigstyMessage(String pigstyMessage) {
        this.pigstyMessage = pigstyMessage == null ? null : pigstyMessage.trim();
    }

    public String getPigVariety() {
        return pigVariety;
    }

    public void setPigVariety(String pigVariety) {
        this.pigVariety = pigVariety == null ? null : pigVariety.trim();
    }

    public String getPigType() {
        return pigType;
    }

    public void setPigType(String pigType) {
        this.pigType = pigType == null ? null : pigType.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getEntergroupDate() {
        return entergroupDate;
    }

    public void setEntergroupDate(Date entergroupDate) {
        this.entergroupDate = entergroupDate;
    }

    public String getPigState() {
        return pigState;
    }

    public void setPigState(String pigState) {
        this.pigState = pigState == null ? null : pigState.trim();
    }
}