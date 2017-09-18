package com.prototype.entity.carMessage;

import java.util.Date;

public class accidentRecord {

    public static final String PROCESSING = "未处理";
    public static final String UNPROCESSING = "已处理";
    public static final String CLAIM="已理赔";
    public static final String UNCLAIM="未理赔";

    private String accidentId; //事故记录Id
    private String licenseId; //车牌号码
    private Date accidentTime; //事故时间
    private String accidentText; //事故内容
    private String processingState;   //处理状态
    private String claimStatus;  //理赔状态
    private float amount;  //理赔金额

    public String getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(String accidentId) {
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
