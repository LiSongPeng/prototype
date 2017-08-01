package main.java.entity;

import java.util.Date;

public class insuranceRecords {
    private int insuranceId;    //保险记录ID
    private String insuranceName;   //保险名称
    private String licenseId;   //车牌号码
    private Date insuranceTime;   //投保时间
    private float insuranceAmount;  //投保金额
    private String insuranceText;   //保险内容

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Date getInsuranceTime() {
        return insuranceTime;
    }

    public void setInsuranceTime(Date insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public float getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(float insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getInsuranceText() {
        return insuranceText;
    }

    public void setInsuranceText(String insuranceText) {
        this.insuranceText = insuranceText;
    }
}
