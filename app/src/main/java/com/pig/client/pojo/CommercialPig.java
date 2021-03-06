package com.pig.client.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class CommercialPig implements Parcelable{
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




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(batchNumber);
                dest.writeString(earlabel);
                dest.writeInt(pigstyMessage);
                dest.writeString(pigstyName);
                dest.writeString(breeder);
                dest.writeString(pigType);
                dest.writeInt(age);
                dest.writeInt(number);
                dest.writeLong(businessDate);

    }

    public CommercialPig(Parcel in) {
        batchNumber = in.readInt();
        earlabel = in.readString();
        pigstyMessage = in.readInt();
        pigstyName    = in.readString();
        breeder = in.readString();
        age =in.readInt();
        number = in.readInt();
        businessDate =in.readLong();
    }

    public static final Creator<CommercialPig> CREATOR = new Creator<CommercialPig>() {
        @Override
        public CommercialPig createFromParcel(Parcel in) {
            return new CommercialPig(in);
        }

        @Override
        public CommercialPig[] newArray(int size) {
            return new CommercialPig[size];
        }
    };
}