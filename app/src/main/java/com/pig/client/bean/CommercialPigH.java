package com.pig.client.bean;

public class CommercialPigH {
    private Integer batchNumber;

    private String earlabel;

    private Integer pigstyMessage;
    private String pigstyName ;

    private String breeder;

    private String pigType;

    private Integer age;

    private Integer number;

    private Long businessDate;

    public String getPigstyName() {
		return pigstyName;
	}

	public void setPigstyName(String pigstyName) {
		this.pigstyName = pigstyName;
	}

	public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(String earlabel) {
        this.earlabel = earlabel == null ? null : earlabel.trim();
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