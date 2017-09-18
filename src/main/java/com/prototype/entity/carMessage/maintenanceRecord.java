package com.prototype.entity.carMessage;

import java.util.Date;

public class maintenanceRecord {
    private String  maintenanceId;  //保养记录ID
    private String licenseId;   //车牌号码
    private Date maintenanceTime;   //保养时间
    private String maintenanceText; //保养内容
    private float maintenanceAmount;   //保养金额
    private float beforeKilometers;   //保养前公里数

    public String  getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(String  maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    public String getMaintenanceText() {
        return maintenanceText;
    }

    public void setMaintenanceText(String maintenanceText) {
        this.maintenanceText = maintenanceText;
    }

    public float getMaintenanceAmount() {
        return maintenanceAmount;
    }

    public void setMaintenanceAmount(float maintenanceAmount) {
        this.maintenanceAmount = maintenanceAmount;
    }

    public float getBeforeKilometers() {
        return beforeKilometers;
    }

    public void setBeforeKilometers(float beforeKilometers) {
        this.beforeKilometers = beforeKilometers;
    }
}
