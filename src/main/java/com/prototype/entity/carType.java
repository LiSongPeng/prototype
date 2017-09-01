package com.prototype.entity;

public class carType {
    private int typeId;   //车型Id
    private String carName;   //车型名称
    private String carImg;
    private String brand;   //汽车品牌
    private String carLevel;   //汽车级别
    private String displacement;  //排量
    private String productionMode;  //生产方式
    private String power;   //动力
    private String drive;   //驱动
    private String transmissionCase;   //变速箱

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getProductionMode() {
        return productionMode;
    }

    public void setProductionMode(String productionMode) {
        this.productionMode = productionMode;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getTransmissionCase() {
        return transmissionCase;
    }

    public void setTransmissionCase(String transmissionCase) {
        this.transmissionCase = transmissionCase;
    }
}
