package com.prototype.entity;

import java.util.Date;

public class accidentRecord {
    private int accidentId; //事故记录Id
    private String licenseId; //车牌号码
    private Date accidentTime; //事故时间
    private String accidentText; //事故内容
    private String processingState;   //处理状态
    private String claimStatus;  //理赔状态

    public int getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(int accidentId) {
        this.accidentId = accidentId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Date getAccidentTime() {
        return accidentTime;
    }

    public void setAccidentTime(Date accidentTime) {
        this.accidentTime = accidentTime;
    }

    public String getAccidentText() {
        return accidentText;
    }

    public void setAccidentText(String accidentText) {
        this.accidentText = accidentText;
    }

    public String getProcessingState() {
        return processingState;
    }

    public void setProcessingState(String processingState) {
        this.processingState = processingState;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
}
