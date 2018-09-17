package com.pig.client.pojo;

public class Pigsty {
    private Integer id;

    private String name;

    private Integer temperature;

    private Integer humidity;

    private Integer illumination;

    private String pigType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getIllumination() {
        return illumination;
    }

    public void setIllumination(Integer illumination) {
        this.illumination = illumination;
    }

    public String getPigType() {
        return pigType;
    }

    public void setPigType(String pigType) {
        this.pigType = pigType == null ? null : pigType.trim();
    }
}