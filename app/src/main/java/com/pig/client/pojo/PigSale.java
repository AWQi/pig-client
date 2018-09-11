package com.pig.client.pojo;

public class PigSale {
    private String pigstyMessage;

    private Integer earlabel;

    private String pigType;

    private Float unitPrice;

    private Integer number;

    private Float totalWeight;

    private String customerName;

    private String customerAddress;

    private String customerTel;

    private String salesDate;

    public String getPigstyMessage() {
        return pigstyMessage;
    }

    public void setPigstyMessage(String pigstyMessage) {
        this.pigstyMessage = pigstyMessage == null ? null : pigstyMessage.trim();
    }

    public Integer getEarlabel() {
        return earlabel;
    }

    public void setEarlabel(Integer earlabel) {
        this.earlabel = earlabel;
    }

    public String getPigType() {
        return pigType;
    }

    public void setPigType(String pigType) {
        this.pigType = pigType == null ? null : pigType.trim();
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate == null ? null : salesDate.trim();
    }
}