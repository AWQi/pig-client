package com.pig.client.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class BreedingPig  implements Parcelable {
    private Integer earlabel;

    private Integer pigstyMessage;

    private String pigVariety;

    private String pigType;

    private Long birthdate;

    private Long entergroupDate;

    private String pigState;

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

    public Long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Long birthdate) {
        this.birthdate = birthdate;
    }

    public Long getEntergroupDate() {
        return entergroupDate;
    }

    public void setEntergroupDate(Long entergroupDate) {
        this.entergroupDate = entergroupDate;
    }

    public String getPigState() {
        return pigState;
    }

    public void setPigState(String pigState) {
        this.pigState = pigState == null ? null : pigState.trim();
    }

    public BreedingPig() {
    }

    public BreedingPig(Parcel in) {
       earlabel =  in.readInt();
        pigstyMessage = in.readInt();
        pigVariety = in.readString();
        pigVariety = in.readString();
        birthdate = in.readLong();
        entergroupDate = in.readLong();
        pigState = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
           dest.writeInt(earlabel);
           dest.writeInt(pigstyMessage);
           dest.writeString(pigVariety);
           dest.writeLong(birthdate);
           dest.writeLong(entergroupDate);
           dest.writeString(pigState);

    }



    public static final Creator<BreedingPig> CREATOR = new Creator<BreedingPig>() {
        @Override
        public BreedingPig createFromParcel(Parcel in) {
            return new BreedingPig(in);
        }

        @Override
        public BreedingPig[] newArray(int size) {
            return new BreedingPig[size];
        }
    };

}