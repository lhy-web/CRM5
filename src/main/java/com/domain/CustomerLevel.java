package com.domain;

import java.io.Serializable;

public class CustomerLevel implements Serializable {
    private Integer levelId;
    private Double business;
    private String levelName;
    public CustomerLevel() {
    }

    public CustomerLevel(Integer levelId, Double business, String levelName) {
        this.levelId = levelId;
        this.business = business;
        this.levelName = levelName;
    }



    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Double getBusiness() {
        return business;
    }

    public void setBusiness(Double business) {
        this.business = business;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
}
